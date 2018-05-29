package pageFactoryCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class freeCRMFour {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(how=How.NAME,using="password")WebElement password;
	@FindBy(xpath="//input[@class='btn btn-small']")WebElement login;
	@FindBy(xpath="//a[@title='Calendar']")WebElement calendar;
	@FindBy(xpath="//a[@title='New Event']")WebElement event;
	@FindBy(xpath="//input[@id='title']")WebElement title;
	@FindBy(xpath="//input[@id='fieldId_start']")WebElement from;
	@FindBy(xpath="//input[@id='fieldId_end']")WebElement end;
	@FindBy(xpath="//select[@name='category']")WebElement category;
	@FindBy(xpath="//input[@value='N']")WebElement confirm;
	@FindBy(xpath="//select[@name='reminder_minutes']")WebElement reminder;
	@FindBy(xpath="//input[@id='tags']")WebElement tag;
	@FindBy(xpath="//textarea[@name='location']")WebElement location;
	@FindBy(xpath="//textarea[@id='notes']")WebElement notes;
	@FindBy(xpath="//textarea[@id='meeting_notes']")WebElement minutes;
	
	public freeCRMFour(WebDriver driver) {
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
	
	public void calendarField() {
		calendar.click();
	}
	
	public void eventField() {
		event.click();
	}
	public void titleField(String TTL) {
		title.sendKeys(TTL);
	}
	
	public void fromField(String frm) {
		from.sendKeys(frm);
	}
	
	public void endField(String en) {
		end.sendKeys(en);
	}
	
	public void categoryField() {
		category.click();
	}
	public void confirmField() {
		confirm.click();
	}
	
	public void reminderField() {
		reminder.click();
	}
	
	public void tagField(String tg) {
		tag.sendKeys(tg);
	}
	public void locationField(String loc) {
		location.sendKeys(loc);
	}
	
	public void notesField(String not) {
		notes.sendKeys(not);
	}
	
	public void minutesField(String min) {
		minutes.sendKeys(min);
	}
	
	
		
	}
	
	
	
	