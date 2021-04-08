package SeleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameDemo1 {
    @Test
	public void iFrame() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
	     
	     String expectedData="Saturday, 3 January 2015";
	     driver.switchTo().frame(0);
	     String actualData=driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span")).getText();
	     System.out.println(actualData);
	     if(expectedData.equals(actualData)) {
	    	 System.out.println("Expected Data matched with Actual Data");
	     }
	     else {
	    	 System.out.println("Expected Data not matched with Actual Data");
	     }
	     driver.switchTo().defaultContent();
	     driver.findElement(By.xpath("//*[@id='text1']")).sendKeys("Hyderabad");
		    String townText= driver.findElement(By.xpath("//*[@id='text1']")).getText();
		     System.out.println(townText);
	}

}
