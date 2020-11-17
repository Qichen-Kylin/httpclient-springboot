/*
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License; Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing; software
 * distributed under the License is distributed on an "AS IS" BASIS;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND; either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zdww.SpringBootHttpClient.DataModel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class DriftRuleDefinitionJson {
  private String id = null;
  private String label = null;
  private String lane = null;
  private Double samplingPercentage = null;
  private Integer samplingRecordsToRetain = null;
  private String condition = null;
  private Boolean alertEnabled = null;
  private String alertText = null;
  private Boolean meterEnabled = null;
  private Boolean sendEmail = null;
  private Boolean enabled = null;
  private Long timestamp = null;
  private Boolean valid = null;

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("label")
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lane")
  public String getLane() {
    return lane;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lane")
  public void setLane(String lane) {
    this.lane = lane;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("samplingPercentage")
  public double getSamplingPercentage() {
    return samplingPercentage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("samplingPercentage")
  public void setSamplingPercentage(double samplingPercentage) {
    this.samplingPercentage = samplingPercentage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("samplingRecordsToRetain")
  public int getSamplingRecordsToRetain() {
    return samplingRecordsToRetain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("samplingRecordsToRetain")
  public void setSamplingRecordsToRetain(int samplingRecordsToRetain) {
    this.samplingRecordsToRetain = samplingRecordsToRetain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("condition")
  public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("alertEnabled")
  public Boolean isAlertEnabled() {
    return alertEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("alertEnabled")
  public void setAlertEnabled(Boolean alertEnabled) {
    this.alertEnabled = alertEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("alertText")
  public String getAlertText() {
    return alertText;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("alertText")
  public void setAlertText(String alertText) {
    this.alertText = alertText;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("meterEnabled")
  public Boolean isMeterEnabled() {
    return meterEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("meterEnabled")
  public void setMeterEnabled(Boolean meterEnabled) {
    this.meterEnabled = meterEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sendEmail")
  public Boolean isSendEmail() {
    return sendEmail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sendEmail")
  public void setSendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public long getTimestamp() {
    return timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
}
