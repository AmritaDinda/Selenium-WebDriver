package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoggleLanguageLinks {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement>langList = driver.findElements(By.xpath(".//div[@id='SIvCob']/a"));
		System.out.println(langList.size());

		for(WebElement e : langList) {
			String lan = e.getText();
			System.out.println(lan);
			if(lan.equals("বাংলা")) {
				e.click();
				break;
			}
		}
		
	}

}
