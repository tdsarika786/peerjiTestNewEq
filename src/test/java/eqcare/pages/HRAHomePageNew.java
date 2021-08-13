package eqcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

import com.practitest.examples.runWithAttachments;

public class HRAHomePageNew extends runWithAttachments {

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

	// HRA Intro Page

	By healthScoreButton = By.xpath("//a[@data-role='start-hra-button']");

	By introPageImage = By.xpath("//img[@alt='EQ Care HRA Intro page']");

	By introPageHeader = By.xpath("//h3[contains(text(), 'health score assessment')]");

	By introPageMinsText = By.xpath("//p[contains(text(), 'minutes')]");

	By startHRAFormButton = By.xpath("//a[@data-role='start-hra-form-button']");

	By skipHRAFormButton = By.xpath("//a[@data-role='skip-hra-form-button']");

	// HRA Physical Intake Form

	By backLink = By.xpath("//p[contains(text(), 'Back')]");

	By quitLink = By.xpath("//p[contains(text(), 'Quit')]");

	By physicalPageHeader = By.xpath("//h2[contains(text(), 'Physical')]");

	By heightLabel = By.xpath("//label[@for='height']");

	By weightLabel = By.xpath("//label[@for='weight']");

	By waistLabel = By.xpath("//label[@for='waist_circumference']");

	By heightInput = By.xpath("//label[@for='height']//following::input[1]");

	By weightInput = By.xpath("//label[@for='weight']//following::input[1]");

	By waistInput = By.xpath("//label[@for='waist_circumference']//following::input[1]");

	By hraPhysicalNextButton = By.xpath("//a[@data-role='hra-physical-question-1-next-button']");

	// Active working

	By hraPhysicalQuestion2Img = By.xpath("//img[contains(@src, 'hra-physical-question-2')]");

	By hraPhysicalActiveWorkingLabel = By.xpath("//label[contains(text(), 'active - working')]");

	By hraPhysicalQuesSecondOption1 = By.xpath("//a[contains(text(), '60 min')]");

	By hraPhysicalQuesSecondOption2 = By.xpath("//a[contains(text(), '60-150 min')]");

	By hraPhysicalQuesSecondOption3 = By.xpath("//a[contains(text(), 'Over 150 min')]");

	// Sitting

	By hraPhysicalQuestion3Img = By.xpath("//img[contains(@src, 'hra-physical-question-3')]");

	By hraPhysicalSpendSittingLabel = By.xpath("//label[contains(text(), 'spend sitting')]");

	By hraPhysicalQuesThirdOption1 = By.xpath("//a[contains(text(), '0-25%')]");

	By hraPhysicalQuesThirdOption2 = By.xpath("//a[contains(text(), '25-50%')]");

	By hraPhysicalQuesThirdOption3 = By.xpath("//a[contains(text(), '50-75%')]");

	By hraPhysicalQuesThirdOption4 = By.xpath("//a[contains(text(), '75-100%')]");

	// Life Style sleeping

	By hraLifestyleQuestion1Img = By.xpath("//img[contains(@src, 'hra-lifestyle-question-1')]");

	By hraLifeStyleSleepPerNightLabel = By.xpath("//label[@for='sleep_per_night']");

	By hraLifeStyleSleepPerNightInput = By.xpath("//input[@id='sleep_per_night']");

	By hraLifeStyleNextLink = By.xpath("//a[@data-role='hra-lifestyle-question-1-next-button']");

	// Smoking Life style
	By hraLifestyleQuestion2SmokingImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-2')]");

	By hraLifeStyleSmokingLabel = By.xpath("//label[contains(text(), 'smoking habits')]");

	By hraLifeStyleSmokingOptionNever = By.xpath("//a[contains(text(), 'Never')]");

	By hraLifeStyleSmokingOptionFormerOccasional = By.xpath("//a[contains(text(), 'used to smoke occas')]");

	By hraLifeStyleSmokingOptionFormerDaily = By.xpath("(//a[contains(text(), 'used to smoke daily')])[1]");

	By hraLifeStyleSmokingOptionOccasional = By.xpath("(//a[contains(text(), 'smoke occa')])[2]");

	By hraLifeStyleSmokingOptionDaily = By.xpath("(//a[contains(text(), 'smoke daily')])[2]");

	By hraLifeStyleSmokingOptionFormerDaily2 = By.xpath("//a[contains(text(), 'currently smoke occas')]");

	// When Never selected Drinking questions

	By hraLifestyleQuestionDrinkingImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-6')]");

	By hraLifeStyleDrinikingLabel = By.xpath("//label[contains(text(), 'alcohol consumption')]");

	By hraLifeStyleDrinkingNeverDrank = By.xpath("(//a[contains(text(), 'drink alcohol')])[1]");

	By hraLifeStyleDrinkingCurrentlyDrink = By.xpath("//*[contains(text(),'I drink')]");

	By hraLifeStyleDrinkingFormerDrink = By.xpath("//a[contains(text(),'I used to drink')]");

	// Alcohol Drinks
	By hraLifestyleQuestionAlcoholImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-6')]");

	By hraLifeStyleAlcoholPerWeekLabel = By.xpath("//label[contains(text(), 'alcoholic drinks')]");

	By hraLifeStyleAlcoholPerDayDrinkInput = By.xpath("//input[@id='current_drinks_per_day']");

	By hraLifeStyleAlcoholPerWeeCurrentDrinkInput = By.xpath("//input[@id='current_drinks_per_week']");

	By hraLifeStyleAlcoholPerWeePastDrinksInput = By.xpath("//input[@id='past_drinks_per_week']");

	By hraLifeStyleAlchoholNextLink = By.xpath("//a[@data-role='hra-lifestyle-question-1-next-button']");

	// when SMOKING former occ, former daily, occasional, daily, daily
	By hraLifestyleQuestionCigrattesImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-2')]");

	By hraLifeStyleSmokePerDayLabel = By.xpath("//label[contains(text(), 'smoke per day')]");

	By hraLifeStyleSmokePerWeekLabel = By.xpath("//label[contains(text(), 'smoke per week')]");

	By hraLifeStyleSmokePerDayInput = By.xpath("//input[@id='past_cigarettes_per_day']");

	By hraLifeStyleSmokePerWeekInput = By.xpath("//input[@id='current_cigarettes_per_week']");

	By hraLifeStyleNextLink2b = By.xpath("//a[@data-role='hra-lifestyle-question-2b-next-button']");

	// when never drank selected - daily stress question

	By hraLifestyleQuestion4StressImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-7')]");

	By hraLifeStyleStressLabel = By.xpath("//label[contains(text(), 'describe your daily stress')]");

	By hraLifeStyleStressOptionNoStressLink = By.xpath("//a[contains(text(), 'No stress')]");

	By hraLifeStyleStressOptionNotVeryStressLink = By.xpath("//a[contains(text(), 'little stressful')]");

	By hraLifeStyleStressOptionBitStressLink = By.xpath("//a[contains(text(), 'bit more stressful')]");

	By hraLifeStyleStressOptionQuiteBitStressLink = By.xpath("//a[contains(text(), 'Quite a bit stressful')]");

	By hraLifeStyleStressOptionQuiteExtremeStressLink = By.xpath("//a[contains(text(), 'Extremely stressful')]");

	// Happiness question
	By hraLifestyleQuestion4HappinessImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-8')]");

	By hraLifeStyleHappinessLabel = By.xpath("//label[contains(text(), 'typical level of happiness')]");

	By hraLifeStyleStressOptionHappyLink = By.xpath("//a[contains(text(), 'Happy')]");

	By hraLifeStyleStressOptionSomewhatHappyLink = By.xpath("//a[contains(text(), 'Somewhat happy')]");

	By hraLifeStyleStressOptionSomewhatUnHappyLink = By.xpath("//a[contains(text(), 'Somewhat unhappy')]");

	By hraLifeStyleStressOptionUnHappyLink = By.xpath("//a[contains(text(), 'Unhappy')]");

	By hraLifeStyleStressOptionUnHappyNotWorthLink = By
			.xpath("//a[contains(text(), 'unhappy that life is not worth')]");

	// Medical question
	// Diabetes
	By hraTypeIIDiabetesLabel = By.xpath("//label[contains(text(), 'Type II Diabetes')]");

	By hraTypeIIDiabetesControlledLabel = By.xpath("//label[contains(text(), 'Type II Diabetes controlled')]");

	By hraYesLink = By.xpath("//a[contains(text(), 'Yes')]");
	
	By hraNoLink = By.xpath("(//a[contains(text(), 'No')])[2]");

	// Cardovascular
	By hraCardiovascularLabel = By.xpath("//label[contains(text(), 'cardiovascular disease')]");

	By hraCardiovascularControlledLabel = By.xpath("//label[contains(text(), 'cardiovascular disease controlled')]");

	// Blood pressure
	By hraBLoodPressureLabel = By.xpath("//label[contains(text(), 'blood pressure')]");

	By hraBloodpressureControlledLabel = By.xpath("//label[contains(text(), 'blood pressure controlled')]");

	// osteoarthritis
	By hraOsteoarthritisLabel = By.xpath("//label[contains(text(), 'osteoarthritis')]");

	By hraOsteoarthritisControlledLabel = By.xpath("//label[contains(text(), 'osteoarthritis controlled')]");

	// lung disease
	By hraLungDiseaseLabel = By.xpath("//label[contains(text(), 'lung disease')]");

	By hraLungdiseaseControlledLabel = By.xpath("//label[contains(text(), 'lung disease controlled')]");

	// lower back pain
	By hraLowerbackpainLabel = By.xpath("//label[contains(text(), 'lower back pain')]");

	By hraLowerbackpainControlledLabel = By.xpath("//label[contains(text(), 'lower back pain controlled')]");

	// Immediate Type II Diabetes immediate family
	By hraTypeIIDiabetesImmediateLabel = By.xpath("//label[contains(text(), 'Type II Diabetes')]");

	By hraCardiovascularImemdidiateLabel = By.xpath("//label[contains(text(), 'cardiovascular disease')]");

	// Content Library

	By spanFeel = By.xpath("//span[contains(text(), 'Feel')]");

	By spanPlay = By.xpath("//span[contains(text(), 'Play')]");

	By spanLifestyle = By.xpath("//span[contains(text(), 'Lifestyle')]");

	By spanCardio = By.xpath("//span[contains(text(), 'Cardio')]");

	By spanRelax = By.xpath("//span[contains(text(), 'Relax')]");

	By spanNutrition = By.xpath("//span[contains(text(), 'Nutrition')]");

	By spanCardio2 = By.xpath("(//span[contains(text(), 'Cardio')])[2]");

	// Home Page

	By updateMyAnswerLink = By.xpath("(//a[contains(text(), 'Update my answers')])[2]");

	By calculateHealthScore = By.xpath("(//a[contains(text(), 'Calculate Health Score')])[2]");
	
	//THNAKS YUT PAGE
	
	By hraThankYouImg = By.xpath("//img[contains(@src, 'hra-intro-page')]");
	
	By hraThankyouHeader = By.xpath("//h3[text()=' Thank you! ']");
	
	By hraThankyouText = By.xpath("//p[contains(text(), 'Thank you for filling')]");
	
	By viewHealthScoreLink = By.xpath("//a[contains(text(), 'View Health Scor')]");
	

	public HRAHomePageNew(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void navigateToHomePage() {

		Utility.waitForWebElement(driver, homeLink).click();

	}

	public void navigateToHRAIntakePage() {

		Utility.navigateToURL(driver, "https://patient.eqserviceqa1.eqcaredev.com/hra/intake");

	}

	public void navigateToHRAContentLibrary() {

		Utility.navigateToURL(driver, "https://patient.eqserviceqa1.eqcaredev.com/hra/content-library");

	}

	
	public void hraCompletionPage() {

		Utility.waitForWebElement(driver, hraThankYouImg);
		
		Utility.waitForWebElement(driver, hraThankyouHeader);
		
		Utility.waitForWebElement(driver, hraThankyouText);	
		
		Utility.waitForWebElement(driver, viewHealthScoreLink).click();
		
		Utility.wait(25);

	}

	
	
	public void calculateHealthScoreLink() throws Exception {

		try {

			Utility.waitForWebElement(driver, calculateHealthScore).click();

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			// throw ex;
			Utility.waitForWebElement(driver, updateMyAnswerLink).click();
		}
	}

	public void verifyHRAIntroductionPage() throws Exception {

		try {
			// Utility.waitForWebElement(driver, healthScoreButton).click();

			Utility.waitForWebElement(driver, introPageImage);

			Utility.waitForWebElement(driver, introPageHeader);

			Utility.waitForWebElement(driver, introPageMinsText);

			WebElement button = driver.findElement(By.xpath("//input[@type='checkbox']"));

			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].click()", button);

			Utility.waitForWebElement(driver, skipHRAFormButton);

			Utility.waitForWebElement(driver, startHRAFormButton).click();

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

		}
	}

	public void verifyHRAContentLibrary() {

		Utility.waitForWebElement(driver, spanFeel);

		Utility.waitForWebElement(driver, spanPlay);

		Utility.waitForWebElement(driver, spanLifestyle);

		Utility.waitForWebElement(driver, spanCardio);

		Utility.waitForWebElement(driver, spanRelax);

		Utility.waitForWebElement(driver, spanNutrition);

		Utility.waitForWebElement(driver, spanCardio2);

	}

	public void verifyHRAPhysicalIntakeFormsQues1() throws Exception {

		try {

			Utility.waitForWebElement(driver, backLink);

			Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, heightLabel);

			Utility.waitForWebElement(driver, weightLabel);

			Utility.waitForWebElement(driver, waistLabel);

			Utility.waitForWebElement(driver, heightInput).sendKeys("157");

			Utility.waitForWebElement(driver, weightInput).sendKeys("55");

			Utility.waitForWebElement(driver, waistInput).sendKeys("77");

			Utility.waitForWebElement(driver, hraPhysicalNextButton).click();

			// Utility.waitForWebElement(driver, quitLink).click();

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

		}
	}

	public void verifyHRAPhysicalIntakeFormsQues2() throws Exception {

		try {

			Utility.waitForWebElement(driver, backLink);

			Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, hraPhysicalQuestion2Img);

			Utility.waitForWebElement(driver, hraPhysicalActiveWorkingLabel);

			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption1).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption2).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption3).click();

			// Utility.waitForWebElement(driver, quitLink).click();

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

		}
	}

	public void verifyHRAPhysicalIntakeFormsQues3() throws Exception {

		try {

			Utility.waitForWebElement(driver, backLink);

			Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption1).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption2).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption3).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption4).click();
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

		}
	}

	public void verifyHRAPhysicalIntakeForms() throws Exception {

		try {

			// Utility.waitForWebElement(driver, backLink);

			// Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, heightInput).sendKeys("157");

			Utility.waitForWebElement(driver, weightInput).sendKeys("55");

			Utility.waitForWebElement(driver, waistInput).sendKeys("77");

			Utility.waitForWebElement(driver, hraPhysicalNextButton).click();

			// Utility.waitForWebElement(driver, backLink);

			// Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, hraPhysicalQuestion2Img);

			Utility.waitForWebElement(driver, hraPhysicalActiveWorkingLabel);

			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption1).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption2).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption3).click();

			// Utility.waitForWebElement(driver, backLink);

			// Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption1).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption2).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption3).click();

			Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption4).click();

			// Utility.waitForWebElement(driver, weightInput);

			// Utility.waitForWebElement(driver, quitLink).click();

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

		}
	}

	public void verifyHRALifeStyleQuesSleep1() throws Exception {

		// Life Style - Sleep Hours - Ques1

		Utility.waitForWebElementVisible(driver, hraLifestyleQuestion1Img);

		Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightLabel);

		Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightInput).sendKeys("7");

		Utility.waitForWebElement(driver, hraLifeStyleNextLink).click();
	}

	public void verifyHRALifeStyleQuesSmoking2() throws Exception {

		// Life Style - Smoking habbits - Ques2

		Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);

		Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);

		Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionNever).click();

		// Life Style - Smoking habbits - Ques3

		// Smoking with Never - Drinking
		Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);

		Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);

		Utility.waitForWebElement(driver, backLink).click();

		// Smoking Former Occasional
		Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerOccasional).click();

		// Cigrattes
		Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

		Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekLabel);

		Utility.waitForWebElement(driver, backLink).click();

		// Smoking Former Daily
		Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerDaily).click();

		// Cigrattes
		Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

		Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

		Utility.waitForWebElement(driver, backLink).click();

		// Smoking Occassional
		Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionOccasional).click();

		// Cigrattes
		Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

		Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekLabel);

		Utility.waitForWebElement(driver, backLink).click();

		// Smoking Daily
		Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionDaily).click();

		// Cigrattes
		Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

		Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

		Utility.waitForWebElement(driver, backLink).click();

		// Former Daily2
		Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
		Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerDaily2).click();

		// Cigrattes
		Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

		Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekLabel);

		// Utility.waitForWebElement(driver, backLink).click();

		Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekInput).sendKeys("7");

		Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();
	}

	public void verifyHRALifeStyleQuesDrinking1() throws Exception {
		// NEVER DRINKING
		Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);

		Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);

		Utility.waitForWebElement(driver, hraLifeStyleDrinkingNeverDrank).click();

		// Never DRINK after STRESS question

		Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

		Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

		Utility.waitForWebElement(driver, backLink).click();

		// Currently Drink
		Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
		Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
		Utility.waitForWebElement(driver, hraLifeStyleDrinkingCurrentlyDrink).click();

		// Alcoholic
		Utility.waitForWebElement(driver, hraLifestyleQuestionAlcoholImg);

		Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeekLabel);

		Utility.waitForWebElement(driver, backLink).click();

		// Former Drink
		Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
		Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
		Utility.waitForWebElement(driver, hraLifeStyleDrinkingFormerDrink).click();

		// Alcholic Input
		Utility.waitForWebElement(driver, hraLifestyleQuestionAlcoholImg);
		Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeekLabel);
		Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeePastDrinksInput).sendKeys("7");

		Utility.waitForWebElement(driver, hraLifeStyleAlchoholNextLink).click();
	}
	
	
	public void verifyHRALifeStyleQuesStressHappiness() throws Exception {
		
		// STRESS QUEST Optipon1
					Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

					Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

					Utility.waitForWebElement(driver, hraLifeStyleStressOptionNoStressLink).click();

					Utility.waitForWebElement(driver, backLink).click();

					// STRESS QUEST Optipon2

					Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

					Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

					Utility.waitForWebElement(driver, hraLifeStyleStressOptionNotVeryStressLink).click();

					Utility.waitForWebElement(driver, backLink).click();

					// STRESS QUEST Optipon3

					Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

					Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

					Utility.waitForWebElement(driver, hraLifeStyleStressOptionBitStressLink).click();

					Utility.waitForWebElement(driver, backLink).click();

					// STRESS QUEST Optipon4

					Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

					Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

					Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteBitStressLink).click();

					Utility.waitForWebElement(driver, backLink).click();

					// STRESS QUEST Optipon5

					Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

					Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

					Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteExtremeStressLink).click();

					// Utility.waitForWebElement(driver, backLink).click();

					// Happiness QUEST

					Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);

					Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);

					Utility.waitForWebElement(driver, hraLifeStyleStressOptionHappyLink).click();

		
	}

	public void verifyHRALifeStyle() throws Exception {

		try {

			// Life Style - Sleep Hours - Ques1

			Utility.waitForWebElementVisible(driver, hraLifestyleQuestion1Img);

			Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightLabel);

			Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightInput).sendKeys("7");

			Utility.waitForWebElement(driver, hraLifeStyleNextLink).click();

			// Life Style - Smoking habbits - Ques2

			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);

			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);

			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionNever).click();

			// Life Style - Smoking habbits - Ques3

			// Smoking with Never - Drinking
			Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);

			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);

			Utility.waitForWebElement(driver, backLink).click();

			// Smoking Former Occasional
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerOccasional).click();

			// Cigrattes
			Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

			Utility.waitForWebElement(driver, backLink).click();

			// Smoking Former Daily
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerDaily).click();

			// Cigrattes
			Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

			Utility.waitForWebElement(driver, backLink).click();

			// Smoking Occassional
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionOccasional).click();

			// Cigrattes
			Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

			Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekLabel);

			Utility.waitForWebElement(driver, backLink).click();

			// Smoking Daily
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionDaily).click();

			// Cigrattes
			Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

			Utility.waitForWebElement(driver, backLink).click();

			// Former Daily2
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerDaily2).click();

			// Cigrattes
			Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

			// Utility.waitForWebElement(driver, backLink).click();

			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayInput).sendKeys("7");

			Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();

			// NEVER DRINKING
			Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);

			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);

			Utility.waitForWebElement(driver, hraLifeStyleDrinkingNeverDrank).click();

			// Never DRINK after STRESS question

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, backLink).click();

			// Currently Drink
			Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleDrinkingCurrentlyDrink).click();

			// Alcoholic
			Utility.waitForWebElement(driver, hraLifestyleQuestionAlcoholImg);

			Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeekLabel);

			Utility.waitForWebElement(driver, backLink).click();

			// Former Drink
			Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleDrinkingFormerDrink).click();

			// Alcholic Input
			Utility.waitForWebElement(driver, hraLifestyleQuestionAlcoholImg);
			Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeekLabel);
			Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeePastDrinksInput).sendKeys("7");

			Utility.waitForWebElement(driver, hraLifeStyleAlchoholNextLink).click();

			// STRESS QUEST Optipon1
			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionNoStressLink).click();

			Utility.waitForWebElement(driver, backLink).click();

			// STRESS QUEST Optipon2

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionNotVeryStressLink).click();

			Utility.waitForWebElement(driver, backLink).click();

			// STRESS QUEST Optipon3

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionBitStressLink).click();

			Utility.waitForWebElement(driver, backLink).click();

			// STRESS QUEST Optipon4

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteBitStressLink).click();

			Utility.waitForWebElement(driver, backLink).click();

			// STRESS QUEST Optipon5

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteExtremeStressLink).click();

			// Utility.waitForWebElement(driver, backLink).click();

			// Happiness QUEST

			Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);

			Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionHappyLink).click();

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

		}
	}

	public void verifyMedical()

	{

		Utility.waitForWebElement(driver, hraTypeIIDiabetesLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		Utility.waitForWebElement(driver, hraTypeIIDiabetesControlledLabel);

		Utility.waitForWebElement(driver, hraNoLink).click();

		// Cardio

		Utility.waitForWebElement(driver, hraCardiovascularLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		Utility.waitForWebElement(driver, hraCardiovascularControlledLabel);

		Utility.waitForWebElement(driver, hraNoLink).click();

		// Blood pressure

		Utility.waitForWebElement(driver, hraBLoodPressureLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		Utility.waitForWebElement(driver, hraBloodpressureControlledLabel);

		Utility.waitForWebElement(driver, hraNoLink).click();

		// osteoarthritis

		Utility.waitForWebElement(driver, hraOsteoarthritisLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		Utility.waitForWebElement(driver, hraOsteoarthritisControlledLabel);

		Utility.waitForWebElement(driver, hraNoLink).click();

		// Lung Disease

		Utility.waitForWebElement(driver, hraLungDiseaseLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		Utility.waitForWebElement(driver, hraLungdiseaseControlledLabel);

		Utility.waitForWebElement(driver, hraNoLink).click();

		// Lower backpain

		Utility.waitForWebElement(driver, hraLowerbackpainLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		Utility.waitForWebElement(driver, hraLowerbackpainControlledLabel);

		Utility.waitForWebElement(driver, hraNoLink).click();

		// Type II Immediate

		Utility.waitForWebElement(driver, hraTypeIIDiabetesImmediateLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		// Cardio

		Utility.waitForWebElement(driver, hraCardiovascularImemdidiateLabel);

		Utility.waitForWebElement(driver, hraYesLink).click();

		/*Utility.waitForWebElement(driver, backLink).click();

		Utility.waitForWebElement(driver, backLink).click();

		Utility.waitForWebElement(driver, backLink).click();

		Utility.waitForWebElement(driver, backLink).click();

		Utility.waitForWebElement(driver, backLink).click();

		Utility.waitForWebElement(driver, backLink).click();

		Utility.waitForWebElement(driver, backLink).click();*/
		
		Utility.wait(10);

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
