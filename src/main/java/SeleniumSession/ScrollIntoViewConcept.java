package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		

		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Sellers in Toys & Games']"));
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.scrollIntoView(ele);
		
		//click -UI -click on middle of the element
		//action click-move to element 	- click on middle of the element
		//js click - click from Dom
		
		WebElement AmazonSell = driver.findElement(By.linkText("Sell"));
		jsUtil.clickElementByJS(AmazonSell);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
