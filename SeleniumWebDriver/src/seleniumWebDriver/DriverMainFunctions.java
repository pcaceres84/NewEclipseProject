package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverMainFunctions {

		
		public static WebDriver getWebDriver(String browser) {
			WebDriver driver;
		
			
			
			
			switch(browser.toLowerCase()) {
			
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
				driver=new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
				driver=new FirefoxDriver();
				break;
				default:
					System.out.println("Browser not found");
					driver=null;
					
				}
			return driver;
		}
		
//		public int sum(int a, int b) {
//			return a+b;
//			
			
		
		
	
	
}



		
		
	



