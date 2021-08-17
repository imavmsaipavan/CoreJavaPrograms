package com.rbg.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.rbg.utilities.PropertiesReader;

public class FlightTest {

	@Test
	public void loginTest() throws IOException
	{
		
		PropertiesReader config=new PropertiesReader();
		
		System.setProperty("webdriver.chrome.driver",config.chromePath());
		WebDriver driver=new ChromeDriver();
		
		driver.get(config.URL());
		driver.findElement(By.name("userName")).sendKeys(config.username());
		driver.findElement(By.name("password")).sendKeys(config.password());
		driver.findElement(By.name("submit")).click();
		
	}
}
