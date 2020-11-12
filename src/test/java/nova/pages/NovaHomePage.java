package nova.pages;

import org.openqa.selenium.By;
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
	By selectEqCareEmployee = By.xpath("//div[contains(text(),'Bell-Test-Sarika')]");

	// EMployer

	By EmployerLink = By.xpath("//a[contains(text(), 'Employers')]");

	By createEmployerLink = By.xpath("//a[contains(text(), 'Create Employer')]");

	By employerIDInput = By.id("id");

	By companyNameInput = By.id("company_name");

	By selectCoverageTokenInput = By.id("coverage_token_label");

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

		Utility.waitForWebElement(driver, searchEmployerInput).sendKeys("Bell-Test-Sarika");
		
		//Utility.waitForWebElement(driver, searchEmployerInput).sendKeys("Comp-Sarika-Test-Gold");
		

		//Utility.waitForWebElement(driver, searchEmployerInput).sendKeys(Keys.ENTER);

		// Actions builder = new Actions(driver);
		// builder.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		Utility.waitForWebElement(driver, selectEqCareEmployee).click();

		Utility.waitForWebElement(driver, firstName).sendKeys("Sarika-LifeJourneyGold");

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
		Utility.waitForWebElement(driver, employerIDInput).sendKeys("1234");

		Utility.waitForWebElement(driver, companyNameInput).sendKeys("EqCare");

		// Select
		WebElement coverageTokenElement = driver.findElement(selectCoverageTokenInput);

		Select objTokenLabel = new Select(coverageTokenElement);

		Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		objTokenLabel.selectByValue("email");

		// Select PArtner
		WebElement partnerPortalElement = driver.findElement(selectPartnerPortal);

		Select objPartnerPortal = new Select(partnerPortalElement);

		Utility.waitForWebElement(driver, selectPartnerPortal).click();

		objPartnerPortal.selectByValue("1");

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");

		Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		Utility.waitForWebElement(driver, createEmployerSubmitButton).click();

		Utility.wait(10000);

	}

	public void TestBrowser() {

	}

}
