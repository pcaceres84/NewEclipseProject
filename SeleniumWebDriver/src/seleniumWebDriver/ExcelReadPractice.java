package seleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadPractice {

	public static void main(String[] args) throws IOException {
		
		File src= new File("C:\\Users\\Pedro\\Documents\\Selenium\\ExcelFiles\\ExcelReadPractice.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook getWorkbook= new XSSFWorkbook(fis);
		
		XSSFSheet getSheet= getWorkbook.getSheet("Employees");
		
		XSSFRow getRow= getSheet.getRow(4);
		
		XSSFCell getCell= getRow.getCell(4);
		
		String value= getCell.getStringCellValue();
		 
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
