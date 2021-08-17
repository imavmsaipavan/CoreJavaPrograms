package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void validCredentials()
	{
		Assert.assertEquals("sai", "sai");
	}

	@Test
	public void inValidCredentials() throws IOException
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		String destination = System.getProperty("user.dir") + "\\Screenshots\\Screenshot.png";
//		File finalDestination = new File(destination);
//		FileUtils.copyFile(source, finalDestination);
		Assert.assertEquals("sai", "pavan");

	}
}

