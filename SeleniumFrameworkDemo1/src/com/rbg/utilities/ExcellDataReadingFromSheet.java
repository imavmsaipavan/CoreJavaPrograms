package com.rbg.utilities;


	import java.io.FileInputStream;
import java.util.Hashtable;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcellDataReadingFromSheet {
		
		
		FileInputStream fInput;
		XSSFWorkbook book;
		XSSFSheet sheet;
		XSSFRow row;
		
		public ExcellDataReadingFromSheet() throws Throwable
		{
			 fInput= new FileInputStream(System.getProperty("user.dir") + "\\testData\\book1.xlsx");
			 book= new XSSFWorkbook(fInput);
			
		}
		
		public static void main(String[] args) throws Throwable {
			
			
		ExcellDataReadingFromSheet e1=new ExcellDataReadingFromSheet();
		System.out.println(e1.getcolumnCount("Sheet1"));
		System.out.println(e1.getRowCount("Sheet1"));
//		e1.printColumnData("Sheet1", "name");
//		System.out.println(e1.getData("Sheet1", "name", 2));
//		e1.printData("Sheet1", 2);
//		System.out.println(e1.getData("Sheet1", 0, 0));
//		System.out.println(e1.getData("Sheet1", 1, 0));
//		System.out.println(e1.getData("Sheet1", 2, 0));
		System.out.println(e1.readFromExcell("Sheet1"));

	
		
		
		}

		public void printData(String sheetName, int colCount) 
		{
			 sheet= book.getSheet(sheetName);
			for (int j = 1; j < getRowCount(sheetName)+1; j++) 
			{
	        XSSFRow rowData = sheet.getRow(j);
	            System.out.print(rowData.getCell(colCount).getStringCellValue());
	      
	        System.out.println();
	       
			}
			
		}
		public  void printColumnData(String sheetName, String colName) {
			sheet= book.getSheet(sheetName);
			int colCount=getcolumnCount( sheetName);
			for (int i = 0; i < colCount; i++) 
				{
				XSSFRow rowData = sheet.getRow(0);
				String ColData = rowData.getCell(i).getStringCellValue();
	        	if(ColData.equals(colName))
	        		{
	        			for (int j = 1; j < getRowCount(sheetName)+1; j++) 
	        				{
	        					rowData = sheet.getRow(j);
	        					System.out.println(rowData.getCell(i).getStringCellValue());
	              
	        				}
	    	   	  
	        		}
	     
				}
	       
		}
		public  String getData(String sheetName, String columnName,int rowNum) {
			 sheet= book.getSheet(sheetName);
			String data="";
			for (int i = 0; i < getcolumnCount(sheetName); i++) 
			{
	        XSSFRow FirstrowData = sheet.getRow(0);
	         String ColData = FirstrowData.getCell(i).getStringCellValue();
	      if(ColData.equals(columnName))
	      {
	    	  XSSFRow requiredRowData = sheet.getRow(rowNum);
	    	  data= requiredRowData.getCell(i).getStringCellValue();
	      }
			}
			return data;
			}
		
		public int getRowCount(String sheetName)
		{
			 sheet= book.getSheet(sheetName);
			  int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
			  return rowCount;
		}
		
		public int getcolumnCount(String sheetName)
		{
			 sheet= book.getSheet(sheetName);
			 row = sheet.getRow(0);
			     int colCount = row.getLastCellNum();
			     return	colCount; 
		}
		
		public  String getData(String sheetName, int columnNum ,int rowNum) {
			 sheet= book.getSheet(sheetName);
			String data="";
			
	         row = sheet.getRow(rowNum);
	         String ColData = row.getCell(columnNum).getStringCellValue();
	     
		
			return ColData;
			}
		
		
		public Object[][] readFromExcell(String sheetName) throws Throwable
		{
			/*
			 * sheet= book.getSheet(sheetName); getData(sheetName, 0, 0);
			 * 
			 * int rowsCount= getRowCount(sheetName); Object[][] o1=new
			 * Object[rowsCount][1]; Hashtable<String, String> ha = null;
			 * 
			 * for(int j=0; j< getRowCount(sheetName); j++) { ha=new Hashtable<String,
			 * String>();
			 * 
			 * for(int i=0; i < getcolumnCount(sheetName); i++) { ha.put(getData(sheetName,
			 * i , 0), getData("sheetName", i, j)); System.out.println(getData(sheetName, i
			 * , 0) + ".." + getData(sheetName, i, j+1));
			 * 
			 * } o1[j][0]=ha; } return o1;
			 */

			
			ExcellDataReadingFromSheet e1=new ExcellDataReadingFromSheet();
			e1.getData("Sheet1", "name", 0);
				
			int rowsCount= e1.getRowCount("Sheet1");
		    	Object[][] o1=new Object[rowsCount][1];
				Hashtable<String, String>  ha = null;

		    	for(int j=0; j< e1.getRowCount("Sheet1"); j++)
		    	{
		    		ha=new Hashtable<String, String>();

			    for(int i=0; i < e1.getcolumnCount("Sheet1"); i++)	
			    {
			    	ha.put(e1.getData("Sheet1", i , 0), e1.getData("Sheet1", i, j+1));	
					System.out.println(e1.getData("Sheet1", i , 0) + ".." + e1.getData("Sheet1", i, j+1));

			    }
			    System.out.println(ha);
			    o1[j][0]=ha;
			}
				return o1;
			


			
			
		
		}
		
		
		
	}
	
	
	
