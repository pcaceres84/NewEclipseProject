package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMPractice {
	
	WebDriver driver;
	
	By nameField= By.xpath("//input[@id='ap_customer_name']");
	By emailField= By.xpath("//input[@id='ap_email']");
	By passwordField= By.xpath("//input[@id='ap_password']");
	By password2Field= By.xpath("//input[@name='passwordCheck']");
	By createButton= By.xpath("//input[@id='continue']");
	
	public POMPractice(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void name(String fullName) {
		driver.findElement(nameField).sendKeys(fullName);
	}
 
	public void email(String emailID) {
		driver.findElement(emailField).sendKeys(emailID);
	}
	
	public void password(String pass) {
	driver.findElement(passwordField).sendKeys(pass);
	
}
	public void password2(String pass2) {
		driver.findElement(password2Field).sendKeys(pass2);
	}

	public void createB() {
	driver.findElement(createButton).click();
	}

}
	
	
