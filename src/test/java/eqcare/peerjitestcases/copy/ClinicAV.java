package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.helper.Utility;
import eqcare.pages.ClinicPageAV;
import eqcare.pages.FeedbackPage;
import eqcare.pages.FeedbackPageAV;
import eqcare.pages.HomePage;
import eqcare.pages.HomePageAV;
import eqcare.pages.InboxPage;
import eqcare.pages.InboxPageAV;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.IntakeFormPageAV;
import eqcare.pages.LoginPage;
import eqcare.pages.LoginPageAV;
import eqcare.pages.copy.BaseClass;

public class ClinicAV extends BaseClass {

	ClinicPageAV clinic, clinic1, clinic2, clinic3;
	LoginPageAV login;
	IntakeFormPageAV intake;
	HomePageAV home;
	FeedbackPageAV feedback;
	InboxPageAV inbox;

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0, enabled = false)
	public void loginToPatientApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPageAV.class);

		home = PageFactory.initElements(driver, HomePageAV.class);

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();

		intake = PageFactory.initElements(driver, IntakeFormPageAV.class);

		home.deviceCheck();

		intake.fillIntakeForm();
	}

	@Parameters({ "VisitNo" })
	@Test(priority = 1)
	public void loginAsCM(String VisitNo) throws Exception {

		login = PageFactory.initElements(driver, LoginPageAV.class);

		home = PageFactory.initElements(driver, HomePageAV.class);

		clinic = PageFactory.initElements(driver, ClinicPageAV.class);

		clinic2 = PageFactory.initElements(driver2, ClinicPageAV.class);

		clinic2.loginToApplication("saru@eqcare.com", "secret");

		clinic3 = PageFactory.initElements(driver3, ClinicPageAV.class);

		clinic3.loginToApplication("anu@eqcare.com", "secret");

		System.out.println();
		System.out.println();

		System.out.println("Log:INFO- *******PEERJI START AV*********************");
		
		System.out.println();System.out.println();

		System.out.println("Log:INFO- 1. Login as Nurse and Doctor");
	}

	// CM Test
	@Parameters({ "VisitNo", "ClinicAppURL" })
	@Test(priority = 2, dependsOnMethods = "loginAsCM")
	public void loginToClinicApplication(String VisitNo, String ClinicAppURL) throws Exception {

		clinic1 = PageFactory.initElements(driver1, ClinicPageAV.class);

		clinic1.loginToApplication("anku@eqcare.com", "secret");

		clinic1.navigateToClinicVisitPage(VisitNo, ClinicAppURL);

		try {
			clinic1.takePatient();
		}

		catch (Exception ex) {
			clinic1.loginToApplication("anku@eqcare.com", "secret");

			clinic1.navigateToClinicVisitPage(VisitNo, ClinicAppURL);

			clinic1.takePatient();

		}
		System.out.println("------------------");
		
		System.out.println("Log:INFO- 2. Login as CM and navigate to Visit page and take patient");

	}

	@Parameters({ "Email", "Password" })
	@Test(priority = 3, dependsOnMethods = "loginToClinicApplication")
	public void loginToPatient(String email, String password) throws Exception {

		login.loginToApplication(email, password);

		clinic.navigateToPatientVisitPage();

		home.navigateToHomePage();

		clinic.nextStep();

		clinic.navigateToPatientVisitPage();
		
		System.out.println("------------------");

		System.out.println("Log:INFO- 3. PATIENT VISIT STARTS");

	}

	@Test(priority = 4, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithCM1() {

		clinic1.addComments("sai-pic CM", "sai-pic.jpeg");

		clinic1.addComments("Sample CM", "sample.pdf");

		System.out.println("------------------");

		System.out.println("Log:INFO- 4.1 CM with patients - comments");

	}

	@Test(priority = 5, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithCM2() {

		clinic1.cannedResponses();

		System.out.println("------------------");

		System.out.println("Log:INFO- 4.2 CM with patients - canned responses");

	}

	@Test(priority = 6, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithCM3() {

		clinic1.patientsTab();

		System.out.println("------------------");

		System.out.println("Log:INFO- 4.3 CM with patients - patient tab check");

	}
	
	@Test(priority = 7, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithCM4() {

		clinic1.visitTab();

		System.out.println("------------------");

		System.out.println("Log:INFO- 4.4 CM with patients - visit tab and upload files");

	}

	@Test(priority = 8, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithCM5() {

		clinic1.createIncident();

		System.out.println("------------------");

		System.out.println("Log:INFO- 4.5 CM with patients - comments, canned, create incidents, chats");

	}

	@Test(priority = 9, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithCM6() {

		clinic1.submitChats("PeerjiAuto Test Chat CM-1");

		System.out.println("------------------");

		System.out.println("Log:INFO- 4.6 CM with patients - chats");

	}


	@Test(priority = 10, dependsOnMethods = "loginToClinicApplication")
	public void patientChats() {

		clinic.patientSubmitChats("Patient with CM-2");
		
		System.out.println("------------------");
		
		System.out.println("Log:INFO- 5. Patient submit chats to CM");
	}

	@Test(priority = 11)
	public void transferPatientToNurse() {
		clinic1.transferToNurse();
		
		System.out.println("------------------");

		System.out.println("Log:INFO- 6. CM TRANSFER PATIENT TO NURSE");
	}

	@Parameters({ "VisitNo", "ClinicAppURL" })
	@Test(priority = 12, dependsOnMethods = "loginToClinicApplication")
	public void navigateToNurse(String VisitNo, String ClinicAppURL) throws Exception {

		clinic2.navigateToClinicVisitPage(VisitNo, ClinicAppURL);

		try {
			clinic2.addComments("sai-pic", "sai-pic.jpeg");
		}

		catch (Exception ex) {
			clinic2.loginToApplication("nurse@eqcare.com", "secret");

			clinic2.navigateToClinicVisitPage(VisitNo, ClinicAppURL);
		}
				
		System.out.println("------------------");

		System.out.println("Log:INFO- 7. Nurse with patients ");

	}
	@Test(priority = 13, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithNR1() {

		clinic2.addComments("sai-pic Nurse", "sai-pic.jpeg");

		clinic2.addComments("Sample Nurse", "sample.pdf");

		System.out.println("------------------");

		System.out.println("Log:INFO- 7.1 Nurse with patients - comments");

	}

	@Test(priority = 14, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithNR2() {

		clinic2.cannedResponses();

		System.out.println("------------------");

		System.out.println("Log:INFO- 7.2 Nurse with patients - canned responses");

	}

	@Test(priority = 15, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithNR3() {

		clinic1.patientsTab();

		System.out.println("------------------");

		System.out.println("Log:INFO- 7.4 CM with patients - patient tab check");

	}
	
	@Test(priority = 16, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithNR4() {

		clinic1.visitTab();

		System.out.println("------------------");

		System.out.println("Log:INFO- 7.5 CM with patients - visit tab and upload files");

	}

	@Test(priority = 17, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithNR5() {

		clinic2.submitChats("PeerjiAuto Test Chat Nurse-3");

		System.out.println("------------------");

		System.out.println("Log:INFO- 7.4 Nurse with patients - chats");

	}

	@Test(priority = 18, dependsOnMethods = "loginToClinicApplication")
	public void patientChatsToNurse() {

		clinic.patientSubmitChats("Patient with Nurse-4");
		
		System.out.println("------------------");
		
		System.out.println("Log:INFO- 8. Patient submit chats to Nurse");
	}

	@Test(priority = 19, dependsOnMethods = "loginToClinicApplication")
	public void transferPatientToCoctor() {

		clinic2.transferToDoctor();
		
		System.out.println("------------------");

		System.out.println("Log:INFO- 9.NURSE TRANSFER PATIENT TO DOCTOR");

	}

	@Parameters({ "VisitNo", "ClinicAppURL" })
	@Test(priority = 20, dependsOnMethods = "loginToClinicApplication")
	public void navigateToDr(String VisitNo, String ClinicAppURL) throws Exception {

		clinic3.navigateToClinicVisitPage(VisitNo, ClinicAppURL);

		try {

			clinic3.takePatient();
		}

		catch (Exception ex) {
			clinic3.loginToApplication("doctor@eqcare.com", "secret");

			clinic3.navigateToClinicVisitPage(VisitNo, ClinicAppURL);

			clinic3.takePatient();
		}
		
		System.out.println("------------------");

		System.out.println("Log:INFO- 10. Doctor with patients");

	}
	@Test(priority = 21, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithDR1() {

		clinic3.addComments("sai-pic DR", "sai-pic.jpeg");

		clinic3.addComments("Sample DR", "sample.pdf");

		System.out.println("------------------");

		System.out.println("Log:INFO- 10.1 DR with patients - comments");

	}

	@Test(priority = 22, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithDR2() {

		clinic3.cannedResponses();

		System.out.println("------------------");

		System.out.println("Log:INFO- 10.2 DR with patients - canned responses");

	}

	@Test(priority = 23, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithDR3() {

		clinic1.patientsTab();

		System.out.println("------------------");

		System.out.println("Log:INFO- 10.3 CM with patients - patient tab check");

	}
	
	@Test(priority = 24, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithDR4() {

		clinic1.visitTab();

		System.out.println("------------------");

		System.out.println("Log:INFO- 10.4 CM with patients - visit tab and upload files");

	}


	@Test(priority = 25, dependsOnMethods = "loginToClinicApplication")
	public void functionsWithDR5() {

		clinic3.submitChats("PeerjiAuto Test Chat DR-1");

		System.out.println("------------------");

		System.out.println("Log:INFO- 10.5 DR with patients - chats");

	}
	@Test(priority = 26, dependsOnMethods = "loginToClinicApplication")
	public void patientChatsToDoctor() {

		clinic.patientSubmitChats("Patient with DR-6");
		
		System.out.println("------------------");
		
		System.out.println("Log:INFO- 11. Patient submit chats to Doctor");
	}

	@Test(priority = 27, dependsOnMethods = "loginToClinicApplication")
	public void doctorEndConsultation() {

		clinic3.endConsultation();
		
		System.out.println("------------------");

		System.out.println("Log:INFO - 12. DOCTOR END CONSULTATION");

	}

	@Test(priority = 28, dependsOnMethods = "loginToClinicApplication")
	public void feedback() throws Exception {

		feedback = PageFactory.initElements(driver, FeedbackPageAV.class);

		feedback.ratingProvidedDRCMNurse();
		
		System.out.println("------------------");

		System.out.println("Log:INFO- 13. Feedback provided");

	}

	@Test(priority = 29, dependsOnMethods = "loginToClinicApplication")
	public void inbox() throws Exception {

		inbox = PageFactory.initElements(driver, InboxPageAV.class);

		inbox.navigateToInboxPage();

		inbox.verifyMyInboxTabs();
		
		System.out.println("------------------");

		System.out.println("Log:INFO- 14. Inbox redirected");
		
		System.out.println(); System.out.println();
		
		System.out.println("Log:INFO- **********END AV******************");
		
		System.out.println(); System.out.println();

	}
}