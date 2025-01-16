package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndNewWindowConcept {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.switchTo().newWindow(WindowType.TAB);

		
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());

		//driver.quit();
		
		
		//random pop up -can't be handle
		//in qa/stage/test -block these pop ups
		
		
	}

}
