package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.linkText("Forgotten Password")).click();
		String title = waitForTitleContainsAndFetch(10,"Password?");
		if(title.contains("Forgot Your Password?")) {
			System.out.println("Pass");
		}
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleContains("Password?"));
//		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		
		if(waitForUrlContains(10,"mobile-phones")) {
			System.out.println("Url --is Correct");
		}
		else {
			System.out.println("Url --is  notCorrect");
		}
		
		
	}
	
	public static String waitForTitleContainsAndFetch(int timeOut,String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();	
	}
	
	public static String waitForTitleIsAndFetch(int timeOut,String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();	
	}
	
	public static String waitForUrlContainsAndFetch(int timeOut,String UrlFractionvalue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(UrlFractionvalue));
		return driver.getCurrentUrl();	
	}
	
	public static String waitForUrlIsAndFetch(int timeOut,String Urlvalue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(Urlvalue));
		return driver.getCurrentUrl();	
	}
	
	public static boolean waitForUrlContains(int timeOut,String UrlFractionvalue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(UrlFractionvalue));	
	}

	
	
}
