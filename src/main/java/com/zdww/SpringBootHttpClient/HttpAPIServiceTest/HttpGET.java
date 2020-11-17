//package com.zdww.SpringBootHttpClient.HttpClient;
//
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
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
//public class HttpGET {
//
//    @Autowired
//    private CloseableHttpClient httpClient;
//
//    @Autowired
//    private RequestConfig config;
//
//    public HttpGET() {
//        // 1 创建HttpClinet，相当于打开浏览器
//        httpClient = HttpClients.createDefault();
//    }
//    /* *
//     * Http Get请求
//     * @author kylin
//     * @date 2020/10/30
//     * @param [url, map]
//     * @return HttpResult
//     */
//    public HttpResult doGet(String url, Map<String, Object> map) throws Exception {
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
//        HttpGet httpGet = new HttpGet(uriBuilder.build());
//        httpGet.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
//        httpGet.addHeader("X-Requested-By","sdc");
//        httpGet.setHeader("Content-Type","application/json");
//
//        System.out.println(httpGet.getURI());
//        // 3 使用HttpClient执行httpGet，相当于按回车，发起请求
//        CloseableHttpResponse response = null;
////        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, "OK");
////        response.addHeader("X-Requested-By","sdc");
////        response.addHeader("Content-Type","applicaton/json;UTF-8");
////        Header H1 = response.getFirstHeader("X-Requested-By");
////        System.out.println(H1);
////        Header H2 = response.getLastHeader("Content-Type");
////        System.out.println(H2);
//
//        try {
//            response = httpClient.execute(httpGet);
//        } catch (IOException e) {
//            HttpResult httpResult = new HttpResult();
//            httpResult.setCode(404);
//            httpResult.setBody("请求失败!");
//            return httpResult;
//        }
//
//        // 4 解析结果，封装返回对象httpResult，相当于显示相应的结果
//        // 状态码
//        //response.getStatusLine().getStatusCode();
//        // 响应体，字符串，如果response.getEntity()为空，下面这个代码会报错,所以解析之前要做非空的判断
//        // EntityUtils.toString(response.getEntity(), "UTF-8");
//        HttpResult httpResult = new HttpResult();
//        // 解析数据封装HttpResult
//        if (response.getEntity() != null) {
//            System.out.println(response.getEntity().getContentType());
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
//        } else {
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            //httpResult.setBody("");
//        }
//        // 返回
//        return httpResult;
//    }
//}
