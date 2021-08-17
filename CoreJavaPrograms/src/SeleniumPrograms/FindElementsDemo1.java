package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsDemo1 {

	@Test
	public void findElements()
	{
		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		List<WebElement> list= driver.findElements(By.xpath("//input[@type='radio']"));
		//list.get(4).click();
	     WebElement radioButton=list.get(4);
	     radioButton.click();
		
	}
}
