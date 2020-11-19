package com.zdww.SpringBootHttpClient.DataModel.PostPipelineId;

import java.util.List;
import java.util.Map;

public class StageConfigurationJson {

    private String instanceName = null;
    private String library = null;
    private String stageName = null;
    private String stageVersion = null;
    private List<ConfigConfigurationJson> configuration = null;
    private List<ServiceConfigurationJson> services = null;
    private Map<String, Object> uiInfo = null;
    private List<String> inputLanes = null;
    private List<String> outputLanes = null;
    private List<String> eventLanes = null;

    public String getInstanceName() {
        return instanceName;
    }
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getLibrary() {
        return library;
    }
    public void setLibrary(String library) {
        this.library = library;
    }

    public String getStageName() {
        return stageName;
    }
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getStageVersion() {
        return stageVersion;
    }
    public void setStageVersion(String stageVersion) {
        this.stageVersion = stageVersion;
    }

    public List<ConfigConfigurationJson> getConfiguration() {
        return configuration;
    }
    public void setConfiguration(List<ConfigConfigurationJson> configuration) {
        this.configuration = configuration;
    }

    public List<ServiceConfigurationJson> getServices() {
        return services;
    }
    public void setServices(List<ServiceConfigurationJson> services) {
        this.services = services;
    }

    public Map<String, Object> getUiInfo() {
        return uiInfo;
    }
    public void setUiInfo(Map<String, Object> uiInfo) {
        this.uiInfo = uiInfo;
    }

    public List<String> getInputLanes() {
        return inputLanes;
    }
    public void setInputLanes(List<String> inputLanes) {
        this.inputLanes = inputLanes;
    }

    public List<String> getOutputLanes() {
        return outputLanes;
    }
    public void setOutputLanes(List<String> outputLanes) {
        this.outputLanes = outputLanes;
    }

    public List<String> getEventLanes() {
        return eventLanes;
    }
    public void setEventLanes(List<String> eventLanes) {
        this.eventLanes = eventLanes;
    }
}
