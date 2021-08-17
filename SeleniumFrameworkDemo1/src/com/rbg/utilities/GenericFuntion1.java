package com.rbg.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class GenericFuntion1 
{
	public WebDriver driver;
	Properties p1;
	
	public GenericFuntion1() throws IOException
	{
		FileInputStream fileRead = new FileInputStream(".//Properties//Test4.properties");
		 p1=new Properties();
		p1.load(fileRead);
		
	}

	public void click(String key) throws IOException
	{
		
		String keys=p1.getProperty(key);
		driver.findElement(By.xpath(keys)).click();
	}
	
	public void enterData(String key,String data) throws IOException
	{
		
		String keys=p1.getProperty(key);
		String datas=p1.getProperty(data);
			driver.findElement(By.xpath(keys)).sendKeys(datas);
		
	}
	
	public void enterURL(String url) throws IOException
	{
		String keys=p1.getProperty(url);
		System.out.println(keys);
		driver.manage().window().maximize();
		driver.get(keys);
	}
	
	
	public void openBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); 
		}
		else if(browserName.equals("IS"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize(); 

		}
	}
        
} 
