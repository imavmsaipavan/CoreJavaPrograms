package PointOfCare;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void login() throws InterruptedException {
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Webdrivers\\IEDriverServer.exe");
    WebDriver driver = new InternetExplorerDriver();
//    driver
    driver.manage().window().maximize();
    driver.get("http://poc.aquilasoftware.com/poc/login.do");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("administrator");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("louisville");
    driver.findElement(By.xpath("//input[@type='image']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class='anchor']")).click();
    Thread.sleep(2000);
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//*[@id='dm0m0i0tdT']")).click();
    Thread.sleep(2000);
//    Actions act=new Actions(driver);
//    act.moveToElement(driver.findElement(By.xpath("//*[@id='dm0m1i0tdT']"))).build().perform();
    driver.findElement(By.xpath("//*[@id='dm0m1i0tdT']")).click();
    Thread.sleep(2000); 
    driver.switchTo().defaultContent();
    Set<String> winIds=driver.getWindowHandles();
    Iterator<String> winIdsList=winIds.iterator();
    String parentWinID = winIdsList.next();
    String child1 = winIdsList.next();
    driver.switchTo().window(child1);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='dm0m1i0tdT']")).click();
    Select sel=new Select(driver.findElement(By.xpath("//select[@name='salutation'])")));
    sel.deselectByValue("MR");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@labelname='Last Name']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@labelname='First Name']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@title='Select Date']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@labelname='Date of Birth']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@value='N/R']")).click();
    Thread.sleep(2000);
    Select sel2=new Select(driver.findElement(By.xpath("//*[@labelname='Gender']")));
    sel2.deselectByValue("M");
    Thread.sleep(2000);
    Select sel3=new Select(driver.findElement(By.xpath("//*[@labelname='Race']")));
    sel3.deselectByValue("W");
    Thread.sleep(2000);
    Select sel4=new Select(driver.findElement(By.xpath("//*[@labelname='Marital Status']")));
    sel4.deselectByValue("S");
    Thread.sleep(2000);
    Select sel5=new Select(driver.findElement(By.xpath("//*[@labelname='Language']")));
    sel5.deselectByValue("1");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@title='Address']")).click();
    
    
    
    
  
  
  
  
	}
}
