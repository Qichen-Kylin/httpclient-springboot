package com.zdww.SpringBootHttpClient.DataModel.PostPipelineIdRules;

import java.util.List;
import java.util.Map;

public class IssueJson {
    private String message ;
    private String level ;
    private String instanceName ;
    private String serviceName ;
    private String configGroup ;
    private String configName ;
    private Map<String, Object> additionalInfo;
    private long count;
    private List<AntennaDoctorMessageJson> antennaDoctorMessages;

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
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }


    /**
     **/
    public String getInstanceName() {
        return instanceName;
    }
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     **/
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     **/
    public String getConfigGroup() {
        return configGroup;
    }
    public void setConfigGroup(String configGroup) {
        this.configGroup = configGroup;
    }


    /**
     **/
    public String getConfigName() {
        return configName;
    }
    public void setConfigName(String configName) {
        this.configName = configName;
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
    public long getCount() {
        return count;
    }
    public void setCount(long count) {
        this.count = count;
    }

    /**
     **/
    public List<AntennaDoctorMessageJson> getAntennaDoctorMessages() {
        return antennaDoctorMessages;
    }
    public void setAntennaDoctorMessages(List<AntennaDoctorMessageJson> antennaDoctorMessages) {
        this.antennaDoctorMessages = antennaDoctorMessages;
    }
}
