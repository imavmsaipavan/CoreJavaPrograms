package seleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FrameWorkDemo1.GenericFuntion1;

public class GetTitle {
	

	@Test
	public void getTitleTest()
	{
		GenericFuntion1 key=new GenericFuntion1();
		key.openBrowser("Chrome");
		key.getTitle("https://companies.naukri.com/cognizantnew-jobs/contact-us/");
//	   driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
//	   driver.findElement(By.xpath("//*[text()='Contact Us']")).click();
	   
	   
	}
}
