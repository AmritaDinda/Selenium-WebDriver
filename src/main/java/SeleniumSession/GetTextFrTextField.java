package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFrTextField {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		WebElement fn = driver.findElement(By.id("input-firstname"));
		fn.sendKeys("NaveenAutomationLab");
		String text = fn.getAttribute("value");	
		System.out.println(text);
		
		
//		WebElement ln = driver.findElement(By.id("input-lastname"));
//		ln.sendKeys(null);//IllegalArgumentException: Keys to send should be a not null

		
				
		
	}

}
