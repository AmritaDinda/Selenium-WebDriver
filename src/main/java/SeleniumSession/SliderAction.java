package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.id("slider"));
		slider.click();
		int width = slider.getSize().getWidth();
		System.out.println(width);
		Actions act = new Actions(driver);
		act.moveToElement(slider, (width/2)-50, 0).click().build().perform();
		act.moveToElement(slider, -((width/2)-50), 0).click().build().perform();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
