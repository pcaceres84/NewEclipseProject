package testNGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterXML {
	
	WebDriver driver;
	
	
	@Test
	@Parameters({"username","password","firstname","middlename","lastname"})
	public void openBrowser(String user,String pass,String first, String middle, String last) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[contains(.,'Recruitment')]")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@name='addCandidate[firstName]']")).sendKeys(first);
		driver.findElement(By.xpath("//input[@name='addCandidate[middleName]']")).sendKeys(middle);
		driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")).sendKeys(last);
		
		
	}
	
	
//		public void param(String Admin, String admin) {
//		System.out.println("The username is:" + Admin);
//		System.out.println("The password is:"+ admin);
//		
		
		
		
	
	
}


	
		
		


