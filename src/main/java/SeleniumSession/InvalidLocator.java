package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
//		driver.findElement(By.xpath("////input[@@@id='name']")).sendKeys("testing");
		  //InvalidSelectorException
		
//		driver.findElement(By.xpath("//input[@id='naveenAutomation']")).sendKeys("testing");
		  //NoSuchElementException
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
