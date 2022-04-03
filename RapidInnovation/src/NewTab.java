import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Webdrivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rapidinnovation.io/");

		Actions act= new Actions(driver);
		act.sendKeys(Keys.CONTROL+"t");
		System.out.println("done");
		
	}

}
