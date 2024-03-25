package Until;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.ProjectSpecification;

public class Listener extends ProjectSpecification implements ITestListener {
	
	
	
	
	ExtentReports  extent= ExtentReportsSpicejet.GetReport();
	ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		test= extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, " Testcase pass");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		String filelocation=null;
		try {
			filelocation= getscreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(filelocation, result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}
	
	

}
