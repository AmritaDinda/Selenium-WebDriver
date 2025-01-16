package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		           //target="_blank" is a WebElement those are only reason for switch/cross Browser
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twEle.click();
		//Child window --twitter page
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handleList = new ArrayList<String>(handles);
		
		String parentWindowId = handleList.get(0);
		String childWindowId = handleList.get(1);

		driver.switchTo().window(childWindowId);
		System.out.println("Child window Url = "+driver.getCurrentUrl());
		
		driver.close(); //close the child Window 
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window Url = "+driver.getCurrentUrl());
	

		
	}
	

}
