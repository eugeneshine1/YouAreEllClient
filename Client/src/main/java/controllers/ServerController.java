package controllers;

import models.Id;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
//import spiffyUrlManipulator

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;


public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085";


    private static ServerController svr = new ServerController();

//    private ServerController() {}
//
//    public static ServerController shared() {
//        return svr;
//    }
//
//    public String idGet(String url) {
//        // url -> /ids/
//        // send the server a get with url
//        // return json from server
//        String str = "";
//        try {
//            CloseableHttpClient httpClient = HttpClients.createDefault();
//            HttpGet getRequest = new HttpGet(rootURL + "/" +url);
//
//            ResponseHandler<String> responseHandler = response -> {
//                int statusCode = response.getStatusLine().getStatusCode();
//                if (statusCode >= HttpURLConnection.HTTP_OK && statusCode<300)// or 200
//                {
//                    HttpEntity httpEntity = response.getEntity();
//                    return httpEntity != null ? EntityUtils.toString(httpEntity) : null;
//                } else {
//                    throw new ClientProtocolException("Failed with HTTP error code : " + statusCode);
//                }
//            };
//            String body = httpClient.execute(getRequest,responseHandler);
//            System.out.println(body);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return str;
//    }
//    public String idPost(String url) {
//        // url -> /ids/
//        // create json from Id
//        // request
//        // reply
//        // return json
//        String str = "";
//        try {
//            CloseableHttpClient httpClient = HttpClients.createDefault();
//            HttpPost postRequest = new HttpPost(rootURL + "/" +url);
//
//            postRequest.setHeader("accept","application/json");
//            postRequest.setHeader("content-type","application/json");
//
//            String JSON_STRING = "{\"userid\":\"-\",\"name\":\"Eugene\",\"github\":\"eugeneshine1\"}";
//
//            postRequest.setEntity(new StringEntity(JSON_STRING,ContentType.APPLICATION_JSON));
////            StringEntity stringEntity = new StringEntity(JSON_STRING);
////            postRequest.setEntity(stringEntity);
////            CloseableHttpResponse response2 = httpClient.execute(postRequest);
//
//            ResponseHandler<String> responseHandler = response -> {
//                int statusCode = response.getStatusLine().getStatusCode();
//                if (statusCode >= HttpURLConnection.HTTP_OK && statusCode<300)// or 200
//                {
//                    HttpEntity httpEntity = response.getEntity();
//                    return httpEntity != null ? EntityUtils.toString(httpEntity) : null;
//                } else {
//                    throw new ClientProtocolException("Failed with HTTP error code : " + statusCode);
//                }
//            };
//            String body = httpClient.execute(postRequest,responseHandler);
//            System.out.println(body);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return str;
//    }
//    public String idPut(String url) {
//        // url -> /ids/
//        try {
//            CloseableHttpClient httpClient = HttpClients.createDefault();
//            HttpPut putRequest = new HttpPut(rootURL + "/" +url);
//
//            putRequest.setHeader("accept","application/json");
//            putRequest.setHeader("content-type","application/json");
//
//            String JSON_STRING = "{\"userid\":\"-\",\"name\":\"Eugene\",\"github\":\"eugeneshine1\"}";
//
//            putRequest.setEntity(new StringEntity(JSON_STRING,ContentType.APPLICATION_JSON));            StringEntity stringEntity = new StringEntity(JSON_STRING);
////            putRequest.setEntity(stringEntity);
////            CloseableHttpResponse response2 = httpClient.execute(putRequest);
//
//            ResponseHandler<String> responseHandler = response -> {
//                int statusCode = response.getStatusLine().getStatusCode();
//                if (statusCode >= HttpURLConnection.HTTP_OK && statusCode<300)// or 200
//                {
//                    HttpEntity httpEntity = response.getEntity();
//                    return httpEntity != null ? EntityUtils.toString(httpEntity) : null;
//                } else {
//                    throw new ClientProtocolException("Failed with HTTP error code : " + statusCode);
//                }
//            };
//            String body = httpClient.execute(putRequest,responseHandler);
//            System.out.println(body);
//
//            return null;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
    public static void main(String[] args) {
        svr.idGet("messages");
        svr.idPost("ids");
        svr.idPut("ids");
    }

}

// ServerController.shared.doGet()