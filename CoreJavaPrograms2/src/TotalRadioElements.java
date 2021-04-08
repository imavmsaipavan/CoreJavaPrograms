import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import  java.util.List;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class TotalRadioElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	     
	    List<WebElement> radioButtonList= driver.findElements(By.xpath("//input[@type='radio']"));
	    int list=radioButtonList.size();
	     System.out.println(list);
	     
	     WebElement firstRadioButton = radioButtonList.get(0);
	}

}
