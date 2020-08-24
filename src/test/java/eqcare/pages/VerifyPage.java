package eqcare.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import eqcare.helper.Utility;

public class VerifyPage {
	
	WebDriver driver;
	
	public VerifyPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public  void verifyLinks() 
	{
		
		
			
			verifyLinkActive("https://pony.qa.eqcarestaging.com/login");
			
			verifyLinkActive("https://clinic.qa.eqcarestaging.com/login");
			
			verifyLinkActive("https://clinic.qa.eqcarestaging.com/admin/login");
		
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			System.out.println(url);
			
			verifyLinkActive(url);
			
		}*/
		
	}
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	
	

}
