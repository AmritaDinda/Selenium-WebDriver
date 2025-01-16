package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) {
		
		//1.open browser : chrome,firefox
		
		//ChromeDriver driver = new ChromeDriver();
		
		//Cross browser logic
		String browser = "chrome";
		WebDriver driver = null;  //top casting - WebDriver driver = new ChromeDriver
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("plz pass the right browser....");
		}
		
		//2.enter url :
		driver.get("https://www.google.com"); //without https we can't open the browse it will give "InvalidArgumentException"
		
		
		//3.get the title:
		String actTitle = driver.getTitle();
		System.out.println("page Title : "+actTitle);
		
		
		//4.validation point/checkpoint :
		if(actTitle.equals("Google")){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

		   driver.quit();	

		   
	//Automation steps(selenium code) + validation/assertions = Automation Testing	
     //Selenium it is a Library/FrameWork to automate the Browser 
				
	//things We Never be Automated -
		   //Otp
		   //Captcha
		   //two Factor Authentication
		   //Random pop ups
		   //performance testing
		   //File downloads
		   //API testing/HTTP Response
		   //Gmail,Email,Facebook logins
		   //links Spidering
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}	
