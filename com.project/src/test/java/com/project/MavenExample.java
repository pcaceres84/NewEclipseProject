package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class MavenExample {
	
	WebDriver driver;
	
	
	@Test
	public void mavenTest() {
	
		System.setProperty("phantomjs.binary.path","C:\\Users\\Pedro\\Documents\\Selenium\\Drivers\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		driver= new PhantomJSDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
		
//		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://google.com");
//		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
		
//		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
		
		
		
		
		
		String title= driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		
		
	
	System.out.println("Hello -----");
	
	}
	
	
	
		
	}

