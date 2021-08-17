package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonDemo2 {

	WebDriver driver;
	
	String checkBoxPath="(//input[@name='tripType'])[2]";
	
	public  RadioButtonDemo2() {
		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	     
	}
	     @Test(priority = 1)
	     public void checkBoxDisplay() {
	     boolean display= driver.findElement(By.xpath(checkBoxPath)).isDisplayed();
	     Assert.assertTrue(display);
	     }
	     
	     @Test(priority = 2)
	     public void checkBoxEnable() {
	     boolean enable= driver.findElement(By.xpath(checkBoxPath)).isEnabled();
	     Assert.assertTrue(enable);
	     }
	     
	     @Test(priority = 3)
	     public void checkBoxSelect() {
	     boolean select = driver.findElement(By.xpath(checkBoxPath)).isSelected();
	     Assert.assertFalse(select);	    
	     }
	     
	     @Test(priority = 4)
	     public void checkBoxClick()
	     {
	    	driver.findElement(By.xpath(checkBoxPath)).click();
	    	 
	     }
	     
	     @Test(priority = 5)
	     public void checkBoxDisplay1() {
	     boolean newSelect = driver.findElement(By.xpath(checkBoxPath)).isSelected();
	     Assert.assertTrue(newSelect);	
	     
	}

}
