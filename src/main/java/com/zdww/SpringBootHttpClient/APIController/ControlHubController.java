package com.zdww.SpringBootHttpClient.APIController;

import com.zdww.SpringBootHttpClient.APIService.ControlHubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
/**
 * Created by zhouzeru
 * on 2020.11.26
 */
@RestController
public class ControlHubController {
    @Autowired
    private ControlHubService controlHubService;
    @RequestMapping("/getPipelinedLog")
    public String getPipelineLog(@RequestParam("pipelineId") String pipelineId){
        String pipelineLog = controlHubService.getPipelineLog(pipelineId);
        return pipelineLog;
    }
    @RequestMapping("/getCurrentUser")
    public String getCurrentUser(@RequestParam Map<String,Object> map){
        String currentUser = controlHubService.getCurrentUser(map);
        return currentUser;
    }
    @RequestMapping("/getUsers")
    public String getUsers(@RequestParam Map<String, Object> map){
        String users = controlHubService.getUsers(map);
        return users;
    }
    @RequestMapping("/getGroups")
    public String getGroups(@RequestParam Map<String, Object>map){
        String groups = controlHubService.getGroups(map);
        return groups;
    }
    @RequestMapping("/getPipelines")
    public String getPipelines(@RequestParam Map<String, Object>map){
        String pipelines = controlHubService.getPipelines(map);
        return pipelines;
    }
    @RequestMapping("/getPipelineCommitId")
    public String getPipelineCommitId(@RequestParam("pipelineCommitId") String pipelineCommitId){
        String CommitId= controlHubService.getPipelineCommitId(pipelineCommitId);
        return CommitId;
    }
    @RequestMapping("/postPublishPipelineId")
    public String postPublishPipelineId(@RequestParam("pipelineId") String pipelineId){
        String PublishPipeline = controlHubService.postPublishPipeline(pipelineId);
        return PublishPipeline;
    }
}

