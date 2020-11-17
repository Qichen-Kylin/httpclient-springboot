//package com.zdww.SpringBootHttpClient.APIController;
//
//import com.zdww.SpringBootHttpClient.HttpClient.HttpGET;
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
//public class TestHttpGET {
//
//    @Resource
//    private HttpGET httpGET;
//
////    private static final String Schema = "http";
////    private static final String Host = "worker3";
////    private static final String Port = "18630";
////    private static final String Path = "rest";
//
//    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
//    private static final String ContentType = "application/json;charset=UTF-8";
//    private static final String id = "";
//
//    //@RequestMapping(value = "/get/v1/activation" , method = RequestMethod.GET , produces = ContentType)
//    @RequestMapping("/get/v1/activation")
//    public String GetActivation() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/activation";
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("id",id);
//        HttpResult httpResult = httpGET.doGet(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//    @RequestMapping("/get/v1/usermanagement/users")
//    public String GetUsermanagementUsers() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/usermanagement/users";
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("id",id);
//        HttpResult httpResult = httpGET.doGet(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//}
