package com.zdww.SpringBootHttpClient.APIController;

import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenqi
 * on 2020.10.26
 */
@RestController
//@RequestMapping("/activation")
public class Activation {

    @Resource
    private HttpAPIService httpAPIService;

    private static final String appKey = "";

    //@GetMapping("/get/v1/activation")
    //@RequestMapping(value = "/get/v1/activation" , method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
    @RequestMapping("/get/v1/activation")
    public String GetActivation() throws Exception {
        String url = "http://worker3:18630/rest/v1/activation";
        Map<String, Object> map = new HashMap<String, Object>();
        //map.put("AppKey", appKey);
        HttpResult httpResult = httpAPIService.doGet(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    //@PostMapping("/post/v1/activation")
    //@RequestMapping(value = "/post/v1/activation" , method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
    //@RequestMapping("/post/v1/activation")
    /*public String PostActivation() throws Exception {
        String url = "http://worker3:18630/rest/v1/activation";
        Map<String, Object> map = new HashMap<String, Object>();
        //map.put("body", "");
        HttpResult httpResult = httpAPIService.doPost(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }*/

    @RequestMapping("/post/v1/activation")
    public String PostActivation(Map<String,Object> map){
        String url = "http://worker3:18630/rest/v1/activation";
        try {
            HttpResult httpResult = httpAPIService.doPost(url,map);
            String body = httpResult.getBody();
            System.out.println(body);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
