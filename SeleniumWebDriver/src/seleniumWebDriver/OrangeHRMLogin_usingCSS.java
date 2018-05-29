package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLogin_usingCSS {

	public static void main(String[] args) {
		
		WebDriver driver= DriverMainFunctions.getWebDriver("chrome");
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		// xpath//tagName[@attribute='value']
		// css    tagName[attributes='value']
		// enter UID
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='btnLogin'")).click();
		driver.findElement(By.cssSelector("a[id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.cssSelector("a[id='menu_pim_addEmployee']")).click();
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Pedro");
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Caceres");
		driver.findElement(By.cssSelector("input[id='btnSave']")).click();
				
				
		
		
		
		
		

	}

}
