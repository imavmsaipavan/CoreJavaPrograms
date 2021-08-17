package seleniumPhase2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo1 {
	@Test
	public void closeAndQuitWindow() 
	{
	System.setProperty("webdriver.chrome.driver", ".//WebDrivers//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.naukri.com/");
//    driver.close();
      driver.quit();
}
}
