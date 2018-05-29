package testCaseCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryCRM.freeCRMThree;

public class freeCRMTestCase3 {
	
	@Test
	public void freeCRMlogin3() {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		freeCRMThree login3= PageFactory.initElements(driver, freeCRMThree.class);
		
		login3.usernameField("pcaceres84");
		login3.passwordField("syntax1");
		login3.loginField();
		login3.companiesField();
		login3.companyField();
		login3.companyNameField("ABC Plumbing");
		login3.industryField("Plumbing");
		login3.revenueField("50 Mil");
		login3.employeeField("100");
		login3.stautsField();
		login3.categoryField();
		login3.priorityField();
		login3.sourceField();
		login3.indentifierField("450");
		login3.taxNumberField("50");
		login3.addressField("Title");
		
		
		
		
	}

}
