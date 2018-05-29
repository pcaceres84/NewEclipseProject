package testNGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework8 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void hwEightmethod() {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		 
		
	}
	
	@Test
	public void amazonTest() {
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPad");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//select[@id='sort']")).click();
		driver.findElement(By.xpath("//option[@value='date-desc-rank']")).click();
		
		
	}
	
	@AfterMethod
		public void quitBrowser() {
			driver.quit();
}
}
	
