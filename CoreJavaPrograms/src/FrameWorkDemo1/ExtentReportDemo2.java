package FrameWorkDemo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo2 {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	public ExtentTest parentExtentLogger;

    @Test
    public void externalReportTest1() throws IOException
    {
    	htmlReporter = new ExtentHtmlReporter("C:\\Users\\mani\\Desktop\\extentReport\\"+"test1.html");
		extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        parentExtentLogger = extent.createTest("Test1");
        extentLogger = parentExtentLogger.createNode("Add User with Madatory Fields");
   
    
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("http://demo.guru99.com/test/newtours/reservation.php");

        TakesScreenshot ts = (TakesScreenshot) driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);

    	String destination = "C:\\Users\\mani\\Desktop\\ScreenShot\\screen.png";
    	File finalDestination = new File(destination);
    	FileUtils.copyFile(source, finalDestination);
    	extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCase1" , ExtentColor.GREEN));
    	
    	extentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(destination).build());
    	extentLogger = parentExtentLogger.createNode("Test2");
    	extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCase1" , ExtentColor.GREEN));
    	

    	extent.flush();
}
}