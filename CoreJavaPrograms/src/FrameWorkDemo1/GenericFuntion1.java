package FrameWorkDemo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
	public XSSFWorkbook workBook;
	public XSSFSheet sheet;
	
	public void alertAccept() 
    {
    	driver.switchTo().alert().accept();
    }
    public void alertDismiss() 
    {
    	driver.switchTo().alert().dismiss();
    }
    
    public void alertText() 
    {
    	String text =driver.switchTo().alert().getText();
    	System.out.println(text);
    }
    
	public void click(String locatorType,String locatorValue)
	{
		if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).click();
		}
		else if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).click();
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).click();
		}
	}
	
	public void colCount(String path, String sheetName) throws IOException
	{
		workBook = new XSSFWorkbook(path);
		sheet=workBook.getSheet(sheetName);				
	    XSSFRow row=sheet.getRow(0);
	    int colCount=row.getLastCellNum();
	    System.out.println(colCount);
}
	
	

	public void dropDown(String methodType,String locatorType,String locatorValue,String textData)
	{
		if(locatorType.equals("id"))
		{
			if(methodType.equals("visibleText"))
			{
			WebElement dropDown= driver.findElement(By.id(locatorValue));
		    Select SelectDropDown= new Select(dropDown);
		    SelectDropDown.selectByVisibleText(textData);
			}
			else if(methodType.equals("value"))
			{
				WebElement dropDown= driver.findElement(By.id(locatorValue));
			    Select SelectDropDown= new Select(dropDown);
			    SelectDropDown.selectByValue(textData);
			}
			
		}
		else if(locatorType.equals("name"))
		{
			if(methodType.equals("visibleText")) {
		
			WebElement dropDown= driver.findElement(By.name(locatorValue));
		    Select SelectDropDown= new Select(dropDown);
		    SelectDropDown.selectByVisibleText(textData);
		}
			else if(methodType.equals("value"))
		{
			WebElement dropDown= driver.findElement(By.name(locatorValue));
		    Select SelectDropDown= new Select(dropDown);
		    SelectDropDown.selectByValue(textData);
		}
		}
		
		else if(locatorType.equals("xpath"))
		{
			if(methodType.equals("visibleText")) {
				
				WebElement dropDown= driver.findElement(By.xpath(locatorValue));
			    Select SelectDropDown= new Select(dropDown);
			    SelectDropDown.selectByVisibleText(textData);
			}
			else if(methodType.equals("value"))
			{
				WebElement dropDown= driver.findElement(By.xpath(locatorValue));
			    Select SelectDropDown= new Select(dropDown);
			    SelectDropDown.selectByValue(textData);
			}
		}
	}
		
	public void enterData(String locatorType,String locatorValue,String data)
	{
		if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
		}
	}
	
	public void enterURL(String URL)
	{
		driver.manage().window().maximize();
		driver.get(URL);
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
	
	public void getText(String locatorType,String locatorValue)
	{
		if(locatorType.equals("id"))
		{
			String text=driver.findElement(By.id(locatorValue)).getText();
		     System.out.println(text); 
		}
		else if(locatorType.equals("name"))
		{
			String text=driver.findElement(By.name(locatorValue)).getText();
		     System.out.println(text);
		     }
		else if(locatorType.equals("xpath"))
		{
			String text=driver.findElement(By.xpath(locatorValue)).getText();
		     System.out.println(text);
		     }
	}
	
	public void getTitle(String url) {
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void isDisplayed(String locatorType,String locatorValue)
	{
		if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).isDisplayed();
		}
		else if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).isDisplayed();
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).isDisplayed();
		}
	}
	
	public void isEnabled(String locatorType,String locatorValue)
	{
		if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).isEnabled();
		}
		else if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).isEnabled();
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).isEnabled();
		}
	}
	
	
	public void isSelect(String locatorType,String locatorValue)
	{
		if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).isSelected();
		}
		else if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).isSelected();
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).isSelected();
		}
	}
	
	public void rowCount(String path, String sheetName) throws IOException
	{
	 workBook = new XSSFWorkbook(path);
	 sheet=workBook.getSheet(sheetName);		
	int rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
	
	}
	
	public void readDataFromExcel(String path,String sheetName, int rowValue, int cellValue) throws IOException
	{
		workBook = new XSSFWorkbook(path);
		sheet=workBook.getSheet(sheetName);
		String cellData= sheet.getRow(rowValue).getCell(cellValue).getStringCellValue();
		System.out.println(cellData);
		
	}
	
	
	public void takeScreenShot(String desPath) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = desPath;
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
	}
	

	public void watermark(String locatorType,String locatorValue)
	{
		if(locatorType.equals("id"))
		{
			String watermark =driver.findElement(By.id(locatorValue)).getAttribute("placeholder");
			System.out.println(watermark);
		}
		
		else if(locatorType.equals("name"))
		  {
			String watermark =driver.findElement(By.name(locatorValue)).getAttribute("placeholder");
			System.out.println(watermark);
		      }
		
		else if(locatorType.equals("xpath"))
		  {
			String watermark =driver.findElement(By.xpath(locatorValue)).getAttribute("placeholder");
			System.out.println(watermark);	
		      }
	            }
	
	public void writeData(String path, int sheetValue,int rowValue, int colValue, String writeData) throws IOException {
   	    String filePath=path;
		File file=new File(filePath);
		FileInputStream streams= new FileInputStream(file);
		 workBook = new XSSFWorkbook(filePath);
	     sheet = workBook.getSheetAt(sheetValue);
		
		sheet.getRow(rowValue).createCell(colValue).setCellValue(writeData);
		FileOutputStream out= new FileOutputStream(file);
		workBook.write(out);
		workBook.close();
	}
	
        
} 
