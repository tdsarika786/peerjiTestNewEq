package eqcare.partnerPortal;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.FAQPage;
import eqcare.pages.copy.BaseClass;

public class NovaFAQ extends BaseClass {

	FAQPage faq;


	// testpeerji
	@Parameters({ "AppURL" })
	@Test(priority = 0)
	public void navigateToFAQPage(String AppURL) throws Exception {

		faq = PageFactory.initElements(driver, FAQPage.class);
		
		if (AppURL.contains("peerjipc")) {
		
		//faq.navigateToFAQPage(AppURL,"peerjipc");
		
		faq.verifyFAQCTA();
		
		faq.verifyFAQPCQues();
		}
		
		if (AppURL.contains("peerjilj")) {
			
			//faq.navigateToFAQPage(AppURL,"peerjipc");
			
			faq.verifyFAQCTA();
			
			faq.verifyFAQPCQues();
			
			faq.verifyFAQLJQues();
			}
			

	}

	
	
	

}