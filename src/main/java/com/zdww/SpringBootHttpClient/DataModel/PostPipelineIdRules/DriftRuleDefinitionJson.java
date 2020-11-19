package com.zdww.SpringBootHttpClient.DataModel.PostPipelineIdRules;

public class DriftRuleDefinitionJson {
    private String id;
    private String label;
    private String lane;
    private double samplingPercentage;
    private int samplingRecordsToRetain;
    private String condition;
    private boolean alertEnabled;
    private String alertText;
    private boolean meterEnabled;
    private boolean sendEmail;
    private boolean enabled;
    private long timestamp;
    private Boolean valid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public double getSamplingPercentage() {
        return samplingPercentage;
    }

    public void setSamplingPercentage(double samplingPercentage) {
        this.samplingPercentage = samplingPercentage;
    }

    public int getSamplingRecordsToRetain() {
        return samplingRecordsToRetain;
    }

    public void setSamplingRecordsToRetain(int samplingRecordsToRetain) {
        this.samplingRecordsToRetain = samplingRecordsToRetain;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isAlertEnabled() {
        return alertEnabled;
    }

    public void setAlertEnabled(boolean alertEnabled) {
        this.alertEnabled = alertEnabled;
    }

    public String getAlertText() {
        return alertText;
    }

    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }

    public boolean isMeterEnabled() {
        return meterEnabled;
    }

    public void setMeterEnabled(boolean meterEnabled) {
        this.meterEnabled = meterEnabled;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
