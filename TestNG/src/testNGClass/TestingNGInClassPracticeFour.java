package testNGClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingNGInClassPracticeFour {
	
	public static WebDriver driver;
	
	@Test
	public void program1() {
		System.out.println("This is a program 1....");
	
	}
	
	@Test
	public void program2() {
		System.out.println("This is a program 2....");
		//Assert.assertEquals(12, 13);
	
	}
	
	@Test
	public void program3() {
		System.out.println("This is a program 3.....");
		
	}

}
