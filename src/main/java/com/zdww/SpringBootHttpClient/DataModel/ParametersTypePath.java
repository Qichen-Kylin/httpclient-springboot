package com.zdww.SpringBootHttpClient.DataModel;

public class ParametersTypePath {
    //定义私有属性
    private String pipelineId;
    //无参数的构造器
    public ParametersTypePath() {}
    //有参数的构造器
    public ParametersTypePath(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    //创建的setter和getter方法
    public String getPipelineId() {
        return pipelineId;
    }
    public void setPipelineId(String pipelineId) { this.pipelineId = pipelineId; }

}
