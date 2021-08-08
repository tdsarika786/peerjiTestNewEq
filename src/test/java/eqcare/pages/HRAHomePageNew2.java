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

import com.practitest.examples.runWithAttachments;

public class HRAHomePageNew2 extends runWithAttachments {

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

	By introPageMinsText = By.xpath("//p[contains(text(), 'mins')]");

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

	// INPUT

	By hraLifeStyleSmokePastPerDayInput = By.xpath("//input[@id='past_cigarettes_per_day']");

	By hraLifeStyleSmokePerDayInput = By.xpath("//input[@id='current_cigarettes_per_day']");

	By hraLifeStyleSmokePerWeekInput = By.xpath("//input[@id='current_cigarettes_per_week']");

	By hraLifeStyleSmokePastPerWeekInput = By.xpath("//input[@id='past_cigarettes_per_week']");

	By hraLifeStyleNextLink2b = By.xpath("//a[@data-role='hra-lifestyle-question-2b-next-button']");

	By hraLifeStyleNextLink2a = By.xpath("//a[@data-role='hra-lifestyle-question-2a-next-button']");

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

	By hraSubYesLink = By.xpath("(//a[contains(text(), 'Yes')])[2]");

	By hraNoSubLink = By.xpath("(//a[contains(text(), 'No')])[2]");

	By hraNoLink = By.xpath("(//a[contains(text(), 'No')])");

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

	By article1 = By.xpath("//p[contains(text(), ' The Amazing Power of Veggies! ')]");

	By article2 = By.xpath("//p[contains(text(), 'Easy Ways to Add Exercise to your Day')]");

	By article3 = By.xpath("//p[contains(text(), ' Give a Little Thanks to Make Everyone’s Day Better! ')]");

	By article4 = By.xpath("//p[contains(text(), ' Live Your Best Life By Practicing Self-Care! ')]");

	By article5 = By.xpath("//p[contains(text(), ' Kick start your healthy habit-building process! ')]");

	By article6 = By.xpath("//p[contains(text(), ' Go With Your Gut ')]");

	By article7 = By.xpath("//p[contains(text(), ' Financial Tips Everyone Should Know ')]");

	By article8 = By.xpath("//p[contains(text(), ' 6 Tips to Lighten Your Mood ')]");

	By article9 = By.xpath("//p[contains(text(), ' 5 Ways Getting Outside Promotes Mental and Physical Wellness ')]");

	By article10 = By.xpath("//p[contains(text(), ' 5 Tips for Taking Productive Breaks ')]");

	By article11 = By.xpath("//p[contains(text(), ' 5 Simple Steps For a Healthy Heart ')]");

	By article12 = By.xpath("//p[contains(text(), ' 5 Easy Strategies To Help Protect Our Planet ')]");

	By article13 = By.xpath("//p[contains(text(), ' How to Make More Time for Your Loved Ones ')]");

	By article14 = By.xpath("//p[contains(text(), ' How to Sneak in Activity Throughout Your Day ')]");

	By article15 = By.xpath("//p[contains(text(), ' Is 10,000 Steps the Magic Number? ')]");

	By article16 = By.xpath("//p[contains(text(), ' How To Learn To Love Your Veggies ')]");

	By article17 = By.xpath("//p[contains(text(), ' Listen to Your Gut: 5 Foods to Improve Your Gut Health ')]");

	By article18 = By.xpath("//p[contains(text(), ' Your Meal Prep Guide for a Week of Healthy Dinners ')]");

	By article19 = By.xpath("//p[contains(text(), ' Top Tips to Stay On Track to Reach Your Goals ')]");

	By article20 = By.xpath("//p[contains(text(), ' Why Mediation is Good and How to Make it Work for You ')]");

	By article21 = By.xpath("//p[contains(text(), ' Your Guide to the Ultimate Personalized Self-Care Routine ')]");

	By article22 = By.xpath("//p[contains(text(), ' 5 Tips to Fit in Activity When Life Throws You a Curveball ')]");

	By pageNo2 = By.xpath("//*[@id='scrollable-container']//li[text()=' 2 ']");

	By pageNo3 = By.xpath("//*[@id='scrollable-container']//li[text()=' 3 ']");

	// images:aa

	// By aa List<WebElement> =
	// By.xpath("//*[@id='scrollable-container']//li[text()=' 3 ']");

	// By
	// List<WebElement>elementName=By.xpath("//*[@id='scrollable-container']//li[text()='
	// 3 ']");

	// Home Page

	By updateMyAnswerLink = By.xpath("(//a[contains(text(), 'Update my answers')])[2]");

	By calculateHealthScore = By.xpath("(//a[contains(text(), 'Calculate Health Score')])[2]");

	// THNAKS YUT PAGE

	By hraThankYouImg = By.xpath("//img[contains(@src, 'hra-intro-page')]");

	By hraThankyouHeader = By.xpath("//h3[text()=' Thank you! ']");

	By hraThankyouText = By.xpath("//p[contains(text(), 'Thank you for filling')]");

	By viewHealthScoreLink = By.xpath("//a[contains(text(), 'View Health Score')]");

	// Close button
	By closeCTA = By.xpath("(//div[@class='close-button'])[1]");

	By getScoreLabel = By.xpath("(//p)[1]");

	By getScorePercentage = By.xpath("(//p)[8]");

	// Access Library
	By accLibrarayLink = By.xpath("//a[contains(text(), 'LIBRARY')]");

	// Score Modal HRA Complete
	By overallScoreLabel = By.xpath("(//p[contains(text(), 'Overall')])[1]");

	By moveScoreLabel = By.xpath("(//p[contains(text(), 'Move')])[1]");

	By feelScoreLabel = By.xpath("(//p[contains(text(), 'Feel')])[1]");

	By mindScoreLabel = By.xpath("(//p[contains(text(), 'Mind')])[1]");

	By updateMyAnswerScoreLink = By.xpath("(//a[contains(text(), 'Update my answers')])[1]");

	By talkToCareLink = By.xpath("//a[contains(text(), 'Talk to a Care')]");

	By calculationTab = By.xpath("//p[contains(text(), 'Calculation')]");

	By myScoreTab = By.xpath("//p[contains(text(), 'My Score')]");

	By myPhysicalityTab = By.xpath("//p[contains(text(), ' Physicality Guidelines ')]");

	By physicalGuideTabActive = By.xpath("//a[contains(text(), 'Activity')]");

	By physicalGuideTabSitting = By.xpath("//a[contains(text(), 'Sitting')]");

	By scoreHeading = By.xpath("//h2[contains(text(),'My Health Score')]");

	// Score ModalHome

	By overallScoreLabelHome = By.xpath("(//p[contains(text(), 'Overall')])[2]");

	By moveScoreLabelHome = By.xpath("(//p[contains(text(), 'Move')])[2]");

	By feelScoreLabelHome = By.xpath("(//p[contains(text(), 'Feel')])[2]");

	By mindScoreLabelHome = By.xpath("(//p[contains(text(), 'Mind')])[2]");

	By divLibrary = By.xpath("//div[contains(text(), 'access to your library')]");

	// Score ModalHome TBA

	By overallScoreLabelHomeTBA = By.xpath("(//p[contains(text(), 'Overall')])");

	By moveScoreLabelHomeTBA = By.xpath("(//p[contains(text(), 'Move')])");

	By feelScoreLabelHomeTBA = By.xpath("(//p[contains(text(), 'Feel')])");

	By mindScoreLabelHomeTBA = By.xpath("(//p[contains(text(), 'Mind')])");

	// Score Home Pop up

	By scorePopUpClick = By.xpath("//*[@id=\"scrollable-container\"]/div[3]/div[3]/div[3]/div[1]/div");

	public HRAHomePageNew2(WebDriver ldriver) {
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

	public void hraCompletionPage1(String scoreLabel) {

		Utility.wait(10);

		Utility.waitForWebElement(driver, hraThankYouImg);

		Utility.waitForWebElement(driver, hraThankyouHeader);

		Utility.waitForWebElement(driver, hraThankyouText);

		Utility.waitForWebElement(driver, talkToCareLink);

		viewScoreHRAComplete(scoreLabel);

		Utility.waitForWebElement(driver, closeCTA).click();

		Utility.waitForWebElement(driver, scorePopUpClick).click();

		System.out.println("10.1 View Score pop closed");

		Utility.waitForWebElement(driver, talkToCareLink).click();

		System.out.println("10.2 On Home Click on Score pop up, In modal CLICK TALK TO CARE ADVOCATE");

		Utility.wait(5);

		String url = driver.getCurrentUrl();

		System.out.println("URL " + url);

	}
	
	public void hraCompletionPage() {

		Utility.wait(10);

		Utility.waitForWebElement(driver, hraThankYouImg);

		Utility.waitForWebElement(driver, hraThankyouHeader);

		Utility.waitForWebElement(driver, hraThankyouText);

		Utility.waitForWebElement(driver, talkToCareLink);

		viewScoreHRAComplete();

	}
	public void viewScoreHRAComplete() {

		System.out.println("View Health Score");

		Utility.waitForWebElement(driver, viewHealthScoreLink).click();

		Utility.wait(5);

		System.out.println("View Health Score");

		String getScore = Utility.waitForWebElement(driver, getScoreLabel).getText();

		System.out.println(getScore);

		String getPercentage = Utility.waitForWebElement(driver, getScorePercentage).getText();

		System.out.println(getPercentage);

		//Assert.assertEquals(getScore, scoreLabel);

		String strPercentage = getPercentage.substring(0, getPercentage.length() - 1);

		int percentage = Integer.parseInt(strPercentage);

		if (percentage <= 49 && percentage >= 0) {

			Assert.assertEquals(getScore, "There’s room for improvement.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 61 && percentage >= 50) {
			Assert.assertEquals(getScore, "Keep an eye on it.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 73 && percentage >= 62) {
			Assert.assertEquals(getScore, "Keep it up.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 85 && percentage >= 74) {

			Assert.assertEquals(getScore, "You’re doing very well.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 100 && percentage >= 86) {
			Assert.assertEquals(getScore, "You’re doing very great.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		}

		// SCORE MODAL

		// Utility.waitForWebElement(driver, scoreHeading);

		Utility.waitForWebElement(driver, overallScoreLabel);

		Utility.waitForWebElement(driver, moveScoreLabel);

		Utility.waitForWebElement(driver, feelScoreLabel);

		Utility.waitForWebElement(driver, mindScoreLabel);

		Utility.waitForWebElement(driver, updateMyAnswerScoreLink);

		// Utility.waitForWebElement(driver, talkToCareLink);

		Utility.waitForWebElement(driver, calculationTab).click();

		Utility.waitForWebElement(driver, myScoreTab).click();

		Utility.waitForWebElement(driver, myPhysicalityTab).click();

		Utility.waitForWebElement(driver, physicalGuideTabActive).click();

		Utility.waitForWebElement(driver, physicalGuideTabSitting).click();

		System.out.println(
				"---- HRA Complete Page Score Popup Overall, Move, feel, Mind, CTA etc. check calculation, score, physical tab----");

		/*
		 * if (getPercentage.equalsIgnoreCase("72%")) {
		 * 
		 * Assert.assertEquals(getScore, "Keep it up.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 * 
		 * if (getPercentage.equalsIgnoreCase("56%")) {
		 * 
		 * Assert.assertEquals(getScore, "Keep an eye on it.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 * 
		 * if (getPercentage.equalsIgnoreCase("81%")) {
		 * 
		 * Assert.assertEquals(getScore, "You’re doing very well.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 * 
		 * if (getPercentage.equalsIgnoreCase("33%")) {
		 * 
		 * Assert.assertEquals(getScore, "There’s room for improvement.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 */

		// Utility.waitForWebElement(driver, closeCTA).click();

	}

	public void hraCompletionPage(String scoreLabel) {

		Utility.wait(10);

		Utility.waitForWebElement(driver, hraThankYouImg);

		Utility.waitForWebElement(driver, hraThankyouHeader);

		Utility.waitForWebElement(driver, hraThankyouText);

		Utility.waitForWebElement(driver, talkToCareLink);

		viewScoreHRAComplete(scoreLabel);

	}

	public void hraCompletionPageAndTalkToCare() {

		Utility.wait(10);

		Utility.waitForWebElement(driver, hraThankYouImg);

		Utility.waitForWebElement(driver, hraThankyouHeader);

		Utility.waitForWebElement(driver, hraThankyouText);

		Utility.waitForWebElement(driver, talkToCareLink).click();

		Utility.wait(5);

		String url = driver.getCurrentUrl();

		System.out.println("URL " + url);

		// viewScoreHRAComplete(scoreLabel);

	}

	public void viewScoreHRAComplete(String scoreLabel) {

		System.out.println("View Health Score");

		Utility.waitForWebElement(driver, viewHealthScoreLink).click();

		Utility.wait(5);

		System.out.println("View Health Score");

		String getScore = Utility.waitForWebElement(driver, getScoreLabel).getText();

		System.out.println(getScore);

		String getPercentage = Utility.waitForWebElement(driver, getScorePercentage).getText();

		System.out.println(getPercentage);

		Assert.assertEquals(getScore, scoreLabel);

		String strPercentage = getPercentage.substring(0, getPercentage.length() - 1);

		int percentage = Integer.parseInt(strPercentage);

		if (percentage <= 49 && percentage >= 0) {

			Assert.assertEquals(getScore, "There’s room for improvement.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 61 && percentage >= 50) {
			Assert.assertEquals(getScore, "Keep an eye on it.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 73 && percentage >= 62) {
			Assert.assertEquals(getScore, "Keep it up.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 85 && percentage >= 74) {

			Assert.assertEquals(getScore, "You’re doing very well.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		} else if (percentage <= 100 && percentage >= 86) {
			Assert.assertEquals(getScore, "You’re doing very great.");
			System.out.println("Assertion Pass " + getScore + " " + percentage);
		}

		// SCORE MODAL

		// Utility.waitForWebElement(driver, scoreHeading);

		Utility.waitForWebElement(driver, overallScoreLabel);

		Utility.waitForWebElement(driver, moveScoreLabel);

		Utility.waitForWebElement(driver, feelScoreLabel);

		Utility.waitForWebElement(driver, mindScoreLabel);

		Utility.waitForWebElement(driver, updateMyAnswerScoreLink);

		// Utility.waitForWebElement(driver, talkToCareLink);

		Utility.waitForWebElement(driver, calculationTab).click();

		Utility.waitForWebElement(driver, myScoreTab).click();

		Utility.waitForWebElement(driver, myPhysicalityTab).click();

		Utility.waitForWebElement(driver, physicalGuideTabActive).click();

		Utility.waitForWebElement(driver, physicalGuideTabSitting).click();

		System.out.println(
				"---- HRA Complete Page Score Popup Overall, Move, feel, Mind, CTA etc. check calculation, score, physical tab----");

		/*
		 * if (getPercentage.equalsIgnoreCase("72%")) {
		 * 
		 * Assert.assertEquals(getScore, "Keep it up.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 * 
		 * if (getPercentage.equalsIgnoreCase("56%")) {
		 * 
		 * Assert.assertEquals(getScore, "Keep an eye on it.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 * 
		 * if (getPercentage.equalsIgnoreCase("81%")) {
		 * 
		 * Assert.assertEquals(getScore, "You’re doing very well.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 * 
		 * if (getPercentage.equalsIgnoreCase("33%")) {
		 * 
		 * Assert.assertEquals(getScore, "There’s room for improvement.");
		 * 
		 * System.out.println("Assertion Pass " + getScore); }
		 */

		// Utility.waitForWebElement(driver, closeCTA).click();

	}

	public void scoreModalClose() {
		Utility.waitForWebElement(driver, closeCTA).click();
	}

	public void scoreModal() {

		Utility.waitForWebElement(driver, scorePopUpClick).click();

		Utility.waitForWebElement(driver, overallScoreLabel);

		Utility.waitForWebElement(driver, moveScoreLabel);

		Utility.waitForWebElement(driver, feelScoreLabel);

		Utility.waitForWebElement(driver, mindScoreLabel);

		Utility.waitForWebElement(driver, updateMyAnswerScoreLink);

		Utility.waitForWebElement(driver, talkToCareLink);

		Utility.waitForWebElement(driver, calculationTab).click();

		Utility.waitForWebElement(driver, myScoreTab).click();

		Utility.waitForWebElement(driver, myPhysicalityTab).click();

		Utility.waitForWebElement(driver, physicalGuideTabActive).click();

		Utility.waitForWebElement(driver, physicalGuideTabSitting).click();

		Utility.waitForWebElement(driver, closeCTA).click();

	}

	public void talkToCare() {

		Utility.waitForWebElement(driver, talkToCareLink).click();

		Utility.wait(7);

		String url = driver.getCurrentUrl();

		System.out.println("URL " + url);

	}

	public void scoreInfoHomePage() {

		try {

			Utility.waitForWebElement(driver, calculateHealthScore);

			Utility.waitForWebElement(driver, scoreHeading);

			Utility.waitForWebElement(driver, overallScoreLabelHomeTBA);

			Utility.waitForWebElement(driver, moveScoreLabelHomeTBA);

			Utility.waitForWebElement(driver, feelScoreLabelHomeTBA);

			Utility.waitForWebElement(driver, mindScoreLabelHomeTBA);

			System.out.println("----Home Page HRA Info Check TBA Overall, Move, feel, Mind----");

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			// throw ex;
			Utility.waitForWebElement(driver, updateMyAnswerLink);

			Utility.waitForWebElement(driver, overallScoreLabelHome);

			Utility.waitForWebElement(driver, moveScoreLabelHome);

			Utility.waitForWebElement(driver, feelScoreLabelHome);

			Utility.waitForWebElement(driver, mindScoreLabelHome);

			Utility.waitForWebElement(driver, divLibrary);

			System.out.println("----Home Page HRA Info Check Scores Overall, Move, feel, Mind----");

			scoreModal();

			System.out.println(
					"----Home Page HRA Score Popup Overall, Move, feel, Mind, CTA etc. check calculation, score, physical tab----");

		}

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
	

	public void verifyHRAIntroductionPageTalkCare() throws Exception {

		try {
			// Utility.waitForWebElement(driver, healthScoreButton).click();

			Utility.waitForWebElement(driver, introPageImage);

			Utility.waitForWebElement(driver, introPageHeader);

			Utility.waitForWebElement(driver, introPageMinsText);

			WebElement button = driver.findElement(By.xpath("//input[@type='checkbox']"));

			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].click()", button);

			Utility.waitForWebElement(driver, skipHRAFormButton).click();

			//Utility.waitForWebElement(driver, startHRAFormButton).click();

			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

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

		Utility.waitForWebElement(driver, accLibrarayLink).click();

		Utility.waitForWebElement(driver, article1);

		String getarticle1 = Utility.waitForWebElement(driver, article1).getText();

		System.out.println("1 " + getarticle1);

		String getarticle2 = Utility.waitForWebElement(driver, article2).getText();

		System.out.println("2 " + getarticle2);

		String getarticle3 = Utility.waitForWebElement(driver, article3).getText();

		System.out.println("3 " + getarticle3);

		String getarticle4 = Utility.waitForWebElement(driver, article4).getText();

		System.out.println("4 " + getarticle4);

		String getarticle5 = Utility.waitForWebElement(driver, article5).getText();

		System.out.println("5 " + getarticle5);

		String getarticle6 = Utility.waitForWebElement(driver, article6).getText();

		System.out.println("6 " + getarticle6);

		String getarticle7 = Utility.waitForWebElement(driver, article7).getText();

		System.out.println("7 " + getarticle7);

		String getarticle8 = Utility.waitForWebElement(driver, article8).getText();

		System.out.println("8 " + getarticle8);

		String getarticle9 = Utility.waitForWebElement(driver, article9).getText();

		System.out.println("9 " + getarticle9);

		String getarticle10 = Utility.waitForWebElement(driver, article10).getText();

		System.out.println("10 " + getarticle10);

		try {
			List<WebElement> allArticleImages = driver.findElements(By.xpath("//li/div"));

			for (WebElement articleImage : allArticleImages) {

				Utility.highLightElement(driver, articleImage);

				System.out.println("*********************************************************************");
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			List<WebElement> allArticleImages = driver.findElements(By.xpath("//li/div"));

			for (WebElement articleImage : allArticleImages) {

				Utility.highLightElement(driver, articleImage);

				System.out.println("*********************************************************************");
			}
		}

		// Page 2

		Utility.waitForWebElement(driver, pageNo2).click();

		Utility.wait(5);

		String getarticle11 = Utility.waitForWebElement(driver, article11).getText();

		System.out.println("11 " + getarticle11);

		String getarticle12 = Utility.waitForWebElement(driver, article12).getText();

		System.out.println("12 " + getarticle12);

		String getarticle13 = Utility.waitForWebElement(driver, article13).getText();

		System.out.println("13 " + getarticle13);

		String getarticle14 = Utility.waitForWebElement(driver, article14).getText();

		System.out.println("14 " + getarticle14);

		String getarticle15 = Utility.waitForWebElement(driver, article15).getText();

		System.out.println("15 " + getarticle15);

		String getarticle16 = Utility.waitForWebElement(driver, article16).getText();

		System.out.println("16 " + getarticle16);

		String getarticle17 = Utility.waitForWebElement(driver, article17).getText();

		System.out.println("17 " + getarticle17);

		String getarticle18 = Utility.waitForWebElement(driver, article18).getText();

		System.out.println("18 " + getarticle18);

		String getarticle19 = Utility.waitForWebElement(driver, article19).getText();

		System.out.println("19 " + getarticle19);

		String getarticle20 = Utility.waitForWebElement(driver, article20).getText();

		System.out.println("20 " + getarticle20);

		try {
			List<WebElement> allArticleImages = driver.findElements(By.xpath("//li/div"));

			for (WebElement articleImage : allArticleImages) {

				Utility.highLightElement(driver, articleImage);

				System.out.println("*********************************************************************");
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			List<WebElement> allArticleImages = driver.findElements(By.xpath("//li/div"));

			for (WebElement articleImage : allArticleImages) {

				Utility.highLightElement(driver, articleImage);

				System.out.println("*********************************************************************");
			}
		}

		Utility.waitForWebElement(driver, pageNo3).click();

		Utility.wait(5);

		String getarticle21 = Utility.waitForWebElement(driver, article21).getText();

		System.out.println("21 " + getarticle21);

		String getarticle22 = Utility.waitForWebElement(driver, article22).getText();

		System.out.println("22 " + getarticle22);

		try {
			List<WebElement> allArticleImages = driver.findElements(By.xpath("//li/div"));

			for (WebElement articleImage : allArticleImages) {

				Utility.highLightElement(driver, articleImage);

				System.out.println("*********************************************************************");
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			List<WebElement> allArticleImages = driver.findElements(By.xpath("//li/div"));

			for (WebElement articleImage : allArticleImages) {

				Utility.highLightElement(driver, articleImage);

				System.out.println("*********************************************************************");
			}
		}

	}

	public void verifyHRAPhysicalIntakeFormsQues1(String height, String weight, String waist) throws Exception {

		try {

			Utility.waitForWebElement(driver, backLink);

			Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, heightLabel);

			Utility.waitForWebElement(driver, weightLabel);

			Utility.waitForWebElement(driver, waistLabel);

			Utility.waitForWebElement(driver, heightInput).sendKeys(height);

			Utility.waitForWebElement(driver, weightInput).sendKeys(weight);

			Utility.waitForWebElement(driver, waistInput).sendKeys(waist);

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

	public void verifyHRAPhysicalIntakeFormsQues2(String option) throws Exception {

		try {

			Utility.waitForWebElement(driver, hraPhysicalQuestion2Img);

			Utility.waitForWebElement(driver, hraPhysicalActiveWorkingLabel);

			if (option.equalsIgnoreCase("option1")) {

				Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption1).click();
			}

			else if (option.equalsIgnoreCase("option2")) {

				Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption2).click();
			}

			else if (option.equalsIgnoreCase("option3")) {

				Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption3).click();
			}

		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12,
			// 0), "7");
			throw ex;

		}
	}

	public void verifyHRAPhysicalIntakeFormsQues3(String option) throws Exception {

		try {

			Utility.waitForWebElement(driver, backLink);

			Utility.waitForWebElement(driver, quitLink);

			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);

			if (option.equalsIgnoreCase("option1")) {

				Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption1).click();
			}

			else if (option.equalsIgnoreCase("option2")) {

				Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption2).click();
			}

			else if (option.equalsIgnoreCase("option3")) {

				Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption3).click();
			} else if (option.equalsIgnoreCase("option4")) {
				Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption4).click();
			}
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

	public void verifyHRALifeStyleQuesSleep1(String SleepHrs) throws Exception {

		// Life Style - Sleep Hours - Ques1

		Utility.waitForWebElementVisible(driver, hraLifestyleQuestion1Img);

		Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightLabel);

		Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightInput).sendKeys(SleepHrs);

		Utility.waitForWebElement(driver, hraLifeStyleNextLink).click();
	}

	public void verifyHRALifeStyleQuesSmoking2(String option, String smokeNO) throws Exception {

		// Life Style - Smoking habbits - Ques2

		Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);

		Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);

		if (option.equalsIgnoreCase("option1")) {

			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionNever).click();

			// Smoking with Never - Drinking
			Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);

			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);

		} else {
			if (option.equalsIgnoreCase("option2")) {

				Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerOccasional).click();

				// Cigrattes
				Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekLabel);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePastPerWeekInput).sendKeys(smokeNO);

				Utility.waitForWebElement(driver, hraLifeStyleNextLink2a).click();
			}

			else if (option.equalsIgnoreCase("option3")) {

				// Smoking Former Daily
				Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerDaily).click();

				// Cigrattes
				Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePastPerDayInput).sendKeys(smokeNO);

				Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();
			}

			else if (option.equalsIgnoreCase("option4")) {

				// Smoking Occassional
				Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
				Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
				Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionOccasional).click();

				// Cigrattes
				Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekLabel);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekInput).sendKeys(smokeNO);

				Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();
			}

			else if (option.equalsIgnoreCase("option5")) {

				// Smoking Daily
				Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
				Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
				Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionDaily).click();

				// Cigrattes
				Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayInput).sendKeys(smokeNO);

				Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();
			}

			else if (option.equalsIgnoreCase("option6")) {

				// Smoking Occassional
				Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
				Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
				Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionOccasional).click();

				// Cigrattes
				Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekLabel);

				Utility.waitForWebElement(driver, hraLifeStyleSmokePerWeekInput).sendKeys(smokeNO);

				Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();

			}

			// Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();
		}
	}

	public void verifyHRALifeStyleQuesDrinking1(String option, String alcoholNo) throws Exception {

		if (option.equalsIgnoreCase("option1")) {

			// NEVER DRINKING
			Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);

			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);

			Utility.waitForWebElement(driver, hraLifeStyleDrinkingNeverDrank).click();

			// Never DRINK after STRESS question

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);
		}

		else {

			if (option.equalsIgnoreCase("option2")) {

				// Currently Drink
				Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
				Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
				Utility.waitForWebElement(driver, hraLifeStyleDrinkingCurrentlyDrink).click();

				// Alcoholic
				Utility.waitForWebElement(driver, hraLifestyleQuestionAlcoholImg);

				Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeekLabel);

				Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeeCurrentDrinkInput).sendKeys("7");

			}

			else if (option.equalsIgnoreCase("option3")) {

				// Former Drink
				Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
				Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
				Utility.waitForWebElement(driver, hraLifeStyleDrinkingFormerDrink).click();

				// Alcholic Input
				Utility.waitForWebElement(driver, hraLifestyleQuestionAlcoholImg);
				Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeekLabel);
				Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeePastDrinksInput).sendKeys("7");

			}

			Utility.waitForWebElement(driver, hraLifeStyleAlchoholNextLink).click();
		}
	}

	public void verifyHRALifeStyleQuesStress(String option) throws Exception {

		if (option.equalsIgnoreCase("option1")) {

			// STRESS QUEST Optipon1
			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionNoStressLink).click();

		}

		else if (option.equalsIgnoreCase("option2")) {
			// STRESS QUEST Optipon2

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionNotVeryStressLink).click();

		}

		// STRESS QUEST Optipon3
		else if (option.equalsIgnoreCase("option3")) {
			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionBitStressLink).click();

		}

		// STRESS QUEST Optipon4
		else if (option.equalsIgnoreCase("option4")) {

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteBitStressLink).click();

		}

		else if (option.equalsIgnoreCase("option5")) {

			// STRESS QUEST Optipon5

			Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);

			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteExtremeStressLink).click();

		}

	}

	public void verifyHRALifeStyleQuesHappiness(String option) throws Exception {

		if (option.equalsIgnoreCase("option1")) {

			// Happiness QUEST

			Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);

			Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionHappyLink).click();

		}

		else if (option.equalsIgnoreCase("option2")) {

			// Happiness QUEST

			Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);

			Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionSomewhatHappyLink).click();

		}

		else if (option.equalsIgnoreCase("option3")) {

			// Happiness QUEST

			Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);

			Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionSomewhatUnHappyLink).click();

		}

		else if (option.equalsIgnoreCase("option4")) {

			// Happiness QUEST

			Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);

			Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionUnHappyLink).click();

		}

		else if (option.equalsIgnoreCase("option5")) {

			// Happiness QUEST

			Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);

			Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);

			Utility.waitForWebElement(driver, hraLifeStyleStressOptionUnHappyNotWorthLink).click();

		}
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

	public void verifyMedical(String ques, String option, String suboption)

	{

		if (ques.equalsIgnoreCase("Med1")) {

			Utility.waitForWebElement(driver, hraTypeIIDiabetesLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {

				Utility.waitForWebElement(driver, hraYesLink).click();

				Utility.waitForWebElement(driver, hraTypeIIDiabetesControlledLabel);

				if (suboption.equalsIgnoreCase("no")) {

					Utility.waitForWebElement(driver, hraNoSubLink).click();
				}

				if (suboption.equalsIgnoreCase("yes")) {

					Utility.waitForWebElement(driver, hraSubYesLink).click();
				}

			}

			System.out.println("Medical Ques 1");
		}

		else if (ques.equalsIgnoreCase("Med2")) {

			// Cardio

			Utility.waitForWebElement(driver, hraCardiovascularLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {

				Utility.waitForWebElement(driver, hraYesLink).click();

				Utility.waitForWebElement(driver, hraCardiovascularControlledLabel);

				if (suboption.equalsIgnoreCase("no")) {

					Utility.waitForWebElement(driver, hraNoSubLink).click();
				}

				if (suboption.equalsIgnoreCase("yes")) {

					Utility.waitForWebElement(driver, hraSubYesLink).click();
				}

			}

			System.out.println("Medical Ques 2");
		}

		else if (ques.equalsIgnoreCase("Med3")) {

			// Blood pressure

			Utility.waitForWebElement(driver, hraBLoodPressureLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {

				Utility.waitForWebElement(driver, hraYesLink).click();

				Utility.waitForWebElement(driver, hraBloodpressureControlledLabel);

				if (suboption.equalsIgnoreCase("no")) {

					Utility.waitForWebElement(driver, hraNoSubLink).click();
				}

				if (suboption.equalsIgnoreCase("yes")) {

					Utility.waitForWebElement(driver, hraSubYesLink).click();
				}

			}

			System.out.println("Medical Ques 3");
		}

		else if (ques.equalsIgnoreCase("Med4")) {

			// osteoarthritis

			Utility.waitForWebElement(driver, hraOsteoarthritisLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {

				Utility.waitForWebElement(driver, hraYesLink).click();

				Utility.waitForWebElement(driver, hraOsteoarthritisControlledLabel);

				if (suboption.equalsIgnoreCase("no")) {

					Utility.waitForWebElement(driver, hraNoSubLink).click();
				}

				if (suboption.equalsIgnoreCase("yes")) {

					Utility.waitForWebElement(driver, hraSubYesLink).click();
				}

			}

			System.out.println("Medical Ques 4");
		}

		else if (ques.equalsIgnoreCase("Med5")) {

			// Lung Disease

			Utility.waitForWebElement(driver, hraLungDiseaseLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {

				Utility.waitForWebElement(driver, hraYesLink).click();

				Utility.waitForWebElement(driver, hraLungdiseaseControlledLabel);

				if (suboption.equalsIgnoreCase("no")) {

					Utility.waitForWebElement(driver, hraNoSubLink).click();
				}

				if (suboption.equalsIgnoreCase("yes")) {

					Utility.waitForWebElement(driver, hraSubYesLink).click();
				}

			}

			System.out.println("Medical Ques 5");
		}

		else if (ques.equalsIgnoreCase("Med6")) {

			// Lower backpain

			Utility.waitForWebElement(driver, hraLowerbackpainLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {

				Utility.waitForWebElement(driver, hraYesLink).click();

				Utility.waitForWebElement(driver, hraLowerbackpainControlledLabel);

				if (suboption.equalsIgnoreCase("no")) {

					Utility.waitForWebElement(driver, hraNoSubLink).click();
				}

				if (suboption.equalsIgnoreCase("yes")) {

					Utility.waitForWebElement(driver, hraSubYesLink).click();
				}

			}

			System.out.println("Medical Ques 6");
		}

		else if (ques.equalsIgnoreCase("Med7")) {

			// Type II Immediate

			Utility.waitForWebElement(driver, hraTypeIIDiabetesImmediateLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {
				Utility.waitForWebElement(driver, hraYesLink).click();
			}

			System.out.println("Medical Ques 7");
		}

		else if (ques.equalsIgnoreCase("Med8")) {

			// Type II Immediate

			Utility.waitForWebElement(driver, hraCardiovascularImemdidiateLabel);

			if (option.equalsIgnoreCase("no")) {
				Utility.waitForWebElement(driver, hraNoLink).click();
			}

			if (option.equalsIgnoreCase("yes")) {
				Utility.waitForWebElement(driver, hraYesLink).click();
			}
			System.out.println("Medical Ques 8");
		}

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
