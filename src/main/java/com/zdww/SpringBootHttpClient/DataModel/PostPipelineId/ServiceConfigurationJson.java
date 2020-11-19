package com.zdww.SpringBootHttpClient.DataModel.PostPipelineId;

import java.util.List;

public class ServiceConfigurationJson {

    private String service = null;
    private Integer serviceVersion = null;
    private List<ConfigConfigurationJson> configuration = null;

    public String getService() {
        return service;
    }
    public void setServiceName(String serviceName) {
        this.service = serviceName;
    }

    public Integer getServiceVersion() {
        return serviceVersion;
    }
    public void setServiceVersion(Integer serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public List<ConfigConfigurationJson> getConfiguration() {
        return configuration;
    }
    public void setConfiguration(List<ConfigConfigurationJson> configuration) {
        this.configuration = configuration;
    }

}
