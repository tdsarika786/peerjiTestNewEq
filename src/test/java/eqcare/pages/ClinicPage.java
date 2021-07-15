package eqcare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class ClinicPage {

	WebDriver driver;

	public ClinicPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	By email = By.name("email");
	By password = By.name("password");
	By loginButton = By.id("login-button");
	By logoutButton = By.id("login-button");

	By TestPat = By.xpath("html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div[1]/div[3]/div/div[2]/div/button");

	By commentsLink = By.xpath("//a[contains(text(), 'Comments')]");

	By commentsTextArea = By.xpath("//textarea[contains(@aria-label, 'Comment')]");

	By commentsToggle = By.xpath("//input[contains(@aria-label, 'Share')]");

	By commentsButton = By.xpath("//div[contains(text(), 'Comment')]");

	By uploadFile = By.xpath("(//input[@type='file'])[2]");

	By uploadCare = By.xpath("(//input[@type='file'])[1]");

	// Patients Tab

	By patientsLink = By.xpath("(//a[contains(text(), 'Patient')])[1]");

	By primaryEmployeeLabel = By.xpath("//span[contains(text(), 'Primary Employee')]");

	By employerLabel = By.xpath("//span[contains(text(), 'Employer')]");

	By patientIDLabel = By.xpath("//span[contains(text(), 'Patient ID')]");

	By sexAtBirthLabel = By.xpath("//span[contains(text(), 'Sex at birth')]");

	By BirthdayLabel = By.xpath("//span[contains(text(), 'Birthday')]");

	By AgeLabel = By.xpath("//span[contains(text(), 'Age')]");

	By HealthCardLinkLabel = By.xpath("//span[contains(text(), 'Health Card Link')]");

	By HealthCardLabel = By.xpath("//span[contains(text(), 'Health Card Number')]");

	By Address1Label = By.xpath("//span[contains(text(), 'Address 1')]");

	By Address2Label = By.xpath("//span[contains(text(), 'Address 2')]");

	By CityLabel = By.xpath("//span[contains(text(), 'City')]");

	By PostalCodeLabel = By.xpath("//span[contains(text(), 'Postal Code')]");

	By Email = By.xpath("//span[contains(text(), 'Email')]");

	By Phone = By.xpath("//span[contains(text(), 'Phone')]");

	// Transfer to dr

	By transferToDrCTA = By.xpath("//div[contains(text(), 'Practitioner')]//parent::button");

	// End Consultation

	By endConsultationCTA = By.xpath("(//div[contains(text(), 'End Consultation')]//parent::button)[2]");

	By consultationComplete = By.xpath("//input[contains(@aria-label, 'Consultation Completed')]//parent::div");

	By consultationOutcomeReq = By.xpath("//input[contains(@aria-label, 'Consultation Outcome (Req')]//parent::div");

	By Prescription = By.xpath("//div[contains(text(), 'Prescription')]");

	By ICDCodeSelect = By.xpath("//input[contains(@aria-label, 'ICD-9')]//parent::div");

	By ICD558 = By.xpath("//div[contains(text(), '0558')]");

	By CarePlanText = By.xpath("//textarea[contains(@aria-label, 'Care Plan')]");

	By CompleteConsulHeader = By.xpath("//div[contains(text(), 'Complete')]");

	// Visit Tab

	By visitLink = By.xpath("(//a[contains(text(), 'Visit')])[1]");

	By visitTypeLabel = By.xpath("//p[contains(text(), 'Visit type')]");

	By reasonvVisitLabel = By.xpath("//span[contains(text(), 'Reason for visit')]");

	By symptomsDurationLabel = By.xpath("//p[contains(text(), 'Symptoms duration')]");

	By knownAllergiesLabel = By.xpath("//p[contains(text(), 'Known allergies')]");

	By currentMedicationLabel = By.xpath("//p[contains(text(), 'Current medication')]");

	By filesLabel = By.xpath("//div[contains(text(), 'Files')]");

	// Canned Responses

	By CannedResonsesLink = By.xpath("//div[contains(text(), 'Canned Responses')]//parent::div");

	By selectCannedResponses = By.xpath("//input[contains(@aria-label,'Canned responses')]//parent::div");

	By PatientImaging = By.xpath("(//div[contains(text(), 'Imaging')])");

	By cannedResponseInput = By.xpath("//textarea[contains(@aria-label, 'Chosen response')]");

	By addResponseLink = By.xpath("//div[contains(text(), 'Add response')]//parent::button");

	// Report Incidents

	By reportIncidentLink = By.xpath("//div[contains(text(), 'Report Clinical Incident')]//parent::button");

	By incidentTechnicalCheck = By.xpath("//input[contains(@aria-label, 'Technical')]");

	By incidentAccountCheck = By.xpath("//input[contains(@aria-label, 'Account')]");

	By incidentText = By.xpath("//textarea[contains(@aria-label, 'nature of the incident')]");

	By incidentLevelLabel = By.xpath("//input[contains(@aria-label, 'level')]");

	By selectLevel = By.xpath("(//div[text()='1'])[2]");

	By incidentSubmit = By.xpath("(//div[contains(text(),'Submit')])[2]");

	// Chats

	By chatsText = By.xpath("//textarea[contains(@placeholder, 'Type your message')]");

	By chatsSubmit = By.xpath("//div[contains(text(), 'Send')]//parent::button");

	// Transfer to DR

	By transferToPractitioner = By.xpath("//div[contains(text(), 'Practitioner')]//parent::button");

	By listPractitioner = By.xpath("(//input[contains(@aria-label, 'List of Online')])[1]");

	By selectPractitioner = By.xpath("(//div[contains(text(), 'Leduc')])[1]");

	By transferToDoctor = By.xpath("//div[contains(text(), 'practitioner')]//parent::button");

	// Resume CAll

	By resumeCall = By.xpath("//a[contains(text(), 'Resume the Call')]");

	By nextStepText = By.xpath("//a[contains(text(), 'Next Step')]");

	// CM take Patient

	By takePatientButton = By.xpath("//div[contains(text(), 'Take Patient')]//parent::button");

	By waitingRoom = By.xpath("//div[contains(text(), 'Waiting Room')]");

	By takePatientButtonDash = By.xpath(
			"((//div[contains(text(), 'Waiting Room')]//parent::div//parent::nav//following-sibling::div)[2]//h2[contains(text(),'Sarika')]//parent::div//parent::div//parent::div//parent::div//parent::div//following-sibling::div)[8]//button//child::div[contains(text(),'Take Patient')]");

	// Chats

	By patientChatsText = By.xpath("//textarea[contains(@placeholder, 'Type your message')]");

	By patientChatsSubmit = By
			.xpath("//textarea[contains(@placeholder, 'Type your message')]//parent::div/following-sibling::div[2]");

	public void loginToApplication1(String userName, String passWord) {
		Utility.waitForWebElement(driver, email).sendKeys(userName);
		Utility.waitForWebElement(driver, password).sendKeys(passWord);
		Utility.waitForWebElement(driver, loginButton).click();

		Utility.wait(10);

	}

	public void loginToApplication(String userName, String passWord) {
		Utility.waitForWebElement(driver, email).sendKeys(userName);
		Utility.waitForWebElement(driver, password).sendKeys(passWord);
		Utility.waitForWebElement(driver, loginButton).click();

		Utility.wait(10);

	}

	public void clickToPatient() {
		Utility.waitForWebElement(driver, TestPat).click();
	}

	public void navigateToPatientVisitPage() {

		// Utility.navigateToURL(driver,
		// "https://patient.eqserviceqa1.eqcaredev.com/visits/67");

		Utility.waitForWebElement(driver, resumeCall).click();

		Utility.wait(10);

	}

	public void nextStep() {

		Utility.waitForWebElement(driver, nextStepText).click();

	}

	public void navigateToClinicVisitPage(String visitNo) {

		Utility.navigateToURL(driver, "https://clinic.eqserviceqa1.eqcaredev.com/visits/" + visitNo);

	}

	public void takePatient() {

		// Utility.waitForWebElement(driver, waitingRoom).click();

		Utility.waitForWebElement(driver, takePatientButton).click();

		// Utility.waitForWebElement(driver, takePatientButtonDash).click();

	}

	public void navigateToClinic() {

		Utility.navigateToURL(driver, "https://clinic.eqserviceqa1.eqcaredev.com/login");

	}

	public void addComments(String text, String file) {

		Utility.waitForWebElement(driver, commentsLink).click();

		Utility.waitForWebElement(driver, commentsTextArea).sendKeys(text + " " + Utility.getCurrentTime());

		// Utility.waitForWebElement(driver, commentsToggle).click();

		WebElement button = driver.findElement(By.xpath("//input[contains(@aria-label, 'Share')]"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", button);

		// Utility.waitForWebElement(driver, commentsButton).click();

		// Utility.waitForWebElement(driver, commentsLink).click();

		WebElement buttontest = driver.findElement(By.xpath("//a[contains(text(), 'Comments')]"));

		JavascriptExecutor executortest = (JavascriptExecutor) driver;
		executortest.executeScript("arguments[0].click()", buttontest);

		WebElement uploadFileElement = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		JavascriptExecutor executorFile = (JavascriptExecutor) driver;
		executorFile.executeScript("arguments[0].style.display='block';", uploadFileElement);

		Utility.waitForWebElement(driver, uploadFile).sendKeys(System.getProperty("user.dir") + "/TestData/" + file);

		WebElement button1 = driver.findElement(By.xpath("//div[contains(text(), 'Comment')]//parent::button"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		Utility.wait(7);

	}

	public void patientsTab() {

		Utility.waitForWebElement(driver, patientsLink).click();

		Utility.waitForWebElement(driver, primaryEmployeeLabel);

		Utility.waitForWebElement(driver, employerLabel);

		Utility.waitForWebElement(driver, patientIDLabel);

		Utility.waitForWebElement(driver, sexAtBirthLabel);

		Utility.waitForWebElement(driver, BirthdayLabel);

		Utility.waitForWebElement(driver, AgeLabel);

		Utility.waitForWebElement(driver, HealthCardLabel);

		Utility.waitForWebElement(driver, HealthCardLinkLabel);

		Utility.waitForWebElement(driver, Address1Label);

		Utility.waitForWebElement(driver, Address2Label);

		Utility.waitForWebElement(driver, CityLabel);

		Utility.waitForWebElement(driver, PostalCodeLabel);

		Utility.waitForWebElement(driver, Email);

		Utility.waitForWebElement(driver, Phone);

	}

	public void loginToClinic(String userName, String passWord) {

		Utility.navigateToURL(driver, "https://clinic.eqserviceqa1.eqcaredev.com/login");

		Utility.waitForWebElement(driver, email).sendKeys(userName);
		Utility.waitForWebElement(driver, password).sendKeys(passWord);
		Utility.waitForWebElement(driver, loginButton).click();

		Utility.wait(10);
	}

	public void navigateToDoctor() {

		// navigateToClinicVisitPage();

	}

	public void endConsultation() {

		WebElement button2 = driver
				.findElement(By.xpath("(//div[contains(text(), 'End Consultation')]//parent::button)[2]"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		WebElement button1 = driver
				.findElement(By.xpath("//input[contains(@aria-label, 'Consultation Completed')]//parent::div"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		Utility.waitForWebElement(driver, consultationComplete).click();

		Utility.waitForWebElement(driver, consultationOutcomeReq).click();

		Utility.waitForWebElement(driver, Prescription).click();

		Utility.waitForWebElement(driver, CompleteConsulHeader).click();

		Utility.waitForWebElement(driver, ICDCodeSelect).click();

		Utility.waitForWebElement(driver, ICD558).click();

		Utility.waitForWebElement(driver, CarePlanText).sendKeys("Peerji care plan" + Utility.getCurrentTime());

		WebElement uploadFileElement = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		JavascriptExecutor executorFile = (JavascriptExecutor) driver;
		executorFile.executeScript("arguments[0].style.display='block';", uploadFileElement);

		Utility.waitForWebElement(driver, uploadCare).sendKeys(System.getProperty("user.dir") + "/TestData/test2.jpeg");

		WebElement button3 = driver
				.findElement(By.xpath("(//div[contains(text(), 'End Consultation')]//parent::button)[1]"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		Utility.wait(10);

	}

	public void visitTab() {

		Utility.waitForWebElement(driver, visitLink).click();

		Utility.waitForWebElement(driver, visitTypeLabel);

		Utility.waitForWebElement(driver, reasonvVisitLabel);

		Utility.waitForWebElement(driver, symptomsDurationLabel);

		Utility.waitForWebElement(driver, knownAllergiesLabel);

		Utility.waitForWebElement(driver, currentMedicationLabel);

		Utility.waitForWebElement(driver, filesLabel);

		WebElement button1 = driver.findElement(By.xpath("(//input[@type='file'])[1]"));

		button1.sendKeys(System.getProperty("user.dir") + "/TestData/sai-pic.jpeg");

		// JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		// executor1.executeScript("arguments[0].click()", button1);

		// WebElement uploadFileElement =
		// driver.findElement(By.xpath("(//input[@type='file'])"));
		// JavascriptExecutor executorFile = (JavascriptExecutor) driver;
		// executorFile.executeScript("arguments[0].style.display='block';",
		// uploadFileElement);

		// Utility.waitForWebElement(driver,
		// uploadCare).sendKeys(System.getProperty("user.dir") +
		// "/TestData/test2.jpeg");

		Utility.wait(7);

		// Utility.waitForWebElement(driver,
		// uploadCare).sendKeys(System.getProperty("user.dir") +
		// "/TestData/test1.jpeg");
	}

	public void cannedResponses() {

		Utility.waitForWebElement(driver, commentsLink).click();

		WebElement button1 = driver.findElement(By.xpath("//div[contains(text(), 'Canned Responses')]//parent::div"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		// Utility.waitForWebElement(driver, CannedResonsesLink).click();

		Utility.waitForWebElement(driver, selectCannedResponses).click();

		Utility.waitForWebElement(driver, PatientImaging).click();

		Utility.waitForWebElement(driver, addResponseLink).click();

		WebElement button = driver.findElement(By.xpath("//input[contains(@aria-label, 'Share')]"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", button);

		// Utility.waitForWebElement(driver, commentsLink).click();

		WebElement buttontest = driver.findElement(By.xpath("//a[contains(text(), 'Comments')]"));

		JavascriptExecutor executortest = (JavascriptExecutor) driver;
		executortest.executeScript("arguments[0].click()", buttontest);

		WebElement uploadFileElement = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		JavascriptExecutor executorFile = (JavascriptExecutor) driver;
		executorFile.executeScript("arguments[0].style.display='block';", uploadFileElement);

		Utility.waitForWebElement(driver, uploadFile).sendKeys(System.getProperty("user.dir") + "/TestData/sample.pdf");

		WebElement button2 = driver.findElement(By.xpath("//div[contains(text(), 'Comment')]//parent::button"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		Utility.wait(7);
	}

	public void createIncident() {

		Utility.waitForWebElement(driver, reportIncidentLink).click();

		// Utility.waitForWebElement(driver, incidentTechnicalCheck).click();
		WebElement button1 = driver.findElement(By.xpath("//input[contains(@aria-label, 'Technical')]"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		WebElement button2 = driver.findElement(By.xpath("//input[contains(@aria-label, 'Account')]"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		Utility.waitForWebElement(driver, incidentText).sendKeys("peerji Incident");
		;

		WebElement button3 = driver.findElement(By.xpath("//input[contains(@aria-label, 'level')]"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		WebElement button4 = driver.findElement(By.xpath("(//div[text()='1'])[2]"));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", button4);

		WebElement button5 = driver.findElement(By.xpath("(//div[contains(text(),'Submit')])[2]"));

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", button5);

		// Utility.waitForWebElement(driver, incidentIntakeCheck).click();

		// Utility.waitForWebElement(driver, incidentLevelLabel).click();

		// Utility.waitForWebElement(driver, selectLevel).click();

		// Utility.waitForWebElement(driver, incidentSubmit).click();

		Utility.wait(7);

	}

	public void submitChats(String text) {

		Utility.waitForWebElement(driver, chatsText).sendKeys(text);

		Utility.waitForWebElement(driver, chatsSubmit).click();

		Utility.wait(7);

	}

	public void patientSubmitChats(String text) {

		Utility.waitForWebElement(driver, patientChatsText).sendKeys(text);

		Utility.waitForWebElement(driver, patientChatsSubmit).click();

		Utility.wait(7);

	}

	public void transferToDoctor() {

		Utility.wait(7);

		WebElement button1 = driver.findElement(By.xpath("//div[contains(text(), 'Practitioner')]//parent::button"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		WebElement button2 = driver.findElement(By.xpath("(//input[contains(@aria-label, 'List of Online')])[1]"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		WebElement button3 = driver.findElement(By.xpath("(//div[contains(text(), 'Leduc')])[1]"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		WebElement button4 = driver.findElement(By.xpath("//div[contains(text(), 'practitioner')]//parent::button"));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", button4);

		// Utility.waitForWebElement(driver, transferToPractitioner).click();

		// Utility.waitForWebElement(driver, listPractitioner).click();

		// Utility.waitForWebElement(driver, selectPractitioner).click();

		// Utility.waitForWebElement(driver, transferToDoctor).click();

		Utility.wait(20);

	}

	public void transferToNurse() {

		Utility.wait(7);

		WebElement button1 = driver.findElement(By.xpath("//div[contains(text(), 'Nurse')]//parent::button"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);

		WebElement button2 = driver.findElement(By.xpath("(//input[contains(@aria-label, 'List of Online')])[1]"));

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		WebElement button3 = driver.findElement(By.xpath("(//div[contains(text(), 'Alice')])[1]"));

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", button3);

		WebElement button4 = driver.findElement(By.xpath("//div[contains(text(), 'nurse')]//parent::button"));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", button4);

		// Utility.waitForWebElement(driver, transferToPractitioner).click();

		// Utility.waitForWebElement(driver, listPractitioner).click();

		// Utility.waitForWebElement(driver, selectPractitioner).click();

		// Utility.waitForWebElement(driver, transferToDoctor).click();

		Utility.wait(20);

	}

}
