package SeleniumPrograms;

import org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi.generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import FrameWorkDemo1.GenericFuntion1;

public class DropdownDemo1 {

	@Test
	public static void dropDownDemo1() throws InterruptedException {
		
		GenericFuntion1 key= new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("http://demo.guru99.com/test/newtours/reservation.php");
		key.dropDown("visibleText","xpath", "//select[@name='toMonth']","May" );
		Thread.sleep(2000);		
		key.dropDown("value", "xpath", "//select[@name='toPort']", "London");
		
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://demo.guru99.com/test/newtours/reservation.php");
//        
//        WebElement dropDown= driver.findElement(By.xpath("//select[@name='toMonth']"));
//        Select SelectDropDown= new Select(dropDown);
//        SelectDropDown.selectByVisibleText("June");
        
//        WebElement dropDown2= driver.findElement(By.xpath("//select[@name='toPort']"));
//        Select SelectDropDown2= new Select(dropDown2);
//        SelectDropDown2.selectByValue("London");
	}

}
