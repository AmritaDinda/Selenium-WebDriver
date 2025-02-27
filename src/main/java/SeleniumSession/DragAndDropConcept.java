package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
//		act.clickAndHold(srcEle).moveToElement(targEle).release().build().perform();
		
		act.dragAndDrop(srcEle, targEle);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
