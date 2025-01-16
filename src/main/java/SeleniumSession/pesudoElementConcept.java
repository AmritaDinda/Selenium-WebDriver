package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pesudoElementConcept {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		js code - //window.getComputedStyle(document.querySelector)("label[for='input-firstname']"),'::before').getPropertyValue('content')

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return window.getComputedStyle(document.querySelector)(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		String mand_field = js.executeScript(script).toString();
		System.out.println(mand_field);
		if(mand_field.contains("*")) {
			System.out.println("this is mandatory field");
			
		}

				
		
	}

}
