package eqcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

import com.practitest.examples.runWithAttachments;

public class HRAHomePage extends runWithAttachments {

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
	
	//HRA
	
	By healthScoreButton = By.xpath("//a[@data-role='start-hra-button']");
	
	By introPageImage = By.xpath("//img[@alt='EQ Care HRA Intro page']");
	
	By introPageHeader = By.xpath("//h3[contains(text(), 'Health Score Assessment')]");
	
	By introPageMinsText = By.xpath("//p[contains(text(), 'mins')]");
	
	By startHRAFormButton = By.xpath("//a[@data-role='start-hra-form-button']");
	
	By skipHRAFormButton = By.xpath("//a[@data-role='skip-hra-form-button']");

	//HRA Physical Intake Form
	
	By backLink = By.xpath("//p[contains(text(), 'Back')]");
	
	By quitLink = By.xpath("//p[contains(text(), 'Quit')]");
	
	By physicalPageHeader = By.xpath("//h2[contains(text(), 'Physical')]");
	
	By heightInput = By.xpath("//label[@for='height']//following::input[1]");
	
	By weightInput = By.xpath("//label[@for='weight']//following::input[1]");

	By waistInput = By.xpath("//label[@for='waist_circumference']//following::input[1]");
	
	By hraPhysicalNextButton = By.xpath("//a[@data-role='hra-physical-question-1-next-button']");
	
	//Active working
	
	By hraPhysicalQuestion2Img = By.xpath("//img[contains(@src, 'hra-physical-question-2')]");
	
	By hraPhysicalActiveWorkingLabel = By.xpath("//label[contains(text(), 'active - working')]");
	
	By hraPhysicalQuesSecondOption1 = By.xpath("//a[contains(text(), '60 min')]");
	
	By hraPhysicalQuesSecondOption2 = By.xpath("//a[contains(text(), '60-150 min')]");
	
	By hraPhysicalQuesSecondOption3 = By.xpath("//a[contains(text(), 'over 150 min')]");
	
	//Sitting
	
    By hraPhysicalQuestion3Img = By.xpath("//img[contains(@src, 'hra-physical-question-3')]");
	
	By hraPhysicalSpendSittingLabel = By.xpath("//label[contains(text(), 'spend sitting')]");
	
	By hraPhysicalQuesThirdOption1 = By.xpath("//a[contains(text(), '0-25%')]");
	
	By hraPhysicalQuesThirdOption2 = By.xpath("//a[contains(text(), '25-50%')]");
	
	By hraPhysicalQuesThirdOption3 = By.xpath("//a[contains(text(), '50-75%')]");
	
	By hraPhysicalQuesThirdOption4 = By.xpath("//a[contains(text(), '50-100%')]");
	
	//Life Style sleeping
	
	By hraLifestyleQuestion1Img = By.xpath("//img[contains(@src, 'hra-lifestyle-question-1')]");
	
	By hraLifeStyleSleepPerNightLabel = By.xpath("//label[@for='sleep_per_night']");
	
	By hraLifeStyleSleepPerNightInput = By.xpath("//input[@id='sleep_per_night']");
	
	By hraLifeStyleNextLink = By.xpath("//a[@data-role='hra-lifestyle-question-1-next-button']");
	
	
	//Smoking Life style
	By hraLifestyleQuestion2SmokingImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-2')]");
	
	By hraLifeStyleSmokingLabel = By.xpath("//label[contains(text(), 'smoking habits')]");
	
	
	By hraLifeStyleSmokingOptionNever = By.xpath("//a[contains(text(), 'Never')]");
	
    By hraLifeStyleSmokingOptionFormerOccasional = By.xpath("//a[contains(text(), 'Former Occ')]");
	
    By hraLifeStyleSmokingOptionFormerDaily = By.xpath("(//a[contains(text(), 'Former Daily')])[1]");

	By hraLifeStyleSmokingOptionOccasional = By.xpath("(//a[contains(text(), 'Occ')])[2]");

	By hraLifeStyleSmokingOptionDaily = By.xpath("(//a[contains(text(), 'Daily')])[2]");

	By hraLifeStyleSmokingOptionFormerDaily2 = By.xpath("(//a[contains(text(), 'Former Daily')])[2]");
	
	
	//When Never selected Drinking questions
	
	By hraLifestyleQuestionDrinkingImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-6')]");
	
	By hraLifeStyleDrinikingLabel = By.xpath("//label[contains(text(), 'drinking habits')]");
	
	By hraLifeStyleDrinkingNeverDrank = By.xpath("//a[contains(text(), 'Never Drank')]");
	
	By hraLifeStyleDrinkingCurrentlyDrink = By.xpath("//a[contains(text(), 'Currently Drink')]");
	
	By hraLifeStyleDrinkingFormerDrink = By.xpath("//a[contains(text(), 'Former Drink')]");
	
	//Alcohol Drinks
     By hraLifestyleQuestionAlcoholImg = By.xpath("///img[contains(@src, 'hra-lifestyle-question-6')]");
	
	By hraLifeStyleAlcoholPerWeekLabel = By.xpath("//label[contains(text(), 'alcholic drinks')]");
	
	By hraLifeStyleAlcoholPerWeeInput = By.xpath("//input[@id='current_drinks_per_day']");
	
	By hraLifeStyleAlchoholNextLink = By.xpath("//a[@data-role='hra-lifestyle-question-1-next-button']");  
	
	
	
	//when SMOKING former occ, former daily, occasional, daily, daily  
	By hraLifestyleQuestionCigrattesImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-2')]");
	
	By hraLifeStyleSmokePerDayLabel = By.xpath("//label[contains(text(), 'smoke per day')]");
	
	By hraLifeStyleSmokePerDayInput = By.xpath("//input[@id='past_cigarettes_per_day']");
	
	By hraLifeStyleNextLink2b = By.xpath("//a[@data-role='hra-lifestyle-question-2b-next-button']");
	
	
	//when never drank selected - daily stress question
	
	By hraLifestyleQuestion4StressImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-7')]");
	
	By hraLifeStyleStressLabel = By.xpath("//label[contains(text(), 'describe your daily stress')]");
	
	By hraLifeStyleStressOptionNoStressLink = By.xpath("//a[contains(text(), 'Not at all')]");
	
	By hraLifeStyleStressOptionNotVeryStressLink = By.xpath("//a[contains(text(), 'Not very stressful')]");
	
	By hraLifeStyleStressOptionBitStressLink = By.xpath("//a[contains(text(), 'bit stressful')]");
	
	By hraLifeStyleStressOptionQuiteBitStressLink = By.xpath("//a[contains(text(), 'Quite a bit stressful')]");
	
	By hraLifeStyleStressOptionQuiteExtremeStressLink = By.xpath("//a[contains(text(), 'Extremly stressfull')]");
	
	
	//Happiness question
	By hraLifestyleQuestion4HappinessImg = By.xpath("//img[contains(@src, 'hra-lifestyle-question-7')]");
	
	By hraLifeStyleHappinessLabel = By.xpath("//label[contains(text(), 'happiness levels')]");
	
	By hraLifeStyleStressOptionHappyLink = By.xpath("//a[contains(text(), 'Happy')]");
	
	By hraLifeStyleStressOptionSomewhatHappyLink = By.xpath("//a[contains(text(), 'Somewhat happy')]");
	
	By hraLifeStyleStressOptionSomewhatUnHappyLink = By.xpath("//a[contains(text(), 'Somewhat unhappy')]");
	
	By hraLifeStyleStressOptionUnHappyLink = By.xpath("//a[contains(text(), 'Unhappy')]");
	
	By hraLifeStyleStressOptionUnHappyNotWorthLink = By.xpath("//a[contains(text(), 'unhappy that life is not worth')]");
	
	
	public HRAHomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void navigateToHomePage() {

		Utility.waitForWebElement(driver, homeLink).click();

	}
	
	public void navigateToHRAIntakePage() {

		Utility.navigateToURL(driver, "https://patient.eqserviceqa2.eqcaredev.com/hra/intake");

	}
	
	
	public void calculateHealthScoreLink() throws Exception {

		try {

			Utility.waitForWebElement(driver, healthScoreButton).click();;

			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "0");
		} catch (Exception ex) {
			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "7");
			throw ex;
		
		}
	}
		
	
	public void verifyHRAIntroductionPage() throws Exception {

		try {
			Utility.waitForWebElement(driver, healthScoreButton).click();;
			
		
			Utility.waitForWebElement(driver, introPageImage);
			
			Utility.waitForWebElement(driver, introPageHeader);
			
			Utility.waitForWebElement(driver, introPageMinsText);
			

			WebElement button = driver.findElement(By.xpath("//input[@type='checkbox']"));

			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].click()", button);

			
			Utility.waitForWebElement(driver, startHRAFormButton).click();
			
			

			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "0");
		} catch (Exception ex) {
			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "7");
			throw ex;
		
		}
	}
	
	public void verifyHRAPhysicalIntakeForms() throws Exception {

		try {
			
			//Utility.waitForWebElement(driver, backLink);
			
			//Utility.waitForWebElement(driver, quitLink);
			
		
			Utility.waitForWebElement(driver, heightInput).sendKeys("157");
			
			Utility.waitForWebElement(driver, weightInput).sendKeys("55");
			
			Utility.waitForWebElement(driver, waistInput).sendKeys("77");
			
			Utility.waitForWebElement(driver, hraPhysicalNextButton).click();
			
          //  Utility.waitForWebElement(driver, backLink);
			
			//Utility.waitForWebElement(driver, quitLink);
			
			Utility.waitForWebElement(driver, hraPhysicalQuestion2Img);
			
			Utility.waitForWebElement(driver, hraPhysicalActiveWorkingLabel);
			
			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption1).click();
			
			Utility.waitForWebElement(driver, backLink).click();
			
			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption2).click();
			
			Utility.waitForWebElement(driver, backLink).click();
			
			Utility.waitForWebElement(driver, hraPhysicalQuesSecondOption3).click();
			
			//Utility.waitForWebElement(driver, backLink);
			
			//Utility.waitForWebElement(driver, quitLink);
			
			Utility.waitForWebElement(driver, hraPhysicalQuestion3Img);
			
			Utility.waitForWebElement(driver, hraPhysicalSpendSittingLabel);
			
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption1).click();
			
			Utility.waitForWebElement(driver, backLink).click();
			
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption2);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption3);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			Utility.waitForWebElement(driver, hraPhysicalQuesThirdOption4);
			
			//Utility.waitForWebElement(driver, weightInput);
			
			//Utility.waitForWebElement(driver, quitLink).click();

			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "0");
		} catch (Exception ex) {
			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "7");
			throw ex;
		
		}
	}
	
	public void verifyHRALifeStyle() throws Exception {

		try {
			
			//Life Style - Sleep Hours - Ques1
			
            Utility.waitForWebElement(driver, hraLifestyleQuestion1Img);
			
			Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightLabel);
			
			Utility.waitForWebElement(driver, hraLifeStyleSleepPerNightInput).sendKeys("7");
			
			Utility.waitForWebElement(driver, hraLifeStyleNextLink).click();
			
			
			//Life Style - Smoking habbits - Ques2
			
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionNever).click();
			
			
			//Life Style - Smoking habbits - Ques3

			//Smoking with Never - Drinking
			Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
			
			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			
			//Smoking Former Occasional
	        Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerOccasional).click();
			
			//Cigrattes
			 Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);
				
			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			//Smoking Former Daily
	        Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerDaily).click();
			
			
			//Cigrattes
			 Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);
				
			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			//Smoking Occassional
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionOccasional).click();
			
			//Cigrattes
			 Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);
				
			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			
			//Smoking Daily
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
		    Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionDaily).click();
			
			//Cigrattes
			 Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);
				
			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			//Former Daily2
			Utility.waitForWebElement(driver, hraLifestyleQuestion2SmokingImg);
		    Utility.waitForWebElement(driver, hraLifeStyleSmokingLabel);
			Utility.waitForWebElement(driver, hraLifeStyleSmokingOptionFormerDaily2).click();
			
			//Cigrattes
			 Utility.waitForWebElement(driver, hraLifestyleQuestionCigrattesImg);
				
			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayLabel);
			
			//Utility.waitForWebElement(driver, backLink).click();
			
			
			Utility.waitForWebElement(driver, hraLifeStyleSmokePerDayInput).sendKeys("7");
			
			Utility.waitForWebElement(driver, hraLifeStyleNextLink2b).click();
			
			//NEVER DRINKING
		    Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
			
			Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
			
	        Utility.waitForWebElement(driver, hraLifeStyleDrinkingNeverDrank).click();
	        
	        //Never DRINK after STRESS question
	        
            Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);
			
			Utility.waitForWebElement(driver, hraLifeStyleStressLabel);
			
			Utility.waitForWebElement(driver, backLink).click();
			
			//Currently Drink
			  Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
			  Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
			  Utility.waitForWebElement(driver, hraLifeStyleDrinkingCurrentlyDrink).click();

			//Alcoholic
				 Utility.waitForWebElement(driver, hraLifestyleQuestionAlcoholImg);
					
				Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeekLabel);
				
				Utility.waitForWebElement(driver, backLink).click();
				
				//Former Drink
				  Utility.waitForWebElement(driver, hraLifestyleQuestionDrinkingImg);
				  Utility.waitForWebElement(driver, hraLifeStyleDrinikingLabel);
				  Utility.waitForWebElement(driver, hraLifeStyleDrinkingFormerDrink).click();

				
				Utility.waitForWebElement(driver, hraLifeStyleAlcoholPerWeeInput).sendKeys("7");
				
				Utility.waitForWebElement(driver, hraLifeStyleAlchoholNextLink).click();
			  
			  
				//STRESS QUEST Optipon1
			    Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);
				
				Utility.waitForWebElement(driver, hraLifeStyleStressLabel);
				
		        Utility.waitForWebElement(driver, hraLifeStyleStressOptionNoStressLink).click();
				
		        Utility.waitForWebElement(driver, backLink).click();
		        
		      //STRESS QUEST Optipon2
		        
		        Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);
				
				Utility.waitForWebElement(driver, hraLifeStyleStressLabel);
				
		        Utility.waitForWebElement(driver, hraLifeStyleStressOptionNotVeryStressLink).click();
				
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        
		        //STRESS QUEST Optipon3
		        
		        Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);
				
				Utility.waitForWebElement(driver, hraLifeStyleStressLabel);
				
		        Utility.waitForWebElement(driver, hraLifeStyleStressOptionBitStressLink).click();
				
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        
               //STRESS QUEST Optipon4
		        
		        Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);
				
				Utility.waitForWebElement(driver, hraLifeStyleStressLabel);
				
		        Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteBitStressLink).click();
				
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        
                //STRESS QUEST Optipon5
		        
		        Utility.waitForWebElement(driver, hraLifestyleQuestion4StressImg);
				
				Utility.waitForWebElement(driver, hraLifeStyleStressLabel);
				
		        Utility.waitForWebElement(driver, hraLifeStyleStressOptionQuiteExtremeStressLink).click();
				
		        //Utility.waitForWebElement(driver, backLink).click();
		        
		       
            //Happiness QUEST 
		        
		        Utility.waitForWebElement(driver, hraLifestyleQuestion4HappinessImg);
				
				Utility.waitForWebElement(driver, hraLifeStyleHappinessLabel);
				
		        Utility.waitForWebElement(driver, hraLifeStyleStressOptionHappyLink).click();
				
		        
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        Utility.waitForWebElement(driver, backLink).click();
		        
		        Utility.waitForWebElement(driver, backLink).click();

			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "0");
		} catch (Exception ex) {
			//runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 12, 0), "7");
			throw ex;
		
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
