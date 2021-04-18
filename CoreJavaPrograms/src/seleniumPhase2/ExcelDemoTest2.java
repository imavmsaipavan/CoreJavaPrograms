package seleniumPhase2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemoTest2 {

	
	public static void main(String[] ARGS) throws InvalidFormatException, IOException
	{
		File file=new File("C:\\Users\\mani\\Downloads\\Excel.xlsx");
		FileInputStream streams= new FileInputStream(file);
		XSSFWorkbook workBook = new XSSFWorkbook(streams);
		XSSFSheet sheet = workBook.getSheetAt(0);
		
		sheet.getRow(0).createCell(2).setCellValue("writeData");
		System.out.println("writing the data in excel file");
		FileOutputStream out= new FileOutputStream(file);
		workBook.write(out);
		workBook.close();
		
	}
}
