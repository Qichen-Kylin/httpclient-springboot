package com.zdww.SpringBootHttpClient.DataModel.PostPipelineIdRules;

public class MetricsRuleDefinitionJson {

    private String id ;
    private String alertText ;
    private String metricId ;

    public enum MetricTypeEnum {
        GAUGE("GAUGE"),
        COUNTER("COUNTER"),
        HISTOGRAM("HISTOGRAM"),
        METER("METER"),
        TIMER("TIMER");

        private String value;

        MetricTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private MetricTypeEnum metricType ;

    public enum MetricElementEnum {
        // Related to Counters
        COUNTER_COUNT("COUNTER_COUNT"),

        // Related to Histogram
        HISTOGRAM_COUNT("HISTOGRAM_COUNT"),
        HISTOGRAM_MAX("HISTOGRAM_MAX"),
        HISTOGRAM_MIN("HISTOGRAM_MIN"),
        HISTOGRAM_MEAN("HISTOGRAM_MEAN"),
        HISTOGRAM_MEDIAN("HISTOGRAM_MEDIAN"),
        HISTOGRAM_P50("HISTOGRAM_P50"),
        HISTOGRAM_P75("HISTOGRAM_P75"),
        HISTOGRAM_P95("HISTOGRAM_P95"),
        HISTOGRAM_P98("HISTOGRAM_P98"),
        HISTOGRAM_P99("HISTOGRAM_P99"),
        HISTOGRAM_P999("HISTOGRAM_P999"),
        HISTOGRAM_STD_DEV("HISTOGRAM_STD_DEV"),

        // Meters
        METER_COUNT("METER_COUNT"),
        METER_M1_RATE("METER_M1_RATE"),
        METER_M5_RATE("METER_M5_RATE"),
        METER_M15_RATE("METER_M15_RATE"),
        METER_M30_RATE("METER_M30_RATE"),
        METER_H1_RATE("METER_H1_RATE"),
        METER_H6_RATE("METER_H6_RATE"),
        METER_H12_RATE("METER_H12_RATE"),
        METER_H24_RATE("METER_H24_RATE"),
        METER_MEAN_RATE("METER_MEAN_RATE"),

        // Timer
        TIMER_COUNT("TIMER_COUNT"),
        TIMER_MAX("TIMER_MAX"),
        TIMER_MIN("TIMER_MIN"),
        TIMER_MEAN("TIMER_MEAN"),
        TIMER_P50("TIMER_P50"),
        TIMER_P75("TIMER_P75"),
        TIMER_P95("TIMER_P95"),
        TIMER_P98("TIMER_P98"),
        TIMER_P99("TIMER_P99"),
        TIMER_P999("TIMER_P999"),
        TIMER_STD_DEV("TIMER_STD_DEV"),
        TIMER_M1_RATE("TIMER_M1_RATE"),
        TIMER_M5_RATE("TIMER_M5_RATE"),
        TIMER_M15_RATE("TIMER_M15_RATE"),
        TIMER_MEAN_RATE("TIMER_MEAN_RATE"),

        // Gauge - Related to Runtime Stats
        CURRENT_BATCH_AGE("CURRENT_BATCH_AGE"),
        TIME_IN_CURRENT_STAGE("TIME_IN_CURRENT_STAGE"),
        TIME_OF_LAST_RECEIVED_RECORD("TIME_OF_LAST_RECEIVED_RECORD"),
        LAST_BATCH_INPUT_RECORDS_COUNT("LAST_BATCH_INPUT_RECORDS_COUNT"),
        LAST_BATCH_OUTPUT_RECORDS_COUNT("LAST_BATCH_OUTPUT_RECORDS_COUNT"),
        LAST_BATCH_ERROR_RECORDS_COUNT("LAST_BATCH_ERROR_RECORDS_COUNT"),
        LAST_BATCH_ERROR_MESSAGES_COUNT("LAST_BATCH_ERROR_MESSAGES_COUNT"),
        ;

        private String value;

        MetricElementEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private MetricElementEnum metricElement ;
    private String condition ;
    private Boolean sendEmail ;
    private Boolean enabled ;
    private Boolean valid ;
    private long timestamp;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAlertText() {
        return alertText;
    }
    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }

    public String getMetricId() {
        return metricId;
    }
    public void setMetricId(String metricId) {
        this.metricId = metricId;
    }

    public MetricTypeEnum getMetricType() {
        return metricType;
    }
    public void setMetricType(MetricTypeEnum metricType) {
        this.metricType = metricType;
    }


    /**
     **/
    public MetricElementEnum getMetricElement() {
        return metricElement;
    }
    public void setMetricElement(MetricElementEnum metricElement) {
        this.metricElement = metricElement;
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
