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
	     scrollDown();
	    	 
	     }
	public static void scrollDown() throws InterruptedException {
		for(int i=1;i<=100;i++) {
	     Thread.sleep(30000);
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
	  }
	}
}
