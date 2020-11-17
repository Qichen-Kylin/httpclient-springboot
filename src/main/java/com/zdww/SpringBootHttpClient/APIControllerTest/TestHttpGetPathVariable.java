//package com.zdww.SpringBootHttpClient.APIControllerTest;
//
//import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
//import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//import java.util.Map;
//
//@RestController
//public class TestHttpGetPathVariable {
//
//    @Resource
//    private HttpAPIService httpAPIService;
//
//    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
//    private static final String ContentType = "application/json;charset=UTF-8";
//
//    @RequestMapping("/get/v1/pipeline/{pipelineId}/rules")
//    //按名称和修订查找管道规则
//    public String GetPipelineIdRules(@PathVariable("pipelineId") String pipelineId, @RequestParam Map<String, Object> map) throws Exception {
//        //String pipelineId = parametersTypePath.getPipelineId();
//        System.out.println(pipelineId);
//        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineId + "/rules";
//
//        HttpResult httpResult = httpAPIService.doGet(url, map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//}
