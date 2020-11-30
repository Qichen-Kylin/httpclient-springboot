package com.zdww.SpringBootHttpClient.APIService;

import java.util.Map;

public interface ControlHubService {
    String getPipelineLog(String pipelineId);
    String getCurrentUser(Map<String, Object> map);
    String getUsers(Map<String, Object> map);
    String getGroups(Map<String, Object> map);
    String getPipelines(Map<String, Object>map);
    String getPipelineCommitId(String pipelineCommitId);
    String postPublishPipeline(String pipelineId);

}
