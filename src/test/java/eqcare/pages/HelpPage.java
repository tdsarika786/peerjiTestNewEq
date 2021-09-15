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

public class HelpPage {

	WebDriver driver;

	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}

	By helpHeader = By.xpath("//h2");

	By submitLink = By.xpath("//a[contains(text(), 'Submit')]");

	By homeButton = By.xpath("//a[contains(text(), 'Homepage')]");

	By visitFeedbackInput = By.xpath("//textarea[@name='textFieldInput']");
	
	By helpLink = By.xpath("//a[@href='/help']");

	public void verifyFeedbackPageUrl()

	{

		Utility.verifyURLContains(driver, "help");

	}

	public void navigateToHelpPage() {
		
		
		Utility.waitForWebElement(driver, helpLink);
		
		WebElement button1 = driver.findElement(By.xpath("//a[@href='/help']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		//Utility.navigateToURL(driver, DataProviderFactory.getConfig().getValue("help"));
		
		//Utility.waitForWebElement(driver, helpLink);

		Utility.wait(5);

		WebElement ele = Utility.waitForWebElement(driver, helpHeader);
		String helpHeaderText = ele.getText();
		Assert.assertEquals(helpHeaderText, ErrorCodesProvider.read("HELP_HEADER"));
	}

}
