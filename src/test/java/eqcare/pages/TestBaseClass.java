package eqcare.pages;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import eqcare.factories.BrowserFactory;
import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class TestBaseClass {

	public WebDriver driver, driver1;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeTest
	public void setUp() {
		System.out.println("Log:INFO- Setting up Browser and Application");

	//	driver = BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
	//			DataProviderFactory.getConfig().getValue("ponyEnv"));

		driver.manage().window().maximize();

		// driver.manage().window().setSize(new Dimension(1270, 716));

		// driver1=BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
		// DataProviderFactory.getConfig().getValue("clinic"));

		System.out.println("Log:INFO- Browser and application is ready");
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Log:INFO- Terminating browser");

		BrowserFactory.closeApplication(driver);

		System.out.println("Log:INFO- Browser terminated");
	}

}
