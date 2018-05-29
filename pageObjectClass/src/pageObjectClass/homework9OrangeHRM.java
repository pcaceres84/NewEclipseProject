package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homework9OrangeHRM {
	
	WebDriver driver;
	 
	By username = By.id("txtUsername");
	By password= By.id("txtPassword");
	By login= By.name("Submit");
	By PIM= By.linkText("PIM");
	By AddEmp= By.linkText("Add Employee");
	By FirstName= By.name("firstName");
	By LastName= By.name("lastName");
	By Eid= By.name("employeeId");
	By BtnSave= By.id("btnSave");
	
	
	public homework9OrangeHRM(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void username(String Uname) {
		driver.findElement(username).sendKeys(Uname);
	}
			
	public void password(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void login() {
		driver.findElement(login).click();
	}
	
	public void pim() {
		driver.findElement(PIM).click(); 
	}
	
	public void addemployee() {
		driver.findElement(AddEmp).click();
	}
	
	public void firstName(String Fname) {
		driver.findElement(FirstName).sendKeys(Fname);
	}

	public void lastName(String Lname) {
		driver.findElement(LastName).sendKeys(Lname);
	}
	
	public void empId(String EID) {
		driver.findElement(Eid).clear();
		driver.findElement(Eid).sendKeys(EID);
	}
	
	public void btnSave() {
		driver.findElement(BtnSave).click();
	}
}
