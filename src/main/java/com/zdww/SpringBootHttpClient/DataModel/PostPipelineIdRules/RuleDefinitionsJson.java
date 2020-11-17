package com.zdww.SpringBootHttpClient.DataModel;

import java.util.List;

public class RuleDefinitionsJson {
    //定义私有属性
    private Integer schemaVersion;
    private Integer version;
    private List<MetricsRuleDefinitionJson> metricsRuleDefinitions;
    private List<DataRuleDefinitionJson> dataRuleDefinitions;
    private List<DriftRuleDefinitionJson> driftRuleDefinitions;
    private String uuid;
    private List<RuleIssueJson> ruleIssues;
    private List<ConfigConfigurationJson> configuration;
    private List<IssueJson> configIssues;

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

    public List<MetricsRuleDefinitionJson> getMetricsRuleDefinitions() {
        return metricsRuleDefinitions;
    }

    public void setMetricsRuleDefinitions(List<MetricsRuleDefinitionJson> metricsRuleDefinitions) {
        this.metricsRuleDefinitions = metricsRuleDefinitions;
    }

    public List<DataRuleDefinitionJson> getDataRuleDefinitions() {
        return dataRuleDefinitions;
    }

    public void setDataRuleDefinitions(List<DataRuleDefinitionJson> dataRuleDefinitions) {
        this.dataRuleDefinitions = dataRuleDefinitions;
    }

    public List<DriftRuleDefinitionJson> getDriftRuleDefinitions() {
        return driftRuleDefinitions;
    }

    public void setDriftRuleDefinitions(List<DriftRuleDefinitionJson> driftRuleDefinitions) {
        this.driftRuleDefinitions = driftRuleDefinitions;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<RuleIssueJson> getRuleIssues() {
        return ruleIssues;
    }

    public void setRuleIssues(List<RuleIssueJson> ruleIssues) {
        this.ruleIssues = ruleIssues;
    }

    public List<ConfigConfigurationJson> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(List<ConfigConfigurationJson> configuration) {
        this.configuration = configuration;
    }

    public List<IssueJson> getConfigIssues() {
        return configIssues;
    }

    public void setConfigIssues(List<IssueJson> configIssues) {
        this.configIssues = configIssues;
    }

}
