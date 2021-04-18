package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	     
	     boolean display= driver.findElement(By.xpath("//*[@value='oneway']")).isDisplayed();
	     boolean enable= driver.findElement(By.xpath("//*[@value='oneway']")).isEnabled();
	     boolean select = driver.findElement(By.xpath("//*[@value='oneway']")).isSelected();

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
		
	    driver.findElement(By.xpath("//*[@value='oneway']")).click();
	    
	    boolean newSelect = driver.findElement(By.xpath("//*[@value='oneway']")).isSelected();
	     if(newSelect==true) {
    	   	 System.out.println("CheckBox is selected");
        }
	     else {
	    	 System.out.println("CheckBox is not selected");
	     }
		 Select sel= new Select(driver.findElement(By.name("fromPort")));
		 sel.selectByValue("Frankfurt");
		 
		 
		 
	     }
}
