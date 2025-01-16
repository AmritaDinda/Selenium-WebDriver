package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAttribute {
	
	static	WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		By links = By.tagName("a");
		By image = By.tagName("img");

//		List<WebElement> linklist = getElement(links);
//		System.out.println(linklist.size());
//	
//		for(WebElement e : linklist) {
//			String w = e.getAttribute("href");
//			String s = e.getText();
//			
//			System.out.println(w);	
//			System.out.println(s);
//		}
		
//		List<WebElement> imglist = getElement(image);
//		System.out.println(imglist.size());
//		
//		for(WebElement e : imglist) {
//			String s = e.getAttribute("src");
//			String g = e.getAttribute("data-a-hires");
//			
//			System.out.println(s);
//			System.out.println(g);
//		}
		
		getElementAttributes(image,"src");
		getElementAttributes(links,"href");

		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementAttributes(By locator,String attName) {
		List<WebElement> elist = getElements(locator);
		for(WebElement e : elist) {
			String z = e.getAttribute(attName);
			System.out.println(z);
		}
	}
	
	
}
	

