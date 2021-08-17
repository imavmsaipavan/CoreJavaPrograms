package com.rbg.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataInExcel {

	public static String TESTDATA_SHEET_PATH = "C:\\Users\\mani\\Desktop\\Book1.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	@Test
	public void writeData() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(TESTDATA_SHEET_PATH);
		book = WorkbookFactory.create(file);
		book.getSheet("CreateEvent").createRow(1).createCell(0).setCellValue("Write Data");
		FileOutputStream fout = new FileOutputStream(TESTDATA_SHEET_PATH);
		book.write(fout);
		fout.close();
		
	}
}
