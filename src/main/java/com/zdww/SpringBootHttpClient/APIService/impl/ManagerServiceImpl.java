package com.zdww.SpringBootHttpClient.APIService.impl;

import com.zdww.SpringBootHttpClient.APIService.ManagerService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private HttpAPIService httpAPIService;
    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
    @Override
    public String getPipelineIdMetrics(String  pipelineId){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineId+"/metrics?rev=0";
        HttpResult httpResult=null;
        Integer code = 0;
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
        return body;
    }
    @Override
    public String getPipelineIdHistory(String pipelineId){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineId+"/history?rev=0";
        HttpResult httpResult=null;
        Integer code = 0;
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
        return body;
    }
    @Override
    public String deletePipelineIdHistory(String pipelineId){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineId+"/history";
        HttpResult httpResult=null;
        Integer code = 0;
        String body = "";
        try {
            httpResult = httpAPIService.doDelete(url,null);
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
    public String postPipelineIdStart(String pipelineId, Map<String,Object>map){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineId+"/start";
        HttpResult httpResult=null;
        Integer code = 0;
        String body = "";
        String head= "";
        try {
            httpResult = httpAPIService.doPost(url,map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            head = httpResult.getHead();
            code = httpResult.getCode();
            body = httpResult.getBody();
        }
        return body;

    }
    @Override
    public String postPipelineIdStop(String pipelineId){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineId+"/stop";
        HttpResult httpResult=null;
        Integer code=0;
        String body="";
        String head="";
        try {
            httpResult = httpAPIService.doPost(url,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
             code = httpResult.getCode();
             body = httpResult.getBody();
             head = httpResult.getHead();
        }
        return body;
    }
    @Override
    public String getSnapshot(String pipelineid, String snapshotName ){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineid+"/snapshot/"+snapshotName+"?rev=0";
        HttpResult httpResult=null;
        String head="";
        String body="";
        Integer code=0;
        try {
             httpResult = httpAPIService.doGet(url,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
             head = httpResult.getHead();
             body = httpResult.getBody();
             code = httpResult.getCode();
        }
        return body;
    }
    @Override
    public String postSnapshot(String pipelineid, String snapshotName){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineid+"/snapshot/"+snapshotName;
        HttpResult httpResult=null;
        String head="";
        String body="";
        Integer code=0;
        try {
            httpResult = httpAPIService.doPost(url,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            head = httpResult.getHead();
            body = httpResult.getBody();
            code = httpResult.getCode();
        }
        return body;
    }
    @Override
    public String putSnapshot(String pipelineid, String snapshotName){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineid+"/snapshot/"+snapshotName;
        HttpResult httpResult=null;
        String head="";
        String body="";
        Integer code=0;
        try {
            httpResult = httpAPIService.doPut(url,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            head = httpResult.getHead();
            body = httpResult.getBody();
            code = httpResult.getCode();
        }
        return body;
    }
    @Override
    public String deleteSnapshot(String pipelineid, String snapshotName){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineid+"/snapshot/"+snapshotName;
        HttpResult httpResult=null;
        String head="";
        String body="";
        Integer code=0;
        try {
            httpResult = httpAPIService.doDelete(url,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            head = httpResult.getHead();
            body = httpResult.getBody();
            code = httpResult.getCode();
        }
        return body;
    }
    @Override
    public String deleteAlerts(String pipelineid){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineid+"alerts";
        HttpResult httpResult=null;
        String head="";
        String body="";
        Integer code=0;
        try {
            httpResult = httpAPIService.doDelete(url,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            head = httpResult.getHead();
            body = httpResult.getBody();
            code = httpResult.getCode();
        }
        return body;
    }
    @Override
    public String getCommittedOffsets(String pipelineid){
        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineid+"/committedOffsets?rev=0";
        HttpResult httpResult=null;
        String head="";
        String body="";
        Integer code=0;
        try {
            httpResult = httpAPIService.doGet(url,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpResult != null) {
            head = httpResult.getHead();
            body = httpResult.getBody();
            code = httpResult.getCode();
        }
        return body;
    }

}
