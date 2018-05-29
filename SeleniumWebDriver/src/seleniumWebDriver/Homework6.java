package seleniumWebDriver;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework6 {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String parent= driver.getWindowHandle();
		
		System.out.println("Parent window is is" +parent);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
		
		Set <String> allWindows = driver.getWindowHandles();
		
		int count= allWindows.size();
		
		System.out.println("Total windows " +count);
		
		for (String child:allWindows) {
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				
				driver.get("http://toolsqa.com/automation-practice-switch-windows/");
				
				driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button"));
				
				Thread.sleep(3000);
				
				driver.close();
			
				}
				
				}
		
		driver.switchTo().window(parent);
		
		System.out.println("Parent window title is " +driver.getTitle());
		
		
		}
		
		
		
	

		
		
		
		
		
	}
		
		
				
		
	
	




			
			
		
	


				
					
				
			
			
			
		
				
		
		
	


