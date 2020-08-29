package com.practitest.examples;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import org.apache.commons.codec.binary.Base64;
;

/**
 * This example demonstrates how to call practiTest API V2 with basic auth (Get request)
 *
 *
 * curl -H "Content-Type: application/json" \
     -u sdhall@eqcare.com:0bc03cabd0dc1c944bdae4955ffcc92d56bf3548  \
    https://api.practitest.com/api/v2/projects.json | python -m json.tool
 *
 */


public class practitestGetProjects {
    private static final String URI = "https://api.practitest.com/api/v2/projects.json";
    private static final String DEVELOPER_EMAIL = "sdhall@eqcare.com";
    private static final String API_TOKEN = "0bc03cabd0dc1c944bdae4955ffcc92d56bf3548";

    
    @Test
    public void testPract() throws Exception {

        byte[] encoding = Base64.encodeBase64((DEVELOPER_EMAIL + ":" + API_TOKEN).getBytes());

        HttpClient httpclient = new DefaultHttpClient();

        HttpGet request = new HttpGet(URI);
        request.setHeader("Authorization", "Basic " + new String(encoding));
        request.addHeader("Content-Type", "application/json");

        System.out.println("executing request " + request.getURI());

        try {
        // Create a response handler
            HttpResponse response = httpclient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            String responseBody = EntityUtils.toString(entity);
            if (statusCode == 200) {
                System.out.println("SUCCESS: " + responseBody);
            } else {
                System.out.println("ERROR: " + statusCode + ": " + responseBody);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------");

        // When HttpClient instance is no longer needed,
        // shut down the connection manager to ensure
        // immediate deallocation of all system resources
        httpclient.getConnectionManager().shutdown();
    }

}