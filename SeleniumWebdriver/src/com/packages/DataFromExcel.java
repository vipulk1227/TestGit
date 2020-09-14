package com.packages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataFromExcel {

	public static void main(String[] args) throws BiffException, IOException {
	
		
		FileInputStream file=new FileInputStream("\\D:\\Selenium\\Test Data\\Test Data.xls\\");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet sh=wb.getSheet(0);
		
		
		// Printing particular cell
		int row=sh.getRows();
		int col=sh.getColumns();
		
		
		String [][] data=new String [row][col];
		
		/*
		{
			
			//printing rows and columns
			System.out.println("row:"+row +"columns:"+col);
			
			System.out.println(sh.getCell(0, 0).getContents());
		}
		*/
		
		
		
		
		// Printing excel Sheet
		
		for(int i=0;i<row;i++)
		 {
			for(int j=0;j<col;j++)
			{
				data[i][j]=sh.getCell(1, 2).getContents();
				System.out.println(data[i][j]);
			}
			
		 }
		
	}

}
