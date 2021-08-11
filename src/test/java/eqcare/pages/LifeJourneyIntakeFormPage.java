package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.practitest.examples.runWithAttachments;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class LifeJourneyIntakeFormPage extends runWithAttachments {

	WebDriver driver;

	public LifeJourneyIntakeFormPage(WebDriver driver) {
		this.driver = driver;
	}

	By startVisitLink = By.xpath("//a[@data-role='start-visit-button']");

	By reasonVisitInput = By.xpath("//div[@data-role='intake-reason-input']/textarea");

	By durationSymptomsInput = By.xpath("//div[@data-role='intake-symptoms-duration-input']/input");

	By currentAllergies = By.xpath("//div[@data-role='intake-allergies-input']/div/input");

	By addCurrentAllergies = By.xpath("//div[contains(text(),'+ Add')]");

	By currentMedication = By.xpath("//input[@id='medication-input']");

	By addCurrentMedication = By.xpath("//div[contains(text(),'+ Add')]");

	By checkBox = By.xpath("//input[@type='checkbox']");

	By uploadFile = By.xpath("//input[@type='file']");

	By startCall = By.xpath("//a[@data-role='start-call-button']");

	By cancelButton = By.xpath("//a[@data-role='cancel-button']");

	// Life Journey

	By startLifeJourneyButton = By.xpath("//a[@data-role='start-life-journey-button']");

	By lifeJourneyreasonVisitInput = By.xpath("//div[@data-role='lifejourney-intake-reason-input']/textarea");

	By reasonVisitNextStep = By.xpath("//a[@data-role='life-journey-reason-of-visit-next-step']");

	// Next Steps

	By educationNextStep = By.xpath("//a[@data-role='education-employment-submit-button']");

	By socialNextStep = By.xpath("//a[@data-role='social-step-submit-button']");

	By legalNextStep = By.xpath("//a[@data-role='legal-financial-submit-button']");

	By medicalNextStep = By.xpath("//a[@data-role='medical-step-submit-button']");

	By mentalNextStep = By.xpath("//a[@data-role='mental-health-step-submit-button']");

	By lifeJourneyIntakeCompleted = By.xpath("//a[@data-role='confirm-lifejourney-intake-completed']");

	// Questions - Employment

	By concernedAboutEmploymentOption = By
			.xpath("//label[contains(text(),'concerned about your employment')]//following::a[1]");

	By currentlyEmployedOption = By.xpath("//label[contains(text(),'currently employed')]//following::a[1]");

	By workInManagementOption = By.xpath("//label[contains(text(),'work in management')]//following::a[1]");

	By workPhysicallyDangerousOption = By
			.xpath("//label[contains(text(),'work physically dangerous')]//following::a[1]");

	By workLongHoursOption = By.xpath("//label[contains(text(),'work long hours')]//following::a[1]");

	// Questions _ Social

	By leaveYourLifeOption = By.xpath("//label[contains(text(),'leave your life')]//following::a[1]");

	// Social Rating

	By currentRelationshipOption = By
			.xpath("//div[contains(text(),'current relationship')]//following::div[@class='rating-7']");

	By describeTheStrengthOption = By
			.xpath("//div[contains(text(),'describe the strength')]//following::div[@class='rating-7']");

	By statusChangedOption = By.xpath("//label[contains(text(),'status changed')]//following::a[1]");

	By currentRelationshipStatus = By.xpath("//input[@value='single']");

	By problemsWithMarriageOption = By.xpath("//label[contains(text(),'problems with marriage')]//following::a[1]");

	// Legal

	By concernedLegalIssuesOption = By
			.xpath("//label[contains(text(),'concerned about legal issues')]//following::a[1]");

	By inputLegalIssuesOption = By.xpath("//input[@value='probation']");

	By arrestedOption = By.xpath("//label[contains(text(),'arrested')]//following::a[1]");

	By sentencedOption = By.xpath("//label[contains(text(),'sentenced')]//following::a[1]");

	By concernedFinancialOption = By
			.xpath("//label[contains(text(),'concerned about your financial')]//following::a[1]");

	// Medical

	By inputSocialWorkerOption = By.xpath("//input[@id='social_worker']");

	By pregnantOption = By.xpath("//label[contains(text(),'pregnant')]//following::a[1]");

	By changesInHealthOption = By.xpath("//label[contains(text(),'changes in your health')]//following::a[1]");

	By currentHealthOption = By.xpath("//div[contains(text(),'current health')]//following::div[@class='rating-7']");

	By inputAlcoholOption = By.xpath("//input[@id='alcohol']");

	// Mental

	By currentMentalHealthOption = By
			.xpath("//div[contains(text(),'current mental health')]//following::div[@class='rating-10']");

	By seeingMentalHealthOption = By.xpath("//label[contains(text(),'seeing a Mental Health')]//following::a[1]");

	By expAnySignificantLifeStressorOption = By
			.xpath("//label[contains(text(),'experienced any significant life stressors')]//following::a[1]");

	By inputPromotionOption = By.xpath("//input[@id='promotion']");

	By inputillNessOption = By.xpath("//input[@id='illness']");

	// Call End
	By videoEndCallButton = By.xpath("//a[@data-role='video-end-call-button']");

	By confirmEndCallButton = By.xpath("//a[@data-role='confirm-end-call-button']");

	By ratingHeart = By.xpath("//div[@class='rating-5']");

	By submitText = By.xpath("//a[contains(text(), 'Submit')]");

	By homeButton = By.xpath("//a[contains(text(), 'Homepage')]");

	// Device Check

	By startVisitButton = By.xpath("//a[@data-role='start-visit-button']");

	By nextStepText = By.xpath("//a[contains(text(), 'Next Step')]");

	By continueToVisitText = By.xpath("//a[contains(text(), 'Continue To Visit')]");

	// Flower Icon

	By infoBodyLink = By.xpath("(//div[contains(@class,'link-body')])[1]]");

	By uploadDiv = By.xpath("(//p[contains(text(),'Chat')]/following-sibling::div)[1]");
	
	
	//Skip to Care
	
	By skipTalkToCareButton = By.xpath("//a[@data-role='tale-to-care-advocate-button']");
	

	public void verifyIntakeFormPageUrl() throws Exception

	{

		Utility.verifyURLContains(driver, "intake-form");

	}

	public void navigateToIntakeFormPage() {

		Utility.navigateToURL(driver, DataProviderFactory.getConfig().getValue("ponyIntakeForm"));
	}

	public void fillIntakeForm() throws Exception {

		Utility.waitForWebElement(driver, startVisitLink).click();

		Utility.waitForWebElement(driver, reasonVisitInput).sendKeys("Test Visit by Sarika Peerji");

		Utility.waitForWebElement(driver, durationSymptomsInput).sendKeys("7 weeks");

		Utility.waitForWebElement(driver, currentAllergies).sendKeys("Amoxyllin");

		Utility.waitForWebElement(driver, addCurrentAllergies).click();

		Utility.waitForWebElement(driver, currentMedication).sendKeys("Tyenol Liquid Gels");

		Utility.waitForWebElement(driver, addCurrentMedication).click();

		uploadFiles();

		// Utility.waitForWebElement(driver, checkBox).click();

		WebElement button = driver.findElement(By.xpath("//input[@type='checkbox']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button);

		Utility.waitForWebElement(driver, startCall).click();
		// Utility.selectValueFromCalendar(Utility.waitForMultipleWebElement(driver,
		// calen), "25");

		Utility.waitForWebElement(driver, videoEndCallButton).click();

		Utility.waitForWebElement(driver, confirmEndCallButton).click();

		Utility.wait(7);

		Utility.waitForWebElement(driver, ratingHeart).click();

		Utility.waitForWebElement(driver, submitText).click();

		Utility.waitForWebElement(driver, homeButton).click();

	}

	public void uploadFiles() throws Exception {

		WebElement fileButton = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].style.display='block';", fileButton);

		Utility.waitForWebElement(driver, uploadFile).sendKeys(System.getProperty("user.dir") + "/TestData/test1.jpeg");

		Utility.wait(2);

	}

	public void cancelButton() throws Exception {

		Utility.waitForWebElement(driver, cancelButton).click();

	}

	public void startLifeJourneyWithoutAnsweringQues() throws Exception {

		Utility.waitForWebElement(driver, startLifeJourneyButton).click();

		deviceCheck();

		Utility.waitForWebElement(driver, startLifeJourneyButton).click();

		Utility.waitForWebElement(driver, lifeJourneyreasonVisitInput).sendKeys("Test Visit by Sarika Peerji");

		Utility.waitForWebElement(driver, reasonVisitNextStep).click();

		Utility.waitForWebElement(driver, educationNextStep).click();

		Utility.waitForWebElement(driver, socialNextStep).click();

		Utility.waitForWebElement(driver, legalNextStep).click();

		Utility.waitForWebElement(driver, medicalNextStep).click();

		Utility.waitForWebElement(driver, mentalNextStep).click();

		Utility.waitForWebElement(driver, lifeJourneyIntakeCompleted).click();

		Utility.waitForWebElement(driver, videoEndCallButton).click();

		Utility.waitForWebElement(driver, confirmEndCallButton).click();

		Utility.waitForWebElement(driver, ratingHeart).click();

		Utility.waitForWebElement(driver, submitText).click();

		Utility.waitForWebElement(driver, homeButton).click();

	}

	public void deviceCheck() {

		// Utility.waitForWebElement(driver, startVisitButton).click();

		// Utility.waitForWebElement(driver, startVisitButton).click();

		Utility.waitForWebElement(driver, nextStepText).click();

		// Utility.waitForWebElement(driver, nextStepText).click();

		Utility.waitForWebElement(driver, continueToVisitText).click();

		// Utility.waitForWebElement(driver, startVisitButton).click();

	}

	public void fillIntakeFormLifeJourney() {

		Utility.waitForWebElement(driver, startLifeJourneyButton).click();

		Utility.waitForWebElement(driver, lifeJourneyreasonVisitInput).sendKeys("Test Visit by Sarika Peerji");

		Utility.waitForWebElement(driver, reasonVisitNextStep).click();
	}

	public void skipTalkToCareCTA() {

		Utility.waitForWebElement(driver, skipTalkToCareButton).click();
		
		deviceCheck();
		
		fillIntakeFormLifeJourney();

	}

	public void startLifeJourneySkipToCareMethod() throws Exception {

		startLifeJourneyVisitCTA();

		deviceCheck();

		fillIntakeFormLifeJourney();

		LifeFourneyForms();

	}

	public void startLifeJourneyMethod() {

		Utility.waitForWebElement(driver, startLifeJourneyButton).click();

		deviceCheck();

		fillIntakeFormLifeJourney();

		// EDucation

		Utility.waitForWebElement(driver, concernedAboutEmploymentOption).click();

		Utility.waitForWebElement(driver, currentlyEmployedOption).click();

		Utility.waitForWebElement(driver, workInManagementOption).click();

		Utility.waitForWebElement(driver, workPhysicallyDangerousOption).click();

		Utility.waitForWebElement(driver, workLongHoursOption).click();

		Utility.waitForWebElement(driver, educationNextStep).click();

		// Social

		Utility.waitForWebElement(driver, leaveYourLifeOption).click();

		Utility.waitForWebElement(driver, currentRelationshipOption).click();

		Utility.waitForWebElement(driver, describeTheStrengthOption).click();

		Utility.waitForWebElement(driver, statusChangedOption).click();

		WebElement button1 = driver.findElement(By.xpath("//input[@value='single']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		Utility.waitForWebElement(driver, problemsWithMarriageOption).click();

		WebElement button2 = driver.findElement(By.xpath("//input[@value='other']"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		Utility.waitForWebElement(driver, socialNextStep).click();

		// Legal

		Utility.waitForWebElement(driver, concernedLegalIssuesOption).click();

		// Utility.waitForWebElement(driver, inputLegalIssuesOption).click();

		WebElement button = driver.findElement(By.xpath("//input[@value='probation']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", button);

		Utility.waitForWebElement(driver, arrestedOption).click();

		Utility.waitForWebElement(driver, sentencedOption).click();

		Utility.waitForWebElement(driver, concernedFinancialOption).click();

		WebElement button3 = driver.findElement(By.xpath("//input[@value='other']"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		Utility.waitForWebElement(driver, legalNextStep).click();

		// Medical

		// Utility.waitForWebElement(driver, inputSocialWorkerOption).click();

		WebElement button4 = driver.findElement(By.xpath("//input[@value='social_worker']"));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", button4);

		// Utility.waitForWebElement(driver, pregnantOption).click();

		Utility.waitForWebElement(driver, changesInHealthOption).click();

		Utility.waitForWebElement(driver, currentHealthOption).click();

		// Utility.waitForWebElement(driver, inputAlcoholOption).click();

		WebElement button5 = driver.findElement(By.xpath("//input[@value='alcohol']"));

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", button5);

		Utility.waitForWebElement(driver, medicalNextStep).click();

		// Mental Health

		Utility.waitForWebElement(driver, currentMentalHealthOption).click();

		// Utility.waitForWebElement(driver, seeingMentalHealthOption).click();

		Utility.waitForWebElement(driver, seeingMentalHealthOption).click();

		Utility.waitForWebElement(driver, expAnySignificantLifeStressorOption).click();

		// Utility.waitForWebElement(driver, inputPromotionOption).click();

		// Utility.waitForWebElement(driver, inputillNessOption).click();

		WebElement button6 = driver.findElement(By.xpath("//input[@value='illness']"));

		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click()", button6);

		Utility.waitForWebElement(driver, mentalNextStep).click();

		// Completed

		Utility.waitForWebElement(driver, lifeJourneyIntakeCompleted).click();

		Utility.wait(2);

		Utility.waitForWebElement(driver, videoEndCallButton).click();

		Utility.waitForWebElement(driver, confirmEndCallButton).click();

		Utility.wait(7);

		Utility.waitForWebElement(driver, ratingHeart).click();

		Utility.waitForWebElement(driver, submitText).click();

		Utility.waitForWebElement(driver, homeButton).click();

	}

	public void startLifeJourneyAfterFillingIntakeForms() throws Exception {

		startLifeJourneyMethod();

		// Utility.wait(2);

		// flowerInformationCheck();

	}

	public void flowerInformationCheck() {

		WebElement button1 = driver.findElement(By.xpath("(//div[contains(@class,'link-body')])[1]"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		Utility.wait(2);

		WebElement button2 = driver.findElement(By.xpath("(//div[contains(@class,'link-mind')])[1]"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		Utility.wait(2);

		WebElement button3 = driver.findElement(By.xpath("(//div[contains(@class,'link-social')])[1]"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		Utility.wait(2);

		WebElement button4 = driver.findElement(By.xpath("(//div[contains(@class,'link-finance')])[1]"));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", button4);

		Utility.wait(2);

		WebElement button5 = driver.findElement(By.xpath("(//div[contains(@class,'link-work')])[1]"));

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", button5);

		Utility.wait(2);

		WebElement button6 = driver.findElement(By.xpath("(//div[contains(@class,'link-purpose')])[1]"));

		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click()", button6);

		Utility.wait(2);

		// Utility.waitForWebElement(driver, button2).click();

	}

	public void hraLifeJourneyVisitSkipAndTalk() {

	}

	public void hraLifeJourneyVisit() {

		Utility.waitForWebElement(driver, lifeJourneyreasonVisitInput).sendKeys("Test Visit by Sarika Peerji");

		Utility.waitForWebElement(driver, reasonVisitNextStep).click();

		// EDucation

		Utility.waitForWebElement(driver, concernedAboutEmploymentOption).click();

		Utility.waitForWebElement(driver, currentlyEmployedOption).click();

		Utility.waitForWebElement(driver, workInManagementOption).click();

		Utility.waitForWebElement(driver, workPhysicallyDangerousOption).click();

		Utility.waitForWebElement(driver, workLongHoursOption).click();

		Utility.waitForWebElement(driver, educationNextStep).click();

		// Social

		Utility.waitForWebElement(driver, leaveYourLifeOption).click();

		Utility.waitForWebElement(driver, currentRelationshipOption).click();

		Utility.waitForWebElement(driver, describeTheStrengthOption).click();

		Utility.waitForWebElement(driver, statusChangedOption).click();

		WebElement button1 = driver.findElement(By.xpath("//input[@value='single']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		Utility.waitForWebElement(driver, problemsWithMarriageOption).click();

		WebElement button2 = driver.findElement(By.xpath("//input[@value='other']"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		Utility.waitForWebElement(driver, socialNextStep).click();

		// Legal

		Utility.waitForWebElement(driver, concernedLegalIssuesOption).click();

		// Utility.waitForWebElement(driver, inputLegalIssuesOption).click();

		WebElement button = driver.findElement(By.xpath("//input[@value='probation']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", button);

		Utility.waitForWebElement(driver, arrestedOption).click();

		Utility.waitForWebElement(driver, sentencedOption).click();

		Utility.waitForWebElement(driver, concernedFinancialOption).click();

		WebElement button3 = driver.findElement(By.xpath("//input[@value='other']"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		Utility.waitForWebElement(driver, legalNextStep).click();

		// Medical

		// Utility.waitForWebElement(driver, inputSocialWorkerOption).click();

		WebElement button4 = driver.findElement(By.xpath("//input[@value='social_worker']"));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", button4);

		// Utility.waitForWebElement(driver, pregnantOption).click();

		Utility.waitForWebElement(driver, changesInHealthOption).click();

		Utility.waitForWebElement(driver, currentHealthOption).click();

		// Utility.waitForWebElement(driver, inputAlcoholOption).click();

		WebElement button5 = driver.findElement(By.xpath("//input[@value='alcohol']"));

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", button5);

		Utility.waitForWebElement(driver, medicalNextStep).click();

		// Mental Health

		Utility.waitForWebElement(driver, currentMentalHealthOption).click();

		// Utility.waitForWebElement(driver, seeingMentalHealthOption).click();

		Utility.waitForWebElement(driver, seeingMentalHealthOption).click();

		Utility.waitForWebElement(driver, expAnySignificantLifeStressorOption).click();

		// Utility.waitForWebElement(driver, inputPromotionOption).click();

		// Utility.waitForWebElement(driver, inputillNessOption).click();

		WebElement button6 = driver.findElement(By.xpath("//input[@value='illness']"));

		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click()", button6);

		Utility.waitForWebElement(driver, mentalNextStep).click();

		// Completed

		Utility.waitForWebElement(driver, lifeJourneyIntakeCompleted).click();

		Utility.wait(10);

		Utility.waitForWebElement(driver, uploadDiv).click();

		try {
			uploadFiles("test2.jpeg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Utility.wait(20);

		String url = driver.getCurrentUrl();

		System.out.println("URL:" + url);

	}

	public void startLifeJourneyVisitCTA() {

		Utility.waitForWebElement(driver, startLifeJourneyButton).click();

	}

	public void LifeFourneyForms() throws Exception {
		// EDucation

		Utility.waitForWebElement(driver, concernedAboutEmploymentOption).click();

		Utility.waitForWebElement(driver, currentlyEmployedOption).click();

		Utility.waitForWebElement(driver, workInManagementOption).click();

		Utility.waitForWebElement(driver, workPhysicallyDangerousOption).click();

		Utility.waitForWebElement(driver, workLongHoursOption).click();

		Utility.waitForWebElement(driver, educationNextStep).click();

		// Social

		Utility.waitForWebElement(driver, leaveYourLifeOption).click();

		Utility.waitForWebElement(driver, currentRelationshipOption).click();

		Utility.waitForWebElement(driver, describeTheStrengthOption).click();

		Utility.waitForWebElement(driver, statusChangedOption).click();

		WebElement button1 = driver.findElement(By.xpath("//input[@value='single']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		Utility.waitForWebElement(driver, problemsWithMarriageOption).click();

		WebElement button2 = driver.findElement(By.xpath("//input[@value='other']"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		Utility.waitForWebElement(driver, socialNextStep).click();

		// Legal

		Utility.waitForWebElement(driver, concernedLegalIssuesOption).click();

		// Utility.waitForWebElement(driver, inputLegalIssuesOption).click();

		WebElement button = driver.findElement(By.xpath("//input[@value='probation']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", button);

		Utility.waitForWebElement(driver, arrestedOption).click();

		Utility.waitForWebElement(driver, sentencedOption).click();

		Utility.waitForWebElement(driver, concernedFinancialOption).click();

		WebElement button3 = driver.findElement(By.xpath("//input[@value='other']"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		Utility.waitForWebElement(driver, legalNextStep).click();

		// Medical

		// Utility.waitForWebElement(driver, inputSocialWorkerOption).click();

		WebElement button4 = driver.findElement(By.xpath("//input[@value='social_worker']"));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", button4);

		// Utility.waitForWebElement(driver, pregnantOption).click();

		Utility.waitForWebElement(driver, changesInHealthOption).click();

		Utility.waitForWebElement(driver, currentHealthOption).click();

		// Utility.waitForWebElement(driver, inputAlcoholOption).click();

		WebElement button5 = driver.findElement(By.xpath("//input[@value='alcohol']"));

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", button5);

		Utility.waitForWebElement(driver, medicalNextStep).click();

		// Mental Health

		Utility.waitForWebElement(driver, currentMentalHealthOption).click();

		// Utility.waitForWebElement(driver, seeingMentalHealthOption).click();

		Utility.waitForWebElement(driver, seeingMentalHealthOption).click();

		Utility.waitForWebElement(driver, expAnySignificantLifeStressorOption).click();

		// Utility.waitForWebElement(driver, inputPromotionOption).click();

		// Utility.waitForWebElement(driver, inputillNessOption).click();

		WebElement button6 = driver.findElement(By.xpath("//input[@value='illness']"));

		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click()", button6);

		Utility.waitForWebElement(driver, mentalNextStep).click();

		// Completed

		Utility.waitForWebElement(driver, lifeJourneyIntakeCompleted).click();

		Utility.wait(10);

		Utility.waitForWebElement(driver, uploadDiv).click();

		uploadFiles("test2.jpeg");

		Utility.wait(20);

		String url = driver.getCurrentUrl();

		System.out.println("URL:" + url);

	}

	public void startLifeJourneyVisitHRA() throws Exception {
		// deviceCheck();

		fillIntakeFormLifeJourney();

		LifeFourneyForms();
	}

	public void startLifeJourneyVisit() throws Exception {

		startLifeJourneyVisitCTA();

		deviceCheck();

		fillIntakeFormLifeJourney();

		LifeFourneyForms();

	}

	public void uploadFiles(String text) throws Exception {
		try {
			WebElement fileButton = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].style.display='block';", fileButton);

			Utility.waitForWebElement(driver, uploadFile)
					.sendKeys(System.getProperty("user.dir") + "/TestData/" + text);

			Utility.wait(2);
//		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 4, 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 4,
			// 0), "7");
			throw ex;
		}
	}
}
