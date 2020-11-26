package com.zdww.SpringBootHttpClient.APIController;

import com.zdww.SpringBootHttpClient.HttpClient.HttpAPIService;
import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenqi
 * on 2020.11.26
 */
@RestController

public class GoToURL {

    @Resource
    private HttpAPIService httpAPIService;

    private static final String SDC_Link = "http://worker3:18630/collector/pipeline/";

    @RequestMapping("/{pipelineId}")
    public String GoToURL(@PathVariable("pipelineId") String pipelineId,@RequestParam Map<String, Object> map) throws Exception {
        String url = SDC_Link + pipelineId;
        HttpResult httpResult = httpAPIService.doGet(url,map);
        return httpResult.getBody();
    }
}
