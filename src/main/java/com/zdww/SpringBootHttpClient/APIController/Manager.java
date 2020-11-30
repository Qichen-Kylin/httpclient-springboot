package com.zdww.SpringBootHttpClient.APIController;

import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class Manager {
    @Resource
    private HttpAPIService httpAPIService;

    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
    private static final String ContentType = "application/json;charset=UTF-8";

//    @RequestMapping(value = "/post/v1/pipeline/{pipelineId}/start",method = RequestMethod.POST)
//    public String postPipelineIdStart(@PathVariable("pipelineId") String pipelineId, @RequestParam Map<String, Object>map) throws Exception {
//        String url=Schema_Host_Port_Path+"/v1/pipeline/"+pipelineId+"/start";
//        System.out.println(map);
//        HttpResult httpResult = httpAPIService.doPost(url,map);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
}
