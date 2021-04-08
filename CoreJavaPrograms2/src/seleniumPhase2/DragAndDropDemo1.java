package SeleniumPhase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo1 {
	@Test
	public void DragAndDropDemo1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mani\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://jqueryui.com/droppable/");
    
    driver.manage().window().maximize();
    driver.switchTo().frame(0);
    WebElement draggable= driver.findElement(By.xpath("//*[@id='draggable']"));
    WebElement droppable= driver.findElement(By.xpath("//*[@id='droppable']"));
    
    Actions act=new Actions(driver);
    act.dragAndDrop(draggable, droppable).perform();
	}
    
}
