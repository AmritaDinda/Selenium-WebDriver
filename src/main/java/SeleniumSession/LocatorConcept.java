package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		//Create a webElements + perform Action (Click,SendKey,GetText,isDisplayed...)
		//Create a WebElements : need a locator
		
	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		//1.Id
		
		  // 1st:
//		driver.findElement(By.id("input-email")).sendKeys("amritadinda812@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Ashri@812");

		
		
		  //2nd:
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emilId.sendKeys("amritadinda812@gmail.com");
//		password.sendKeys("Ashri@812");
	
		
		
		  //3rd: By Locator
//		By eId = By.id("input-email");
//		By pass =By.id("input-password");
//		
//		WebElement email = driver.findElement(eId);
//		WebElement password = driver.findElement(pass);
//
//		email.sendKeys("amritadinda812@gmail.com");
//		password.sendKeys("Ashri@812");
		
		
		
		   //4.By Locator + generic method for WebElement
//		By eId = By.id("input-email");
//		By pass =By.id("input-password");
//		
//		getElement(eId).sendKeys("amritadinda812@gmail.com");
//		getElement(pass).sendKeys("Ashri@812");

		
		
		   //5.By Locator + generic method for WebElement + Actions
//		By eId = By.id("input-email");
//		By pass =By.id("input-password");
//		
//		doSendkey(eId,"amritadinda812@gmail.com");
//		doSendkey(pass,"Ashri@812");

		
		   //6.By Locator + generic method for WebElement + Actions in a ElementUtil class
		By eId = By.id("input-email");
		By pass =By.id("input-password");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendkey(eId,"amritadinda812@gmail.com");
		eUtil.doSendkey(pass,"Ashri@812");		
				
		
	}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendkey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	
	
	
	//Notes-
	
	//Dom = document object model
	//WebElements are primitive type(interface type) it's not a datatype


}
