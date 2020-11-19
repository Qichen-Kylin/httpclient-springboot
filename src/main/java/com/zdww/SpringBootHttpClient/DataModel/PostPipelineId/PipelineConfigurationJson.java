package com.zdww.SpringBootHttpClient.DataModel.PostPipelineId;

import java.util.List;
import java.util.Map;

public class PipelineConfigurationJson {
    private Integer schemaVersion = null;
    private Integer version = null;
    private String pipelineId = null;
    private String title = null;
    private String description = null;
    private String uuid = null;
    private List<ConfigConfigurationJson> configuration = null;
    private Map<String, Object> uiInfo = null;
    private List<PipelineFragmentConfigurationJson> fragments = null;
    private List<StageConfigurationJson> stages = null;
    private StageConfigurationJson errorStage = null;
    private PipelineInfoJson info = null;
    private Map<String, Object> metadata = null;
    private StageConfigurationJson statsAggregatorStage = null;
    private List<StageConfigurationJson> startEventStages = null;
    private List<StageConfigurationJson> stopEventStages  = null;
    private StageConfigurationJson testOriginStage = null;
    private Boolean valid =null;
    private IssuesJson issues = null;
    private Boolean previewable =null;

    public Integer getSchemaVersion() {
        return schemaVersion;
    }
    public void setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<ConfigConfigurationJson> getConfiguration() {
        return configuration;
    }
    public void setConfiguration(List<ConfigConfigurationJson> configuration) {
        this.configuration = configuration;
    }

    public Map<String, Object> getUiInfo() {
        return uiInfo;
    }
    public void setUiInfo(Map<String, Object> uiInfo) {
        this.uiInfo = uiInfo;
    }

    public List<PipelineFragmentConfigurationJson> getFragments() {
        return fragments;
    }
    public void setFragments(List<PipelineFragmentConfigurationJson> fragments) {
        this.fragments = fragments;
    }

    public List<StageConfigurationJson> getStages() {
        return stages;
    }
    public void setStages(List<StageConfigurationJson> stages) {
        this.stages = stages;
    }

    public StageConfigurationJson getErrorStage() {
        return errorStage;
    }
    public void setErrorStage(StageConfigurationJson errorStage) {
        this.errorStage = errorStage;
    }

    public PipelineInfoJson getInfo() {
        return info;
    }
    public void setInfo(PipelineInfoJson info) {
        this.info = info;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public StageConfigurationJson getStatsAggregatorStage() {
        return statsAggregatorStage;
    }
    public void setStatsAggregatorStage(StageConfigurationJson statsAggregatorStage) { this.statsAggregatorStage = statsAggregatorStage; }

    public List<StageConfigurationJson> getStartEventStages() {
        return startEventStages;
    }
    public void setStartEventStages(List<StageConfigurationJson> startEventStages) { this.startEventStages = startEventStages; }

    public List<StageConfigurationJson> getStopEventStages() {
        return stopEventStages;
    }
    public void setStopEventStages(List<StageConfigurationJson> stopEventStages) { this.stopEventStages = stopEventStages; }

    public StageConfigurationJson getTestOriginStage() {
        return testOriginStage;
    }
    public void setTestOriginStage(StageConfigurationJson testOriginStage) {
        this.testOriginStage = testOriginStage;
    }

    public Boolean getValid() {
        return valid;
    }
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public IssuesJson getIssues() {
        return issues;
    }
    public void setIssues(IssuesJson issues) {
        this.issues = issues;
    }

    public Boolean getPreviewable() {
        return previewable;
    }
    public void setPreviewable(Boolean previewable) {
        this.previewable = previewable;
    }

}
