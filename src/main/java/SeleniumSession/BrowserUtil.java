package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	private WebDriver driver;
	
	/**
	 * This method is used to initialized the driver on the basis of given browser name
	 * @param browserName
	 * @return This return the specific browser driver
	 */

	public WebDriver initDriver(String browserName) {
		System.out.println("BrowserName is :" + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("plz pass the right browser......");
			break;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}

	//https://www.google.com
	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("url can not be null");
		}
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("page title :"+title);
		return title;
	}
	
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page url :"+url);
		return url;
	}
	
	public void closeBrowser() {
		if(driver!=null) {
		driver.close();	
		}	
	}
	
	public void quitBrowser() {
		if(driver!=null) {
		driver.quit();	
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
