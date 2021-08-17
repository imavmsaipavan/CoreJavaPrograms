package com.rbg.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.rbg.utilities.GenericFuntion1;
import com.aventstack.extentreports.Status;

public class LoginTest {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	public ExtentTest parentExtentLogger;
	
	 public LoginTest() 
	 {
		 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReports\\test.html");
			extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        parentExtentLogger = extent.createTest("Test1");
	       
	}
	
	@Test
	public void loginWithValidCredentials() throws IOException
	{
		 extentLogger = parentExtentLogger.createNode("with valid credentials");
		   
		
		GenericFuntion1 key = new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("http://demo.guru99.com/test/newtours/index.php");

	    TakesScreenshot ts = (TakesScreenshot) key.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir")+"\\Screenshots\\test1.png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCaseDemo1" , ExtentColor.GREEN));
    	extentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(destination).build());
    	
	}
	@Test
	public void loginWithinValidCredentials() throws IOException
	{
		 extentLogger = parentExtentLogger.createNode("with invalid credentials");
		   
		
		GenericFuntion1 key = new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("http://demo.guru99.com/test/newtours/index.php");

	    TakesScreenshot ts = (TakesScreenshot) key.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir")+"\\Screenshots\\test3.png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCaseDemo2" , ExtentColor.RED));
    	extentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(destination).build());
    	
	}
	@AfterClass
	public void afterClass()
	{
		extent.flush();
	}
}
