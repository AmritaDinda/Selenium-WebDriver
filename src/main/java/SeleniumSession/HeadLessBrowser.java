package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadLessBrowser {

	public static void main(String[] args) {

		//browser is not visible
		//headless - testing is happening behind the scene
		//faster than normal mode 	
		//sanity test cases
		//for complex html dom - its might not work
		
		ChromeOptions co = new ChromeOptions();
//		  co.addArguments("--headLess"); //it is blocking the visibility of the page
		  co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		
		
		
	}

}
