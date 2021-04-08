package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo1 {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.guru99.com/test/newtours/reservation.php");
         
         WebElement dropDown= driver.findElement(By.xpath("//select[@name='toMonth']"));
         Select SelectDropDown= new Select(dropDown);
         SelectDropDown.selectByVisibleText("June");
         Thread.sleep(2000);
         
         WebElement dropDown2= driver.findElement(By.xpath("//select[@name='toPort']"));
         Select SelectDropDown2= new Select(dropDown2);
         SelectDropDown2.selectByValue("London");
	}

}
