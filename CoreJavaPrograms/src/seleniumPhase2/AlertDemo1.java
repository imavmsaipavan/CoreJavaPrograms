package SeleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1 {
@Test
public void alertTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.meghanabus.in/index.html");
    
   
    driver.findElement(By.xpath("//*[@id='navbar-menu']/ul[1]/li[2]/a")).click();
    Thread.sleep(3000); 
    
    WebElement searchButton= driver.findElement(By.xpath("//*[@id='ticketForm']/div[3]/div/button"));
    searchButton.click();
    Thread.sleep(3000);
    
    
    driver.switchTo().alert().accept();

  String text=driver.findElement(By.xpath("//*[@id='manage_booking']/div[1]/div[1]/div[1]/span")).getText();
  System.out.println(text);
    
    

}
}
