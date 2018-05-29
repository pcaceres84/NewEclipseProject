import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classTweleve {

	public static void main(String[] args) throws IOException {
		
		//import the properties class
		//Step 1
		Properties myProp= new Properties();
		
		//Step 2
		//Provide the location of the properties inside the FileInputStream
		FileInputStream src= new FileInputStream("C:\\Users\\Pedro\\eclipse-workspace\\Class12\\file.properties");
		
		//Step 3
		myProp.load(src);
		
		if(myProp.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe");
			
			WebDriver driver= new FirefoxDriver();
			
			driver.get(myProp.getProperty("url"));
			driver.get(myProp.getProperty("username"))
		
		}else {
			System.out.println("Write Code");
		
		
		}
			
	}			
		
}			
			
		
		
		
		
		
		
		
		
	

