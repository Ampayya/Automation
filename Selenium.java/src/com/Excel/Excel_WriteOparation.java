package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOparation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("./src/com/Excel/writeoparation.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowcount=sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++)
		{
			Row row=sheet.getRow(i);
			
			int cellcount=row.getLastCellNum();
			for(int j=0; j<cellcount; j++)
			{
				Cell cell=row.getCell(j);
				String data=cell.getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		
		

	}

}
