package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkDemo1 {

	@Test
	public static void totalLinks() {
		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.bbc.com/");
	     List<WebElement> linksList = driver.findElements(By.tagName("a"));
	     int linksSize= linksList.size();
	     System.out.println(linksSize);
	     
	     for(int i=0;i<=linksSize-1;i++) {
	     String linksName = linksList.get(i).getText();
	     System.out.println(linksName);
	     
	     }
	  
	}

}
