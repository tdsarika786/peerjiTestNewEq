/*
 upload test results with a file attachment
 curl -H "Content-Type:application/json" \
   -u test@pt.com:YOUR TOKEN \
   -X POST https://api.practitest.com/api/v2/projects/YOUR_PROJECT_ID/runs.json \
   -d '{"data": { "type": "instances", "attributes": {"instance-id": 3254471, "exit-code": 0 }, "files": {"data": [{"filename": "one.log", "content_encoded": "'"$( base64 /tmp/log_wifi1.log)"'" }, {"filename": "two.log", "content_encoded": "'"$( base64 /tmp/log_wifi2.log)"'" }]} }  }'
*/

package com.practitest.examples;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import org.apache.commons.codec.binary.Base64;
import java.io.*;
import java.util.Properties;

import java.util.Date;
import java.util.Properties;


import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class runWithAttachments {
    private static final String URI = "https://api.practitest.com/api/v2/projects/13295/runs.json";
    private static final String DEVELOPER_EMAIL = "sdhall@eqcare.com";
    private static final String API_TOKEN = "0bc03cabd0dc1c944bdae4955ffcc92d56bf3548";
	private String tower_no;

      public void runTestResults(String instanceid) {

        byte[] encoding = Base64.encodeBase64((DEVELOPER_EMAIL + ":" + API_TOKEN).getBytes());

        HttpClient httpclient = new DefaultHttpClient();

        String json_str = "{" +
          "\"data\" : {\"attributes\" : {" +
            "\"instance-id\": "
            + instanceid + "," +
            "\"exit-code\": 0" +
          "} "
          +"} "
          + "}";

        HttpPost request = new HttpPost(URI);
        try {
			request.setEntity(new StringEntity(json_str));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        request.setHeader("Authorization", "Basic " + new String(encoding));
        request.addHeader("content-type", "application/json");


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


    private static String filenameToBase64(String fileName){
      File originalFile = new File(fileName);
      String encodedBase64 = null;
      try {
          FileInputStream fileInputStreamReader = new FileInputStream(originalFile);
          byte[] bytes = new byte[(int)originalFile.length()];
          fileInputStreamReader.read(bytes);
          encodedBase64 = new String(Base64.encodeBase64(bytes));
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
      return encodedBase64;
    }
    
  
    
    
    public void peerji() {
    	final String username = "sarikabagga7@gmail.com";
        final String password = "bible786";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("sdhall@eqcare.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("sdhall@eqcare.com, sdhall@eqcare.com")
            );
            message.setSubject("Testing Email");
            
         // message contains HTML markups
            String test = "<h1>This is actual message embedded in HTML tags</h1><br><i>Greetings!</i><br>";
            test += "<b>Wish you a nice day!</b><br>";
            test += "<font color=red>Duke</font>";
            
            String cat="Peerji";
			String subcat="Peerji";
			String quan="Peerji";
			String unit="Peerji";
			String rate="Peerji";
			String total="Peerji";
			String url="Peerji";
			String society_name="Peerji";
			String resi_name="Peerji";
			String flat_no="Peerji";
			String contact="Peerji";
			String email_id="Peerji";
			String html="<html><head>"
                    + "<title>"+message.getSubject()+"</title>"
                    + "</head>"+"<LINK REL='stylesheet' HREF='stylesheet/fac_css.css' TYPE='text/css'>"
                    + "<body>"
                    +"<table width='900' cellpadding='0' cellspacing='0' border='0'>"
                    +"<tr><td class ='text12' width='100%'><br>I ordered all the following items.Please deliver all the same items on the given below address:</td></tr><tr>"
                    +"<td height='5'></td></tr>"
                    +"<tr><td></td></tr>"
                    +"<tr><td height='5'></td></tr>"
                    +"<tr><td><table border='1' width='800' cellpadding='2' cellspacing='1' bgColor='#B6AFA9' style='border-collapse: collapse' bordercolor='#EBDA2A' align='left'>"
                    +"<tr bgColor=#CD919E class='centerheading' align='left'>"
                            +"<td width='30' style='color: #FFFFFF;'><b>Category</b></td>"
                            +"<td width='35' style='color: #FFFFFF;'><b>Subcategory</b></td>"
                            +"<td width='30' style='color: #FFFFFF;'><b>Quantity</b></td>"
                            +"<td width='30' style='color: #FFFFFF;'><b>Units</b></td>"
                            +"<td width='30' style='color: #FFFFFF;'><b>Rate</b></td>"
                            +"<td width='30' style='color: #FFFFFF;'><b>Total</b></td>"
                   + "</tr>"
                   +"<tr>"
                        +"<td width='30' style='color: #EEE9E9;'>"+cat+"</b></td>"
                            +"<td width='35' style='color: #EEE9E9;'>"+subcat+"</td>"
                            +"<td width='30' style='color: #EEE9E9;'>"+quan+"</td>"
                            +"<td width='30' style='color: #EEE9E9;'>"+unit+"</td>"
                            +"<td width='30' style='color: #EEE9E9;'>"+rate+"</td>"
                            +"<td width='30' style='color: #EEE9E9;'>"+total+"</td>"
                   +"</tr>"
                    +"</table>"
                +"</td>"
        +"</tr>"
        +"<tr>"
             +"<td height='6'></td>"
        +"</tr>"
        +"<tr>"
            +"<td class ='text12' width='100%'><a href="+url+" style='font-weight: bolder;'>Give Order Online Here---->>>>></a>."+"</td>"
        +"</tr>"
        +"<tr>"
             +"<td height='15'></td>"
        +"</tr>"
        +"<tr><td  class ='text12' width='100%'>"+"Regards"+"</td></tr>"
        +"<tr><td  class ='text12' width='100%'>"+"Society Name: "+society_name+"</td></tr>"
        +"<tr><td  class ='text12' width='100%'>"+"Resident Name: "+resi_name+"</td></tr>"
        +"<tr><td  class ='text12' width='100%'>"+"Flat No: "+flat_no+"</td></tr>"
        +"<tr><td  class ='text12' width='100%'>"+"Tower No: "+tower_no+"</td></tr>"
        +"<tr><td  class ='text12' width='100%'>"+"Ph: "+contact+"</td></tr>"
        +"<tr><td  class ='text12' width='100%'>"+"E-mail: "+email_id+"</td></tr>"
        +"</table>"
        +"</body></html>";
            
            message.setText(html);
            message.setContent(test, "text/html");
            

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
 
	}

