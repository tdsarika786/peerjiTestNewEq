package nova.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class NovaHomePage {

	WebDriver driver;

	By EmployeesLink = By.xpath("//a[contains(text(), 'Employees')]");

	By createEmployeeLink = By.xpath("//a[contains(text(), 'Create Employee')]");

	By employerButton = By.xpath("//div[@data-testid='employers-search-input']");

	By searchEmployerInput = By.xpath("//input[@placeholder='Search']");

	By firstName = By.id("first_name");

	By lastName = By.id("last_name");

	By provinceDropDwnList = By.id("province");

	By coverageToken = By.id("coverage_token");

	By planTypeDropDwnList = By.id("plan_type");

	By coverageStartDate = By.name("Coverage Start");

	By createEmployeeSubmitButton = By.xpath("//button[@dusk='create-button']");
	

	//Modify Employee
	By selectEqCareEmployee = By.xpath("//div[contains(text(),'Sarika-BellTest')]");

	// EMployer

	By EmployerLink = By.xpath("//a[contains(text(), 'Employers')]");

	By createEmployerLink = By.xpath("//a[contains(text(), 'Create Employer')]");

	By employerIDInput = By.id("id");

	By companyNameInput = By.id("company_name");

	By selectCoverageTokenInput = By.id("coverage_token_label");

	By selectCoverageType = By.xpath("//select[@id='coverage_type']");
	
	
	By selectPartnerPortal = By.xpath("//select[@data-testid='partner-portals-select']");


	By startDateInput = By.name("Start Date");

	By createEmployerSubmitButton = By.xpath("//button[@dusk='create-button']");

	public NovaHomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void createEmployeeLifeJourney(String coverageTokenString) {
		
		Utility.waitForWebElement(driver, EmployeesLink).click();

		Utility.waitForWebElement(driver, createEmployeeLink).click();

		Utility.waitForWebElement(driver, employerButton).click();
		
		
		
	}
	
	public void createEmployee(String coverageTokenString) {

		Utility.waitForWebElement(driver, EmployeesLink).click();

		Utility.waitForWebElement(driver, createEmployeeLink).click();

		Utility.waitForWebElement(driver, employerButton).click();
		
		//Modify Line No 40

		//Utility.waitForWebElement(driver, searchEmployerInput).sendKeys("Sarika-TestBasi");
		
		Utility.waitForWebElement(driver, searchEmployerInput).sendKeys("Sarika-BellTest");
		

		//Utility.waitForWebElement(driver, searchEmployerInput).sendKeys(Keys.ENTER);

		// Actions builder = new Actions(driver);
		// builder.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		Utility.waitForWebElement(driver, selectEqCareEmployee).click();

		Utility.waitForWebElement(driver, firstName).sendKeys("Sarika");

		Utility.waitForWebElement(driver, lastName).sendKeys("Test");

		WebElement provinceElement = driver.findElement(provinceDropDwnList);

		Select objProvince = new Select(provinceElement);

		Utility.waitForWebElement(driver, provinceDropDwnList).click();

		objProvince.selectByValue("QC");

		// Change Token- 1
		Utility.waitForWebElement(driver, coverageToken).sendKeys(coverageTokenString);

		WebElement planTypeElement = driver.findElement(planTypeDropDwnList);

		Select objplanTypee = new Select(planTypeElement);

		// Change Family Type

		objplanTypee.selectByValue("family");

	    // objplanTypee.selectByValue("single");

		Utility.waitForWebElement(driver, coverageStartDate).sendKeys("2020-08-01");

		Utility.waitForWebElement(driver, createEmployeeSubmitButton).click();
		
		Utility.wait(5);

	}

	public void createEmployer() {

		Utility.waitForWebElement(driver, EmployerLink).click();

		Utility.waitForWebElement(driver, createEmployerLink).click();

		// Change ID for NEW Employer
		Utility.waitForWebElement(driver, employerIDInput).sendKeys("16"); // Modify

		Utility.waitForWebElement(driver, companyNameInput).sendKeys("Sarika-TestSilver"); //Modify

		// Select
		WebElement coverageTokenElement = driver.findElement(selectCoverageTokenInput);

		Select objTokenLabel = new Select(coverageTokenElement);

		Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		objTokenLabel.selectByValue("email");

		// Select PArtner
		/*WebElement partnerPortalElement = driver.findElement(selectPartnerPortal);

		Select objPartnerPortal = new Select(partnerPortalElement);

		Utility.waitForWebElement(driver, selectPartnerPortal).click();

		objPartnerPortal.selectByValue("1");*/
		
		
		
		WebElement coverageTypeElement = driver.findElement(selectCoverageType);

		Select objCoverageType = new Select(coverageTypeElement);

		Utility.waitForWebElement(driver, selectCoverageType).click();

		//objCoverageType.selectByValue("lifejourney_silver"); 
		
		//objCoverageType.selectByValue("lifejourney_gold");
		
		objCoverageType.selectByValue("lifejourney_bronze");//Modify
		
		//objCoverageType.selectByValue("lifejourney_basic"); 
		
		//objCoverageType.selectByValue("none");
		
		//Services
		
		WebElement buttonPrimaryCare = driver.findElement(By.xpath("//input[@name='primary_care']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", buttonPrimaryCare);
		
		//Checkbox
		
		WebElement buttonDmss = driver.findElement(By.xpath("//input[@name='dmss']"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", buttonDmss);
		
		//Checkbox
		
		WebElement buttonDcbt = driver.findElement(By.xpath("//input[@name='dcbt']"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", buttonDcbt);
		
		
		WebElement buttonCritical_incident = driver.findElement(By.xpath("//input[@name='critical_incident']"));
		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", buttonCritical_incident);
		
		
		WebElement buttonTherapy = driver.findElement(By.xpath("//input[@name='therapy']"));
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", buttonTherapy);
		
		
		WebElement buttonCoaching = driver.findElement(By.xpath("//input[@name='coaching']"));
		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click()", buttonCoaching);
		
		
		WebElement buttonPersonal_crisis = driver.findElement(By.xpath("//input[@name='personal_crisis']"));
		JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		executor7.executeScript("arguments[0].click()", buttonPersonal_crisis);
		
		
		WebElement buttonHra = driver.findElement(By.xpath("//input[@name='hra']"));
		JavascriptExecutor executor8 = (JavascriptExecutor) driver;
		executor8.executeScript("arguments[0].click()", buttonHra);
		
		
		WebElement buttonNutrition = driver.findElement(By.xpath("//input[@name='nutrition']"));
		JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		executor9.executeScript("arguments[0].click()", buttonNutrition);
		
		
		WebElement buttonArticles = driver.findElement(By.xpath("//input[@name='articles']"));
		JavascriptExecutor executor10 = (JavascriptExecutor) driver;
		executor10.executeScript("arguments[0].click()", buttonArticles);
		
		
		WebElement buttonLegal_financial = driver.findElement(By.xpath("//input[@name='legal_financial']"));
		JavascriptExecutor executor11 = (JavascriptExecutor) driver;
		executor11.executeScript("arguments[0].click()", buttonLegal_financial);
		
		
		

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");

		Utility.waitForWebElement(driver, createEmployerSubmitButton).click();

		Utility.wait(10000);

	}

	public void TestBrowser() {

	}

}
