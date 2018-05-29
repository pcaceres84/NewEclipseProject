package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithElements {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		
		//Opens new chrome window
		WebDriver driver= new ChromeDriver();
		
		//navigate to the orange hrm
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		//enter username
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		//enter password
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		//click on login button
		driver.findElement(By.name("Submit")).click();
		
		//click on PIM link
		driver.findElement(By.linkText("PIM")).click();
		
		//click on add employee
		driver.findElement(By.partialLinkText("Add Emp")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Pedro");
		
		driver.findElement(By.name("middleName")).sendKeys("A");
		
		driver.findElement(By.name("lastName")).sendKeys("Caceres");
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.name("employeeID")).clear();
		
		
	
		driver.findElement(By.name("employeeID")).sendKeys("0009");
		
		if (driver.findElement(By.id("chkLogin")).isSelected()) {
		
		}else
			driver.findElement(By.id("chkLogin")).click();
	
		
		driver.findElement(By.id("chkLogin")).click();
		
		
		
		
		
		
	}

}
