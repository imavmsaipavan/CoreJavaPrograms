package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//WebDrivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/watch?v=X06TQOOBrhM&t=5664s");
	    
	    Actions act=new Actions(driver);
	    WebElement draggable= driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[1]/video"));
	    act.doubleClick(draggable);
	}

}
