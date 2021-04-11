package seleniumPhase2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo2 {
	   @Test
		public void CloseAndQuitTest2()
		{
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.naukri.com/");
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
	        Set<String> winIds=driver.getWindowHandles();
//		    driver.close();
	        driver.quit();
	       
		}
}
