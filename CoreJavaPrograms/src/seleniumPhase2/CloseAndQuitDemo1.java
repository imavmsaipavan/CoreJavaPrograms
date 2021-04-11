package seleniumPhase2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo1 {
	@Test
	public void closeAndQuitWindow() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/test/newtours/index.php");
//    driver.close();
    driver.quit();
}
}
