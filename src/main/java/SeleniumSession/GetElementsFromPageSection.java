package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		List<WebElement> panelLinkList = driver.findElements(By.xpath("//aside[@id='column-right']//a")); //create XPATH
//		System.out.println(panelLinkList.size());
//		
//		for(WebElement e :panelLinkList ) {
//			String gt = e.getText();
//			System.out.println(gt);
//		}
		
		By panelLink = By.xpath("//aside[@id='column-right']//a");
		
		List<String>elementList = getElementTextList(panelLink);
		
		System.out.println(elementList);
		System.out.println(elementList.contains("Login"));
		System.out.println(elementList.contains("Wish List"));
		System.out.println(elementList.contains("My Account"));

		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementTextList(By locator) {
		
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String Text = e.getText();
			eleTextList.add(Text);
		}
			return eleTextList ;
		
	}

}
