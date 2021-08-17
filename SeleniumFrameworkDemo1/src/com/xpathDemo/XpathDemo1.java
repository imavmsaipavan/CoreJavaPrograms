package com.xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathDemo1 {

	@Test
	public void LoginFB()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("asaipavann");
		driver.findElement(By.name("pass")).sendKeys("password");
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		
	}
}
