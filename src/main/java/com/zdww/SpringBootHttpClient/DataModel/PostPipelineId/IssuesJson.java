package com.zdww.SpringBootHttpClient.DataModel.PostPipelineId;

import java.util.List;
import java.util.Map;

public class IssuesJson {

    private List<IssueJson> pipelineIssues = null;
    private Map<String, List<IssueJson>> stageIssues = null;
    private Integer issueCount = null;

    public List<IssueJson> getPipelineIssues() {
        return pipelineIssues;
    }
    public void setPipelineIssues(List<IssueJson> pipelineIssues) {
        this.pipelineIssues = pipelineIssues;
    }

    public Map<String, List<IssueJson>> getStageIssues() {
        return stageIssues;
    }
    public void setStageIssues(Map<String, List<IssueJson>> stageIssues) {
        this.stageIssues = stageIssues;
    }

    public Integer getIssueCount() {
        return issueCount;
    }
    public void setIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
    }
}
