package com.rbg.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeDataInExcel {
     @Test
	public void writeData() throws IOException {
		File file=new File("C:\\Users\\mani\\Downloads\\Excel.xlsx");
		FileInputStream streams= new FileInputStream(file);
		XSSFWorkbook workBook = new XSSFWorkbook(streams);
		XSSFSheet sheet = workBook.getSheetAt(0);
		
		sheet.getRow(1).createCell(2).setCellValue("Writing Data in 2nd Row");
		System.out.println("writing the data in excel file");
		FileOutputStream out= new FileOutputStream(file);
		workBook.write(out);
		workBook.close();
	}

}
