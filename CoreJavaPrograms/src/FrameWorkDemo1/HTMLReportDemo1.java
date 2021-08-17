package FrameWorkDemo1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HTMLReportDemo1 {

	@Test
	public void HTMLReport()
	{
		ExtentHtmlReporter report= new ExtentHtmlReporter("C:\\Users\\mani\\Desktop\\HTMLReports\\NewReport3.html");
		ExtentReports repo=new ExtentReports();
		repo.attachReporter(report);
		ExtentTest name= repo.createTest("Login Test");
		ExtentTest name2= repo.createTest("Login Test2");
		name.log(Status.PASS, "Test Case is passed");
		name2.log(Status.PASS, "login test2 pass");
		name.log(Status.FAIL, "Case is failed");
		repo.flush(); //flush means transfer data from temporary data to permanent data
		
	}
}
