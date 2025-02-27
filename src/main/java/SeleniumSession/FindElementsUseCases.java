package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https:	//www.amazon.in/");
	
		By links = By.tagName("a");
		if(getTotalElementsCount(links)	>250) {
			System.out.println("PASS");
		}
		
		
		
		
	}	
	
    public static int getTotalElementsCount(By locator) {
    	int elecount =  getElements(locator).size();
    	System.out.println("total elements for :"+locator+"--->"+elecount);
    	return elecount;
    }	
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
