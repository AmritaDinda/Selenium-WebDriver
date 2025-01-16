package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJsAlertPopUp {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		
			
		
		
	}

	public static Alert waitForAlertPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeOut) {
		return waitForAlertPresent(timeOut).getText();
	}
	
	public static void acceptAlert(int timeOut) {
	    waitForAlertPresent(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
	    waitForAlertPresent(timeOut).dismiss();
	}
	
	public static void alertSendKeys(int timeOut,String value) {
	    waitForAlertPresent(timeOut).sendKeys(value);
	}
	
	
	
	
}
