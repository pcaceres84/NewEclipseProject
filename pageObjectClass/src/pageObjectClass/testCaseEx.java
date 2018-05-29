package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCaseEx {
	@Test
	public void testLogin() {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
		pageClassEx loginEx = new pageClassEx(driver);
		
		loginEx.username();
		loginEx.password();
		loginEx.clickLogin();
		loginEx.clickRec();
		loginEx.clickAdd();
		loginEx.firstname();
		loginEx.lastname();
		loginEx.emailID();
		loginEx.clickSave();
		
		
	}

}
