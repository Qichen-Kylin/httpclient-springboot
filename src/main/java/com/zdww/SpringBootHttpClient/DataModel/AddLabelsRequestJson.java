package com.zdww.SpringBootHttpClient.DataModel;

public class AddLabelsRequestJson {
    //定义私有属性
    private String[] labels;
    private String[] pipelineNames;
    //无参数的构造器
    public AddLabelsRequestJson() {}
    //有参数的构造器
    public AddLabelsRequestJson(String[] labels, String[] pipelineNames) {
        this.labels = labels;
        this.pipelineNames = pipelineNames;
    }
    //创建的setter和getter方法
    public String[] getLabels() {
        return labels;
    }
    public void setLabels(String[] labels) { this.labels = labels; }
    public  String[] getPipelineNames() {
        return pipelineNames;
    }
    public void setPipelineNames(String[] pipelineNames) {
        this.pipelineNames = pipelineNames;
    }
}
