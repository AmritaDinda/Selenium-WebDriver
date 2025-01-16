package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String ZoomScriptChrome = "document.body.style.zoom = '100.0%'";
//		js.executeScript(ZoomScriptChrome);
//		
//		String ZoomScriptFireFox = "document.body.style.MozTransform = scale'(0.5)'";
//		js.executeScript(ZoomScriptFireFox);

		zoomFirFox("0.5");
		
		
		
	}
	
	public static void zoomChrome(String zoompercent) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String Zoom = "document.body.style.zoom = '"+zoompercent+"%'";
		js.executeScript(Zoom);
	
	}
	
	public static void zoomFirFox(String zoompercent) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String Zoom = "document.body.style.MozTransform = scale'("+zoompercent+")'";
		js.executeScript(Zoom);
	
	}
	
	

}
