package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionWithFEs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> frw =  driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
		for(int i=0;i<frw.size();i++) {
			frw.get(i).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
