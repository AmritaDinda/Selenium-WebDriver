package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {

		String browserName = "chrome";
		
		BrowserUtil broUtil = new BrowserUtil();
		
		WebDriver driver = broUtil.initDriver(browserName);
		broUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		//By Locator:
		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendkey(fName, "Amrita");
		eUtil.doSendkey(lName, "Dinda");
		eUtil.doSendkey(email, "Amrita@gmail.com");
		eUtil.doSendkey(telephone, "8305391277");
		eUtil.doSendkey(password, "Amrita@123");
		eUtil.doSendkey(confirmPassword, "Amrita@123");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
