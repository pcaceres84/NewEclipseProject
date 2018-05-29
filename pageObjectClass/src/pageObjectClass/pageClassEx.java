package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageClassEx {
	WebDriver driver;
	
	By usernameField= By.name("txtUsername");
	By passwordField= By.id("txtPassword");
	By loginButton= By.name("Submit");
	By clickRecruitment= By.xpath("//b[contains(.,'Recruitment')]");
	By addButton= By.id("btnAdd");
	By firstNameField= By.id("addCandidate_firstName");
	By lastNameField= By.id("addCandidate_lastName");
	By emailField= By.id("addCandidate_email");
	By saveButton= By.id("btnSave");
	
	
	
	
	//*the below piece of code is a constructor
	//*constructor does not return a value
	//*it has the same name as the class name
	
	
	public pageClassEx(WebDriver driver) {
		this.driver= driver;
		}
	
	public void username() {
		driver.findElement(usernameField).sendKeys("admin");
	}
	
	public void password() {
		driver.findElement(passwordField).sendKeys("admin");
		
	}
		public void clickLogin() {
		driver.findElement(loginButton).click();
		
		}
	
	public void clickRec() {
		driver.findElement(clickRecruitment).click();
	}
	
	public void clickAdd() {
		driver.findElement(addButton).click();
	}
	
	public void firstname() {
		driver.findElement(firstNameField).sendKeys("Pedro");
	
	}
	
	public void lastname() {
		driver.findElement(lastNameField).sendKeys("Caceres");
		
	}
	
	public void emailID() {
		driver.findElement(emailField).sendKeys("mail@gmail.com");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
	}
	
		
		
	}
