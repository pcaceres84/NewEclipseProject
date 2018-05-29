package testCaseCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryCRM.freeCRMTwo;

public class freeCRMTestCase2 {
	
	@Test
	public void freeCRMlogin() {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		freeCRMTwo projectCRM2= PageFactory.initElements(driver, freeCRMTwo.class);
		
		projectCRM2.usernameField("pcaceres84");
		projectCRM2.passwordField("syntax1");
		projectCRM2.loginField();
		projectCRM2.addBoxesField();
		projectCRM2.shortlistField();
		projectCRM2.createField();
		projectCRM2.pipelineField();
		projectCRM2.timelineField();
		projectCRM2.alertsField();
		projectCRM2.messagesField();
		projectCRM2.customField();
		projectCRM2.scheduleField();
		projectCRM2.listField();
		projectCRM2.mailField();
		projectCRM2.productsField();
		projectCRM2.promotionsField();
		projectCRM2.resourcesField();
		projectCRM2.knowledgeField();
		projectCRM2.teamField();
		projectCRM2.importField();
		projectCRM2.exportField();
		projectCRM2.salesField();
		projectCRM2.preferencesField();
		projectCRM2.auditField();
		projectCRM2.blogField();
		
		
	}

}
