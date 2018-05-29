package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		
		//set chrome diver path
		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		
		//open new chrome window
		WebDriver driver=new ChromeDriver();
		
		//navigates to the Google.com
		driver.get("http://google.com");
		
		//gets and prints page title
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		
	}

}
