package SeleniumSession;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keysUpDownConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
		//Scroll down using action class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		Thread.sleep(2000);
		
		//Scroll up using action class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();


		Thread.sleep(3000);

		//Refreshing the page using Action class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		//act.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL).build().perform();

		
		
	}

}
