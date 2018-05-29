package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		
		
		
	}

}
