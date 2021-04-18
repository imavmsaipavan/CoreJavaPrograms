package seleniumPhase2;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemoTest {

	public static void main(String[] args) throws IOException {
 
		
	XSSFWorkbook workBook = new XSSFWorkbook("C:\\Users\\mani\\Downloads\\Excel.xlsx");
	XSSFSheet sheet=workBook.getSheet("Sheet1");		
	int rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
	}

}
