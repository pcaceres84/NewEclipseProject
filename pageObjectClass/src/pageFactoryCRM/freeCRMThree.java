package pageFactoryCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class freeCRMThree {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(how=How.NAME,using="password")WebElement password;
	@FindBy(xpath="//input[@class='btn btn-small']")WebElement login;
	@FindBy(xpath="//a[@href='https://www.freecrm.com/system/index.cfm?action=client']")WebElement companies;
	@FindBy(xpath="//a[@title='New Company']")WebElement company;
	@FindBy(xpath="//input[@id='company_name']")WebElement companyName;
	@FindBy(xpath="//input[@name='industry']")WebElement industry;
	@FindBy(xpath="//input[@id='annual_revenue']")WebElement revenue;
	@FindBy(xpath="//input[@id='num_of_employees']")WebElement employees;
	@FindBy(xpath="//select[@name='status']")WebElement status;
	@FindBy(xpath="//select[@name='category']")WebElement category;
	@FindBy(xpath="//select[@name='priority']")WebElement priority;
	@FindBy(xpath="//select[@name='source']")WebElement source;
	@FindBy(xpath="//input[@name='identifier']")WebElement identifier;
	@FindBy(xpath="//input[@id='vat_number']")WebElement taxNumber;
	@FindBy(xpath="//input[@name='address_title']")WebElement address;
	
	
	
	
	
	public freeCRMThree(WebDriver driver) {
		this.driver=driver;
		
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
	
	public void companiesField() {
		companies.isSelected();
	}
	
	public void companyField() {
		company.click();
	}
	public void companyNameField(String cname) {
		companyName.sendKeys(cname);
	}
	
	public void industryField(String ind) {
		industry.sendKeys(ind);
		
	}
	
	public void revenueField(String rev) {
		revenue.sendKeys(rev);
	}
	public void employeeField(String emp) {
		employees.sendKeys(emp);
	}
	
	public void stautsField() {
		status.click();
		
	}
	
	public void categoryField() {
		status.click();
		
	}
	
	public void priorityField() {
		priority.click();
	}
	
	public void sourceField() {
		source.click();
	}
	
	public void indentifierField(String ID) {
		identifier.sendKeys(ID);
	}
	
	public void taxNumberField(String tax) {
		taxNumber.sendKeys(tax);
	}
	
	public void addressField(String add) {
		address.sendKeys(add);
	}
	
	
	
}

