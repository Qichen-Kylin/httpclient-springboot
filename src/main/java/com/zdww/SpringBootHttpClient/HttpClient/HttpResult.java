package com.zdww.SpringBootHttpClient.HttpClient;

public class HttpResult {

    // 响应码
    private Integer code;

    // 响应体
    private String body;

    // 响应头
    private String head;

    public HttpResult() {
        super();
    }

    public HttpResult (Integer code, String body ,String head) {
        super();
        this.code = code;
        this.body = body;
        this.head = head;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() { return head; }

    public void setHead(String head) { this.head = head; }

}