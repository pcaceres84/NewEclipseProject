package TestCases2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {

	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("qa.syntaxlive.com//home");
}
	@AfterMethod()
	public void quitBrowser() {
		driver.quit();
	}
}