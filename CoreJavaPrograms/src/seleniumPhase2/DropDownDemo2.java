package seleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownDemo2 {
    @Test
	public void linkClick()
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.meghanabus.in/");
	     
	      driver.findElement(By.xpath("//*[@id='search-origin']/div/div/div/div[1]")).click();
	     driver.findElement(By.xpath("//*[@id='search-origin']/div[2]/div/div/div/ul/li[5]")).click();
	     driver.findElement(By.xpath("//*[@id='search-destination']/div[1]/div/div/div[1]")).click();
	     driver.findElement(By.xpath("//*[@id='search-destination']/div[2]/div/div/div/ul/li[2]")).click();


	   
	}

}
