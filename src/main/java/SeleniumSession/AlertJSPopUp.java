package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUp {

	public static void main(String[] args) throws InterruptedException {

		//1.js alert - alert,prompt,confirm
		//2.auth pop up
		//3.browser window pop up/adv pop up
		//4.file upload pop up
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//1.js alert - alert,prompt,confirm
		   //alert-
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String gText = alert.getText();
//		System.out.println(gText);
//		alert.accept();
//		//alert.dismiss();
		
		
		//confirm-
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String gCText = alert.getText();
//		System.out.println(gCText);
//		alert.accept();
//		//alert.dismiss();
		
		
		//prompt-
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Amrita dinda");
		alert.accept();
		
		
		
		
		
		
		
		
		
	}

}
