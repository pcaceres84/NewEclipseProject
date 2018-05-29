package seleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMLogin {

	
	
	public void OrangeLogin() {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("http://opensource.demo.orangehrmlive.com/");
		
		 driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		 driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		 driver.findElement(By.name("Submit")).click();
		 
		 driver.findElement(By.linkText("PIM")).click();
		 
		 driver.findElement(By.partialLinkText("Add Emp")).click();
		 
		 driver.findElement(By.name("firstName")).sendKeys("Pedro");
		 
		 driver.findElement(By.name("lastName")).sendKeys("Caceres");
		 
		 driver.findElement(By.id("btnSave")).click();
		 
		 String profileURL= driver.getCurrentUrl();
		 
		 System.out.println("The link to the profile is:"+profileURL);
		 
//		 driver.findElement(By.xpath("//input[@value='Edit']")).click();
//		 driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).clear();
//		 driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).sendKeys("2018-04-11");
		 
		 
		// driver.findElement(By.className("ui-datepicker-month")).click();
		 //driver.findElement(By.xpath("//input[@option='Apr']")).click();
		 
		 
		// driver.findElement(By.xpath("//input[@value='1984'")).click();
		 
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 
		 
		 
		 
		WebElement nationality = driver.findElement(By.id("personal_cmbNation"));
		Select nationalityDropDownSelect = new Select(nationality);

		WebElement selectedValue = nationalityDropDownSelect.getFirstSelectedOption();
		System.out.println(selectedValue.getText());

		List<WebElement> nationalityList = nationalityDropDownSelect.getOptions();

		int totalNationality = nationalityList.size();
		System.out.println(totalNationality);

		for (WebElement eleLoop : nationalityList) {
			String nationalityName = eleLoop.getText();
			System.out.println(nationalityName);
			
		
		
		
			
			
			
	
		}

		}

	}
	


