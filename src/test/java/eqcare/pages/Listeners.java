package eqcare.pages;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import eqcare.helper.Utility;

public class Listeners implements ITestListener {
	
	ExtentReports report = ReportNG.setupReport();
	public ExtentTest logger;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	logger = report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		logger.log(Status.PASS,"Success");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		logger.fail(result.getThrowable());
				  
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		report.flush();
		
	}
	
	

}
