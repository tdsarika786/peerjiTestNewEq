package eqcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

import com.practitest.examples.runWithAttachments;

public class LifeJourneyHomePage extends runWithAttachments {

	WebDriver driver;

	By logoutText = By.xpath("//a[contains(text(), 'Logout')]");

	By startVisitButton = By.xpath("//a[@data-role='start-visit-button']");

	By startCallButton = By.xpath("//a[@data-role='start-call-button']");

	By videoEndCallButton = By.xpath("//a[@data-role='video-end-call-button']");

	By confirmEndCallButton = By.xpath("//a[@data-role='confirm-end-call-button']");

	By ratingHeart = By.xpath("//div[@class='rating-heart-5']");

	By submitText = By.xpath("//a[contains(text(), 'Submit')]");

	By homeButton = By.xpath("//a[contains(text(), 'Homepage')]");

	// Device Check

	By nextStepText = By.xpath("//a[contains(text(), 'Next Step')]");

	By continueToVisitText = By.xpath("//a[contains(text(), 'Continue To Visit')]");

	By homeLink = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[2]/a[1]");

	By logoutButton = By.xpath("//a[contains(text(), 'Logout')]");

	By divAvatarPlaceHolder = By.xpath("//div[contains(@class,'halo-avatar')]");

	By languageENLink = By.xpath("//a[contains(text(), 'EN')]");

	By languageFRLink = By.xpath("//a[contains(text(), 'FR')]");

	By needHelpText = By.xpath("//p[contains(text(), 'Need help')]");

	By phoneNoLink = By.xpath("//a[contains(text(), '1-855-449-4994')]");

	By emailLink = By.xpath("//a[contains(text(), 'support@eqcare.com')]");

	public LifeJourneyHomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void logOutFromApplication() throws Exception {
		
		try {

		Utility.wait(4);

		Utility.waitForWebElement(driver, logoutText).click();
		
		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 14, 0), "0");
		
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 14, 0), "7");
			throw ex;
		}
	}

	public void startVideoConsultationLink() throws Exception {

		try {

			Utility.waitForWebElement(driver, startVisitButton);

			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "0");
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "7");
			throw ex;
		}

	}

	public void verifyHomeFooter() throws Exception {
		
		try {

		Utility.waitForWebElement(driver, needHelpText);

		Utility.waitForWebElement(driver, phoneNoLink);

		Utility.waitForWebElement(driver, emailLink);
		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 13, 0), "0");
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 13, 0), "7");
			throw ex;
		}

	}

	public void startVideoConsultationClick() {

		Utility.waitForWebElement(driver, startCallButton).click();

	}

	public void startVideoConsultation() {

		Utility.waitForWebElement(driver, startCallButton).click();

		Utility.waitForWebElement(driver, videoEndCallButton).click();

		Utility.waitForWebElement(driver, confirmEndCallButton).click();

		Utility.waitForWebElement(driver, ratingHeart).click();

		Utility.waitForWebElement(driver, submitText).click();

		Utility.waitForWebElement(driver, homeButton).click();

	}

	public void deviceCheck() {

		Utility.waitForWebElement(driver, startVisitButton).click();

		// Utility.waitForWebElement(driver, startVisitButton).click();

		Utility.waitForWebElement(driver, nextStepText).click();

		// Utility.waitForWebElement(driver, nextStepText).click();

		Utility.waitForWebElement(driver, continueToVisitText).click();

		// Utility.waitForWebElement(driver, startVisitButton).click();

	}

	public void navigateToHomePage() {

		Utility.waitForWebElement(driver, homeLink).click();

	}

	public void verifyUrl() throws Exception {
		try {
			WebElement ele = Utility.waitForWebElement(driver, logoutButton);
			String contactUsHeader = ele.getText();
			Assert.assertEquals(contactUsHeader, "Logout");

			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 9, 0), "0");
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 9, 0), "7");
			throw ex;
		}

	}

	public void verifyProfilePicPlacheHolder() throws Exception {

		try {

			Utility.waitForWebElement(driver, divAvatarPlaceHolder);

			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 10, 0), "0");
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 10, 0), "7");
			throw ex;
		}
	}

	public void validatelanguageLink() throws Exception {

		try {

			Utility.waitForWebElement(driver, languageFRLink).click();

			Utility.verifyText(driver, startVisitButton, "J'ai besoin de soins médicaux");

			Utility.wait(2);

			Utility.waitForWebElement(driver, languageENLink).click();

			Utility.verifyText(driver, startVisitButton, "I need medical care");

			Utility.wait(2);

			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 11, 0), "0");

		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 11, 0), "7");
			throw ex;
		}

	}
	
	
	

}
