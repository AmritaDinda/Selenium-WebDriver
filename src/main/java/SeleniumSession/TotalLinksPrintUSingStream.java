package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksPrintUSingStream {
	
	static WebDriver driver;
	public static void main(String[] args) {	

		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
//		driver.findElements(By.tagName("a"))
//		          .stream()
//		                   .filter(e ->!e.getText().isEmpty())
//		                         .forEach(e -> System.out.println(e.getText()));
	
		
		driver.findElements(By.tagName("a"))
        .stream()
                 .filter(e ->!e.getText().isEmpty());
	
		
		
		
		
		
		
		
		
	}

}
