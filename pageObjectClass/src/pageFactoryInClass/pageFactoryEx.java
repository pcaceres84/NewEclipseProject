package pageFactoryInClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageFactoryEx {
	
	WebDriver driver;
	
	@CacheLookup
	@FindBy(id="txtUsername")WebElement username;
	@CacheLookup
	@FindBy(how=How.NAME,using="txtPassword")WebElement password;
	@CacheLookup
	@FindBy(how=How.NAME,using="Submit")WebElement login;
	
	public pageFactoryEx(WebDriver driver) {
		this.driver= driver;
		
	}
	public void usernameField(String uid) {
		username.sendKeys(uid);
	}
	
	public void passwordField(String passid) {
		password.sendKeys(passid);
	}
	
	public void loginButton() {
		login.click();
	}
	
	
	

}
