package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;

public class WebTablePagination {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

	    driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		
		//single Selection-
//		while(true){
//			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
//				selectCountry("India");
//				break;
//			}
//			else {
//				//pagination logic:
//				WebElement nextC = driver.findElement(By.linkText("Next"));
//				
//				if(nextC.getAttribute("class").contains("disabled")) {
//					System.out.println("pagination is over...country is not found");
//					break;
//				}
//				
//				nextC.click();
//				Thread.sleep(3000);
//				break;
//			}
//		}
			
		//Mutiple selection-
			while(true){
				if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
					selectMultiCountry("India");
					
				}
				
					//pagination logic:
					WebElement next = driver.findElement(By.linkText("Next"));
					
					 if(next.getAttribute("class").contains("disabled")) {
			 			System.out.println("pagination is over...country is not found");
						break;
					}
					
					next.click();
					Thread.sleep(1000);		
					
		}		
		
				
			
	}
	
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}


	public static void selectMultiCountry(String countryName) {
		List<WebElement> checkbox = driver.findElements(By.xpath("(//td[text()='"+countryName+"'])/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : checkbox) {
			e.click();
		}
	}
		
	}

