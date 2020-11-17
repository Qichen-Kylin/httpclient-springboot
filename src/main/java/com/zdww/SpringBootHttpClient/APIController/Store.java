package com.zdww.SpringBootHttpClient.APIController;

import com.alibaba.fastjson.JSON;
import com.zdww.SpringBootHttpClient.DataModel.model.RuleDefinitionsJson;
import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenqi
 * on 2020.11.10
 */
@RestController
public class Store {

    @Resource
    private HttpAPIService httpAPIService;

    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
    private static final String ContentType = "application/json;charset=UTF-8";

    @RequestMapping("/get/v1/pipelines")
    //返回所有管道配置信息
    public String GetPipelines(@RequestParam Map<String, Object> map) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/pipelines";
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("filterText", "");
//        map.put("label", "");
//        map.put("offset", "");
//        map.put("len", "-1");
//        //NAME(default)、TITLE、LAST_MODIFIED、CREATED、CREATOR、STATUS
//        map.put("orderBy", "NAME");
//        //ASC(default)、DESC
//        map.put("order", "ASC");
//        map.put("includeStatus", "");
        System.out.println(map);
        HttpResult httpResult = httpAPIService.doGet(url, map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

//    @RequestMapping("/get/v1/pipeline/pipelineId/rules")
//    //按名称和修订查找管道规则
//    public String GetPipelineIdRules(@RequestBody ParametersTypePath parametersTypePath,@RequestParam Map<String, Object> map) throws Exception {
////        String pipelineId = "HttpClient_TESTAPI";
////        String rev = "";
////        Map<String, Object> map = new HashMap<String, Object>();
////        map.put("rev", rev);
//        String pipelineId = parametersTypePath.getPipelineId();
//        System.out.println(pipelineId);
//        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineId + "/rules";
//
//        HttpResult httpResult = httpAPIService.doGet(url, map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }

    @RequestMapping("/get/v1/pipeline/{pipelineId}/rules")
    //按名称和修订查找管道规则
    public String GetPipelineIdRules(@PathVariable("pipelineId") String pipelineId, @RequestParam Map<String, Object> map) throws Exception {
        //String pipelineId = parametersTypePath.getPipelineId();
        System.out.println(pipelineId);
        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineId + "/rules";

        HttpResult httpResult = httpAPIService.doGet(url, map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/pipeline/{pipelineId}/rules")
    //按名称和修订查找管道规则
    public String PostPipelineIdRules(@PathVariable("pipelineId") String pipelineId,@RequestParam Map<String, Object> map,@RequestBody RuleDefinitionsJson ruleDefinitionsJson) throws Exception {
//        String pipelineId = "HttpClient_TESTAPI";
//        String rev = "";
//        String body = null;
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("rev", rev);
//        String pipelineId = ruleDefinitionsJson.getPipelineid();
        System.out.println(pipelineId);
        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineId + "/rules";
        //System.out.println(ruleDefinitionsJson);
        String body  = JSON.toJSONString(ruleDefinitionsJson);
        System.out.println(body);
        HttpResult httpResult = httpAPIService.doPostParameterAndBody(url,body,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/put/v1/pipeline/{pipelineTitle}")
    //向商店添加新的管道配置
    public String PutPipeline() throws Exception {
        String pipelineTitle = "HttpClient_TESTAPI1";
        String description = "";
        boolean autoGeneratePipelineId = false;
        boolean draft = false;
        String pipelineType = "DATA_COLLECTOR";
        String pipelineLabel = "HttpClient";

        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineTitle;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("description", description);
        map.put("autoGeneratePipelineId", autoGeneratePipelineId);
        map.put("draft", draft);
        map.put("pipelineType", pipelineType);
        map.put("pipelineLabel", pipelineLabel);
        HttpResult httpResult = httpAPIService.doPut(url, map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/get/v1/pipeline/{pipelineId}")
    //按名称和修订查找管道规则
    public String GetPipelineId() throws Exception {
        String pipelineId = "HttpClient_TESTAPI1";
        String rev = "";
        String get = "pipeline";
        boolean attachment;
        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineId;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rev", rev);
        map.put("get", get);
        HttpResult httpResult = httpAPIService.doGet(url, map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/pipeline/{pipelineId}")
    //通过名称更新现有管道配置
    public String PostPipeline() throws Exception {
        String pipelineId = "HttpClient_TESTAPI1";
        String rev = "";
        String description = "";
        boolean encryptCredentials;
        String url = Schema_Host_Port_Path + "/v1/pipeline/"+ pipelineId;

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rev", rev);
        map.put("description", description);

        String body = null;
        HttpResult httpResult = httpAPIService.doPostParameterAndBody(url,body,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

}
