package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_copyoperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("./src/com/Excel/writeoparation.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet2");
		
		int rowcount1=sheet.getLastRowNum();
		for(int i=0; i<=rowcount1; i++)
		{
			Row row=sheet.getRow(i);
        
		int cellcount1=row.getLastCellNum();
		for(int j=0; j<cellcount1; j++)
		{
			Cell cell=row.getCell(j);
			String data=cell.getStringCellValue();
			System.out.print(data+"    ");
		}
		System.out.println();

	}

	}}
