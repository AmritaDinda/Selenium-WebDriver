package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		 List<WebElement> option = driver.findElements(By.xpath(".//Select[@id='Form_getForm_Country']/option"));
//		System.out.println(option.size());
//		 for(WebElement e : option) {
//			 String text = e.getText();
//				System.out.println(text);
//
//		 }
		By option = By.xpath(".//Select[@id='Form_getForm_Country']/option");
		List<String> cList = getOptionList(option);
		 System.out.println(cList);
		 
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);		
	}

	public static List<String> getOptionList(By locator) {
		List<WebElement> gto =getElements(locator);
		List<String> CreateList = new ArrayList<String>();
		for(WebElement e:gto) {
			String tex = e.getText();
			CreateList.add(tex);
			if(tex.equals("India")){
				System.out.println("Land By India");
				e.click();
			}
		}
		return CreateList;
	}
	
	
}
