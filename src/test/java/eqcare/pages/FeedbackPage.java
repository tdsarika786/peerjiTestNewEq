package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import eqcare.helper.Utility;

public class FeedbackPage {

	WebDriver driver;

	public FeedbackPage(WebDriver driver) {
		this.driver = driver;
	}

	By ratingHeart = By.xpath("//div[@class='rating-5']");

	By submitLink = By.xpath("//a[contains(text(), 'Submit')]");

	By homeButton = By.xpath("//a[contains(text(), 'Homepage')]");

	By visitFeedbackInput = By.xpath("//textarea[@name='textFieldInput']");
	
	By nextLink = By.xpath("//a[contains(text(), 'Next')]");
	
	

	public void verifyFeedbackPageUrl()

	{

		Utility.verifyURLContains(driver, "feedback");

	}

	public void ratingProvided() {
		
		Utility.wait(2);

		Utility.waitForWebElement(driver, ratingHeart).click();

		Utility.waitForWebElement(driver, visitFeedbackInput).sendKeys("A Good");

		Utility.waitForWebElement(driver, submitLink).click();

		Utility.waitForWebElement(driver, homeButton).click();

	}
	
	public void ratingProvidedDRCMNurse() {
		
		Utility.wait(2);

		Utility.waitForWebElement(driver, ratingHeart).click();

		Utility.waitForWebElement(driver, visitFeedbackInput).sendKeys("A Good");

		Utility.waitForWebElement(driver, nextLink).click();
		
		Utility.waitForWebElement(driver, ratingHeart).click();
		
		Utility.waitForWebElement(driver, nextLink).click();
		
	    Utility.waitForWebElement(driver, ratingHeart).click();
		
		Utility.waitForWebElement(driver, nextLink).click();
		
		Utility.waitForWebElement(driver, submitLink).click();

		Utility.waitForWebElement(driver, homeButton).click();

	}

}
