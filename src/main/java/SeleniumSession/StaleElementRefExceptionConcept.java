package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//DOM v1
	
		WebElement fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("naveen123@gmail.com");
		
		driver.navigate().refresh();//DOM v2
		
	//	fn.sendKeys("jasprit123@gmail.com");
		   //StaleElementReferenceException
		
		fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("jasprit123@gmail.com");

		
	//click,back,forward,refresh	
				
		
		
	}

}
