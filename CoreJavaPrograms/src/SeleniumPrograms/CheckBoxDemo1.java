package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.calculator.net/mortgage-calculator.html");
	     
	     boolean display= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isDisplayed();
	     boolean enable= driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isEnabled();
	     boolean select = driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).isSelected();

	     if(display==true) {
	    	 System.out.println("CheckBox is displaying");
	    	 if(enable==true){
	        	 System.out.println("CheckBox is enabled");	 
	         }
	      }
	     else {
	    	 System.out.println("element is not displaying");
	     }
	     
	     if(select==true) {
    	   	 System.out.println("CheckBox is selected");
        }
	     else {
	    	 System.out.println("CheckBox is not selected");
	     }
	     boolean newSelect = driver.findElement(By.xpath("//*[@id='caddoptional']")).isSelected();
	     if(newSelect==true) {
    	   	 System.out.println("CheckBox is selected");
        }
	     else {
	    	 System.out.println("CheckBox is not selected");    
	}
	}
	}


