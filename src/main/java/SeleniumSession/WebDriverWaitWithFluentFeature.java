package SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentFeature {

	static WebDriver driver;
	public static void main(String[] args) {

	    driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");		
		By FreeTry = By.xpath("//div[@class='sc-6293d692-0 bvexqx']//a[text()='Try it Free']");
	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				                   wait.withTimeout(Duration.ofSeconds(10));
				                   wait.ignoring(NoSuchElementException.class);
				                   wait.ignoring(StaleElementReferenceException.class);
				                  wait.pollingEvery(Duration.ofSeconds(2)); //interval time
				                   wait.withMessage("..element is not found on this page");
		
		
		 wait.until(ExpectedConditions.presenceOfElementLocated(FreeTry)).click();
	
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
//		 wait.until(ExpectedConditions.presenceOfElementLocated(FreeTry)).click();

		
		
		
	//conclusion :WebDriverWait And FluentWaitWait both are same access feature only little bit syntax is different 	
		
		
		
		
		
		
		
	}

}
