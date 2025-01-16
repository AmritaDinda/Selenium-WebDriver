package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionWithFindElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> footerList = driver.findElements(By.cssSelector("div.row ul.list-unstyled a"));
		 
		System.out.println(footerList.size());
		Thread.sleep(2000);

		for(int i=0;i<footerList.size();i++) {
			footerList.get(i).click();
			driver.navigate().refresh();
			Thread.sleep(2000);
			footerList = driver.findElements(By.cssSelector("div.row ul.list-unstyled a"));

		}
		//when WebElement id is expire than the StaleElementException will occurs
		
		
	}

}
