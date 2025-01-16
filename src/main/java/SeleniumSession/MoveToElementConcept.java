package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement spiceclube =driver.findElement(By.xpath("//div[contains(@class,'r-1pzd9i8')  and text()='SpiceClub']"));
		
		Actions act = new Actions(driver); //remember = select asked for WebElement in Parameters but action asked for driver
		act.moveToElement(spiceclube).build().perform();
		   //moveToElement use for mouse over on the variables
		Thread.sleep(2000);
		driver.findElement(By.linkText("Benefits" )).click();
		
		
		
		
	}

}
