package com.rbg.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataRead {

	
			XSSFSheet sheet;
			@Test
			public void excelread() throws Exception
			{
				File str=new File("C:\\Users\\mani\\Downloads\\SAREES GROUP LIST (1).xlsx");
				FileInputStream fin=new FileInputStream(str);
				XSSFWorkbook wb=new XSSFWorkbook(fin);
				XSSFSheet sheet=wb.getSheetAt(0);
				
//				String data=sheet.getRow(0).getCell(0).getStringCellValue();
//				System.out.println(data);
//				String data1=sheet.getRow(0).getCell(1).getStringCellValue();
//				System.out.println(data1);
//				String data2=sheet.getRow(1).getCell(0).getStringCellValue();
//				System.out.println(data2);
//				String data3=sheet.getRow(1).getCell(1).getStringCellValue();
//				System.out.println(data3);
				
				
				int rowcount=sheet.getLastRowNum();
				
				for(int i=0;i<=rowcount;i++)
				{
					int cellcount=sheet.getRow(i).getLastCellNum();
					for(int j=0;j<cellcount;j++)
					{
						String data=sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println("data in excel is: "+data);
					}
					System.out.println();
					
				}
			}
				
				
			}
	


