package SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		//WebDriverWait -- fluentWait -- wait
		
	    driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");		
		By FreeTry = By.xpath("//div[@class='sc-6293d692-0 bvexqx']//a[text()='Try it Free']");
	
//		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				                   .withTimeout(Duration.ofSeconds(10))
//				                   .ignoring(NoSuchElementException.class)
//				                   .ignoring(StaleElementReferenceException.class)
//				                   .pollingEvery(Duration.ofSeconds(2)) //interval time
//				                   .withMessage("..element is not found on this page");
//		
//		
//		WebElement freTrialEle = wait.until(ExpectedConditions.presenceOfElementLocated(footer));
//		freTrialEle.click();
		
		
		waitForElementPresenceWithFluentWait(10,2,FreeTry).click();
		
		
	}

	public static WebElement waitForElementPresenceWithFluentWait(int  timeOut,int pollingTime,By  locator) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                   .withTimeout(Duration.ofSeconds(timeOut))
				                   .ignoring(NoSuchElementException.class)
				                   .ignoring(StaleElementReferenceException.class)
				                   .pollingEvery(Duration.ofSeconds(pollingTime)) //interval time
				                   .withMessage("..element is not found on this page");
		
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	}

	public static void waitForAlertWithFluentWait(int  timeOut,int pollingTime,By  locator) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                   .withTimeout(Duration.ofSeconds(timeOut))
				                   .ignoring(NoAlertPresentException.class)
				                   .pollingEvery(Duration.ofSeconds(pollingTime)) //interval time
				                   .withMessage("..Alert is not found on this page");
		
		
		wait.until(ExpectedConditions.alertIsPresent());

	}
	
	
	//we can also create the utilies for fluentWait like  :wait for title, wait for url, wait for alert,wait for Element,
	                //only ignoring and message will be change
	
	
	
	
}
