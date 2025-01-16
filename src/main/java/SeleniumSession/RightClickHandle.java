package SeleniumSession;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {

	public static void main(String[] args) throws InterruptedException {

		//context menu or Right click both are same
		WebDriver driver = new ChromeDriver();
		 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 WebElement rightc = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightc).build().perform();
		
		List<WebElement> cList = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li"));
		System.out.println(cList.size());
	

		
		for(WebElement e: cList) {
			String gList = e.getText();	
			System.out.println(gList);
			if(gList.equalsIgnoreCase("copy")) {
				e.click();
				Alert sto = driver.switchTo().alert();
				Thread.sleep(2000);
				sto.accept();
				break;

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
