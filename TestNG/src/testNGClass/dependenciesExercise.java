package testNGClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependenciesExercise {
	
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");

		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	
	}
	
	@Test
	public void validCredentials() {
		
	}
	
	

}
