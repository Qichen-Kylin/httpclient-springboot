package com.zdww.SpringBootHttpClient.HttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;


@Component
public class HttpAPIService {

    @Autowired
    private CloseableHttpClient httpClient;

    @Autowired
    private RequestConfig config;

    public HttpAPIService() {
        // 1 创建HttpClinet，相当于打开浏览器
        httpClient = HttpClients.createDefault();
    }

    /* *
     * Http Get请求
     * @author kylin
     * @date 2020/10/30
     * @param [url, map]
     * @return HttpResult
     */
    public HttpResult doGet(String url, Map<String, Object> map) throws Exception {

        // 声明URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);

        // 判断参数map是否为非空
        if (map != null) {
            // 遍历参数
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                // 设置参数
                if (entry.getValue() != "") {
                    uriBuilder.setParameter(entry.getKey(), entry.getValue().toString());
                }
            }
        }

        // 2 创建httpGet对象，相当于设置url请求地址
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        httpGet.addHeader("X-Requested-By","sdc");
        httpGet.setHeader("Content-Type","application/json");

        //获取request URL
        System.out.println("request URL：");
        System.out.println(httpGet.getURI());
        // 3 使用HttpClient执行httpGet，相当于按回车，发起请求
        CloseableHttpResponse response = null;
//        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, "OK");
//        response.addHeader("X-Requested-By","sdc");
//        response.addHeader("Content-Type","applicaton/json;UTF-8");
//        Header H1 = response.getFirstHeader("X-Requested-By");
//        System.out.println(H1);
//        Header H2 = response.getLastHeader("Content-Type");
//        System.out.println(H2);

        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            HttpResult httpResult = new HttpResult();
            httpResult.setCode(404);
            httpResult.setBody("请求失败!");
            return httpResult;
        }

        // 4 解析结果，封装返回对象httpResult，相当于显示相应的结果
        // 状态码
        //response.getStatusLine().getStatusCode();
        // 响应体，字符串，如果response.getEntity()为空，下面这个代码会报错,所以解析之前要做非空的判断
        // EntityUtils.toString(response.getEntity(), "UTF-8");
        HttpResult httpResult = new HttpResult();
        // 解析数据封装HttpResult
        if (response.getEntity() != null) {
            System.out.println(response.getEntity().getContentType());
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
        } else {
            httpResult.setCode(response.getStatusLine().getStatusCode());
            //httpResult.setBody("");
        }
        // 返回
        return httpResult;
    }

    /* *
     * HttpPOST请求
     * @author kylin
     * @date 2020/11/2 18:13
     * @param [url, map]
     * @return com.example.HttpClient.HttpResult
     */
    public HttpResult doPost(String url, Map<String,Object> map) throws Exception {
        // 声明URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(uriBuilder.build());
        httpPost.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        httpPost.addHeader("X-Requested-By","sdc");
        httpPost.addHeader("Content-Type","application/json");

        // 判断map不为空
        if (map != null) {
            // 声明存放参数的List集合
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            // 遍历map，设置参数到list中
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != "") {
                    params.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
                }
            }

            // 创建form表单对象
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params,"UTF-8");

            // 把表单对象设置到httpPost中
            httpPost.setEntity(formEntity);
        }

        //获取request URL
        System.out.println("request URL：");
        System.out.println(httpPost.getURI());
        // 使用HttpClient发起请求，返回response
        CloseableHttpResponse response = null;
        //response.addHeader("Content-Type","application/json;UTF-8");
        try {
            response = httpClient.execute(httpPost);
        } catch (IOException e) {
            HttpResult httpResult = new HttpResult();
            httpResult.setCode(404);
            httpResult.setBody("请求失败");
            return httpResult;
        }

        // 解析response封装返回对象httpResult
        HttpResult httpResult = new HttpResult();
        // 解析数据封装HttpResult
        if (response.getEntity() != null) {
            System.out.println(response.getEntity().getContentType());
            //System.out.println(response.getEntity());
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
        } else {
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody("Post失败！");
        }
        // 返回结果
        return httpResult;
    }

    /* *
     * HttpPOST Body请求
     * @author kylin
     * @date 2020/11/4 9:13
     * @param [url, body]
     * @return com.example.HttpClient.HttpResult
     */
    public HttpResult doPostbody(String url, String body) throws Exception {
        // 声明URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(uriBuilder.build());
        httpPost.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        httpPost.addHeader("X-Requested-By","sdc");
        //httpPost.addHeader("Content-Type","application/json");
        // 设置请求体
        httpPost.setEntity(new StringEntity(body));
        //httpPost.setEntity(new StringEntity(body,"UTF-8"));
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("charset","utf8");

        //获取request URL
        System.out.println("request URL：");
        System.out.println(httpPost.getURI());
        // 使用HttpClient发起请求，返回response
        CloseableHttpResponse response = null;
        //response.addHeader("Content-Type","application/json;UTF-8");
        try {
            response = httpClient.execute(httpPost);
        } catch (IOException e) {
            HttpResult httpResult = new HttpResult();
            httpResult.setCode(404);
            httpResult.setBody("请求失败");
            return httpResult;
        }

        // 解析response封装返回对象httpResult
        HttpResult httpResult = new HttpResult();

        HttpEntity entity = response.getEntity();
        // 解析数据封装HttpResult
        if (entity != null) {
//            System.out.println(response.getStatusLine().getStatusCode());
//            String responseContent = EntityUtils.toString(entity,"UTF-8");
//            System.out.println(responseContent);
            // System.out.println("response code:");
            httpResult.setCode(response.getStatusLine().getStatusCode());
            // System.out.println("response body:");
            System.out.println(response.getEntity().getContentType());
            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
        } else {
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody("Post失败！");
        }
//        response.close();
//        httpClient.close();
        // 返回结果
        return httpResult;
    }

    /* *
     * HttpPOST Parameter&Body请求
     * @author kylin
     * @date 2020/11/4 9:13
     * @param [url, body, map]
     * @return com.example.HttpClient.HttpResult
     */
    public HttpResult doPostParameterAndBody(String url, String body ,Map<String,Object> map) throws Exception {
        // 声明URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(uriBuilder.build());
        httpPost.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        httpPost.addHeader("X-Requested-By","sdc");
        //httpPost.addHeader("Content-Type","application/json");
        // 设置请求体
        httpPost.setEntity(new StringEntity(body));
        //httpPost.setEntity(new StringEntity(body,"UTF-8"));
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");

        // 判断map不为空
        if (map != null) {
            // 声明存放参数的List集合
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            // 遍历map，设置参数到list中
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != "") {
                    params.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
                }
            }

            // 创建form表单对象
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params,"UTF-8");

            // 把表单对象设置到httpPost中
            httpPost.setEntity(formEntity);
        }
        //获取request URL
        System.out.println("request URL：");
        System.out.println(httpPost.getURI());
        // 使用HttpClient发起请求，返回response
        CloseableHttpResponse response = null;
        //response.addHeader("Content-Type","application/json;UTF-8");
        try {
            response = httpClient.execute(httpPost);
        } catch (IOException e) {
            HttpResult httpResult = new HttpResult();
            httpResult.setCode(404);
            httpResult.setBody("请求失败");
            return httpResult;
        }

        // 解析response封装返回对象httpResult
        HttpResult httpResult = new HttpResult();

        HttpEntity entity = response.getEntity();
        // 解析数据封装HttpResult
        if (entity != null) {
//            System.out.println(response.getStatusLine().getStatusCode());
//            String responseContent = EntityUtils.toString(entity,"UTF-8");
//            System.out.println(responseContent);
            // System.out.println("response code:");
            httpResult.setCode(response.getStatusLine().getStatusCode());
            // System.out.println("response body:");
            System.out.println(response.getEntity().getContentType());
            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
        } else {
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody("Post失败！");
        }
//        response.close();
//        httpClient.close();
        // 返回结果
        return httpResult;
    }

    /* *
     * Http Put请求
     * @author kylin
     * @date 2020/11/3 9:13
     * @param [url, map]
     * @return com.example.HttpClient.HttpResult
     */
    public HttpResult doPut(String url, Map<String,Object> map) throws Exception {
        // 声明URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);
        // 声明httpPut请求
        HttpPut httpPut = new HttpPut(uriBuilder.build());
        httpPut.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        httpPut.addHeader("X-Requested-By","sdc");
        httpPut.setHeader("Content-Type","application/json");

        // 判断map不为空
        if (map != null) {
            // 声明存放参数的List集合
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            // 遍历map，设置参数到list中
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                params.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }

            // 创建form表单对象
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params,"UTF-8");

            // 把表单对象设置到httpPut中
            httpPut.setEntity(formEntity);
        }

        //获取request URL
        System.out.println("request URL：");
        System.out.println(httpPut.getURI());
        // 使用HttpClient发起请求，返回response
        CloseableHttpResponse response = null;
        //response.addHeader("Content-Type","application/json;UTF-8");
        try {
            response = httpClient.execute(httpPut);
        } catch (IOException e) {
            HttpResult httpResult = new HttpResult();
            httpResult.setCode(404);
            httpResult.setBody("Put请求失败");
            return httpResult;
        }

        // 解析response封装返回对象httpResult
        HttpResult httpResult = new HttpResult();
        // 解析数据封装HttpResult
        if (response.getEntity() != null) {
            System.out.println(response.getEntity().getContentType());
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
        } else {
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody("Put失败！");
        }
        // 返回结果
        return httpResult;
    }

    /* *
     * Http Delete请求
     * @author kylin
     * @date 2020/11/3
     * @param [url, map]
     * @return HttpResult
     */
    public HttpResult doDelete(String url, Map<String, Object> map) throws Exception {

        // 声明URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);

        // 判断参数map是否为非空
        if (map != null) {
            // 遍历参数
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                // 设置参数
                uriBuilder.setParameter(entry.getKey(), entry.getValue().toString());
            }
        }

        // 2 创建httpGet对象，相当于设置url请求地址
        HttpDelete httpDelete = new HttpDelete(uriBuilder.build());
        httpDelete.addHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        httpDelete.addHeader("X-Requested-By","sdc");
        httpDelete.setHeader("Content-Type","application/json");

        //获取request URL
        System.out.println("request URL：");
        System.out.println(httpDelete.getURI());
        // 3 使用HttpClient执行httpDelete，相当于按回车，发起请求
        CloseableHttpResponse response = null;

        try {
            response = httpClient.execute(httpDelete);
        } catch (IOException e) {
            HttpResult httpResult = new HttpResult();
            httpResult.setCode(404);
            httpResult.setBody("Delete请求失败!");
            return httpResult;
        }

        // 4 解析结果，封装返回对象httpResult，相当于显示相应的结果
        HttpResult httpResult = new HttpResult();
        // 解析数据封装HttpResult
        if (response.getEntity() != null) {
            System.out.println(response.getEntity().getContentType());
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody(EntityUtils.toString(response.getEntity(),"UTF-8"));
        } else {
            httpResult.setCode(response.getStatusLine().getStatusCode());
            httpResult.setBody("Delete请求异常！");
        }
        // 返回
        return httpResult;
    }
}