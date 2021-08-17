package FrameWorkDemo1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo1 {

	public static void main(String[] args) throws IOException {
		
		String newName=new SimpleDateFormat("YYYYMMddHHmmss").format(new Date());
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
   driver.get("http://demo.guru99.com/test/newtours/reservation.php");

    		
    TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);

	String destination = "C:\\Users\\mani\\Desktop\\ScreenShot\\screen"+System.currentTimeMillis()+".png";
	
//	String destination = "C:\\Users\\mani\\Desktop\\ScreenShot\\screen"+newName+".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	
	
	}

}
