import java.io.File;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Webdrivers//chromedriver.exe");
			ChromeOptions opt= new ChromeOptions();
			opt.addExtensions(new File("C:\\Users\\mani\\Desktop\\AutomationTesting\\CoreJavaPrograms"
					+ "\\CoreJavaPrograms\\Webdrivers\\Phantom Wallet.crx"));
			DesiredCapabilities caps= DesiredCapabilities.chrome();
			caps.setCapability(ChromeOptions.CAPABILITY,opt);
			driver = new ChromeDriver(caps);
			WebDriverWait wait= new WebDriverWait(driver,30);
			driver.manage().window().maximize();
			driver.get("https://staging.d3r7fcca8xw	5ep.amplifyapp.com/landing");

			Set<String> winIds=driver.getWindowHandles();   
			Iterator<String> winIdsList=winIds.iterator();
//			String parentWinID = winIdsList.next();
//	        String child1 = winIdsList.next();
			int totalWindowsCount = winIds.size();
			String expecredTitle= "Phantom Wallet";

			for(int i=0;i<totalWindowsCount;i++)
			{
				driver.switchTo().window(winIdsList.next());
				String actualTitle=driver.getTitle();
				if(expecredTitle.equals(actualTitle))
				{
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
//					driver.switchTo().window(winIdsList.next());
					Set<String> winIds1=driver.getWindowHandles();   
			        int totalWindowsCount1 = winIds1.size();
					break;
				}
				
			}
			
//			String expectedTitle1= "Valhalla Market";
//			for(int i=0;i<totalWindowsCount;i++)
//			{
				
//				String actualTitle=driver.getTitle();
//				if(expectedTitle1.equals(actualTitle))
//				{
//			driver.switchTo().window(winIdsList.next());
//		}
//			}
			}

		catch (Exception e) {
		}
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {

		System.out.println("Test case executed");
		Thread.sleep(2000);
		//		driver.quit();

	}
}