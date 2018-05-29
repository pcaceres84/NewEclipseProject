package seleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InClassExcelDynamic {
//to make the class object dynamic we have to declare globally
	
	public static File writingFile;
	public static FileInputStream fis;
	public static XSSFWorkbook writingWB;
	public static XSSFSheet writingSheet;
	public static XSSFRow gtRow;
	public static XSSFCell gtCell;
	public static FileOutputStream fout;
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		String value = dataWrite(0,1);
		System.out.println(value);
		
		writingSheet.getRow(1).createCell(2).setCellValue("Pass");
		fout= new FileOutputStream(writingFile);
		writingWB.write(fout);
		writingWB.close(); 
		
		
		
		


	}
	
	public static String dataWrite(int row, int col) throws IOException {
		
		//Step 1
		writingFile = new File("C:\\Users\\Pedro\\Documents\\Selenium\\ExcelFiles\\sample.xlsx");
		fis = new FileInputStream(writingFile);
		
		//Step 2
		writingWB= new XSSFWorkbook(fis);
		
		//Step 3
		writingSheet= writingWB.getSheet("Sheet1");
		
		//Step 4
		gtRow = writingSheet.getRow(0);
		
		//Step 5
		gtCell= gtRow.getCell(0);
		
		
		
		return gtCell.getStringCellValue();
		
	
		
		
		
		
		
		
		}

}
