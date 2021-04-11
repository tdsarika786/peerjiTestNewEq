package eqcare.pages;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import eqcare.factories.DataProviderFactory;
import eqcare.factories.*;
import eqcare.helper.Utility;

public class ForgotPasswordPage {

	WebDriver driver;

	public ForgotPasswordPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	// FR PW
	By forgotPasswordButton = By.xpath("//*[@data-role='forgot-password-button']");

	By resetButton = By.xpath("//*[@data-role='forgot-password-reset-button']");

	By email = By.xpath("//*[@data-role='forgot-password-email-input']/input");

	By resetPasswordHeader = By.xpath("//h1[contains(text(), 'Reset')]");

	By errorMessages = By.xpath("//p[@data-role='error']");

	By forgotPasswordConfirmMsg = By.xpath("//*[@data-role='forgot-password-confirmation-message']");
	
	By password = By.name("password");

	By confirmPassword = By.xpath("(//*[@name='password'])[2]");
	
	By resetLink = By.xpath("//a[text()=' Reset ']");
	
	By cloaseLink = By.xpath("(//div[@class='close-button'])[1]");

	// FR PW

	public void navigateToForgortPasswordModal() {

		Utility.waitForWebElement(driver, forgotPasswordButton).click();
	}

	public void resetPasswordNotification(String patientEmail) {

		Utility.waitForWebElement(driver, email).sendKeys(patientEmail);

		Utility.waitForWebElement(driver, resetButton).click();

		WebElement ele = Utility.waitForWebElement(driver, forgotPasswordConfirmMsg);
		String resetPasswordConfirmMsg = ele.getText();
		Assert.assertEquals(resetPasswordConfirmMsg, ErrorCodesProvider.read("FORGOT_PASSWORD_CONFIRMATION_MESSAGE"));

	}

	public void verifyResetPasswordModal() {
		// Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Dashboard
		// does not contain dashboard keyword");
		WebElement ele = Utility.waitForWebElement(driver, resetPasswordHeader);
		String resetPasswordHeaderText = ele.getText();
		Assert.assertEquals(resetPasswordHeaderText, "Reset password");
		
		Utility.waitForWebElement(driver, cloaseLink).click();
	}

	public void errorMessageEmptyEmail() {

		Utility.waitForWebElement(driver, email).sendKeys("");

		Utility.waitForWebElement(driver, resetButton).click();
		Utility.wait(2);
		WebElement ele = Utility.waitForWebElement(driver, errorMessages);
		String resetPasswordMessageText = ele.getText();
		Assert.assertEquals(resetPasswordMessageText, ErrorCodesProvider.read("ENTER_EMAIL"));
		
		Utility.waitForWebElement(driver, cloaseLink).click();
	}

	// 

	public void resetPassword() {

		Utility.waitForWebElement(driver, password).sendKeys("Abcde#123");
		
		Utility.waitForWebElement(driver, confirmPassword).sendKeys("Abcde#123");

		Utility.waitForWebElement(driver, resetLink).click();

		WebElement ele = Utility.waitForWebElement(driver, forgotPasswordConfirmMsg);
		String resetPasswordConfirmMsg = ele.getText();
		Assert.assertEquals(resetPasswordConfirmMsg, ErrorCodesProvider.read("FORGOT_PASSWORD_CONFIRMATION_MESSAGE"));

		Utility.waitForWebElement(driver, cloaseLink).click();
	}

	public void navigateToLoginPage() {

		Utility.navigateToURL(driver, DataProviderFactory.getConfig().getValue("ponyEnv"));
	}
	
	public void navigateToPasswordResetPage() {

		Utility.navigateToURL(driver, "https://pony.qa.eqcarestaging.com/password-reset/903c1a67b4e9c1d92a633c3ac61c1927fa55605df62e460b0e8cb2f4b8b2c098?email=sarikaqa7+a1@gmail.com");

		
	
	
	}
}