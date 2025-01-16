package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("amazon")) {
			System.out.println("PASS");
		}

		String pgCS = driver.getPageSource();
		System.out.println(pgCS);
		if(pgCS.contains("var ue_pty")) {
			System.out.println("PASS");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
