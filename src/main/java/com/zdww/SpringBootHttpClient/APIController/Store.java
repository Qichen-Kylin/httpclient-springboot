package com.zdww.SpringBootHttpClient.APIController;

import com.alibaba.fastjson.JSON;
import com.zdww.SpringBootHttpClient.DataModel.PostPipelineId.PipelineConfigurationJson;
import com.zdww.SpringBootHttpClient.DataModel.RuleDefinitionsJson;
import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
        System.out.println(map);
        HttpResult httpResult = httpAPIService.doGet(url, map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

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
    //通过名称更新现有的管道规则
    public String PostPipelineIdRules(@PathVariable("pipelineId") String pipelineId,@RequestParam Map<String, Object> map,@RequestBody RuleDefinitionsJson ruleDefinitionsJson) throws Exception {
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
    public String PutPipeline(@PathVariable("pipelineTitle") String pipelineTitle,@RequestParam Map<String, Object> map) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineTitle;
        HttpResult httpResult = httpAPIService.doPut(url, map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/get/v1/pipeline/{pipelineId}")
    //通过名称和修订版查找管道配置
    public String GetPipelineId(@PathVariable("pipelineId") String pipelineId,@RequestParam Map<String, Object> map) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineId;
        HttpResult httpResult = httpAPIService.doGet(url, map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/pipeline/{pipelineId}")
    //通过名称更新现有管道配置
    public String PostPipelineId(@PathVariable("pipelineId") String pipelineId,@RequestParam Map<String, Object> map,@RequestBody PipelineConfigurationJson pipelineConfigurationJson ) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/pipeline/"+ pipelineId;
        String body  = JSON.toJSONString(pipelineConfigurationJson);
        System.out.println(body);
        HttpResult httpResult = httpAPIService.doPostParameterAndBody(url,body,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }
}
