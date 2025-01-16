package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrameElement {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");	
	
//		waitForFrameAndSwitchToItByIdOrName(10,"main");
	
		waitForFrameAndSwitchToItByFrameElement(10,driver.findElement(By.xpath("//frame[@src='top.html']")));
	
	
	}

	public static void waitForFrameAndSwitchToItByIdOrName(int timeOut,String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static void waitForFrameAndSwitchToItByIndex(int timeOut,int FrameIndex) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIndex));
	}
	
	
	public static void waitForFrameAndSwitchToItByFrameElement(int timeOut,WebElement FrameElement) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));
	}
	
	public static void waitForFrameAndSwitchToItByFrameLocator(int timeOut,By FrameLocator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameLocator));
	}
	
}
