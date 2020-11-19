package com.zdww.SpringBootHttpClient.APIController;

import com.alibaba.fastjson.JSON;
import com.zdww.SpringBootHttpClient.DataModel.RestRequestRUser;
import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";

    @RequestMapping("/post/v1/usermanagement/users/{id}/resetPassword")
    public String PostResetPassword(@PathVariable("id") String id,@RequestParam Map<String, Object> map) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/usermanagement/users/" + id + "/resetPassword";
        HttpResult httpResult = httpAPIService.doPost(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/usermanagement/users/{id}/changePassword")
    public String PostChangePassword(@PathVariable("id") String id,@RequestParam Map<String, Object> map) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/usermanagement/users/" + id + "/changePassword";
        HttpResult httpResult = httpAPIService.doPost(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/usermanagement/users/{id}")
    public String PostUser(@PathVariable("id") String id, @Validated @RequestBody RestRequestRUser restRequestRUserJson) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/usermanagement/users/" + id;
        String body  = JSON.toJSONString(restRequestRUserJson);
        HttpResult httpResult = httpAPIService.doPostbody(url,body);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/delete/v1/usermanagement/users/{id}")
    public String DeleteUser(@PathVariable("id") String id,@RequestParam Map<String, Object> map) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/usermanagement/users/" + id;
        HttpResult httpResult = httpAPIService.doDelete(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/get/v1/usermanagement/users")
    public String GetUsers(@RequestParam Map<String, Object> map) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/usermanagement/users";
        HttpResult httpResult = httpAPIService.doGet(url,map);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }

    @RequestMapping("/post/v1/usermanagement/users")
    public String PostUsers(@RequestBody RestRequestRUser restRequestRUserJson) throws Exception {
        String url = Schema_Host_Port_Path + "/v1/usermanagement/users";
        System.out.println(restRequestRUserJson);
        String body  = JSON.toJSONString(restRequestRUserJson);
        System.out.println(body);
        HttpResult httpResult = httpAPIService.doPostbody(url,body);
        System.out.println(httpResult.getCode());
        System.out.println(httpResult.getBody());
        return httpResult.getBody();
    }
}