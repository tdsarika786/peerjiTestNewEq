package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class ClinicPage {

	WebDriver driver;

	public ClinicPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	By email=By.name("email");
	By password=By.name("password");
	By loginButton=By.id("login-button");
	By logoutButton=By.id("login-button");
	
	By TestPat = By.xpath("html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div[1]/div[3]/div/div[2]/div/button");
	
	By commentsLink=By.xpath("//a[contains(text(), 'Comments')]");
	
	By commentsTextArea=By.xpath("//textarea[contains(@aria-label, 'Comment')]");
	
	By commentsToggle=By.xpath("//input[contains(@aria-label, 'Share')]");
	
	By commentsButton=By.xpath("//div[contains(text(), 'Comment')]");
	
	public void loginToApplication(String userName,String passWord)
	{
		Utility.waitForWebElement(driver, email).sendKeys(userName);
		Utility.waitForWebElement(driver, password).sendKeys(passWord);
		Utility.waitForWebElement(driver, loginButton).click();
		
		Utility.wait(7);
		
	}
	
	
	
	public void clickToPatient()
	{
		Utility.waitForWebElement(driver, TestPat).click();
	}
	
	
	public void navigateToClinicVisitPage() {

		Utility.navigateToURL(driver, "https://clinic.eqserviceqa1.eqcaredev.com/visits/7");

	}
	
	public void addComments() {

		Utility.waitForWebElement(driver, commentsLink).click();
		
		Utility.waitForWebElement(driver, commentsTextArea).sendKeys("Test");
		
		Utility.waitForWebElement(driver, commentsToggle).click();
		
		Utility.waitForWebElement(driver, commentsButton).click();
		

	}

}
