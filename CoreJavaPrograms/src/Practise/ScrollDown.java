package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	     driver.get("https://www.tutorialspoint.com/rust/rust_quick_guide.htm");
//	     scrollDown();
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul[1]/li[2]/a")).click();
	     Thread.sleep(240000);
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul[1]/li[3]/a")).click();
	     Thread.sleep(240000);
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul[1]/li[4]/a")).click();
	     Thread.sleep(240000);
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul[1]/li[5]/a")).click();
	     Thread.sleep(240000);
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul[1]/li[5]/a")).click();
	     Thread.sleep(240000);
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul[1]/li[5]/a")).click();
	     Thread.sleep(240000);
	    	 
	     }
	public static void scrollDown() throws InterruptedException {
		for(int i=1;i<=100;i++) {
	     Thread.sleep(30000);
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
	  }
	}
}
