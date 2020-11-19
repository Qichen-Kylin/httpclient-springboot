package com.zdww.SpringBootHttpClient.DataModel.PostPipelineIdRules;

import java.util.Map;

public class RuleIssueJson {
    private String message ;
    private Map<String, Object> additionalInfo;
    private String ruleId ;


    /**
     **/
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     **/
    public Map<String, Object> getAdditionalInfo() {
        return additionalInfo;
    }
    public void setAdditionalInfo(Map<String, Object> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     **/
    public String getRuleId() {
        return ruleId;
    }
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

}
