package SeleniumSession;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.clickWhenReady(10, twitter);

		driver.switchTo().window("sasassa");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> iit = handles.iterator();

		String parentWindowId = iit.next();
		System.out.println(parentWindowId);

		String childWindowId = iit.next();
		System.out.println("child Window Id:" + childWindowId);
		
		//switching the window
		driver.switchTo().window(childWindowId);
		System.out.println("child Window Id:"+ driver.getCurrentUrl());
		driver.close();//close the child Window
		
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent Window Id:"+ driver.getCurrentUrl());
		

	}

}
