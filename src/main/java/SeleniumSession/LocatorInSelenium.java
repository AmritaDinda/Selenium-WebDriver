package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//8 locators- id, name, ClassName, Xpath, css selector, LinkText, partial LinkText, tag Name		
		
		
		
		
		//Create a webElements + perform Action (Click,SendKey,GetText,isDisplayed...)
				//Create a WebElements : need a locator
				
			    driver = new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				
		//1.id: -always unique
//				driver.findElement(By.id("input-email")).sendKeys("amritadinda812@gmail.com");

		//2.name: - it can be duplicate
//				driver.findElement(By.name("email")).sendKeys("amritadinda812@gmail.com");
//				By email = By.name("email");
		
		//3.className: - it can be duplicate most of the the time-not recommended - use class only if it's unique 
//				driver.findElement(By.className("form-control")).sendKeys("amritadinda812@gmail.com");

		//4.xpath: - it is not a attribute ,it is the address of the elements in HTML DOM
//				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("amritadinda812@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Ashri@812");
//				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	
//				By email = By.xpath("//*[@id=\"input-email\"]");
//				By password = By.xpath("//*[@id=\"input-password\"]");
//				By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//
//				doSendkey(email,"amritadinda812@gmail.com");
//				doSendkey(password,"Ashri@812");
//				doClick(login);
		
				
		//5.CSS selector:- it is not a attribute( attribute are coming in the form of key and value pair)
//				driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//				driver.findElement(By.cssSelector("#input-password")).sendKeys("test123");
//				driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//				
		
				
		//6.Linktext: - only for link,it is not attribute ,it is a text of the link ->htmltage = <a ,linktest it can be duplicate
			//	driver.findElement(By.linkText("Register")).click();
			
//				By reg = By.linkText("Register");			
//			doClick(reg);	
				
				
				
		//7.partialLinktext: - it can be duplicate,it is not attribute ,it is a text of the link
			//	driver.findElement(By.partialLinkText("Forgotten")).click();
				
			
				
		//8.tagName : htmltag
//			String get = driver.findElement(By.tagName("h2")).getText();
//			System.out.println(get);	
				
			
		//getText - link,headers,paragraph,footer
//			By pay = By.linkText("Recurring payments");
//			
//			String val = doGetText(pay);
//			System.out.println(val);
			
			
			
			//practice-
			By re = By.linkText("Register"); 
			
			doClick(re);
			
			By iF = By.id("input-firstname");
			By lN = By.id("input-lastname");
			By em = By.id("input-email");
			By tl = By.id("input-telephone");
			By pw = By.id("input-password");
			By pc = By.id("input-confirm");
			By ns = By.name("newsletter");
			By co = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");


			doSendkey(iF,"amrita");
			doSendkey(lN,"dinda");
			doSendkey(em,"amrita123@gmail.com");
			doSendkey(tl,"8305391277");
			doSendkey(pw,"amrita123");
			doSendkey(pc,"amrita123");
			doClick(ns);
			doClick(co);


					
			
			
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendkey(By locator ,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	//By class is use for to fixed the locator,and method is use for to perform an action with locator	
	
	
}
