package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestCases2.base;

public class exampleTestBase extends base {
	
	
	
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("editor");
		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("Welcome1");
		driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	}

}
