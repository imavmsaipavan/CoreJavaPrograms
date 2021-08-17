package FrameWorkDemo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestDemo1 {

	@Test
	public void flightTest() throws IOException
	{
		GenericFuntion1 key= new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("http://demo.guru99.com/test/newtours/index.php");
		key.enterData("xpath","//input[@type='text']", "Mercury");
		key.enterData("xpath","//input[@type='password']", "Mercury");
		key.click("xpath","//input[@type='submit']");

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
//	   driver.get("http://demo.guru99.com/test/newtours/index.php");
//	   
//	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mercury");
//	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mercury");
//	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	   
    TakesScreenshot ts = (TakesScreenshot) key.driver;
	File source = ts.getScreenshotAs(OutputType.FILE);

	String destination = "C:\\Users\\mani\\Desktop\\ScreenShot\\screen1.png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	
	ExtentHtmlReporter report= new ExtentHtmlReporter("C:\\Users\\mani\\Desktop\\HTMLReports\\NewReport1.html");
	ExtentReports repo=new ExtentReports();
	repo.attachReporter(report);
	ExtentTest name= repo.createTest("Login Test");
	name.log(Status.PASS, "Test Case is passed");
	name.log(Status.FAIL, "Case is failed");
	name.log(Status.PASS, "",MediaEntityBuilder.createScreenCaptureFromPath(destination).build());
	repo.flush();

	}
}
