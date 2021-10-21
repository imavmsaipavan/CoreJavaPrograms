package FlushGame;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Baseclass {

  WebDriver driver;
  
	@BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\eclipse-workspace\\kjg\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
			
		  WebDriverWait wait= new WebDriverWait(driver,20);
			
		  driver.manage().window().maximize();
			
		  driver.get("https://demo19952021.flush.com/"); 
	  }

	  @AfterMethod
	  public void afterMethod() {
		 
		  System.out.println("chrome browser close");
		  
		  driver.quit();
	  }
}