package testNGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homework9 {
	
	WebDriver driver;
	
	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		driver = new ChromeDriver(); 
		driver.get("https://www.ebates.com/");
	}

	@Test(dataProvider = "Login")
	public void loginWithProvider(String email, String password) {
		driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		

	}

@DataProvider(name= "Login")
public Object [][] test(){
	
	Object [][] test= new Object [1][2];
	
	test [0][0]= "mail@gmail.com";
	test [0][1]= "password1";
	
	return test;
}
	
		


//@AfterTest
//public void quitBrowser() {
	//driver.quit();
	
	
}



	

