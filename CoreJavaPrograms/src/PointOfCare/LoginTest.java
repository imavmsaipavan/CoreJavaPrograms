package PointOfCare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void login() {
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Webdrivers\\IEDriverServer.exe");
    WebDriver driver = new InternetExplorerDriver();
//    driver
    driver.manage().window().maximize();
    driver.get("http://poc.aquilasoftware.com/poc/login.do");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("administrator");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("louisville");
    driver.findElement(By.xpath("//input[@type='image']")).click();
	}
}
