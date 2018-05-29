package seleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GroupStudiesWritingExcel {

	public static void main(String[] args) throws IOException {
		File src= new File("C:\\Users\\Pedro\\Documents\\Selenium\\ExcelFiles\\GroupStudiesWriteExcel.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook getWorkbook= new XSSFWorkbook(fis);
		XSSFSheet getSheet= getWorkbook.getSheet("Sheet1");
		XSSFRow getRow= getSheet.createRow(2);
		XSSFCell getCell= getRow.createCell(1);
		
		
	}

}
