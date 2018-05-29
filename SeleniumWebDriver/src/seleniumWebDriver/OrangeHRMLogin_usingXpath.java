package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin_usingXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		driver.findElement(By.xpath("//a[.='PIM']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pedro");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Caceres");
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		
		
		
		
		
		
	

	}

}
