	package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		
		//2.auth pop up
		
		String username = "admin";
		String password = "admin";

		WebDriver driver = new ChromeDriver();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
		
		
	}

}
