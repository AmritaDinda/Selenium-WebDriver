package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		List<WebElement> footerList = driver.findElements(By.xpath("//h5[text() = 'Information']/following-sibling::ul//a"));
//		
//		System.out.println(footerList.size());
//		
//		for(WebElement e :footerList) {
//			System.out.println(e.getText());
//		}
		
		List<String> infofooter = getFooter("Information");
		System.out.println(infofooter);
		
		List<String> Extrasfooter = getFooter("Extras");
		System.out.println(Extrasfooter.size());
		
		
		
		
		
	}
	
	public static List<String> getFooter(String userElement) {
		List<WebElement> secFooter = driver.findElements(By.xpath("//h5[text() = '"+userElement+"']/following-sibling::ul//a"));
		List<String> li =new ArrayList<String>();
		for(WebElement e : secFooter) {
			String gT = e.getText();
			li.add(gT);
		}
	      return li;
	
	}

}
