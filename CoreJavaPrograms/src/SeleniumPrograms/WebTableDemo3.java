package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo3 {
	@Test
	public void webTable()
	{
		System.setProperty("webdriver.chrome.driver", "./Webdrivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
	     
	     List<WebElement> rowsList=driver.findElements(By.xpath("//*[@id=\"fontSize\"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr"));
	        int rowCount=rowsList.size();
	        System.out.println(rowCount);
//	        List<WebElement> ColumnList=driver.findElements(By.xpath("//*[@id=\"fontSize\"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td"));
//	        int columnCount=ColumnList.size();
   	    String xpath1= "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[";
	    String xpath2 = "]/td[1]";
	    for(int i=1;i<=rowCount;i++)
	    {
	    		String textData=driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
	    	    System.out.println(textData);
	    }
	}

}
