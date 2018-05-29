package testCaseCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryCRM.freeCRMFour;

public class freeCRMTestCase4 {
	
	@Test
	public void CRMLogin4() {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		
		freeCRMFour login4= PageFactory.initElements(driver, freeCRMFour.class);
		
		
		login4.usernameField("pcaceres84");
		login4.passwordField("syntax1");
		login4.loginField();
		login4.calendarField();
		login4.eventField();
		login4.titleField("XYZ");
		login4.fromField("04-May-2018 21:53");
		login4.endField("04-May-2018 22:53");
		login4.categoryField();
		login4.confirmField();
		login4.reminderField();
		login4.tagField("abc");
		login4.locationField("abc");
		login4.notesField("abc");
		login4.minutesField("30 Minutes");
	}
	

}
