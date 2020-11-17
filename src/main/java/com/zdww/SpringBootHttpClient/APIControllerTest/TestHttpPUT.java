//package com.zdww.SpringBootHttpClient.APIController;
//
//import com.zdww.SpringBootHttpClient.HttpClient.HttpPUT;
//import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class TestHttpPUT {
//
//    @Resource
//    private HttpPUT httpPUT;
//
//    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
//    private static final String ContentType = "application/json;charset=UTF-8";
//    private static final String pipelineType = "DATA_COLLECTOR";
//
//    private static final String pipelineTitle = "HttpClient_TESTAPI";
//
//    //@RequestMapping(value = "/put/v1/pipeline/pipelineTitle" , method = RequestMethod.PUT , produces = ContentType)
//    @RequestMapping("/put/v1/pipeline/pipelineTitle")
//    public String PostSystemStats() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/pipeline/" + pipelineTitle;
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("id",pipelineType);
//        HttpResult httpResult = httpPUT.doPut(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//}
