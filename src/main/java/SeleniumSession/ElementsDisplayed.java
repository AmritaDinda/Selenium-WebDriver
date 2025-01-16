package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
//		boolean img = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).isDisplayed();
//		boolean search = driver.findElement(By.xpath("//*[@id=\"search\"]/input")).isDisplayed();
//		if(img){
//			System.out.println("PASS");
//		}
//		if(search) {
//			System.out.println("PASS");
//			driver.findElement(By.name("search")).sendKeys("Macbook");
//			driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
//		}
		
		
		
		By image = By.className("img-responsive");
		By search = By.name("search");
		By click = By.cssSelector("#search > span > button");
	
		if(doDisplay(image)) {
			System.out.println("imag is present - PASS");
		}
		if(doDisplay(search)) {
			System.out.println("search is present - PASS");
			doSendkey(search, "Macbook");
			doClick(click);
		}
	
		
		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean doDisplay(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendkey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
}
