package eqcare.pages;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.practitest.examples.runWithAttachments;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class CovidResultsFormPage extends runWithAttachments {

	WebDriver driver;

	public CovidResultsFormPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	// Covid Form

	By firstName = By.name("first_name");

	By lastName = By.name("last_name");

	By emailAddress = By.name("email");

	By phoneNumber = By.name("phone_number");

	By dob = By.name("date_of_birth");

	By healthCardNumber = By.name("health_card_number");

	By healthCardExpiration = By.name("health_card_expiration");

	By testLocation = By.name("test_location");

	By testDate = By.name("test_date");
	
	By timeOfTestDrpDown = By.name("test_time");

	By checkBox1 = By.name("user_consent");

	By submitForm = By.xpath("//button[text()='Submit Form']");
	
	By confirmationEmailText = By.xpath("//h2[contains(text(),'Thank you')]");

	public void verifyUrlBeforeRegister()

	{

		Utility.verifyURLContains(driver, "resultatscovid");

	}

	public void Registeration(String email, String userFirstName, String userLastName, String DOB, String PhoneNo, String HealthCardNumber, String HealthCardExpiration, String TestLocation, String TestDate) {

		Utility.waitForWebElement(driver, emailAddress).sendKeys(email);

		Utility.waitForWebElement(driver, firstName).sendKeys(userFirstName);

		Utility.waitForWebElement(driver, lastName).sendKeys(userLastName);

		Utility.waitForWebElement(driver, healthCardNumber).sendKeys(HealthCardNumber);

		Utility.waitForWebElement(driver, dob).sendKeys(DOB);

		Utility.waitForWebElement(driver, phoneNumber).sendKeys(PhoneNo);

		Utility.waitForWebElement(driver, healthCardExpiration).sendKeys(HealthCardExpiration);

		Utility.waitForWebElement(driver, testLocation).sendKeys(TestLocation);

		Utility.waitForWebElement(driver, testDate).sendKeys(TestDate);
		
		WebElement languageElement = Utility.waitForWebElement(driver, timeOfTestDrpDown);

		Select language = new Select(languageElement);

		language.selectByValue("morning");

		Utility.waitForWebElement(driver, checkBox1).click();

		Utility.waitForWebElement(driver, submitForm).click();

		WebElement ele = Utility.waitForWebElement(driver, confirmationEmailText);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText, "Thank you for submitting your request.");
		
	     Utility.wait(5);

	}

}