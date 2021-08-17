package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
    @Test(dataProvider = "setData")
	public void loginTest(String username, String password) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/newtours/index.php");
	     
	     driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     	     	
	}
    @DataProvider
    public Object[][] setData()
    {
    	Object[][] s1=new Object[3][2];
    	s1[0][0]="sai";
    	s1[0][1]="pavan";
    	
    	s1[1][0]="siva";
    	s1[1][1]="kumar";
    	
    	s1[2][0]="vijay";
    	s1[2][1]="shankar";
    	
    	return s1;
    }
    
    
    
}
