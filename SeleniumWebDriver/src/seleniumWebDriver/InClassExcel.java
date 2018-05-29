package seleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InClassExcel {
	
	
	public static void main(String[] args) throws IOException {
		
		//Step 1: Providing file path inside
		 File fileSource= new File("C:\\Users\\Pedro\\Documents\\Selenium\\ExcelFiles\\TestData.xlsx");
		 FileInputStream fis = new FileInputStream(fileSource);
		 
		 //Step 2: Take Control of the workbook, in this case it is an excel file
		XSSFWorkbook getWorkbook = new XSSFWorkbook(fis);
		 
		 //Step 3: We have to access the sheet
		 XSSFSheet getSheet= getWorkbook.getSheet("Sheet1");
		 
		 //Step 4: get the row
		 XSSFRow getRow = getSheet.getRow(0);
		
		 
		 
		
		 //Step 5: get the cell
		 XSSFCell getCell= getRow.getCell(0);
		 
		 //Step 6: get the Value
		 String value= getCell.getStringCellValue();
		 
		 //Print out the value
		 System.out.println(value);
		 
		 System.out.println(getSheet.getLastRowNum());
		 
		 int totalRows = getSheet.getLastRowNum();
		 for(int i=0; i <totalRows;i++) {
		 System.out.println(getSheet.getRow(i).getCell(0).getStringCellValue());
			 
			 
			 
		 }
		 
		 }
	
	
		
		
		
	
}