package SeleniumSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithEelements {

	static WebDriver driver;
	public static void main(String[] args) {

	    driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footer = By.xpath("//footer //a");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		List <WebElement> fotList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		System.out.println(fotList.size());		
		
	}

	public static List <WebElement> waitForAllElementPresence(By locator, int timeOut) {	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public static List <WebElement> waitForAllElementVisible(By locator, int timeOut) {	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
	
	
	
	
	
	
	
	
	
}
