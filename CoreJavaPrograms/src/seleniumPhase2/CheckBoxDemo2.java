package seleniumPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxDemo2 {
	@Test
	public void CheckBox2()
	{
	    
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	     
	     boolean display= driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).isDisplayed();
	     boolean enable= driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).isEnabled();
	     boolean select = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).isSelected();
	    
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
	     
        driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).click();
        
       	   	 
		
	}
}
