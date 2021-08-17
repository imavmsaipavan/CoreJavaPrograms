package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo1 {

	WebDriver driver;
	
	public  CheckBoxDemo1() {
		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.calculator.net/mortgage-calculator.html");
	     
	}
	     @Test
	     public void checkBoxDisplay() {
	     boolean display= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isDisplayed();
	     Assert.assertTrue(display);
	     }
	     
	     @Test
	     public void checkBoxEnable() {
	     boolean enable= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isEnabled();
	     Assert.assertTrue(enable);
	     }
	     
	     @Test
	     public void checkBoxSelect() {
	     boolean select = driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isSelected();
	     Assert.assertFalse(select);	    
	     }
	     
	     @Test
	     public void checkBoxDisplay1() {
	     boolean newSelect = driver.findElement(By.xpath("//*[@id='caddoptional']")).isSelected();
	     Assert.assertTrue(newSelect);	
	     
	}
	}


