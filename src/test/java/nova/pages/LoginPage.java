package nova.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	By email=By.id("email");
	By password=By.id("password");
	By loginButton=By.xpath("//button[@type='submit']");
	By logoutButton=By.xpath("//a[contains(text(), 'Logout')]");
	
	
	public void verifyUrlBeforeLogin()
	{
		Utility.verifyURLContains(driver, "eqcare");
	}
	
	
	public void verifyFB()
	
	{
		System.out.println(driver.findElement(By.xpath("//a[2]//img[1]")).isDisplayed());
	}
	
	public void verifyUrlAfterLogin()
	{
		
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboards"), "Dashboard does not contain dashboard keyword");	
		// WebElement ele = Utility.waitForWebElement(driver, logoutButton);
		//String contactUsHeader = ele.getText();
		//Assert.assertEquals(contactUsHeader, "Logout");
	
		
	}
	

	
	public void loginToApplication(String userName,String passWord) throws InterruptedException
	{
		Utility.waitForWebElement(driver, email).sendKeys(userName);
		Utility.waitForWebElement(driver, password).sendKeys(passWord);
	
		
		Utility.waitForWebElement(driver, loginButton).click();
		
		Thread.sleep(2000);
		
	}
	

}