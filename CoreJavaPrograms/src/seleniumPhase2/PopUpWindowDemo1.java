package seleniumPhase2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpWindowDemo1 {
    @Test
	public void verfiyPopUpWindow()
	{
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        
        WebElement cognizant =	driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img"));
        cognizant.click();
        String getTitle=cognizant.getText();
        System.out.println(getTitle);
        		
        Set<String> winIds=driver.getWindowHandles(); //it will handle more than one window
        int count=winIds.size();
        System.out.println(count);
        Iterator<String> winIdsList=winIds.iterator(); 
        // Switch to windows
        String parentWinID = winIdsList.next();
        String child1 = winIdsList.next();
        String child2 = winIdsList.next();
        String child3 = winIdsList.next();
//        String child4 = winIdsList.next();
//        String child5 = winIdsList.next();
        
        driver.switchTo().window(child1);
        
        driver.findElement(By.xpath("//*[@id='menu-item-43']/a/span[2]")).click();
	     
        
        
	
	}
}
