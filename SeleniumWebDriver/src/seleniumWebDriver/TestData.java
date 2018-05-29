package seleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class TestData {

	public static void main(String[] args) throws IOException {
		
		File src= new File("C:\\Users\\Pedro\\Documents\\Selenium\\ExcelFiles\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout= new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
