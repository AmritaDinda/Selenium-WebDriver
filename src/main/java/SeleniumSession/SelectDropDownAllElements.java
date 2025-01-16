package SeleniumSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {


	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
//		WebElement webs = driver.findElement(By.id("Form_getForm_Country"));		
//		Select s = new Select(webs); //select always ask for webElement in a parameter (select is a inBuild class in java)...
//		List<WebElement> list = s.getOptions(); //getOption only work with Select
//		System.out.println(list.size());
//
//		for(WebElement e: list) {
//			String te = e.getText();
//			System.out.println(te);
//			if(te.equals("India")) {
//				e.click();
//				System.out.println("world largest population place");
//				break;
//			}
//		}
		
		By country = By.id("Form_getForm_Country");

		if(getTotalDropDownOption(country)==232) {
		System.out.println("country drop down id correct");
		}
		List<String> opteLi = getDropDownOptionTextList(country);
		System.out.println(opteLi);

		List<String> expCountryList = Arrays.asList("India","Belgium","Afghanistan");
		if(getDropDownOptionTextList(country).containsAll(expCountryList)) {
			System.out.println("Pass");
		}
		
		
		
		
	}

	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	public static List<WebElement> getDropDownOptionList(By locator) {
		Select sel = new Select(getElement(locator));
		return sel.getOptions();
	}

	
	
	public static List<String> getDropDownOptionTextList(By locator) {
		List<WebElement>optionList = getDropDownOptionList(locator);
		List<String> opList = new ArrayList<String>();
		for(WebElement e : optionList) {
			String get = e.getText();
			opList.add(get);		
		}
		return opList;
	}
	
	
	
	public static void selectDropDownValue(By locator,String expValue) {
		List<WebElement> ol = getDropDownOptionList(locator);
		for(WebElement e: ol) {
			String tex = e.getText();
			System.out.println(tex);
			if(tex.equals(expValue)) {
				e.click();
				break;
			}
		}		
	}
	
	
	
	public static int getTotalDropDownOption(By locator) {
		int optionCount = getDropDownOptionList(locator).size();
		System.out.println("total no. of option count ="+optionCount);
		return optionCount;
	}
	

}
