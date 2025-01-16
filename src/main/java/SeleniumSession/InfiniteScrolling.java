package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScrolling {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://scrollmagic.io/examples/advanced/infinite_scrolling.html");
		
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			long lastHeight = (long)js.executeScript("return document.body.scrollHeight");
			
			while(true) {
				List<WebElement> boxList = driver.findElements(By.cssSelector("div#content div.box1"));
				
				for(WebElement e: boxList) {
					String color = e.getCssValue("background-color");
					System.out.println(color);
				}
				
				//scroll down to the bottom of the page
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
				Thread.sleep(2000);
				
				//calculate new scroll height and compare with last scroll height
				long newHeight = (long)js.executeScript("return document.body.scrollHeight");
				if(newHeight == lastHeight) {
					//Break the loop if the bottom of the page is reached
					break;
				}
				lastHeight = newHeight;
			}
		} catch(InterruptedException e ) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		}

}
