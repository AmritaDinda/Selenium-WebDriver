package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandal {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		//dropdown -- htmltag -->  <select>
		//use select class in selenium
		

//		WebElement country_ele = driver.findElement(By.id("Form_getForm_Country"));
//		Select se = new Select(country_ele);
//		
//		se.selectByIndex(6);
//		se.selectByValue("Belgium"); //value attributes
//		se.selectByVisibleText("India"); //text of the option
		
		
		By country = By.id("Form_getForm_Country");
		
		doSelectDropDownByIndex(country,5);
		Thread.sleep(2000);
		doSelectDropDownByvalue(country,"Belgium");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country,"India");
		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator,int index) {
		Select se = new Select(getElement(locator));
		se.selectByIndex(index);
	}
	
	public static void doSelectDropDownByvalue(By locator,String value) {
		Select se = new Select(getElement(locator));
		se.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String vivalue) {
		Select se = new Select(getElement(locator));
		se.selectByValue(vivalue);
	}
	
}
