package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	
static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String ph = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(ph);
//		String dr = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		System.out.println(dr);
//		String er = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		System.out.println(er);

		By fn = By.name("firstname");
		By sc = By.className("img-responsive");
		
		String a= doGetAttribute(sc,"src");
		String b =doGetAttribute(sc,"title");
		String c = doGetAttribute(fn,"placeholder");
		
		System.out.println(a+" - "+b+" - "+c);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doGetAttribute(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}
}
