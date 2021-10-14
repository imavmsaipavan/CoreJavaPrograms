package Practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	     driver.get("https://www.guru99.com/blockchain-tutorial.html");
	     Thread.sleep(3000);
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
	  }

}
