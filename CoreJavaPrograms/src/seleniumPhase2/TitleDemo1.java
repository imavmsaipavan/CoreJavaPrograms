package seleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TitleDemo1 {
	@Test
	public void iFrame() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/newtours/index.php");
	     driver.manage().window().maximize();
	     
	     String expectedTitle = "Find a Flight: Mercury Tours: ";
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//a[@href ='reservation.php']")).click();
         String actualTitle = driver.getTitle();
         System.out.println(actualTitle);
        
         Assert.assertEquals(expectedTitle, actualTitle);
         
         
	}
}
