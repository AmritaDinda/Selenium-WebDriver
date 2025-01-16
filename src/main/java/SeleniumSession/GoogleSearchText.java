package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Lab");
		
		Thread.sleep(2000);
		
		By suggestLocator = By.xpath(".//li['@role=presentation']//div['@class=wM6W7d']/span");
//		List<WebElement> listOfsuggested = driver.findElements(suggestLocator);
//		System.out.println(listOfsuggested.size());
		
		getSuggestElement(suggestLocator,"naveen automation lab github");
		
		
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);		
	}
	
	public static void getSuggestElement(By locator, String suggName){
		List<WebElement> sugg = getElements(locator);
		for(WebElement e : sugg) {
			String suggText = e.getText();
			if(suggText.contains(suggName)){
			e.click();
			break;
			}
		}
	}
	
}
