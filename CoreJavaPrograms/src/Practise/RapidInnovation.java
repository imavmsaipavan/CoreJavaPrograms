package Practise;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class RapidInnovation {
	WebDriver driver;
	@Test(priority = 1)
	public void connectWallet() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addExtensions(new File("C:\\Users\\mani\\Desktop\\AutomationTesting\\CoreJavaPrograms"
				+ "\\CoreJavaPrograms\\Webdrivers\\Phantom Wallet.crx"));
		DesiredCapabilities caps= DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY,opt);
		WebDriver driver = new ChromeDriver(caps);
		driver.manage().window().maximize();
		driver.get("https://staging.d3r7fcca8xw	5ep.amplifyapp.com/landing");
//		driver.get("chrome-e xtension://bfnaelmomeimhlpmgjnjophhpkkoljpa/onboarding.html");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb.get(1));
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='sc-bdfBQB fatHKg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='sc-bdfBQB bzlPNH']")).click();
		Thread.sleep(2000);		
		WebElement textbox=driver.findElement(By.xpath("//*[@id='root']/main/div[2]/div/form/section/div/textarea"));
		textbox.click();
		textbox.sendKeys("very theory cover theory hospital belt "
				+ "volume fan reform prize practice cycle");

		driver.findElement(By.xpath("//*[@class='sc-bdfBQB bzlPNH']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password.first']")).sendKeys("Mani@222");
		driver.findElement(By.xpath("//*[@name='password.confirm']")).sendKeys("Mani@222");
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='sc-bdfBQB bzlPNH']")).click();
		Thread.sleep(2000);

		driver.switchTo().window(newTb.get(0));
		driver.findElement(By.xpath("//*[@alt='wallet']")).click();
		//		driver.switchTo().window(newTb.get(1));
		WebElement Phantom=driver.findElement(By.xpath("//*[contains(text(),'Phantom')]"));
		js.executeScript("arguments[0].click();",Phantom );
		Thread.sleep(3000);
		ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb1.get(1));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[2]/div/button[2]")).click();
		driver.switchTo().window(newTb1.get(0));
		driver.findElement(By.xpath("//*[@alt='Valhha']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='sc-fubCzh Tplht']")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Load more Artwork')]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 Thread.sleep(2000);
		 element.click();
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		 WebElement element2=driver.findElement(By.xpath("//*[contains(text(),'View all Artwork')]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		 Thread.sleep(2000);
		 element2.click();
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		 Thread.sleep(2000);
//		 window.scrollTo(0, 0);
		 driver.findElement(By.xpath("//*[@class=\"sc-dQoVA efrVQc\"]")).click();
		 Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void clickOnLogo() throws InterruptedException{

	}

}
