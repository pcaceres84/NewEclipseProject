package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkEbay {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Galaxy S7 Case");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector(
				"a[title='Click this link to access Samsung Galaxy S7 Caseology® [WAVELENGTH] Shockproof Slim Bumper Case Cover']"))
				.click();
		driver.findElement(By.cssSelector("select[name='Color']")).click();
		driver.findElement(By.cssSelector("option[selected='selected']")).click();
		driver.findElement(By.cssSelector("option[id='msku-opt-1']")).click();
		driver.findElement(By.cssSelector("a[id='binBtn_btn']")).click();

	}

}
