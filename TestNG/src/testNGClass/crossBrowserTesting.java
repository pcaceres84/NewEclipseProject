package testNGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	WebDriver driver;
	
	
	@Test
	@Parameters("browser")
	public void verifyPage(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
			driver=new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
		
		}else {
			System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
			driver= new ChromeDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
			
		}
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[contains(.,'Recruitment')]")).click();
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@name='addCandidate[firstName]']")).sendKeys("Pedro");
		driver.findElement(By.xpath("//input[@name='addCandidate[middleName]']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")).sendKeys("Caceres");
		driver.findElement(By.xpath("//input[@name='addCandidate[email]']")).sendKeys("mail@gmail.com");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		
		
		
		
	}

}
