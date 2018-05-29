package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework9TestCase {
	WebDriver driver;
	
	@Test
	public void OrangeLogin() {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		homework9OrangeHRM login= new homework9OrangeHRM(driver);
		
		login.username("admin");
		login.password("admin");
		login.login();
		login.pim();
		login.addemployee();
		login.firstName("Pedro");
		login.lastName("Caceres");
		login.empId("0123456");
		login.btnSave();
	}

}
