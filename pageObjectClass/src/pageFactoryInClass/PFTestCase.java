package pageFactoryInClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PFTestCase {
	@Test
	public void testLogin() {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		pageFactoryEx loginPF= PageFactory.initElements(driver, pageFactoryEx.class);
		
		loginPF.usernameField("admin");
		loginPF.passwordField("admin");
		loginPF.loginButton();
		
		
	}

}
