package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {

	//SVG = Scaler Vector graph 
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		List<WebElement> StateList = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
		System.out.println(StateList.size());
		for(WebElement e:StateList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
			if(stateName.equals("Virginia")) {
				e.click();
				break;
			}
		}		
		
		
		//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']			
		
	}
	
	public static void createUser(String name) {
		String xpath = "//input[contains(text()='"+name+"']";
		xpath.replaceAll("name", "name");
	}

}
