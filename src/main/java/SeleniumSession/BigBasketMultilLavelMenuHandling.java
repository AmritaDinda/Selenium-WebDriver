package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultilLavelMenuHandling {

	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

	    driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		Thread.sleep(2000);
		selectProductLavelHandle("Beverages","Tea","Tea Bags");

	}
	
	public static void selectProductLavelHandle(String l2,String l3,String l4) throws InterruptedException {
		
		WebElement shopParentEle = driver.findElement(By.cssSelector("a.meganav-shop"));
		
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		Thread.sleep(2000);
		
		WebElement L2Ele = driver.findElement(By.linkText(l2));
		act.moveToElement(L2Ele).build().perform();
		Thread.sleep(2000);

		WebElement L3Ele = driver.findElement(By.linkText(l3));
		act.moveToElement(L3Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L4Ele = driver.findElement(By.linkText(l4));
		L4Ele.click();
		
	}

}
