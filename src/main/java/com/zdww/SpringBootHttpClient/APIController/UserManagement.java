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
//@RequestMapping("/usermanagement")
public class UserManagement {

    @Resource
    private HttpAPIService httpAPIService;

    private static final String appKey = "";

    //@PostMapping("/v1/usermanagement/users/{id}/resetPassword")
    @RequestMapping("/post/v1/usermanagement/users/{id}/resetPassword")
    public String PostUserResetPassword() throws Exception {
        String url = "http://worker3:18630/rest/v1/usermanagement/users/{id}/resetPassword";
        Map<String, Object> map = new HashMap<String, Object>();
        HttpResult httpResult = httpAPIService.doPost(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/usermanagement/users/{id}/changePassword")
    public String PostUserChangePassword() throws Exception {
        String url = "http://worker3:18630/rest/v1/usermanagement/users/{id}/changePassword";
        Map<String, Object> map = new HashMap<String, Object>();
        HttpResult httpResult = httpAPIService.doPost(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/usermanagement/users/{id}")
    public String PostUser() throws Exception {
        String url = "http://worker3:18630/rest/v1/usermanagement/users/{id}";
        Map<String, Object> map = new HashMap<String, Object>();
        HttpResult httpResult = httpAPIService.doPost(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/delete/v1/usermanagement/users/{id}")
    public String DeleteUser() throws Exception {
        String url = "http://worker3:18630/rest/v1/usermanagement/users/{id}";
        Map<String, Object> map = new HashMap<String, Object>();
        HttpResult httpResult = httpAPIService.doDelete(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/get/v1/usermanagement/users")
    @ResponseBody
    //@RequestMapping(value = {"/get/v1/usermanagement/users"} , method = {RequestMethod.GET} , produces = "application/json;charset=UTF-8")
    public String GetUsers() throws Exception {
        String url = "http://worker3:18630/rest/v1/usermanagement/users";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("AppKey", appKey);
        HttpResult httpResult = httpAPIService.doGet(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/usermanagement/users")
    @ResponseBody
    //@RequestMapping(value = {"/get/v1/usermanagement/users"} , method = {RequestMethod.POST} , produces = "application/json;charset=UTF-8")
    public String PostUsers() throws Exception {
        String url = "http://worker3:18630/rest/v1/usermanagement/users";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("AppKey", appKey);

        HttpResult httpResult = httpAPIService.doPost(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }
}