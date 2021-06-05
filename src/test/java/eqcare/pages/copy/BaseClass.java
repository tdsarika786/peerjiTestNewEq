package eqcare.pages.copy;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import eqcare.factories.BrowserFactory;
import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class BaseClass implements ITestListener {

	public WebDriver driver, driver1;
	public ExtentReports report;
	public ExtentTest logger;

	@Parameters({"Browser","AppURL", "ProjectRun"})
	@BeforeClass
	public void setUp(String browser, String appurl, String projectrun) throws IOException {
		System.out.println("Log:INFO- Setting up Browser and Application");

		//driver = BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
		//		DataProviderFactory.getConfig().getValue("ponyEnv"));
		
		driver = BrowserFactory.getApplication(browser,
						appurl, projectrun);

		driver.manage().window().maximize();
		
		System.out.println("Log:INFO- Driver Value- "+driver);

		// driver.manage().window().setSize(new Dimension(1270, 716));

		// driver1=BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
		// DataProviderFactory.getConfig().getValue("clinic"));

		System.out.println("Log:INFO- Browser and application is ready");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Log:INFO- Terminating browser");

		BrowserFactory.closeApplication(driver);

		System.out.println("Log:INFO- Browser terminated");
	}

}
