package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCharSequenceConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement email = driver.findElement(By.id("input-email"));
		
		//StringBuilder,StringBuffer,String,Key
		StringBuilder username = new StringBuilder()
				.append("naveen")
				.append(" ")
				.append("automation")
				.append(" ")
				.append("labs")
				.append(" ")
				.append("Selenium");
			
		String space = " ";
		
		StringBuffer userInfo = new StringBuffer()
				.append("Test")
				.append(" ")
				.append("WebDriver");
		
		String author = "Naveen Khunteta";
		
		email.sendKeys(username,space,userInfo,author,Keys.TAB);

		
		
	}

}
