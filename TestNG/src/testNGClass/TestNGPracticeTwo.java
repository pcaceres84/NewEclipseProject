package testNGClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPracticeTwo {
	
//	@Test
//	public void classNGmethod() {
//		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
//		WebDriver driver= new ChromeDriver();
//		driver.get("http://www.google.com");
	
		
	
	
	@Test(priority=1)
	public void bProgram() {
		System.out.println("This is a B method");

	}

	@Test(priority=3)
	public void aProgram() {
		System.out.println("This is a A method");

	}

	@Test(priority=2)
	public void cProgram() {
		System.out.println("This is a C method");
		//Assert.assertEquals(12, 13);
		

	}
}
	
	
