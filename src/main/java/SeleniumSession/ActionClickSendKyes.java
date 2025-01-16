package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickSendKyes {

	static WebDriver driver;
	public static void main(String[] args) {

	     driver  = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn= By.id("input-firstname");
		By ln =  By.id("input-lastname");
		By continuButton =  By.xpath("//input[@type='submit']");
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(fn), "Naveen").build().perform();
//		act.sendKeys(driver.findElement(ln), "Automation").build().perform();
//		act.click(driver.findElement(continuButton)).build().perform();

		//ElementNotIntractableException
		//ElementNotInterceptedException
		
		
		doActionSendkey(fn,"naveen");
		doActionSendkey(ln,"naveen");
		doActionClick(continuButton);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionSendkey(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();

	}

}
