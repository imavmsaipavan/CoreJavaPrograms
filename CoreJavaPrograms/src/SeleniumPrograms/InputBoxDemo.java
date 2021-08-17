package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FrameWorkDemo1.GenericFuntion1;

public class InputBoxDemo {

	@Test
	public static void InputBoxDemo()
	{
		GenericFuntion1 key=new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("http://facebook.com");
		key.enterData("xpath", "//input[@type='text']", "asaipavan333@gmail.com");
		key.enterData("xpath", "//input[@type='password']", "vasu*222");
		key.watermark("id", "email");
		key.watermark("name", "pass");
		key.click("xpath", "//*[@type='submit']");
		
	
		
	}
	

}
