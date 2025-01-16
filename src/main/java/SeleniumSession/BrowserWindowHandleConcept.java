package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {

		//3.browser window pop up/adv pop up/new tab window/new Browser window 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		           //target="_blank" is a WebElement those are only reason for switch/cross Browser
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twEle.click();
		//Child window --twitter page
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> iit = handles.iterator();
		
		String parentWindowId = iit.next();
		System.out.println(parentWindowId);
		
		String childWindowId = iit.next();
		System.out.println("child Window Id:"+childWindowId);

		//switching the window
		driver.switchTo().window(childWindowId);
		System.out.println("child Window Id:"+ driver.getCurrentUrl());
		driver.close();//close the child Window
		
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent Window Id:"+ driver.getCurrentUrl());
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
