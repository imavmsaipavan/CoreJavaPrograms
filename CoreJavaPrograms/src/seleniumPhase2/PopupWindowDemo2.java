package seleniumPhase2;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupWindowDemo2 {
    @Test
	public void verfiyPopUpWindow()
	{
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
       
        Set<String> winIds=driver.getWindowHandles();   
        Iterator<String> winIdsList=winIds.iterator();
        int totalWindowsCount = winIds.size();
        String expecredTitle= "Cognizant Jobs - Career Opportunities in Cognizant - Naukri.com";
        
        for(int i=0;i<totalWindowsCount;i++)
        {
           driver.switchTo().window(winIdsList.next());
           String actualTitle=driver.getTitle();
           if(expecredTitle.equals(actualTitle))
           {
        	   driver.findElement(By.xpath("//*[@id='menu-item-43']/a/span[2]")).click();
        	   break;
           }
        }
	}
}