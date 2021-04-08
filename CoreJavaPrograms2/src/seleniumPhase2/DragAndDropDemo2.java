package SeleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo2 {
	@Test
	public void DragAndDropDemo2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/slider/");
    
    
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
  
    WebElement slider= driver.findElement(By.xpath("//*[@id='slider']"));

    Thread.sleep(2000);    
    Actions act=new Actions(driver);
    
    act.dragAndDropBy(slider, 87, 0).perform();
	}
}
