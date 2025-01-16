package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailId = driver.findElement(By.id("input-email"));//Dom v1
		
		emailId.sendKeys("naveen@gmail.com"); //Dom v1
		
//		driver.navigate().refresh();//Dom v2 - new Dom
		//back/fwd
		//click on link/element
		//page is loaded/ refreshed
		  //always asked for new webElement ,solution = create By locator and used it into Element util
		
		driver.findElement(By.tagName("Register")).click();
		driver.navigate().back();//back to login page

    	emailId = driver.findElement(By.id("input-email"));//Dom v2
		
		emailId.sendKeys("tom@gmail.com");//Dom v2
		

	
		
		
		
		
		
		
	}

}
