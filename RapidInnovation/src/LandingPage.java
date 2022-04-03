
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LandingPage extends Baseclass {
//	WebDriver driver;
	@Test(enabled = false, description = "User able to click on Logo",priority=1)
	public void clickOnLogo() throws InterruptedException { 
		driver.findElement(By.xpath("//*[@alt='Valhha']")).click();
		Thread.sleep(2000);
	}
	
	@Test(enabled = false, description = "User able to click on Valhalla",priority=2)
	public void clickOnValhalla() throws InterruptedException { 
		driver.findElement(By.xpath("//*[@class='sc-fubCzh Tplht']")).click();
		Thread.sleep(2000);
		
	}
	@Test(enabled = true, description = "User able to click on Load more Artwork",priority=3)
	public void clickOnLoadMoreArtwork() throws InterruptedException {
		
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Load more Artwork')]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 Thread.sleep(2000);
		 element.click();
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		 Thread.sleep(2000);
	}
	
	@Test(enabled = true, description = "User able to click on View more Artwork",priority=4)
	public void clickOnViewMoreArtwork() throws InterruptedException {
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'View all Artwork')]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 Thread.sleep(2000);
		 element.click();
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		 Thread.sleep(2000);
	}
	}
	
	

