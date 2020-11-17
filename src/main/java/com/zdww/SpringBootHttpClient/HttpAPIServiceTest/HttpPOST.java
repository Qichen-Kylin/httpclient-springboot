//package com.zdww.SpringBootHttpClient.HttpClient;
//
//import org.apache.http.NameValuePair;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.utils.URIBuilder;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Base64;
//import java.util.Map;
//
//@Component
//public class HttpPOST {
//
//    @Autowired
//    private CloseableHttpClient httpClient;
//
//    @Autowired
//    private RequestConfig config;
//
//    public HttpPOST() {
//        // 1 创建HttpClinet，相当于打开浏览器
//        httpClient = HttpClients.createDefault();
//    }
//
//    /* *
//     * HttpPOST请求
//     * @author kylin
//     * @date 2020/11/2 18:13
//     * @param [url, map]
//     * @return com.example.HttpClient.HttpResult
//     */
//    public HttpResult doPost(String url, Map<String,Object> map) throws Exception {
//        // 声明URIBuilder
//        URIBuilder uriBuilder = new URIBuilder(url);
//        // 声明httpPost请求
//        HttpPost httpPost = new HttpPost(uriBuilder.build());
//        httpPost.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
//        httpPost.addHeader("X-Requested-By","sdc");
//        httpPost.addHeader("Content-Type","application/json");
//
//        // 判断map不为空
//        if (map != null) {
//            // 声明存放参数的List集合
//            List<NameValuePair> params = new ArrayList<NameValuePair>();
//            // 遍历map，设置参数到list中
//            for (Map.Entry<String, Object> entry : map.entrySet()) {
//                params.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
//            }
//
//            // 创建form表单对象
//            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params,"UTF-8");
//
//            // 把表单对象设置到httpPost中
//            httpPost.setEntity(formEntity);
//        }
//
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
//        // 解析数据封装HttpResult
//        if (response.getEntity() != null) {
//            System.out.println(response.getEntity().getContentType());
//            //System.out.println(response.getEntity());
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
//        } else {
//            httpResult.setCode(response.getStatusLine().getStatusCode());
//            httpResult.setBody("Post失败！");
//        }
//        // 返回结果
//        return httpResult;
//    }
//}
