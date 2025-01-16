package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImage {
	
	static	WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imglist = driver.findElements(By.tagName("img"));
		System.out.println(imglist.size());
		
		
		//  FE        vs      FEs
		//WebElement     List<WebElement>
		//NSE            empty list -> size=0
		//any action     no action
		
	}	

}
