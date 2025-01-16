package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microchip.com/prochiplicensing");
		
		WebElement designDate = driver.findElement(By.xpath("//label[text() ='When is your design planned for production?']/preceding-sibling::select"));
		Select dateD = new Select(designDate);
		dateD.selectByVisibleText("2024");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
