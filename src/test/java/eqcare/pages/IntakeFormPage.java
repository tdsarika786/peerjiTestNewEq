package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import eqcare.helper.Utility;

public class IntakeFormPage {

	WebDriver driver;

	public IntakeFormPage(WebDriver driver) {
		this.driver = driver;
	}

	By reasonVisitInput = By.xpath("//div[@data-role='intake-reason-input']/textarea");

	By durationSymptomsInput = By.xpath("//div[@data-role='intake-symptoms-duration-input']/input");

	By currentAllergies = By.xpath("//div[@data-role='intake-allergies-input']/div/input");
	
	By addCurrentAllergies = By.xpath("//div[contains(text(),'+ Add')]");

	By currentMedication = By.xpath("//input[@id='medication-input']");
	
	By addCurrentMedication = By.xpath("//div[contains(text(),'+ Add')]");
	
	By checkBox = By.xpath("//input[@type='checkbox']");

	By uploadFile = By.xpath("//input[@type='file']");
	
	By startCall = By.xpath("//a[@data-role='start-call-button']");


	public void verifyIntakeFormPageUrl()

	{

		Utility.verifyURLContains(driver, "intake-form");

	}

	public void fillIntakeForm() throws Exception {
	
		Utility.waitForWebElement(driver, reasonVisitInput).sendKeys("Test Visit by Sarika Peerji");
		
		Utility.waitForWebElement(driver, durationSymptomsInput).sendKeys("7 weeks");
		
		Utility.waitForWebElement(driver, currentAllergies).sendKeys("Amoxyllin");
		
		Utility.waitForWebElement(driver, addCurrentAllergies).click();
		
		Utility.waitForWebElement(driver, currentMedication).sendKeys("Tyenol Liquid Gels");
		
		Utility.waitForWebElement(driver, addCurrentMedication).click();
		
		uploadFiles();
		
		//Utility.waitForWebElement(driver, checkBox).click();
		
		WebElement button = driver.findElement(By.xpath("//input[@type='checkbox']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button);

		
		Utility.waitForWebElement(driver, startCall).click();
		// Utility.selectValueFromCalendar(Utility.waitForMultipleWebElement(driver,
		// calen), "25");
		
		
	}
	public void uploadFiles() throws Exception {
		try {
			WebElement fileButton = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].style.display='block';", fileButton);

			Utility.waitForWebElement(driver, uploadFile)
					.sendKeys(System.getProperty("user.dir") + "/TestData/test1.jpeg");

			Utility.wait(2);
//		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 4, 0), "0");
		} catch (Exception ex) {
			// runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 4,
			// 0), "7");
			throw ex;
		}
	}
}
