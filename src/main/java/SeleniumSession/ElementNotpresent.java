package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotpresent {
	
	static WebDriver driver;

	public static void main(String[] args) {

	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	By image = By.className("img-responsive11");
//	By search = By.name("search");
	
	boolean fImage = driver.findElement(image).isDisplayed();
	System.out.print(fImage);
	// if the locator is wrong findElement always throw [ NoSuchElementException ]
	
	
		
		
	}

}
