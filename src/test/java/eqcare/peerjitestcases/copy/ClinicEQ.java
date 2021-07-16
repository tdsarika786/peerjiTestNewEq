package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.helper.Utility;
import eqcare.pages.ClinicPage;
import eqcare.pages.FeedbackPage;
import eqcare.pages.HomePage;
import eqcare.pages.InboxPage;
import eqcare.pages.InboxPageAV;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.copy.BaseClass;

public class ClinicEQ extends BaseClass {

	ClinicPage clinic, clinic1, clinic2, clinic3;
	LoginPage login;
	IntakeFormPage intake;
	HomePage home;
	FeedbackPage feedback;
	InboxPage inbox;
	
	public static final String TEXT_GREEN = "\u001B[32m";

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0, enabled = false)
	public void loginToPatientApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		home.deviceCheck();

		intake.fillIntakeForm();
	}

	@Parameters({ "VisitNo" })
	@Test(priority = 1)
	public void loginAsCM(String VisitNo) throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		clinic = PageFactory.initElements(driver, ClinicPage.class);

		clinic2 = PageFactory.initElements(driver2, ClinicPage.class);

		clinic2.loginToApplication("saru@eqcare.com", "secret");
		
		clinic3 = PageFactory.initElements(driver3, ClinicPage.class);

		clinic3.loginToApplication("anu@eqcare.com", "secret");
		
		System.out.println();System.out.println();
		
		System.out.println(TEXT_GREEN + "Log:INFO- *******PEERJI START EQ*********************");
		
		System.out.println(TEXT_GREEN + "Log:INFO- 1. Login as Nurse and Doctor");
	}

	// CM Test
	@Parameters({ "VisitNo","ClinicAppURL" })
	@Test(priority = 2)
	public void loginToClinicApplication(String VisitNo,String ClinicAppURL) throws Exception {

		clinic1 = PageFactory.initElements(driver1, ClinicPage.class);

		clinic1.loginToApplication("anku@eqcare.com", "secret");

		clinic1.navigateToClinicVisitPage(VisitNo,ClinicAppURL);

		try {
			clinic1.takePatient();
		}

		catch (Exception ex) {
			clinic1.loginToApplication("anku@eqcare.com", "secret");

			clinic1.navigateToClinicVisitPage(VisitNo,ClinicAppURL);

			clinic1.takePatient();

		}
		System.out.println(TEXT_GREEN + "Log:INFO- 2. Login as CM and navigate to Visit page and take patient");
	}


	@Parameters({ "Email", "Password" })
	@Test(priority = 3)
	public void loginToPatient(String email, String password) throws Exception {

		login.loginToApplication(email, password);

		clinic.navigateToPatientVisitPage();

		home.navigateToHomePage();

		clinic.nextStep();

		clinic.navigateToPatientVisitPage();

		System.out.println(TEXT_GREEN +"TEXT_GREEN +Log:INFO- 3. PATIENT VISIT STARTS");

	}

	@Test(priority = 4)
	public void functionsWithCM() {

		clinic1.addComments("sai-pic CM", "sai-pic.jpeg");

		clinic1.addComments("Sample CM", "sample.pdf");

		clinic1.cannedResponses();

		clinic1.patientsTab();

		clinic1.visitTab();

		clinic1.createIncident();

		clinic1.submitChats("PeerjiAuto Test Chat CM-1");

		System.out.println(TEXT_GREEN +"Log:INFO- 4. CM with patients - comments, canned, create incidents, chats");

	}

	@Test(priority = 5, dependsOnMethods = "loginToClinicApplication")
	public void patientChats() {

		clinic.patientSubmitChats("Patient with CM-2");
		
		System.out.println(TEXT_GREEN +"Log:INFO- 5. Patient submit chats to CM");
	}

	@Test(priority = 6)
	public void transferPatientToNurse() {
		clinic1.transferToNurse();

		System.out.println(TEXT_GREEN +"Log:INFO- 6. CM TRANSFER PATIENT TO NURSE");
	}
	
	

	@Parameters({ "VisitNo","ClinicAppURL" })
	@Test(priority = 7, dependsOnMethods = "loginToClinicApplication")
	public void navigateToNurse(String VisitNo,String ClinicAppURL) throws Exception {

		clinic2.navigateToClinicVisitPage(VisitNo,ClinicAppURL);
		
		try {
			clinic2.addComments("sai-pic", "sai-pic.jpeg");
		}

		catch (Exception ex) {
			clinic2.loginToApplication("nurse@eqcare.com", "secret");

			clinic2.navigateToClinicVisitPage(VisitNo,ClinicAppURL);
		}
		clinic2.addComments("sai-pic Nurse", "sai-pic.jpeg");

		clinic2.addComments("Sample Nurse", "sample.pdf");

		clinic2.cannedResponses();

		clinic2.patientsTab();

		clinic2.visitTab();

		clinic2.submitChats("PeerjiAuto Test Chat Nurse-3");

		System.out.println(TEXT_GREEN +"Log:INFO-7.  Nurse with patients - comments, canned, create incidents, chats");


	}

	@Test(priority = 8, dependsOnMethods = "loginToClinicApplication")
	public void patientChatsToNurse() {

		clinic.patientSubmitChats("Patient with Nurse-4");
		
		System.out.println(TEXT_GREEN +"Log:INFO- 8. Patient submit chats to Nurse");
	}

	@Test(priority = 9, dependsOnMethods = "loginToClinicApplication")
	public void transferPatientToCoctor() {

		clinic2.transferToDoctor();

		System.out.println(TEXT_GREEN +"Log:INFO 9.- NURSE TRANSFER PATIENT TO DOCTOR");	
		

	}

	@Parameters({ "VisitNo", "ClinicAppURL" })
	@Test(priority = 10, dependsOnMethods = "loginToClinicApplication")
	public void navigateToDr(String VisitNo, String ClinicAppURL) throws Exception {

		clinic3.navigateToClinicVisitPage(VisitNo,ClinicAppURL);
		try {

			clinic3.takePatient();
		}

		catch (Exception ex) {
			clinic3.loginToApplication("doctor@eqcare.com", "secret");

			clinic3.navigateToClinicVisitPage(VisitNo,ClinicAppURL);

			clinic3.takePatient();
		}

		clinic3.addComments("sai-pic DR", "sai-pic.jpeg");

		clinic3.addComments("Sample DR", "sample.pdf");

		clinic3.cannedResponses();

		clinic3.patientsTab();

		clinic3.visitTab();

		clinic3.submitChats("PeerjiAuto Test Chat DR-5");

		System.out.println(TEXT_GREEN +"Log:INFO- 10. Doctor with patients - comments, canned, create incidents, chats");

	}

	@Test(priority = 11, dependsOnMethods = "loginToClinicApplication")
	public void patientChatsToDoctor() {

		clinic.patientSubmitChats("Patient with DR-6");
		
		System.out.println(TEXT_GREEN +"Log:INFO- 11. Patient submit chats to Doctor");
	}

	@Test(priority = 12, dependsOnMethods = "loginToClinicApplication")
	public void doctorEndConsultation() {

		clinic3.endConsultation();

		System.out.println(TEXT_GREEN +"Log:INFO - 12. DOCTOR END CONSULTATION");

	}

	@Test(priority = 13, dependsOnMethods = "loginToClinicApplication")
	public void feedback() throws Exception {

		feedback = PageFactory.initElements(driver, FeedbackPage.class);

		feedback.ratingProvidedDRCMNurse();

		System.out.println(TEXT_GREEN +"Log:13. INFO- Feedback provided");

	}

	@Test(priority = 14, dependsOnMethods = "loginToClinicApplication")
	public void inbox() throws Exception {

		inbox = PageFactory.initElements(driver, InboxPage.class);

		inbox.navigateToInboxPage();

		inbox.verifyMyInboxTabs();

		System.out.println("Log:INFO- Inbox redirected");
		
		System.out.println(TEXT_GREEN +"Log:INFO- **********END EQ******************");
		
		System.out.println(); System.out.println();

	}

}