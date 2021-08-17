package Practise;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyBoardActions {

	@Test
	public void keyBoardTest() throws InterruptedException {
		
		String dirPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",dirPath+"//WebDrivers//chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("asaipavan333@gmail.com");
		username.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("vasu*222");
		Thread.sleep(2000);
		password.sendKeys(Keys.ENTER);
	}

	
}
