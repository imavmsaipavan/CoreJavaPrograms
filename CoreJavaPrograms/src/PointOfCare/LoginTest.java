package PointOfCare;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='dm0m0i0tdT']")).click();
		//		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		//		Thread.sleep(3000);
		//		    WebElement element=driver.findElement(By.xpath("//td[text()='Create PS']"));
		//		    JavascriptExecutor executor=  (JavascriptExecutor)driver;
		//		    executor. executeScript("arguments[0]. click();", element);
				WebDriverWait wait= new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Create PS']")));
		//    Actions act=new Actions(driver);
		//    act.moveToElement(driver.findElement(By.xpath("//*[@id='dm0m1i1tdT']"))).build().perform();
		Thread.sleep(6000);
		WebElement element=driver.findElement(By.xpath("//td[text()='Create PS']"));
		JavascriptExecutor executor=  (JavascriptExecutor)driver;
		executor.executeScript("arguments[0]. click();", element);
		//		driver.findElement(By.xpath("//td[text()='Create PS']")).click();
		Thread.sleep(2000); 
		driver.switchTo().defaultContent();
		Set<String> winIds=driver.getWindowHandles();
		Iterator<String> winIdsList=winIds.iterator();
		String parentWinID = winIdsList.next();
		String child1 = winIdsList.next();
		driver.switchTo().window(child1);
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='salutation']")));
		sel.selectByValue("MR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@labelname='Last Name']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@labelname='First Name']")).sendKeys("Cena");
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//*[@title='Select Date']")).click();
		//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@labelname='Date of Birth']")).sendKeys("01/11/2021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='N/R']")).click();
		Thread.sleep(2000);
		Select sel2=new Select(driver.findElement(By.xpath("//*[@labelname='Gender']")));
		sel2.selectByValue("M");
		Thread.sleep(2000);
		Select sel3=new Select(driver.findElement(By.xpath("//*[@labelname='Race']")));
		sel3.selectByValue("I");
		Thread.sleep(2000);
		Select sel4=new Select(driver.findElement(By.xpath("//*[@labelname='Marital Status']")));
		sel4.selectByValue("S");
		Thread.sleep(2000);
		Select sel5=new Select(driver.findElement(By.xpath("//*[@labelname='Language']")));
		sel5.selectByValue("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Address']")).click();

	}
}
