package testCaseCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryCRM.freeCRMProject;

public class freeCRMTestCase {
	
	@Test
	public void CRMLogin() {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		freeCRMProject projectCRM= PageFactory.initElements(driver, freeCRMProject.class );
		
		projectCRM.logoField();
		projectCRM.forgotField();
		projectCRM.signUpField();
		projectCRM.featuresField();
		projectCRM.pricingField();
		projectCRM.customersField();
		projectCRM.contactField();
		projectCRM.headerField();
		projectCRM.footerField();
		projectCRM.usernameField("pcaceres84");
		projectCRM.passwordField("syntax1");
		projectCRM.loginField();
		
		
		
		
		
		
	}

}
