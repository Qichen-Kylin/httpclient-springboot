//package com.zdww.SpringBootHttpClient.APIController;
//
//import com.zdww.SpringBootHttpClient.HttpClient.HttpPOST;
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
//public class TestHttpPOST {
//
//    @Resource
//    private HttpPOST httpPOST;
//
//    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
//    private static final String ContentType = "application/json;charset=UTF-8";
//    private static final String id = "";
//
//    @RequestMapping(value = "/post/v1/system/stats" , method = RequestMethod.POST , produces = ContentType)
//    //@RequestMapping("/post/v1/system/stats")
//    public String PostSystemStats() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/system/stats";
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("id",id);
//        HttpResult httpResult = httpPOST.doPost(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//
//    @RequestMapping("/post/v1/usermanagement/users")
//    //@RequestMapping(value = "/post/v1/usermanagement/users" , method = RequestMethod.POST , produces = ContentType)
//    public String PostUsermanagementUsers() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/usermanagement/users";
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("id",id);
//        HttpResult httpResult = httpPOST.doPost(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//
//    @RequestMapping("/post/v1/pipeline/pipelineId/start")
//    public String PostPipelineStart() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/pipeline/HttpClient_TESTAPI/start";
//        Map<String, Object> map = new HashMap<String, Object>();
//        //map.put("id",id);
//        HttpResult httpResult = httpPOST.doPost(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//}
