package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class NestedFrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//nested frame-
		   //f1 -ele
		        //f2-ele
		            //f3-ele
		
//		driver.switchTo()
//		     .frame("pact1")
//		       .switchTo().frame("pact2")
//		         .findElement(By.id("jex"))
//		           .sendKeys("PQR");

		
		
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("Amrita");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Dinda");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Age - 23");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Jana");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Age - 23+");
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("Amrita Dinda Jana");
		driver.switchTo().defaultContent();

//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("Dinda");   // directly couldn't jump	
		
		
		
	}

}
