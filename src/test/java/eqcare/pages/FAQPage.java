package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class FAQPage {

	WebDriver driver;

	public FAQPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	By faqHeader = By.xpath("//h1");
	
	By faqLink = By.xpath("(//a[@href='/en/faq'])[1]");

	By primaryCareDiv = By.xpath("//li[contains(text(),'Primary Care')]");

	By dataSecurityDiv = By.xpath("//li[contains(text(),'Data Security')]");

	By registerationDiv = By.xpath("//li[contains(text(),'Registration')]");

	By technologyDiv = By.xpath("//li[contains(text(),'Technology')]");

	By primaryCareHeading = By.xpath("//h2[contains(text(),'Primary Care')]");

	By dataSecurityHeading = By.xpath("//h2[contains(text(),'Data Security')]");

	By registerationHeading = By.xpath("//h2[contains(text(),'Registration')]");

	By technologyHeading = By.xpath("//h2[contains(text(),'Technology')]");

	public void navigateToFAQPage(String AppURL, String subdomain) {

		if (AppURL.contains("qa2")) {

			if (subdomain.contains("peerjipc")) {

				String URL = "https://peerjipc.eqserviceqa2.eqcaredev.com/";

				Utility.navigateToURL(driver, URL);

				System.out.println("Log:INFO- CLINIC VISIT STARTS CM QA1 " + URL);
			}

			if (subdomain.contains("peerjilj")) {

				String URL = "https://peerjilj.eqserviceqa2.eqcaredev.com/";

				Utility.navigateToURL(driver, URL);

				System.out.println("Log:INFO- CLINIC VISIT STARTS CM QA1 " + URL);
			}

			if (subdomain.contains("peerjipclj")) {

				String URL = "https://peerjipclj.eqserviceqa2.eqcaredev.com/";

				Utility.navigateToURL(driver, URL);

				System.out.println("Log:INFO- CLINIC VISIT STARTS CM QA1 " + URL);
			}

			if (subdomain.contains("peerjidcbt")) {

				String URL = "https://peerjidcbt.eqserviceqa2.eqcaredev.com/";

				Utility.navigateToURL(driver, URL);

				System.out.println("Log:INFO- CLINIC VISIT STARTS CM QA1 " + URL);
			}

			if (subdomain.contains("peerjiljdcbt")) {

				String URL = "https://peerjiljdcbt.eqserviceqa2.eqcaredev.com/";

				Utility.navigateToURL(driver, URL);

				System.out.println("Log:INFO- CLINIC VISIT STARTS CM QA1 " + URL);
			}

			if (subdomain.contains("peerjiall")) {

				String URL = "https://peerjiall.eqserviceqa2.eqcaredev.com/";

				Utility.navigateToURL(driver, URL);

				System.out.println("Log:INFO- CLINIC VISIT STARTS CM QA1 " + URL);
			}

		}

	}

	public void verifyFAQPCQues() {

		Utility.waitForWebElement(driver, faqLink);
		

		WebElement buttonSub = driver.findElement(By.xpath("(//a[@href='/en/faq'])[1]"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);
		
		Utility.waitForWebElement(driver, faqHeader);
		
		WebElement buttonPrimary = driver.findElement(By.xpath("//li[contains(text(),'Primary Care')]"));

		JavascriptExecutor executorSub1 = (JavascriptExecutor) driver;
		executorSub1.executeScript("arguments[0].click()", buttonPrimary);

		//Utility.waitForWebElement(driver, primaryCareDiv).click();

		Utility.waitForWebElement(driver, primaryCareHeading);
		
		WebElement buttonData = driver.findElement(By.xpath("//li[contains(text(),'Data Security')]"));

		JavascriptExecutor executorSub2 = (JavascriptExecutor) driver;
		executorSub2.executeScript("arguments[0].click()", buttonData);

		//Utility.waitForWebElement(driver, dataSecurityDiv).click();

		Utility.waitForWebElement(driver, dataSecurityHeading);
		
		WebElement buttonReg = driver.findElement(By.xpath("//li[contains(text(),'Registeration')]"));

		JavascriptExecutor executorSub3 = (JavascriptExecutor) driver;
		executorSub3.executeScript("arguments[0].click()", buttonReg);

		//Utility.waitForWebElement(driver, registerationDiv).click();

		Utility.waitForWebElement(driver, registerationHeading);
		
		WebElement buttonTech = driver.findElement(By.xpath("//li[contains(text(),'Technology')]"));

		JavascriptExecutor executorSub4 = (JavascriptExecutor) driver;
		executorSub4.executeScript("arguments[0].click()", buttonTech);

		//Utility.waitForWebElement(driver, technologyDiv).click();

		Utility.waitForWebElement(driver, technologyHeading);

	}

	

}
