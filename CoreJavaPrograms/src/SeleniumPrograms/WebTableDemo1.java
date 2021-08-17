package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1 {

	@Test
	public static void webTableDemo1() {
		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
	     
        WebElement firstElement= driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
        String firstElementData=firstElement.getText();
        System.out.println(firstElementData);
        
	}

}
