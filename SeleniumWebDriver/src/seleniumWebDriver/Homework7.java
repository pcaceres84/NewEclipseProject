package seleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework7 {

	public static void main(String[] args) throws IOException {
		
		File src= new File("C:\\Users\\Pedro\\Documents\\Selenium\\ExcelFiles\\OrangeHRM.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook getWorkbook= new XSSFWorkbook(fis);
		
		XSSFSheet getSheet= getWorkbook.getSheet("Login");
		
		XSSFRow getRow= getSheet.getRow(0);
		
		XSSFCell getCell= getRow.getCell(0);
		
		String value = getCell.getStringCellValue();
		
		System.out.println(value);
		
	int totalRows = getSheet.getLastRowNum();
		System.out.println(totalRows);
		for(int i=0;i<totalRows;i++) {
			System.out.println(getSheet.getRow(0).getCell(0).getStringCellValue());
			System.out.println(getSheet.getRow(0).getCell(1).getStringCellValue());
			System.out.println(getSheet.getRow(1).getCell(0).getStringCellValue());
			System.out.println(getSheet.getRow(1).getCell(1).getStringCellValue());
						
			
			
			}
	}
}

		
		
		
		
		
		
		
		

		 
	



