//package com.zdww.SpringBootHttpClient.APIController;
//
//import com.zdww.SpringBootHttpClient.HttpClient.HttpDELETE;
//import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class TestHttpDELETE {
//
//    @Resource
//    private HttpDELETE httpDELETE;
//
//    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
//    private static final String ContentType = "application/json;charset=UTF-8";
//    private static final String Id = "";
//
//    private static final String pipelineId = "TestpipelineTitle";
//
//    //@RequestMapping(value = "/delete/v1/pipeline/pipelineId" , method = RequestMethod.PUT , produces = ContentType)
//    @RequestMapping("/delete/v1/pipeline/pipelineId")
//    public String PostSystemStats() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineId;
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("id",Id);
//        HttpResult httpResult = httpDELETE.doDelete(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//}
