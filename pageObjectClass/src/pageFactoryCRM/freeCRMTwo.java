package pageFactoryCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class freeCRMTwo {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(how=How.NAME,using="password")WebElement password;
	@FindBy(xpath="//input[@class='btn btn-small']")WebElement login;
	@FindBy(xpath="//a[@onclick='addHomeBoxPanel();']")WebElement addBoxes;
	@FindBy(xpath="//a[@onclick='expandPanel(this);']")WebElement shorlist;
	@FindBy(xpath="//a[@onclick='quickCreatePanel();']")WebElement create;
	@FindBy(xpath="//a[@title='Pipeline']")WebElement pipeline;
	@FindBy(xpath="//a[@title='Timeline']")WebElement timeline;
	@FindBy(xpath="//a[@title='Alerts']")WebElement alerts;
	@FindBy(xpath="//a[@title='Messages']")WebElement messages;
	@FindBy(xpath="//a[@title='Custom Views']")WebElement custom;
	@FindBy(xpath="//a[@title='Schedule Call']")WebElement schedule;
	@FindBy(xpath="//a[@title='Call List']")WebElement list;
	@FindBy(xpath="//a[@title='Mail Accounts']")WebElement mail;
	@FindBy(xpath="//a[@title='Products']")WebElement products;
	@FindBy(xpath="//a[@title='Promotions']")WebElement promotions;
	@FindBy(xpath="//a[@title='Resources']")WebElement resources;
	@FindBy(xpath="//a[@title='Knowledge Base']")WebElement knowledge;
	@FindBy(xpath="//a[@title='Team View']")WebElement team;
	@FindBy(xpath="//a[@title='Import']")WebElement import1;
	@FindBy(xpath="//a[@title='Export']")WebElement export;
	@FindBy(xpath="//a[@title='Sales Targets']")WebElement sales;
	@FindBy(xpath="//a[@title='Preferences']")WebElement preferences;
	@FindBy(xpath="//a[@title='Audit Trail']")WebElement audit;
	@FindBy(xpath="//a[@title='Blog']")WebElement blog;
	
	
	public freeCRMTwo (WebDriver driver) {
		this.driver= driver;
		
		
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
	
	
	 
	  public void addBoxesField() {
		 addBoxes.isDisplayed();
		 Assert.assertEquals(true, addBoxes.isDisplayed());
	 }
	
	 public void shortlistField() {
		 shorlist.isDisplayed();
		 Assert.assertEquals(true, shorlist.isDisplayed());
	 }
	 
	 public void createField() {
		 create.isDisplayed();
		 Assert.assertEquals(true, create.isDisplayed());
	 }
	 
	 public void pipelineField() {
		 pipeline.isDisplayed();
		 Assert.assertEquals(true, pipeline.isDisplayed());
	 }
	 
	 public void timelineField() {
		 timeline.isDisplayed();
		 Assert.assertEquals(true, timeline.isDisplayed());
		 
	 }
	 
	 public void alertsField() {
		 alerts.isDisplayed();
		 Assert.assertEquals(true, alerts.isDisplayed());
	 }
	 
	 public void messagesField() {
		 messages.isDisplayed();
		 Assert.assertEquals(true, messages.isDisplayed());
	 }
	 
	 public void customField() {
		 custom.isDisplayed();
		 Assert.assertEquals(true, custom.isDisplayed());
	 }
	  public void scheduleField() {
		  schedule.isDisplayed();
		  Assert.assertEquals(true, schedule.isDisplayed());
	  }
	  
	  public void listField() {
		  list.isDisplayed();
		  Assert.assertEquals(true, list.isDisplayed());
	  }
	  
	  public void mailField() {
		 mail.isDisplayed();
		 Assert.assertEquals(true, mail.isDisplayed());
			
		 }
	  
	  public void productsField() {
		  products.isDisplayed();
		  Assert.assertEquals(true, products.isDisplayed());
	  }
	  
	  public void promotionsField() {
		  promotions.isDisplayed();
		  Assert.assertEquals(true, promotions.isDisplayed());
	  }
	  
	  public void resourcesField() {
		  resources.isDisplayed();
		  Assert.assertEquals(true, resources.isDisplayed());
	  }
	  
	  public void knowledgeField() {
		  knowledge.isDisplayed();
		  Assert.assertEquals(true, knowledge.isDisplayed());
	  }
	  
	  public void teamField() {
		  team.isDisplayed();
		  Assert.assertEquals(true, team.isDisplayed());
	  }
	  
	  public void importField() {
		  import1.isDisplayed();
		  Assert.assertEquals(true, import1.isDisplayed());
	  }
	  
	  public void exportField() {
		  export.isDisplayed();
		  Assert.assertEquals(true, export.isDisplayed());
	  }
	  
	  public void salesField() {
		  sales.isDisplayed();
		  Assert.assertEquals(true, sales.isDisplayed());
	  }
	  
	  public void preferencesField() {
		  preferences.isDisplayed();
		  Assert.assertEquals(true,  preferences.isDisplayed());
	  }
	  
	  public void auditField() {
		  audit.isDisplayed();
		  Assert.assertEquals(true, audit.isDisplayed());
	  }
	  
	  public void blogField() {
		  blog.isDisplayed();
		  Assert.assertEquals(true, blog.isDisplayed());
	  }
	  
	  
	  }
	
	
	
	
	

