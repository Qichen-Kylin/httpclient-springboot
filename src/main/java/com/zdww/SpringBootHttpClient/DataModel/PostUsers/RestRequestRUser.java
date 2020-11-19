package com.zdww.SpringBootHttpClient.DataModel.PostUsers;

public class RestRequestRUser {
    //定义私有属性
    private String envelopeVersion = null;
    private RUser data = null;

    //创建的setter和getter方法
    public String getEnvelopeVersion() { return envelopeVersion; }
    public void setEnvelopeVersion(String envelopeVersion) { this.envelopeVersion = envelopeVersion; }

    public RUser getData() { return data; }
    public void setData(RUser data) { this.data = data; }
}
