import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://facebook.com");
	     
		boolean display= driver.findElement(By.xpath("//*[@name=\'login']")).isDisplayed();
	     boolean enable= driver.findElement(By.xpath("//*[@name=\'login']")).isEnabled();
	     if(display==true) {
	    	 System.out.println("element is displaying");
	    	 if(enable==true){
	        	 System.out.println("element is enabled");
	       
	         }
	      }
	     else {
	    	 System.out.println("element is not displaying");
	     } 
	     
	     String ExpectedButtonName="Log In";
	     
	     String ActualData=driver.findElement(By.xpath("//*[@name='login']")).getText();
	     System.out.println(ActualData);
	     if(ExpectedButtonName.equals(ActualData)) {
	    	 System.out.println("buttonName is Matched");
	     }
	     else {
	    	 System.out.println("buttonName is not Matched");
	     }
	     
	}

	
	
}
