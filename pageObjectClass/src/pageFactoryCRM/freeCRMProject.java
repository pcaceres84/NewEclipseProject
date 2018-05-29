package pageFactoryCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class freeCRMProject {
	
	WebDriver driver;
	
	@FindBy(xpath="//img[@alt='free crm logo']")WebElement logo;
	@FindBy(xpath="//small[contains(.,'Forgot Password?')]")WebElement forgotPass;
	@FindBy(xpath="//button[@class='btn']")WebElement signUp;
	@FindBy(xpath="//a[@href='https://www.freecrm.com/features.html']")WebElement features;
	@FindBy(xpath="//a[contains(.,'Pricing')]")WebElement pricing;
	@FindBy(xpath="//a[contains(.,'Customers')]")WebElement customers;
	@FindBy(xpath="//a[contains(.,'Contact')]")WebElement contact;
	@FindBy(xpath="//div[@class='collapse navbar-collapse']")WebElement header;
	@FindBy(xpath="//section[@id='footer']")WebElement footer;
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(how=How.NAME,using="password")WebElement password;
	@FindBy(xpath="//input[@class='btn btn-small']")WebElement login;
	
	public freeCRMProject(WebDriver driver) {
		this.driver= driver;
		
	}
	
	 public void logoField() {
	 logo.isDisplayed();
	 Assert.assertEquals(true, logo.isDisplayed());
		
	}
	 
	public void forgotField() {
		forgotPass.isDisplayed();
		Assert.assertEquals(true, forgotPass.isDisplayed());
	}
	
	public void signUpField() {
		signUp.isDisplayed();
		Assert.assertEquals(true, signUp.isDisplayed());
	}
	
	public void featuresField() {
		features.isDisplayed();
		Assert.assertEquals(true, features.isDisplayed());
	}
	
	public void pricingField() {
		pricing.isDisplayed();
		Assert.assertEquals(true, pricing.isDisplayed());
	}
	
	public void customersField() {
		customers.isDisplayed();
		Assert.assertEquals(true, customers.isDisplayed());
	}
	
	public void contactField() {
		contact.isDisplayed();
		Assert.assertEquals(true, contact.isDisplayed());
	}
	
	public void headerField() {
		header.isDisplayed();
		Assert.assertEquals(true, header.isDisplayed());
	}
	
	public void footerField() {
		footer.isDisplayed();
		Assert.assertEquals(true, footer.isDisplayed());
	}
	
	public void usernameField(String user) {
		username.sendKeys(user);
	}
	
	public void passwordField(String pass) {
		password.sendKeys(pass);
	}
	
	public void loginField() {
		login.click();
	}
	
	
	
	
	

}
