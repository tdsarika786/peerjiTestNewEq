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

	// Modify Employee

	// Partner Portal

	By PartnerLink = By.xpath("//a[contains(text(), 'Partner')]");
	By createPartnerLink = By.xpath("(//a[contains(text(), 'Create Partner')])[1]");

	By selectOwner = By.xpath("//select[@data-testid='owner-type']");

	By employerPartner = By.xpath("//div[@data-testid='owner-search-input']");

	By subdomainInput = By.id("subdomain");

	By accentColorInput = By.id("Accent Color");

	By portalActive = By.id("portal_active");

	By selectDefault = By.xpath("//select[@id='default_lang']");

	By logoPartner = By.xpath("//input[@id='file-logo_url_en']");

	// EMployer

	By EmployerLink = By.xpath("//a[contains(text(), 'Employers')]");

	By createEmployerLink = By.xpath("(//a[contains(text(), 'Create Employer')])[1]");

	By employerIDInput = By.id("id");

	By companyNameInput = By.id("company_name");

	By selectCoverageTokenInput = By.xpath("//select[@id='coverage_token_label']");

	By selectCoverageType = By.xpath("//select[@id='coverage_type']");

	By selectPartnerPortal = By.xpath("//select[@data-testid='partner-portals-select']");

	By startDateInput = By.name("Start Date");

	By createEmployerSubmitButton = By.xpath("//button[@dusk='create-button']");

	// Staff
	By StaffLink = By.xpath("//a[@href='/admin/resources/clinic-employees']");

	By email = By.id("email");

	By passowrd = By.id("password");

	By selectRole = By.id("role");

	By selectSubRole = By.id("sub_role");

	By selectLanguage = By.id("language");

	// Group Number

	By GroupNoLink = By.xpath("//a[contains(text(), 'Group Numbers')]");

	By groupNumberInput = By.id("group_number");

	By selectGroupable = By.xpath("//select[@data-testid='groupable-type']");

	By selectGroupableSearchInput = By.xpath("//div[@data-testid='groupable-search-input']");

	By CreateGroupNo = By.xpath("//a[contains(text(), 'Create Group Number')]");

	// Story 1797
	By CreateCoverage = By.xpath("//a[contains(text(), 'Create Coverage')]");

	By selectCoverageOption = By.xpath("//select[@id='coverage_option']");

	By CreateLifeJounerSer = By.xpath("//a[contains(text(), 'Create LifeJourney Service')]");

	By selectLifeJourneyOption = By.xpath("//select[@id='lifejourney_service_option']");

	// Nova Links

	By PatientsLink = By.xpath("//a[contains(text(), 'Patients')]");

	By PatientsTtleTable = By.xpath("//span[contains(text(), 'Title')]");

	By PatiemtTableHeading = By.xpath("//h1[contains(text(), 'Patients')]");

	// Family
	By FamilyLink = By.xpath("//a[contains(text(), 'Families')]");

	By FamilyTableHeading = By.xpath("//h1[contains(text(), 'Families')]");

	By FamilyTitleTable = By.xpath("//span[contains(text(), 'Primary')]");

	// Appointments
	By AppointmentLink = By.xpath("//a[contains(text(), 'Appointments')]");

	By AppointmentTableHeading = By.xpath("//h1[contains(text(), 'Appointments')]");

	By AppointmentTitleTable = By.xpath("//span[contains(text(), 'ID')]");

	// Visits
	By VisitsLink = By.xpath("//a[contains(text(), 'Visits')]");

	By VisitsTableHeading = By.xpath("//h1[contains(text(), 'Visits')]");

	By VisitsTitleTable = By.xpath("//span[contains(text(), 'ID')]");
	
	
	//Paywall Plans
	By PaywallLink = By.xpath("//a[contains(text(), 'Paywall')]");

	By PaywallTableHeading = By.xpath("//h1[contains(text(), 'Paywall Plans')]");
	
	
	//Native App
	By NativeAppLink = By.xpath("//a[contains(text(), 'Native App')]");

	By NativeAppTableHeading = By.xpath("//h1[contains(text(), 'Native App Versions')]");
	
	//Medications
	By MedicationLink = By.xpath("//a[contains(text(), 'Medications')]");

	By MedicationTableHeading = By.xpath("//h1[contains(text(), 'Medications')]");
	
	
	//ICD Codes
		By ICDLink = By.xpath("//a[contains(text(), 'Icd Codes')]");

		By ICDTableHeading = By.xpath("//h1[contains(text(), 'Icd Codes')]");
				
	//HRA Forms
	By HRAFormLink = By.xpath("//a[contains(text(), 'Hra Forms')]");

	By HRAFormTableHeading = By.xpath("//h1[contains(text(), 'Hra Forms')]");
	
	//HRA Articles
	By HRAArticleLink = By.xpath("//a[contains(text(), 'Hra Articles')]");

	By HRAArticleTableHeading = By.xpath("//h1[contains(text(), 'Hra Articles')]");
	
	//FAQ Categories
	By FAQCatLink = By.xpath("//a[contains(text(), 'FAQ Categories')]");

	By FAQCatTableHeading = By.xpath("//h1[contains(text(), 'FAQ Categories')]");
	
	//FAQ 
		By FAQLink = By.xpath("//a[contains(text(), 'FAQ')]");

		By FAQTableHeading = By.xpath("//h1[contains(text(), 'FAQ')]");
		
		//Covid Requests
		By CovidRequestsLink = By.xpath("//a[contains(text(), 'Covid Requests')]");

		By CovidRequestsTableHeading = By.xpath("//h1[contains(text(), 'Covid Requests')]");
		
		//Canned Responses
		By CannedResponsesLink = By.xpath("//a[contains(text(), 'Canned Responses')]");

		By CannedResponsesTableHeading = By.xpath("//h1[contains(text(), 'Canned Responses')]");
		
		//Support Tickets
		By SupportTicketsLink = By.xpath("//a[contains(text(), 'Support Tickets')]");

		By SupportTicketsTableHeading = By.xpath("//h1[contains(text(), 'Support Tickets')]");
		
		//Staff
		//By StaffLink = By.xpath("//a[contains(text(), 'Staff')]");

		By StaffTableHeading = By.xpath("//h1[contains(text(), 'Staff')]");
		
		
		//Ratings
		By RatingsLink = By.xpath("//a[contains(text(), 'Ratings')]");

	    By RatingsTableHeading = By.xpath("//h1[contains(text(), 'Ratings')]");
				
		//Logged Actions
		By ClinicLoggedActionsLink = By.xpath("(//a[contains(text(), 'Logged Actions')])[1]");

	    By ClinicLoggedActionsTableHeading = By.xpath("//h1[contains(text(), 'Logged Actions')]");
	    
	  //Incident Reports
	  		By IncidentReportsLink = By.xpath("//a[contains(text(), 'Incident Reports')]");

	  	    By IncidentReportsTableHeading = By.xpath("//h1[contains(text(), 'Incident Reports')]");
	  	    
	  	    
	  	  //Clinics
	  		By ClinicsLink = By.xpath("//a[contains(text(), 'Clinics')]");

	  	    By ClinicsTableHeading = By.xpath("//h1[contains(text(), 'Clinics')]");
	  	    
	  	    
	  	  //Announcements
	  		By AnnouncementsLink = By.xpath("//a[contains(text(), 'Announcements')]");

	  	    By AnnouncementsTableHeading = By.xpath("//h1[contains(text(), 'Announcements')]");
	  	    
	  	  //Partner Portals
	  		By PartnerPortalsLink = By.xpath("//a[contains(text(), 'Partner Portals')]");

	  	    By PartnerPortalsTableHeading = By.xpath("//h1[contains(text(), 'Partner Portals')]");
	  	   
	  	//Group Numbers
	  		By GroupNumbersLink = By.xpath("//a[contains(text(), 'Group Numbers')]");

	  	    By GroupNumbersTableHeading = By.xpath("//h1[contains(text(), 'Group Numbers')]");
	  	    
	  	//Employers
	  		By EmployersLink = By.xpath("//a[contains(text(), 'Employers')]");

	  	    By EmployersTableHeading = By.xpath("//h1[contains(text(), 'Employers')]");
	  	    
	  	
	  	//Employees
	  		By EmployeesLink1 = By.xpath("//a[contains(text(), 'Employees')]");

	  	    By EmployeesTableHeading = By.xpath("//h1[contains(text(), 'Employees')]");
	  	    
	  		//Client Admins
	  		By ClientAdminsLink = By.xpath("//a[contains(text(), 'Client Admins')]");

	  	    By ClientAdminsTableHeading = By.xpath("//h1[contains(text(), 'Client Admins')]");
	  	    
	  	//Carriers
	  		By CarriersLink = By.xpath("//a[contains(text(), 'Carriers')]");

	  	    By CarriersTableHeading = By.xpath("//h1[contains(text(), 'Carriers')]");
	  	    
		  	//Advisors
	  		By AdvisorsLink = By.xpath("//a[contains(text(), 'Advisors')]");

	  	    By AdvisorsTableHeading = By.xpath("//h1[contains(text(), 'Advisors')]");    
	  	    
	  	 	//Staff KPI
	  		By StaffKPILink = By.xpath("//a[contains(text(), 'Staff KPI')]");
	  	    
	  	 	//Client KPI
		  		By ClientKPILink = By.xpath("//a[contains(text(), 'Client KPI')]");
		  		
		  	 	//Clinic KPI
		  		By ClinicKPILink = By.xpath("//a[contains(text(), 'Clinic KPI')]");
	  	    
		
	
	// LOgged Actions
	By LoggedActionLink = By.xpath("(//a[contains(text(), 'Logged Action')])[2]");
	
	By CreateLoggedActionLink = By.xpath("(//a[contains(text(), 'Create Logged Action')])[1]");

	By IdentifierInput = By.xpath("//input[@id='Identifier']");

	By LoggedActionTranslationENInput = By.xpath("//input[@id='translations_label_en-CA']");

	By LoggedActionTranslationFRInput = By.xpath("//input[@id='translations_label_fr-CA']");
	
	By CreateCoverage1 = By.xpath("(//a[contains(text(), 'Create Coverage')])[1]");
	
	
	By CoverageUpdate = By.xpath("//button[@dusk='create-and-add-another-button']");
	
	By CoverageEmployer = By.xpath("//select[@data-testid='employers-select']");

	public NovaHomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void createPartnerPortal(String searchEmployer, String empID, String domain) {

		Utility.waitForWebElement(driver, PartnerLink).click();

		Utility.wait(10);

		WebElement buttonPartner = driver.findElement(By.xpath("(//a[contains(text(), 'Create Partner')])[1]"));

		JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		executorEmpl.executeScript("arguments[0].click()", buttonPartner);

		Utility.wait(10);

		Utility.waitForWebElement(driver, selectOwner);

		// Select Owner
		WebElement ownerElement = driver.findElement(selectOwner);

		Select objOwner = new Select(ownerElement);

		objOwner.selectByValue("employers");

		// Employer

		Utility.waitForWebElement(driver, employerPartner).click();

		Utility.waitForWebElement(driver, searchEmployerInput).sendKeys(searchEmployer);

		By selectEqCareEmployee = By.xpath("//div[contains(text(),'" + searchEmployer + "')]");

		System.out.println("xpath --------" + selectEqCareEmployee);

		Utility.waitForWebElement(driver, selectEqCareEmployee).click();

		Utility.waitForWebElement(driver, subdomainInput).sendKeys(domain);

		Utility.waitForWebElement(driver, accentColorInput).sendKeys("#2D863D");

		// Utility.waitForWebElement(driver, portalActive).click();

		// Partner Portal

		WebElement buttonPortal = driver.findElement(By.xpath("//input[@id='portal_active']"));

		JavascriptExecutor executorPortal = (JavascriptExecutor) driver;
		executorPortal.executeScript("arguments[0].click()", buttonPortal);

		// Default lang
		WebElement langElement = driver.findElement(selectDefault);

		Select objLang = new Select(langElement);

		objLang.selectByValue("en-CA");

		// Logo

		WebElement fileLogoPartner = driver.findElement(By.xpath("//input[@id='file-logo_url_en']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("var Target = document.getElementById('file-logo_url_en');Target.className='';");

		Utility.waitForWebElement(driver, logoPartner)
				.sendKeys(System.getProperty("user.dir") + "/TestData/sai-pic.jpeg");

		Utility.wait(5);

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(20);

	}

	public void createEmployer1(String searchEmployer, String CoverageToken, String CoverageType) {

		Utility.waitForWebElement(driver, EmployerLink).click();

		WebElement buttonEmpl = driver.findElement(By.xpath("(//a[contains(text(), 'Create Employer')])[1]"));

		JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		executorEmpl.executeScript("arguments[0].click()", buttonEmpl);

		// Utility.waitForWebElement(driver, createEmployerLink).click();

		// Change ID for NEW Employer
		Utility.waitForWebElement(driver, employerIDInput).sendKeys(CoverageToken); // Modify

		Utility.waitForWebElement(driver, companyNameInput).sendKeys(searchEmployer); // Modify

		// Select
		WebElement coverageTokenElement = driver.findElement(selectCoverageTokenInput);

		Select objTokenLabel = new Select(coverageTokenElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		objTokenLabel.selectByValue("email");

		// ***************** Select PArtner
		/*
		 * WebElement partnerPortalElement = driver.findElement(selectPartnerPortal);
		 * 
		 * Select objPartnerPortal = new Select(partnerPortalElement);
		 * 
		 * Utility.waitForWebElement(driver, selectPartnerPortal).click();
		 * 
		 * objPartnerPortal.selectByValue("1");
		 */

		// *******************************Coverage
		// Type************************************

		// lifejourney_gold

		WebElement coverageTypeElement = driver.findElement(selectCoverageType);

		Select objCoverageType = new Select(coverageTypeElement);

		// Utility.waitForWebElement(driver, selectCoverageType).click();

		System.out.println(CoverageType);

		objCoverageType.selectByValue(CoverageType);

		// *******************************Services************************************

		// objCoverageType.selectByValue("lifejourney_silver");

		// objCoverageType.selectByValue("lifejourney_gold");

		// Uncomment it

		// objCoverageType.selectByValue("lifejourney_bronze");//Modify

		// objCoverageType.selectByValue("lifejourney_basic");

		// objCoverageType.selectByValue("none");

		// *******************************Services************************************

		WebElement buttonPrimaryCare = driver.findElement(By.xpath("//input[@name='primary_care']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", buttonPrimaryCare);

		/*
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDmss =
		 * driver.findElement(By.xpath("//input[@name='dmss']"));
		 * 
		 * JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		 * executor2.executeScript("arguments[0].click()", buttonDmss);
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDcbt =
		 * driver.findElement(By.xpath("//input[@name='dcbt']")); JavascriptExecutor
		 * executor3 = (JavascriptExecutor) driver;
		 * executor3.executeScript("arguments[0].click()", buttonDcbt);
		 * 
		 * 
		 * WebElement buttonCritical_incident =
		 * driver.findElement(By.xpath("//input[@name='critical_incident']"));
		 * JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		 * executor4.executeScript("arguments[0].click()", buttonCritical_incident);
		 * 
		 * 
		 * WebElement buttonTherapy =
		 * driver.findElement(By.xpath("//input[@name='therapy']")); JavascriptExecutor
		 * executor5 = (JavascriptExecutor) driver;
		 * executor5.executeScript("arguments[0].click()", buttonTherapy);
		 * 
		 * 
		 * WebElement buttonCoaching =
		 * driver.findElement(By.xpath("//input[@name='coaching']")); JavascriptExecutor
		 * executor6 = (JavascriptExecutor) driver;
		 * executor6.executeScript("arguments[0].click()", buttonCoaching);
		 * 
		 * 
		 * WebElement buttonPersonal_crisis =
		 * driver.findElement(By.xpath("//input[@name='personal_crisis']"));
		 * JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		 * executor7.executeScript("arguments[0].click()", buttonPersonal_crisis);
		 * 
		 * 
		 * WebElement buttonHra = driver.findElement(By.xpath("//input[@name='hra']"));
		 * JavascriptExecutor executor8 = (JavascriptExecutor) driver;
		 * executor8.executeScript("arguments[0].click()", buttonHra);
		 * 
		 * 
		 * WebElement buttonNutrition =
		 * driver.findElement(By.xpath("//input[@name='nutrition']"));
		 * JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		 * executor9.executeScript("arguments[0].click()", buttonNutrition);
		 * 
		 */
		WebElement buttonArticles = driver.findElement(By.xpath("//input[@name='articles']"));
		JavascriptExecutor executor10 = (JavascriptExecutor) driver;
		executor10.executeScript("arguments[0].click()", buttonArticles);

		WebElement buttonLegal_financial = driver.findElement(By.xpath("//input[@name='legal_financial']"));
		JavascriptExecutor executor11 = (JavascriptExecutor) driver;
		executor11.executeScript("arguments[0].click()", buttonLegal_financial);

		// *******************************Services************************************

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");
		Utility.waitForWebElement(driver, startDateInput).sendKeys(Keys.RETURN);

		// Utility.waitForWebElement(driver, createEmployerSubmitButton).click();

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(5);

	}

	public void createEmployeeLifeJourney(String coverageTokenString) {

		Utility.waitForWebElement(driver, EmployeesLink).click();

		Utility.waitForWebElement(driver, createEmployeeLink).click();

		Utility.waitForWebElement(driver, employerButton).click();

	}

	public void createEmployee(String searchEmployer, String CoverageIdentifier, String PlanType) {

		Utility.waitForWebElement(driver, EmployeesLink).click();

		Utility.waitForWebElement(driver, createEmployeeLink).click();

		Utility.wait(5);

		Utility.waitForWebElement(driver, employerButton).click();

		// Modify Line No 40

		// Utility.waitForWebElement(driver,
		// searchEmployerInput).sendKeys("Sarika-TestBasi");

		Utility.waitForWebElement(driver, searchEmployerInput).sendKeys(searchEmployer);

		// Utility.waitForWebElement(driver, searchEmployerInput).sendKeys(Keys.ENTER);

		// Actions builder = new Actions(driver);
		// builder.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		By selectEqCareEmployee = By.xpath("//div[contains(text(),'" + searchEmployer + "')]");

		System.out.println("xpath --------" + selectEqCareEmployee);

		Utility.waitForWebElement(driver, selectEqCareEmployee).click();

		Utility.waitForWebElement(driver, firstName).sendKeys("Sarika");

		Utility.waitForWebElement(driver, lastName).sendKeys("Test");

		WebElement provinceElement = driver.findElement(provinceDropDwnList);

		Select objProvince = new Select(provinceElement);

		// Utility.waitForWebElement(driver, provinceDropDwnList).click();

		objProvince.selectByValue("QC");

		// Change Token- 1
		Utility.waitForWebElement(driver, coverageToken).sendKeys(CoverageIdentifier);

		WebElement planTypeElement = driver.findElement(planTypeDropDwnList);

		Select objplanTypee = new Select(planTypeElement);

		// Change Family Type

		objplanTypee.selectByValue(PlanType);

		// objplanTypee.selectByValue("family");

		// objplanTypee.selectByValue("single");

		Utility.waitForWebElement(driver, coverageStartDate).sendKeys("2021-03-02");

		Utility.waitForWebElement(driver, coverageStartDate).sendKeys(Keys.RETURN);

		WebElement checkBoxVip = driver.findElement(By.xpath("//input[@id='is_vip']"));

		JavascriptExecutor executorCheck = (JavascriptExecutor) driver;
		executorCheck.executeScript("arguments[0].click()", checkBoxVip);

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		// Utility.waitForWebElement(driver, createEmployeeSubmitButton).click();

		Utility.wait(5);

	}

	public void createEmployer(String searchEmployer, String CoverageToken, String CoverageType) {

		Utility.waitForWebElement(driver, EmployerLink).click();

		WebElement buttonEmpl = driver.findElement(By.xpath("(//a[contains(text(), 'Create Employer')])[1]"));

		JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		executorEmpl.executeScript("arguments[0].click()", buttonEmpl);

		// Utility.waitForWebElement(driver, createEmployerLink).click();

		// Change ID for NEW Employer
		Utility.waitForWebElement(driver, employerIDInput).sendKeys(CoverageToken); // Modify

		Utility.waitForWebElement(driver, companyNameInput).sendKeys(searchEmployer); // Modify

		// Select
		WebElement coverageTokenElement = driver.findElement(selectCoverageTokenInput);

		Select objTokenLabel = new Select(coverageTokenElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		objTokenLabel.selectByValue("email");

		// ***************** Select PArtner
		/*
		 * WebElement partnerPortalElement = driver.findElement(selectPartnerPortal);
		 * 
		 * Select objPartnerPortal = new Select(partnerPortalElement);
		 * 
		 * Utility.waitForWebElement(driver, selectPartnerPortal).click();
		 * 
		 * objPartnerPortal.selectByValue("1");
		 */

		// *******************************Coverage
		// Type************************************

		// lifejourney_gold

		WebElement coverageTypeElement = driver.findElement(selectCoverageType);

		Select objCoverageType = new Select(coverageTypeElement);

		// Utility.waitForWebElement(driver, selectCoverageType).click();

		System.out.println(CoverageType);

		objCoverageType.selectByValue(CoverageType);

		// *******************************Services************************************

		// objCoverageType.selectByValue("lifejourney_silver");

		// objCoverageType.selectByValue("lifejourney_gold");

		// Uncomment it

		// objCoverageType.selectByValue("lifejourney_bronze");//Modify

		// objCoverageType.selectByValue("lifejourney_basic");

		// objCoverageType.selectByValue("none");

		// *******************************Services************************************

		WebElement buttonPrimaryCare = driver.findElement(By.xpath("//input[@name='primary_care']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", buttonPrimaryCare);

		/*
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDmss =
		 * driver.findElement(By.xpath("//input[@name='dmss']"));
		 * 
		 * JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		 * executor2.executeScript("arguments[0].click()", buttonDmss);
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDcbt =
		 * driver.findElement(By.xpath("//input[@name='dcbt']")); JavascriptExecutor
		 * executor3 = (JavascriptExecutor) driver;
		 * executor3.executeScript("arguments[0].click()", buttonDcbt);
		 * 
		 * 
		 * WebElement buttonCritical_incident =
		 * driver.findElement(By.xpath("//input[@name='critical_incident']"));
		 * JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		 * executor4.executeScript("arguments[0].click()", buttonCritical_incident);
		 * 
		 * 
		 * WebElement buttonTherapy =
		 * driver.findElement(By.xpath("//input[@name='therapy']")); JavascriptExecutor
		 * executor5 = (JavascriptExecutor) driver;
		 * executor5.executeScript("arguments[0].click()", buttonTherapy);
		 * 
		 * 
		 * WebElement buttonCoaching =
		 * driver.findElement(By.xpath("//input[@name='coaching']")); JavascriptExecutor
		 * executor6 = (JavascriptExecutor) driver;
		 * executor6.executeScript("arguments[0].click()", buttonCoaching);
		 * 
		 * 
		 * WebElement buttonPersonal_crisis =
		 * driver.findElement(By.xpath("//input[@name='personal_crisis']"));
		 * JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		 * executor7.executeScript("arguments[0].click()", buttonPersonal_crisis);
		 * 
		 * 
		 * WebElement buttonHra = driver.findElement(By.xpath("//input[@name='hra']"));
		 * JavascriptExecutor executor8 = (JavascriptExecutor) driver;
		 * executor8.executeScript("arguments[0].click()", buttonHra);
		 * 
		 * 
		 * WebElement buttonNutrition =
		 * driver.findElement(By.xpath("//input[@name='nutrition']"));
		 * JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		 * executor9.executeScript("arguments[0].click()", buttonNutrition);
		 * 
		 */
		WebElement buttonArticles = driver.findElement(By.xpath("//input[@name='articles']"));
		JavascriptExecutor executor10 = (JavascriptExecutor) driver;
		executor10.executeScript("arguments[0].click()", buttonArticles);

		WebElement buttonLegal_financial = driver.findElement(By.xpath("//input[@name='legal_financial']"));
		JavascriptExecutor executor11 = (JavascriptExecutor) driver;
		executor11.executeScript("arguments[0].click()", buttonLegal_financial);

		// *******************************Services************************************

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");
		Utility.waitForWebElement(driver, startDateInput).sendKeys(Keys.RETURN);

		// Utility.waitForWebElement(driver, createEmployerSubmitButton).click();

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(2);

	}

	public void TestBrowser() {

	}

	public void addStaff(String staffEmail, String password, String staff) {

		WebElement buttonStaff = driver.findElement(By.xpath("//a[@href='/admin/resources/clinic-employees']"));

		JavascriptExecutor executorStaff = (JavascriptExecutor) driver;
		executorStaff.executeScript("arguments[0].click()", buttonStaff);

		// Utility.waitForWebElement(driver, StaffLink).click();

		Utility.wait(5);

		Utility.waitForWebElement(driver, createEmployeeLink).click();

		Utility.wait(7);

		Utility.waitForWebElement(driver, email).sendKeys(staffEmail);

		Utility.waitForWebElement(driver, passowrd).sendKeys(password);

		if (staff.equalsIgnoreCase("Practitioner")) {

			Utility.waitForWebElement(driver, firstName).sendKeys("SarikaPa");

			Utility.waitForWebElement(driver, lastName).sendKeys("TestPa");

			// Select Role
			WebElement roleElement = driver.findElement(selectRole);

			Select objTokenLabelP = new Select(roleElement);

			objTokenLabelP.selectByValue("practitioner");

		}

		if (staff.equalsIgnoreCase("CareManager")) {

			Utility.waitForWebElement(driver, firstName).sendKeys("SarikaCM");

			Utility.waitForWebElement(driver, lastName).sendKeys("TestCM");

			// Select Role
			WebElement roleElement = driver.findElement(selectRole);

			Select objTokenLabelC = new Select(roleElement);

			objTokenLabelC.selectByValue("care_manager");

			WebElement chkBoxAdmin = driver.findElement(By.id("is_admin"));

			JavascriptExecutor executorAdmin = (JavascriptExecutor) driver;
			executorAdmin.executeScript("arguments[0].click()", chkBoxAdmin);

		}

		if (staff.equalsIgnoreCase("Nurse")) {

			Utility.waitForWebElement(driver, firstName).sendKeys("SarikaNu");

			Utility.waitForWebElement(driver, lastName).sendKeys("TestNu");

			// Select Role
			WebElement roleElement = driver.findElement(selectRole);

			Select objTokenLabel = new Select(roleElement);

			objTokenLabel.selectByValue("registered_nurse");

		}

		// Select Language
		WebElement languageElement = driver.findElement(selectLanguage);

		Select objTokenLabel2 = new Select(languageElement);

		objTokenLabel2.selectByValue("en");

		/*
		 * 
		 * 
		 * // Select Sub Role WebElement subRoleElement =
		 * driver.findElement(selectSubRole);
		 * 
		 * Select objTokenLabel1 = new Select(subRoleElement);
		 * 
		 * objTokenLabel1.selectByValue("care_manager");
		 * 
		 * Utility.waitForWebElement(driver, employerButton).click();
		 * 
		 */
		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(7);
	}

	public void createEmployer1733(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, EmployerLink).click();

		Utility.wait(10);
		
		Utility.waitForWebElement(driver, createEmployerLink);

		WebElement buttonEmpl = driver.findElement(By.xpath("(//a[contains(text(), 'Create Employer')])[1]"));

		JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		executorEmpl.executeScript("arguments[0].click()", buttonEmpl);

		// Utility.waitForWebElement(driver, createEmployerLink).click();

		// Change ID for NEW Employer NEW

		Utility.wait(10);

		Utility.waitForWebElement(driver, employerIDInput).sendKeys(empID);
		// // Modify

		Utility.waitForWebElement(driver, companyNameInput).sendKeys(searchEmployer); // Modify

		// Select
		/*
		 * NEW WebElement coverageTokenElement =
		 * driver.findElement(selectCoverageTokenInput);
		 * 
		 * Select objTokenLabel = new Select(coverageTokenElement);
		 * 
		 * 
		 * // Utility.waitForWebElement(driver, selectCoverageTokenInput).click();
		 * 
		 * objTokenLabel.selectByValue("email");
		 */

		// ***************** Select PArtner
		/*
		 * WebElement partnerPortalElement = driver.findElement(selectPartnerPortal);
		 * 
		 * Select objPartnerPortal = new Select(partnerPortalElement);
		 * 
		 * Utility.waitForWebElement(driver, selectPartnerPortal).click();
		 * 
		 * objPartnerPortal.selectByValue("1");
		 */

		// *******************************Coverage
		// Type************************************

		// lifejourney_gold

		/*
		 * WebElement coverageTypeElement = driver.findElement(selectCoverageType);
		 * 
		 * Select objCoverageType = new Select(coverageTypeElement);
		 * 
		 * // Utility.waitForWebElement(driver, selectCoverageType).click();
		 * 
		 * System.out.println(CoverageType);
		 * 
		 * objCoverageType.selectByValue(CoverageType);
		 */

		// *******************************Services************************************

		// objCoverageType.selectByValue("lifejourney_silver");

		// objCoverageType.selectByValue("lifejourney_gold");

		// Uncomment it

		// objCoverageType.selectByValue("lifejourney_bronze");//Modify

		// objCoverageType.selectByValue("lifejourney_basic");

		// objCoverageType.selectByValue("none");

		// *******************************Services************************************

		/*
		 * WebElement buttonPrimaryCare =
		 * driver.findElement(By.xpath("//input[@name='primary_care']"));
		 * 
		 * JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		 * executor1.executeScript("arguments[0].click()", buttonPrimaryCare);
		 */
		/*
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDmss =
		 * driver.findElement(By.xpath("//input[@name='dmss']"));
		 * 
		 * JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		 * executor2.executeScript("arguments[0].click()", buttonDmss);
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDcbt =
		 * driver.findElement(By.xpath("//input[@name='dcbt']")); JavascriptExecutor
		 * executor3 = (JavascriptExecutor) driver;
		 * executor3.executeScript("arguments[0].click()", buttonDcbt);
		 * 
		 * 
		 * WebElement buttonCritical_incident =
		 * driver.findElement(By.xpath("//input[@name='critical_incident']"));
		 * JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		 * executor4.executeScript("arguments[0].click()", buttonCritical_incident);
		 * 
		 * 
		 * WebElement buttonTherapy =
		 * driver.findElement(By.xpath("//input[@name='therapy']")); JavascriptExecutor
		 * executor5 = (JavascriptExecutor) driver;
		 * executor5.executeScript("arguments[0].click()", buttonTherapy);
		 * 
		 * 
		 * WebElement buttonCoaching =
		 * driver.findElement(By.xpath("//input[@name='coaching']")); JavascriptExecutor
		 * executor6 = (JavascriptExecutor) driver;
		 * executor6.executeScript("arguments[0].click()", buttonCoaching);
		 * 
		 * 
		 * WebElement buttonPersonal_crisis =
		 * driver.findElement(By.xpath("//input[@name='personal_crisis']"));
		 * JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		 * executor7.executeScript("arguments[0].click()", buttonPersonal_crisis);
		 * 
		 * 
		 * WebElement buttonHra = driver.findElement(By.xpath("//input[@name='hra']"));
		 * JavascriptExecutor executor8 = (JavascriptExecutor) driver;
		 * executor8.executeScript("arguments[0].click()", buttonHra);
		 * 
		 * 
		 * WebElement buttonNutrition =
		 * driver.findElement(By.xpath("//input[@name='nutrition']"));
		 * JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		 * executor9.executeScript("arguments[0].click()", buttonNutrition);
		 * 
		 */
		/*
		 * WebElement buttonArticles =
		 * driver.findElement(By.xpath("//input[@name='articles']")); JavascriptExecutor
		 * executor10 = (JavascriptExecutor) driver;
		 * executor10.executeScript("arguments[0].click()", buttonArticles);
		 * 
		 * WebElement buttonLegal_financial =
		 * driver.findElement(By.xpath("//input[@name='legal_financial']"));
		 * JavascriptExecutor executor11 = (JavascriptExecutor) driver;
		 * executor11.executeScript("arguments[0].click()", buttonLegal_financial);
		 */

		// *******************************Services************************************

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");
		Utility.waitForWebElement(driver, startDateInput).sendKeys(Keys.RETURN);

		// Utility.waitForWebElement(driver, createEmployerSubmitButton).click();

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(20);

	}

	public void createGroupNo(String groupNumber, String searchEmployer) {

		Utility.waitForWebElement(driver, GroupNoLink).click();

		Utility.wait(5);

		Utility.waitForWebElement(driver, CreateGroupNo);

		WebElement buttonEmpl = driver.findElement(By.xpath("//a[contains(text(), 'Create Group Number')]"));

		JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		executorEmpl.executeScript("arguments[0].click()", buttonEmpl);

		Utility.waitForWebElement(driver, groupNumberInput).sendKeys(groupNumber); // Modify

		// Select

		WebElement coverageTokenElement = driver.findElement(selectCoverageTokenInput);

		Select objTokenLabel = new Select(coverageTokenElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		objTokenLabel.selectByValue("email");

		// Select

		WebElement groupableElement = driver.findElement(selectGroupable);

		Select objGroup = new Select(groupableElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		objGroup.selectByValue("employers");

		// Employer

		Utility.waitForWebElement(driver, selectGroupableSearchInput).click();

		Utility.waitForWebElement(driver, searchEmployerInput).sendKeys(searchEmployer);

		// Utility.waitForWebElement(driver, searchEmployerInput).sendKeys(Keys.ENTER);

		// Actions builder = new Actions(driver);
		// builder.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		By selectEqCareEmployer = By.xpath("//div[contains(text(),'" + searchEmployer + "')]");

		Utility.waitForWebElement(driver, selectEqCareEmployer).click();

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(2);

	}

	public void createEmployerNew1797(String searchEmployer, String CoverageToken, String CoverageType) {

		Utility.waitForWebElement(driver, EmployerLink).click();

		WebElement buttonEmpl = driver.findElement(By.xpath("(//a[contains(text(), 'Create Employer')])[1]"));

		JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		executorEmpl.executeScript("arguments[0].click()", buttonEmpl);

		// Utility.waitForWebElement(driver, createEmployerLink).click();

		// Change ID for NEW Employer NEW
		Utility.waitForWebElement(driver, employerIDInput).sendKeys(CoverageToken);
		// // Modify

		Utility.waitForWebElement(driver, companyNameInput).sendKeys(searchEmployer); // Modify

		// Select

		WebElement coverageTokenElement = driver.findElement(selectCoverageTokenInput);

		Select objTokenLabel = new Select(coverageTokenElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		objTokenLabel.selectByValue("email");

		// ***************** Select PArtner
		/*
		 * WebElement partnerPortalElement = driver.findElement(selectPartnerPortal);
		 * 
		 * Select objPartnerPortal = new Select(partnerPortalElement);
		 * 
		 * Utility.waitForWebElement(driver, selectPartnerPortal).click();
		 * 
		 * objPartnerPortal.selectByValue("1");
		 */

		// *******************************Coverage
		// Type************************************

		// lifejourney_gold

		/*
		 * WebElement coverageTypeElement = driver.findElement(selectCoverageType);
		 * 
		 * Select objCoverageType = new Select(coverageTypeElement);
		 * 
		 * // Utility.waitForWebElement(driver, selectCoverageType).click();
		 * 
		 * System.out.println(CoverageType);
		 * 
		 * objCoverageType.selectByValue(CoverageType);
		 */

		// *******************************Services************************************

		// objCoverageType.selectByValue("lifejourney_silver");

		// objCoverageType.selectByValue("lifejourney_gold");

		// Uncomment it

		// objCoverageType.selectByValue("lifejourney_bronze");//Modify

		// objCoverageType.selectByValue("lifejourney_basic");

		// objCoverageType.selectByValue("none");

		// *******************************Services************************************

		/*
		 * WebElement buttonPrimaryCare =
		 * driver.findElement(By.xpath("//input[@name='primary_care']"));
		 * 
		 * JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		 * executor1.executeScript("arguments[0].click()", buttonPrimaryCare);
		 */

		/*
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDmss =
		 * driver.findElement(By.xpath("//input[@name='dmss']"));
		 * 
		 * JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		 * executor2.executeScript("arguments[0].click()", buttonDmss);
		 * 
		 * //Checkbox
		 * 
		 * WebElement buttonDcbt =
		 * driver.findElement(By.xpath("//input[@name='dcbt']")); JavascriptExecutor
		 * executor3 = (JavascriptExecutor) driver;
		 * executor3.executeScript("arguments[0].click()", buttonDcbt);
		 * 
		 * 
		 * WebElement buttonCritical_incident =
		 * driver.findElement(By.xpath("//input[@name='critical_incident']"));
		 * JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		 * executor4.executeScript("arguments[0].click()", buttonCritical_incident);
		 * 
		 * 
		 * WebElement buttonTherapy =
		 * driver.findElement(By.xpath("//input[@name='therapy']")); JavascriptExecutor
		 * executor5 = (JavascriptExecutor) driver;
		 * executor5.executeScript("arguments[0].click()", buttonTherapy);
		 * 
		 * 
		 * WebElement buttonCoaching =
		 * driver.findElement(By.xpath("//input[@name='coaching']")); JavascriptExecutor
		 * executor6 = (JavascriptExecutor) driver;
		 * executor6.executeScript("arguments[0].click()", buttonCoaching);
		 * 
		 * 
		 * WebElement buttonPersonal_crisis =
		 * driver.findElement(By.xpath("//input[@name='personal_crisis']"));
		 * JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		 * executor7.executeScript("arguments[0].click()", buttonPersonal_crisis);
		 * 
		 * 
		 * WebElement buttonHra = driver.findElement(By.xpath("//input[@name='hra']"));
		 * JavascriptExecutor executor8 = (JavascriptExecutor) driver;
		 * executor8.executeScript("arguments[0].click()", buttonHra);
		 * 
		 * 
		 * WebElement buttonNutrition =
		 * driver.findElement(By.xpath("//input[@name='nutrition']"));
		 * JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		 * executor9.executeScript("arguments[0].click()", buttonNutrition);
		 * 
		 */

		/*
		 * WebElement buttonArticles =
		 * driver.findElement(By.xpath("//input[@name='articles']")); JavascriptExecutor
		 * executor10 = (JavascriptExecutor) driver;
		 * executor10.executeScript("arguments[0].click()", buttonArticles);
		 * 
		 * WebElement buttonLegal_financial =
		 * driver.findElement(By.xpath("//input[@name='legal_financial']"));
		 * JavascriptExecutor executor11 = (JavascriptExecutor) driver;
		 * executor11.executeScript("arguments[0].click()", buttonLegal_financial);
		 */

		// *******************************Services************************************

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");
		Utility.waitForWebElement(driver, startDateInput).sendKeys(Keys.RETURN);

		// Utility.waitForWebElement(driver, createEmployerSubmitButton).click();

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(2);

	}

	// peerji7722
	public void createCoverage1797(String searchEmployer, String CoverageToken, String CoverageType) {

		/*
		 * Utility.waitForWebElement(driver, EmployerLink).click();
		 * 
		 * WebElement buttonEmpl =
		 * driver.findElement(By.xpath("(//a[contains(text(), 'Create Employer')])[1]"))
		 * ;
		 * 
		 * JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		 * executorEmpl.executeScript("arguments[0].click()", buttonEmpl);
		 * 
		 * By clickEqCareEmployer = By.xpath("//span[contains(text(),'" + searchEmployer
		 * + "')]/following::td[6]//a[1])[1]");
		 * 
		 * Utility.waitForWebElement(driver, clickEqCareEmployer).click();
		 */

		// Utility.waitForWebElement(driver, CreateCoverage).click();

		
		
		//Utility.waitForWebElement(driver, CoverageEmployer);
		
		Utility.wait(7);
		
		Utility.waitForWebElement(driver, CreateCoverage1);

		WebElement CreateCoverage = driver.findElement(By.xpath("(//a[contains(text(), 'Create Coverage')])[1]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", CreateCoverage);

		Utility.wait(5);

		Utility.waitForWebElement(driver, selectCoverageOption);

		// Select Coverage Option

		WebElement coverageOptionElement = driver.findElement(selectCoverageOption);

		Select objCoverageOption = new Select(coverageOptionElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		// objCoverageOption.selectByValue("primary_care");

		// objCoverageOption.selectByValue("lifejourney");

		objCoverageOption.selectByValue(CoverageType);

		// objCoverageOption.selectByValue("dcbt");

		// objCoverageOption.selectByValue("hra");

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");
		Utility.waitForWebElement(driver, startDateInput).sendKeys(Keys.RETURN);

		
	}
	
     public void createCoverageCTA() {
    	 
    	 WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

 		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
 		executorSub.executeScript("arguments[0].click()", buttonSub);

 		Utility.wait(7);
		
	}
	
	public void createAnotherCoverageCTA() {
		
		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-and-add-another-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);
		
		

		Utility.wait(7);
		
	}

	public void createService1797(String searchEmployer, String CoverageToken, String CoverageType) {

		By selectEqCareEmployer = By.xpath("//a[contains(text(),'" + searchEmployer + "')]");

		System.out.println("//a[contains(text(),'" + searchEmployer + "')]");

		Utility.waitForWebElement(driver, selectEqCareEmployer).click();

		Utility.wait(12);

		Utility.waitForWebElement(driver, CreateLifeJounerSer);

		// Utility.waitForWebElement(driver, EmployerLink).click();

		// Utility.wait(10);

		// WebElement buttonEmpl = driver.findElement(By.xpath("(//a[contains(text(),
		// 'Create Employer')])[1]"));

		// JavascriptExecutor executorEmpl = (JavascriptExecutor) driver;
		// executorEmpl.executeScript("arguments[0].click()", buttonEmpl);

		// By clickEqCareEmployer = By.xpath("(//span[contains(text(),'" +
		// searchEmployer + "')]/following::td[6]//a[1])[1]");

		// Utility.waitForWebElement(driver, clickEqCareEmployer).click();

		// Find in table
		// WebElement clickEqCareEmployer =
		// driver.findElement(By.xpath("(//span[contains(text(),'" + searchEmployer +
		// "')]/following::td[6]//a[1])[1]"));

		/*
		 * JavascriptExecutor executorCreateEmployer = (JavascriptExecutor) driver;
		 * executorCreateEmployer.executeScript("arguments[0].click()",
		 * clickEqCareEmployer);
		 * 
		 * Utility.wait(2);
		 * 
		 * Utility.waitForWebElement(driver, CreateLifeJounerSer);
		 */

		// Utility.waitForWebElement(driver, CreateLifeJounerSer).click();

		WebElement createService = driver.findElement(By.xpath("//a[contains(text(), 'Create LifeJourney Service')]"));

		JavascriptExecutor executorCreateService = (JavascriptExecutor) driver;
		executorCreateService.executeScript("arguments[0].click()", createService);

		Utility.wait(10);
		Utility.waitForWebElement(driver, startDateInput);

		WebElement selectService = driver.findElement(By.xpath("//select[@id='lifejourney_service_option']"));

		JavascriptExecutor executorSelectService = (JavascriptExecutor) driver;
		executorSelectService.executeScript("arguments[0].click()", selectService);

		// Select Coverage Option

		WebElement lifeJouneyOptionElement = driver.findElement(selectLifeJourneyOption);

		Select objlifeJouneyOption = new Select(lifeJouneyOptionElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		// objCoverageOption.selectByValue("primary_care");

		objlifeJouneyOption.selectByValue("primary_care");

		// objCoverageOption.selectByValue("dcbt");

		// objCoverageOption.selectByValue("hra");

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");
		Utility.waitForWebElement(driver, startDateInput).sendKeys(Keys.RETURN);

		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(2);
	}

	public void createCoverageUpdate1797(String searchEmployer, String CoverageToken, String CoverageType) {
		
		

		/*By selectEqCareEmployer = By.xpath("//a[contains(text(),'" + searchEmployer + "')]");

		System.out.println("//a[contains(text(),'" + searchEmployer + "')]");

		Utility.waitForWebElement(driver, selectEqCareEmployer).click();

		Utility.wait(12);

		Utility.waitForWebElement(driver, CreateCoverage);*/

		/*
		 * Utility.waitForWebElement(driver, EmployerLink).click();
		 * 
		 * Utility.wait(2);
		 * 
		 * WebElement clickEqCareEmployer =
		 * driver.findElement(By.xpath("(//span[contains(text(),'" + searchEmployer +
		 * "')]/following::td[6]//a[1])[1]"));
		 * 
		 * JavascriptExecutor executorCreateEmployer = (JavascriptExecutor) driver;
		 * executorCreateEmployer.executeScript("arguments[0].click()",
		 * clickEqCareEmployer);
		 * 
		 */
		/*WebElement CreateCoverage = driver.findElement(By.xpath("//a[contains(text(), 'Create Coverage')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", CreateCoverage);*/

		Utility.wait(4);

		Utility.waitForWebElement(driver, selectCoverageOption);

		// Select Coverage Option

		WebElement coverageOptionElement = driver.findElement(selectCoverageOption);

		Select objCoverageOption = new Select(coverageOptionElement);

		// Utility.waitForWebElement(driver, selectCoverageTokenInput).click();

		// objCoverageOption.selectByValue("primary_care");

		// objCoverageOption.selectByValue("lifejourney");

		objCoverageOption.selectByValue(CoverageType);

		// objCoverageOption.selectByValue("dcbt");

		// objCoverageOption.selectByValue("hra");

		Utility.waitForWebElement(driver, startDateInput).sendKeys("2020-08-01");
		Utility.waitForWebElement(driver, startDateInput).sendKeys(Keys.RETURN);

		/*WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(2);*/
	}

	public void novaPatients(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, PatientsLink);

		WebElement PatientCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Patients')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", PatientCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, PatientsTtleTable);

		Utility.waitForWebElement(driver, PatiemtTableHeading);

	}

	public void novaFamilies(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, FamilyLink);

		WebElement FamilyCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Families')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", FamilyCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, FamilyTitleTable);

		Utility.waitForWebElement(driver, FamilyTableHeading);

	}

	public void novaAppointments(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, AppointmentLink);

		WebElement AppointmentsCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Appointments')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", AppointmentsCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, AppointmentTableHeading);

		// Utility.waitForWebElement(driver, AppointmentTitleTable);

	}

	public void novaVisits(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, VisitsLink);

		WebElement VisitsCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Visits')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", VisitsCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, VisitsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaPaywall(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, PaywallLink);

		WebElement PaywallCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Paywall')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", PaywallCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, PaywallTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaNativeApp(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, NativeAppLink);

		WebElement NativeAppCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Native App')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", NativeAppCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, NativeAppTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	

	public void novaICD(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, ICDLink);

		WebElement ICDCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Icd Codes')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", ICDCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, ICDTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaMedication(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, MedicationLink);

		WebElement MedicationCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Medications')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", MedicationCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, MedicationTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaHRAForms(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, HRAFormLink);

		WebElement HRAFormCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Hra Forms')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", HRAFormCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, HRAFormTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaHRAArticles(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, HRAArticleLink);

		WebElement HRAArticleCTALink = driver.findElement(By.xpath("//a[contains(text(), 'Hra Articles')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", HRAArticleCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, HRAArticleTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaFAQCate(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, FAQCatLink);

		WebElement HRAFAQCTALink = driver.findElement(By.xpath("//a[contains(text(), 'FAQ Categories')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", HRAFAQCTALink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, FAQCatTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaFAQ(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, FAQLink);

		WebElement HRAFAQLink = driver.findElement(By.xpath("//a[contains(text(), 'FAQ')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", HRAFAQLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, FAQTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaCovidReq(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, CovidRequestsLink);

		WebElement CovidReqLink = driver.findElement(By.xpath("//a[contains(text(), 'Covid Requests')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", CovidReqLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, CovidRequestsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	
	public void novaCannedRes(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, CannedResponsesLink);

		WebElement CannedResLink = driver.findElement(By.xpath("//a[contains(text(), 'Canned Responses')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", CannedResLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, CannedResponsesTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaSupportTickets(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, SupportTicketsLink);

		WebElement SupportTicLink = driver.findElement(By.xpath("//a[contains(text(), 'Support Tickets')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", SupportTicLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, SupportTicketsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaStaff(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, StaffLink);

		WebElement staffLink = driver.findElement(By.xpath("(//a[contains(text(), 'Staff')])[2]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", staffLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, StaffTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	
	public void novaRatings(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, RatingsLink);

		WebElement ratingLink = driver.findElement(By.xpath("//a[contains(text(), 'Ratings')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", ratingLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, RatingsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaClinicLoggedActions(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, ClinicLoggedActionsLink);

		WebElement clinicLoggedActionsLink = driver.findElement(By.xpath("(//a[contains(text(), 'Logged Actions')])[1]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", clinicLoggedActionsLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, ClinicLoggedActionsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaIncidentReports(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, IncidentReportsLink);

		WebElement incidentReportsLink = driver.findElement(By.xpath("//a[contains(text(), 'Incident Reports')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", incidentReportsLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, IncidentReportsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	
	public void novaClinics(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, ClinicsLink);

		WebElement clinicLink = driver.findElement(By.xpath("//a[contains(text(), 'Clinics')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", clinicLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, ClinicsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaAnnouncements(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, AnnouncementsLink);

		WebElement clinicLink = driver.findElement(By.xpath("//a[contains(text(), 'Clinics')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", clinicLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, ClinicsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaPartnerPortals(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, PartnerPortalsLink);

		WebElement portalLink = driver.findElement(By.xpath("//a[contains(text(), 'Partner Portals')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", portalLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, PartnerPortalsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}

	public void novaGroupNos(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, GroupNumbersLink);

		WebElement gpNoLink = driver.findElement(By.xpath("//a[contains(text(), 'Group Numbers')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", gpNoLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, GroupNumbersTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaEmployer(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, EmployersLink);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Employers')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, EmployersTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaEmployees(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, EmployeesLink1);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Employees')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, EmployeesTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaClientAdmin(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, ClientAdminsLink);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Client Admins')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, ClientAdminsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaCarriers(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, CarriersLink);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Carriers')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, CarriersTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaAdvisors(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, AdvisorsLink);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Advisors')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		Utility.waitForWebElement(driver, AdvisorsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaStaffKPI(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, StaffKPILink);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Staff KPI')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		//Utility.waitForWebElement(driver, AdvisorsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaClientKPI(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, ClientKPILink);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Client KPI')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		//Utility.waitForWebElement(driver, AdvisorsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	
	public void novaClinicKPILink(String searchEmployer, String empID, String CoverageType) {

		Utility.waitForWebElement(driver, ClinicKPILink);

		WebElement empLink = driver.findElement(By.xpath("//a[contains(text(), 'Clinic KPI')]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", empLink);

		Utility.wait(10);

		//Utility.waitForWebElement(driver, AdvisorsTableHeading);

		// Utility.waitForWebElement(driver, VisitsTitleTable);

	}
	

	public void LoggedAction(String identifier, String enText, String frText) {

		Utility.waitForWebElement(driver, LoggedActionLink);
		
		Utility.wait(2); 
				
		WebElement LoggedCTALink = driver.findElement(By.xpath("(//a[contains(text(), 'Logged Action')])[2]"));

		JavascriptExecutor executorCreateCoverage1 = (JavascriptExecutor) driver;
		executorCreateCoverage1.executeScript("arguments[0].click()", LoggedCTALink);	
		
		Utility.waitForWebElement(driver, CreateLoggedActionLink);
		
		
		WebElement CreateLoggedCTALink = driver.findElement(By.xpath("(//a[contains(text(), 'Create Logged Action')])[1]"));

		JavascriptExecutor executorCreateCoverage = (JavascriptExecutor) driver;
		executorCreateCoverage.executeScript("arguments[0].click()", CreateLoggedCTALink);	
		
		Utility.wait(10);
			
		Utility.waitForWebElement(driver, IdentifierInput).sendKeys(identifier);
		
		Utility.waitForWebElement(driver, LoggedActionTranslationENInput).sendKeys(enText);
		
		Utility.waitForWebElement(driver, LoggedActionTranslationFRInput).sendKeys(frText);
		
		WebElement buttonSub = driver.findElement(By.xpath("//button[@dusk='create-button']"));

		JavascriptExecutor executorSub = (JavascriptExecutor) driver;
		executorSub.executeScript("arguments[0].click()", buttonSub);

		Utility.wait(2);
		
	}

}
