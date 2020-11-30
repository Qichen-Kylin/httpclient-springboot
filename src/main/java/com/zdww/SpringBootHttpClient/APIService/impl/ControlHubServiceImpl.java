package com.zdww.SpringBootHttpClient.APIService.impl;

import com.zdww.SpringBootHttpClient.APIService.ControlHubService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class ControlHubServiceImpl implements ControlHubService {
    @Autowired
    private HttpAPIService httpAPIService;
    @Override
    public String getPipelineLog(String pipelineId)  {
        Map<String, Object> map = null;
        String url = "http://worker3:18630/rest/v1/controlHub/pipeline/"+pipelineId+"/log?len=50";
        HttpResult httpResult = null ;
        Integer code = 0;//返回值代码
        String body = ""; //返回的数据
        try {
             httpResult = httpAPIService.doGet(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult!=null){
            code = httpResult.getCode();
            body = httpResult.getBody();

        }
        return body;
    }

    @Override
    public String getCurrentUser(Map<String, Object> map) {
        String url = "http://worker3:18630/rest/v1/controlHub/currentUser";
        HttpResult httpResult = null;
        Integer code=0;//返回值代码
        String body="";//返回值数据
        try {
             httpResult = httpAPIService.doGet(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult!=null){
             code = httpResult.getCode();
             body = httpResult.getBody();
        }
        return body;
    }
    @Override
    public String getUsers(Map<String, Object> map){
        String url = "http://worker3:18630/rest/v1/controlHub/users?len=50";
        HttpResult httpResult=null;
        Integer code= 0;
        String body= "";
        try {
            httpResult = httpAPIService.doGet(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            code = httpResult.getCode();
            body = httpResult.getBody();
        }
        return body;
    }
    @Override
    public String getGroups(Map<String, Object>map){
        String url = "http://worker3:18630/rest/v1/controlHub/groups?len=50";
           HttpResult httpResult = null;
           Integer code = 0;
           String body = "";
        try {
             httpResult = httpAPIService.doGet(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            code = httpResult.getCode();
            body = httpResult.getBody();
        }
        return body;
    }
    @Override
    public String getPipelines(Map<String, Object>map){
        String url="http://worker3:18630/rest/v1/controlHub/pipelines?len=50";
        HttpResult httpResult=null;
        Integer code=0;
        String body="";
        try {
             httpResult = httpAPIService.doGet(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
             code = httpResult.getCode();
             body = httpResult.getBody();
        }
        return  body;
    }
    @Override
    public String getPipelineCommitId(String pipelineCommitId){
        String url="http://worker3:18630/rest/v1/controlHub/pipeline/"+pipelineCommitId;
        HttpResult httpResult=null;
        Integer code=0;
        String body="";
        try {
            httpResult = httpAPIService.doGet(url, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            code = httpResult.getCode();
            body = httpResult.getBody();
        }
        return  body;
    }
    @Override
    public String postPublishPipeline(String pipelineId){
        String url="http://worker3:18630/rest/v1/publishPipeline/"+pipelineId;
        HttpResult httpResult=null;
        Integer code = 0;
        String body = "";
        try {
             httpResult = httpAPIService.doPost(url, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
             code = httpResult.getCode();
             body = httpResult.getBody();
        }
        return body;
    }
}
