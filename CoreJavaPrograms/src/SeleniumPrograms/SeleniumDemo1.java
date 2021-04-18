package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://facebook.com");
     
     boolean display = driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
     boolean enable = driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
     boolean select = driver.findElement(By.xpath("//*[@id=\"email\"]")).isSelected();

     if(display==true) {
    	 System.out.println("element is displaying");
    	 if(enable==true){
        	 System.out.println("element is enabled");
        	 if(select==false) {
        	   	 System.out.println("element is selected");
            }
         }
      }
     else {
    	 System.out.println("element is not displaying");
     }
     
     
     String ExpectedWatermark="Email address or phone number";
   
     String ActualWatermark=driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("placeholder");
     System.out.println(ActualWatermark);
     if(ExpectedWatermark.equals(ActualWatermark)) {
    	 System.out.println("watermark is correct");
     }
     else {
    	 System.out.println("watermark is not available");
     }
     
     String ExpectedEnteredData = "asaipavan333@gmail.com";
     driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys(ExpectedEnteredData);
     String ActualEnteredData = driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value");
     System.out.println(ActualEnteredData);
     if(ExpectedEnteredData.equals(ActualEnteredData)) {
    	 System.out.println("expected result came");
     }else
     {
    	 System.out.println("expected result not came");
     }
     String Expected="Facebook helps you connect and share with the people in your life.";
String Actual = driver.findElement(By.xpath("//*[@class='_8eso']")).getText();
if(Expected.equals(Actual)) {
	 System.out.println("expected Text came");
}else
{
	 System.out.println("expected Text not came");
}
     
    
     
	}

}
