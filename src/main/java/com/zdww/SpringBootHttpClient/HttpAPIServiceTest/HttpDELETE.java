//package com.zdww.SpringBootHttpClient.HttpClient;
//
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpDelete;
//import org.apache.http.client.utils.URIBuilder;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.Base64;
//import java.util.Map;
//
//@Component
//public class HttpDELETE {
//
//    @Autowired
//    private CloseableHttpClient httpClient;
//
//    @Autowired
//    private RequestConfig config;
//
//    public HttpDELETE() {
//        // 1 创建HttpClinet，相当于打开浏览器
//        httpClient = HttpClients.createDefault();
//    }
//    /* *
//     * Http Delete请求
//     * @author kylin
//     * @date 2020/10/30
//     * @param [url, map]
//     * @return HttpResult
//     */
//    public HttpResult doDelete(String url, Map<String, Object> map) throws Exception {
//
//        // 声明URIBuilder
//        URIBuilder uriBuilder = new URIBuilder(url);
//
//        // 判断参数map是否为非空
//        if (map != null) {
//            // 遍历参数
//            for (Map.Entry<String, Object> entry : map.entrySet()) {
//                // 设置参数
//                uriBuilder.setParameter(entry.getKey(), entry.getValue().toString());
//            }
//        }
//
//        // 2 创建httpGet对象，相当于设置url请求地址
//        HttpDelete httpDelete = new HttpDelete(uriBuilder.build());
//        httpDelete.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
//        httpDelete.addHeader("X-Requested-By","sdc");
//        httpDelete.setHeader("Content-Type","application/json");
//
//        System.out.println(httpDelete.getURI());
//        // 3 使用HttpClient执行httpDelete，相当于按回车，发起请求
//        CloseableHttpResponse response = null;
//
//        try {
//            response = httpClient.execute(httpDelete);
//        } catch (IOException e) {
//            HttpResult httpResult = new HttpResult();
//            httpResult.setCode(404);
//            httpResult.setBody("Delete请求失败!");
//            return httpResult;
//        }
//
//        // 4 解析结果，封装返回对象httpResult，相当于显示相应的结果
//        HttpResult httpResult = new HttpResult();
//        // 解析数据封装HttpResult
//        if (response.getEntity() != null) {
//            System.out.println(response.getEntity().getContentType());
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
//        } else {
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            httpResult.setBody("Delete请求异常！");
//        }
//        // 返回
//        return httpResult;
//    }
//}
