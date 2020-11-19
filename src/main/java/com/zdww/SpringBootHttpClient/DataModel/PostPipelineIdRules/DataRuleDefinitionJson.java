package com.zdww.SpringBootHttpClient.DataModel.PostPipelineIdRules.;

public class DataRuleDefinitionJson {

    private String id ;
    private String label ;
    private String lane ;
    private Double samplingPercentage ;
    private Integer samplingRecordsToRetain ;
    private String condition ;
    private Boolean alertEnabled ;
    private String alertText ;

    public enum ThresholdTypeEnum {
        COUNT("COUNT"), PERCENTAGE("PERCENTAGE");

        private String value;

        ThresholdTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private ThresholdTypeEnum thresholdType ;
    private String thresholdValue ;
    private Long minVolume ;
    private Boolean meterEnabled ;
    private Boolean sendEmail ;
    private Boolean enabled ;
    private Boolean valid ;
    private long timestamp;


    /**
     **/
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    /**
     **/
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }


    /**
     **/
    public String getLane() {
        return lane;
    }
    public void setLane(String lane) {
        this.lane = lane;
    }


    /**
     **/
    public Double getSamplingPercentage() {
        return samplingPercentage;
    }
    public void setSamplingPercentage(Double samplingPercentage) {
        this.samplingPercentage = samplingPercentage;
    }


    /**
     **/
    public Integer getSamplingRecordsToRetain() {
        return samplingRecordsToRetain;
    }
    public void setSamplingRecordsToRetain(Integer samplingRecordsToRetain) {
        this.samplingRecordsToRetain = samplingRecordsToRetain;
    }


    /**
     **/
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }


    /**
     **/
    public Boolean getAlertEnabled() {
        return alertEnabled;
    }
    public void setAlertEnabled(Boolean alertEnabled) {
        this.alertEnabled = alertEnabled;
    }


    /**
     **/
    public String getAlertText() {
        return alertText;
    }
    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }


    /**
     **/
    public ThresholdTypeEnum getThresholdType() {
        return thresholdType;
    }
    public void setThresholdType(ThresholdTypeEnum thresholdType) {
        this.thresholdType = thresholdType;
    }


    /**
     **/
    public String getThresholdValue() {
        return thresholdValue;
    }
    public void setThresholdValue(String thresholdValue) {
        this.thresholdValue = thresholdValue;
    }


    /**
     **/
    public Long getMinVolume() {
        return minVolume;
    }
    public void setMinVolume(Long minVolume) {
        this.minVolume = minVolume;
    }


    /**
     **/
    public Boolean getMeterEnabled() {
        return meterEnabled;
    }
    public void setMeterEnabled(Boolean meterEnabled) {
        this.meterEnabled = meterEnabled;
    }


    /**
     **/
    public Boolean getSendEmail() {
        return sendEmail;
    }
    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     **/
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     **/
    public Boolean getValid() {
        return valid;
    }
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     **/
    public long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
