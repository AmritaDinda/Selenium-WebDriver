package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandal {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		
		By thc = By.xpath("//table[@id='customers']//th");
		By trc = By.xpath("//table[@id='customers']//tr");

		int headerCount = getTableHeaderCount(thc);
		System.out.println(headerCount);
		
		int rowCount = getRowCount(trc);
		System.out.println(rowCount);
		
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[5]/td[1]
		//table[@id="customers"]/tbody/tr[6]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int row=2;row<=7;row++) {
			String xpath = beforeXpath + row + afterXpath;
			String values = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(values);

		}
		
		
		
		
	}
	
	public static List<WebElement> getElement(By locator) {
		return driver.findElements(locator);
	}

	public static int getTableHeaderCount(By locator) {
		return getElement(locator).size()-1;
	}
	
	public static int getRowCount(By locator) {
		return getElement(locator).size();
	}
	
}
