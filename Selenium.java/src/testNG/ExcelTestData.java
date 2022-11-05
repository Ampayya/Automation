package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTestData {
	@Test
	public void ExcelTestData() throws IOException
	{
		FileInputStream file=new FileInputStream("./src/testNG/Excel test data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowCount=sheet.getLastRowNum();
		for(int i=0; i<=rowCount; i++)
		{
			Row row =sheet.getRow(i);
			int cellcount=row.getLastCellNum();
	
			for(int j=0; j<cellcount; j++)
			{
				Cell cell=row.getCell(j);
				String data=cell.getStringCellValue()
						;
				System.out.println(data+"");
			}
			System.out.println();
			}
		}
		
	}