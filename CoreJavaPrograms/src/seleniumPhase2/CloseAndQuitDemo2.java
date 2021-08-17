package seleniumPhase2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo2 {
	   @Test
		public void CloseAndQuitTest2() throws InterruptedException
		{
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.naukri.com/");
	        
//		    driver.close();
	        Thread.sleep(2000);
	        driver.quit();
	       
		}
}
