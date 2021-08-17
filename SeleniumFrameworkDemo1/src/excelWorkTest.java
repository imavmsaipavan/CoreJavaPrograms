import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelWorkTest {
	public XSSFWorkbook workBook;
	public XSSFSheet sheet;
	@Test(priority = 0)
	public void rowCount() throws IOException
	{
	 workBook = new XSSFWorkbook("C:\\Users\\mani\\Downloads\\Excel.xlsx");
	 sheet=workBook.getSheet("Sheet1");		
	int rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
	
	}
	@Test(priority = 1)
	public void colCount() throws IOException
	{
		workBook = new XSSFWorkbook("C:\\Users\\mani\\Downloads\\Excel.xlsx");
		sheet=workBook.getSheet("Sheet1");				
	    XSSFRow row=sheet.getRow(0);
	    int colCount=row.getLastCellNum();
	    System.out.println(colCount);
}
	@Test(priority = 2)
	public void readDataFromExcel() throws IOException
	{
		workBook = new XSSFWorkbook("C:\\Users\\mani\\Downloads\\Excel.xlsx");
		sheet=workBook.getSheet("Sheet1");
		String cellData= sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellData);
		
	}
}
