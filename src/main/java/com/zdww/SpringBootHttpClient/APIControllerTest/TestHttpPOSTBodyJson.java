//package com.zdww.SpringBootHttpClient.APIControllerTest;
//
//import com.alibaba.fastjson.JSON;
//import com.zdww.SpringBootHttpClient.DataModel.AddLabelsRequestJson;
//import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
//import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@RestController
//public class TestHttpPOSTBodyJson {
//
//    @Resource
//    private HttpAPIService httpAPIService;
//
//    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
//    private static final String ContentType = "application/json;charset=UTF-8";
//
//    @RequestMapping("/PostBodyJson/v1/pipelines/addLabels")
//    //将标签添加到多个管道
//    public String PostPipelinesaddLabels(@RequestBody AddLabelsRequestJson addLabelsRequestJson) throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/pipelines/addLabels";
//
//        System.out.println(addLabelsRequestJson);
//        String body  = JSON.toJSONString(addLabelsRequestJson);
//        System.out.println(body);
//
//        HttpResult httpResult = httpAPIService.doPostbody(url,body);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//}
