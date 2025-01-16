package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.id("input-email");
		By password = By.id("input-password");
		By Login = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		email_ele.sendKeys("test123@gmail.com");
			
		waitForElementPresence(email,10).sendKeys("test123@gmail.com");
		getElement(password).sendKeys("Test223");
		getElement(Login).click();
		
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 */
	public static WebElement waitForElementVisible(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	}
	
	 /**
	 *An expectation for checking that an element is present on the DOM of a page. 
	 *This does not necessarily mean that the element is visible
	 */

	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	}

	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	
	
	
}
