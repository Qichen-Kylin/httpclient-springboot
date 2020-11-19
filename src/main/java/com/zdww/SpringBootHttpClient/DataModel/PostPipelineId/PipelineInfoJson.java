package com.zdww.SpringBootHttpClient.DataModel.PostPipelineId;

import java.util.Date;
import java.util.Map;

public class PipelineInfoJson {

    private String pipelineId = null;
    private String title = null;
    private String description = null;
    private Date created = null;
    private Date lastModified = null;
    private String creator = null;
    private String lastModifier = null;
    private String lastRev = null;
    private String uuid = null;
    private Boolean valid = null;
    private Map<String, Object> metadata = null;
    private String name = null;
    private String sdcVersion = null;
    private String sdcId = null;

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

    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getLastModifier() {
        return lastModifier;
    }
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public String getLastRev() {
        return lastRev;
    }
    public void setLastRev(String lastRev) {
        this.lastRev = lastRev;
    }

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getValid() {
        return valid;
    }
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSdcVersion() {
        return sdcVersion;
    }
    public void setSdcVersion(String sdcVersion) {
        this.sdcVersion = sdcVersion;
    }

    public String getSdcId() {
        return sdcId;
    }
    public void setSdcId(String sdcId) {
        this.sdcId = sdcId;
    }
}
