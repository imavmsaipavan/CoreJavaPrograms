package SeleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo1 {
	 WebDriver driver;
	@Test
	   public void dropDown() throws InterruptedException 
	   {
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.guru99.com/test/newtours/reservation.php");
         
         WebElement dropDown= driver.findElement(By.xpath("//select[@name='toMonth']"));
         Select SelectDropDown= new Select(dropDown);
         SelectDropDown.selectByVisibleText("June");
         Thread.sleep(2000);
	
         WebElement dropDown2= driver.findElement(By.xpath("//select[@name='toPort']"));
         Select SelectDropDown2= new Select(dropDown2);
         SelectDropDown2.selectByValue("London");
	}

}
