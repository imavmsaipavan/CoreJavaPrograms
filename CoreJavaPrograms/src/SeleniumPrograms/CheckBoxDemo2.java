package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
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
