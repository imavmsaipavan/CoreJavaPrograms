package TestNGDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FrameWorkDemo1.GenericFuntion1;

public class AutoITDemo1 {

	@Test
	public void autoITTest() throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\SAI\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://pdfcompressor.com/");
	     WebElement uploadFile=driver.findElement(By.xpath("//*[@id='pick-files']/span[2]"));
	     uploadFile.click();
		
//		GenericFuntion1 key=new GenericFuntion1();
//		key.openBrowser("Chrome");
//		key.enterURL("C:\\Users\\mani\\Desktop\\AutoIT\\fileUpload.HTML");
//		key.click("xpath", "//input[@type='file']");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\mani\\Desktop\\AutoIT\\AUTOIT.exe");
	}
}
