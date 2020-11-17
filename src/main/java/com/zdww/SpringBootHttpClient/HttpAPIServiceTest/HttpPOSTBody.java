//package com.zdww.SpringBootHttpClient.HttpClient;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.utils.URIBuilder;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Base64;
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class HttpPOSTBody {
//
//    @Autowired
//    private CloseableHttpClient httpClient;
//
//    @Autowired
//    private RequestConfig config;
//
//    public HttpPOSTBody() {
//        // 1 创建HttpClinet，相当于打开浏览器
//        httpClient = HttpClients.createDefault();
//    }
//
//    /* *
//     * HttpPOST Body请求
//     * @author kylin
//     * @date 2020/11/2 18:13
//     * @param [url, map]
//     * @return com.example.HttpClient.HttpResult
//     */
//    public HttpResult doPostbody(String url, String body) throws Exception {
//        // 声明URIBuilder
//        URIBuilder uriBuilder = new URIBuilder(url);
//        // 声明httpPost请求
//        HttpPost httpPost = new HttpPost(uriBuilder.build());
//        httpPost.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
//        httpPost.addHeader("X-Requested-By","sdc");
//        httpPost.addHeader("Content-Type","application/json");
//        // 设置请求体
//        httpPost.setEntity(new StringEntity(body));
//        //获取request URL
//        System.out.println("request URL：");
//        System.out.println(httpPost.getURI());
//        // 使用HttpClient发起请求，返回response
//        CloseableHttpResponse response = null;
//        //response.addHeader("Content-Type","application/json;UTF-8");
//        try {
//            response = httpClient.execute(httpPost);
//        } catch (IOException e) {
//            HttpResult httpResult = new HttpResult();
//            httpResult.setCode(404);
//            httpResult.setBody("请求失败");
//            return httpResult;
//        }
//
//        // 解析response封装返回对象httpResult
//        HttpResult httpResult = new HttpResult();
//
//        HttpEntity entity = response.getEntity();
//        // 解析数据封装HttpResult
//        if (entity != null) {
////            System.out.println(response.getStatusLine().getStatusCode());
////            String responseContent = EntityUtils.toString(entity,"UTF-8");
////            System.out.println(responseContent);
//            // System.out.println("response code:");
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            // System.out.println("response body:");
//            System.out.println(response.getEntity().getContentType());
//            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
//        } else {
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            httpResult.setBody("Post失败！");
//        }
////        response.close();
////        httpClient.close();
//        // 返回结果
//        return httpResult;
//    }
//}
