package seleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritePractice {

	public static void main(String[] args) throws IOException {
		
		File src= new File("C:\\Users\\Pedro\\Documents\\Selenium\\ExcelFiles\\ExcelReadPractice.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook getWorkbook= new XSSFWorkbook(fis);
		
		XSSFSheet getSheet= getWorkbook.getSheet("Employees");
		
		getSheet.getRow(1).createCell(4).setCellValue("Pass");
		getSheet.getRow(2).createCell(4).setCellValue("Fail");
		
		FileOutputStream fout= new FileOutputStream(src);
		
		getWorkbook.write(fout);
		
		getWorkbook.close();
		
		

	}

}
