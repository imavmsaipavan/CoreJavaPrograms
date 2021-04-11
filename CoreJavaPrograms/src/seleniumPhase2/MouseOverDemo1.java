package seleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo1 {
	@Test
	public void mouseOverDemo() {
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/gp/aws/cart/add.html?");
    
    WebElement fashion=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]/span"));
    
    Actions act=new Actions(driver);
    act.moveToElement(fashion).perform();
    
    driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span")).click();
    
  
	}   
}

