import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fileInput = new FileInputStream("C:\\Users\\mani\\Downloads\\Excel.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		String cellData=cell.getStringCellValue();
		System.out.println("cellData - "+cellData);
				
	}

}
