package testNGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGInClassPracticeThree {
	public static WebDriver driver;

	@BeforeMethod
	public void classNGmethod() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

	@Test
	public void testGoogle() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("syntax technologies....");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		

	}
	
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
