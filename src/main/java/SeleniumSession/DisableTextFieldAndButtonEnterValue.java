package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldAndButtonEnterValue {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//	
//		WebElement di = driver.findElement(By.xpath("//input[@id='pass']"));//this is disable
//		di.sendKeys("text@123");
//                       //ElementNotInteractableException: element not interactable
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.classic.freecrm.com/register/");
		
		WebElement diB = driver.findElement(By.id("submitButton"));//this is disable
		String dB = diB.getAttribute("disable");
		System.out.println(dB);
		
		diB.click();
                   //ElementClickInterceptedException
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
