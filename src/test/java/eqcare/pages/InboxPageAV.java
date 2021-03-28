package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import eqcare.factories.DataProviderFactory;
import eqcare.factories.ErrorCodesProvider;
import eqcare.helper.Utility;

public class InboxPageAV {

	WebDriver driver;

	public InboxPageAV(WebDriver driver) {
		this.driver = driver;
	}

	By personalInfoHeader = By.xpath("//h2[text()='Personal Information']");

	By accountInfoHeader = By.xpath("//h2[text()='Account Information']");

	By messagesLink = By.xpath("//a[text()=' Messages ']");

	By carePlansLink = By.xpath("//a[text()=' Care Plans ']");

	By appointmentsLink = By.xpath("//a[text()=' Appointments ']");

	By inboxHeader = By.xpath("//h1");
	
	By inboxLink = By.xpath("//a[@href='/profile/inbox']");

	public void verifyFeedbackPageUrl()

	{

		Utility.verifyURLContains(driver, "feedback");

	}

	public void verifyMyInboxTabs() {

		Utility.waitForWebElement(driver, messagesLink).click();

		Utility.waitForWebElement(driver, carePlansLink).click();

		Utility.waitForWebElement(driver, appointmentsLink).click();

	}

	public void navigateToInboxPage() {
		
		Utility.waitForWebElement(driver, inboxLink);

		//Utility.navigateToURL(driver, DataProviderFactory.getConfig().getValue("inbox"));

		Utility.wait(2);

		WebElement ele = Utility.waitForWebElement(driver, inboxHeader);
		String helpHeaderText = ele.getText();
		Assert.assertEquals(helpHeaderText, ErrorCodesProvider.read("INBOX_HEADER"));
	}
}
