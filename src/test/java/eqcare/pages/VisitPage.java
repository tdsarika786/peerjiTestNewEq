package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import eqcare.helper.Utility;

public class VisitPage {

	WebDriver driver;

	public VisitPage(WebDriver driver) {
		this.driver = driver;
	}

	By videoEndCallButton = By.xpath("//a[@data-role='video-end-call-button']");

	By confirmEndCallButton = By.xpath("//a[@data-role='confirm-end-call-button']");

	By ratingHeart = By.xpath("//div[@class='rating-heart-5']");

	By submitText = By.xpath("//a[contains(text(), 'Submit')]");

	By homeButton = By.xpath("//a[contains(text(), 'Homepage')]");

	public void verifyVisitPageUrl()

	{

		Utility.verifyURLContains(driver, "visit");

	}

	public void endCall() {

		Utility.waitForWebElement(driver, videoEndCallButton).click();
		
		Utility.waitForWebElement(driver, confirmEndCallButton).click();

	}
	
	public void ratingProvided() {

		Utility.waitForWebElement(driver, ratingHeart).click();

	}

}
