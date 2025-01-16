package SeleniumSession;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassCRMstream {

	static WebDriver driver;
	public static void main(String[] args) {	

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		List<WebElement> paragraphs = driver.findElements(By.cssSelector("section#details p"));
		String allPara = paragraphs.stream()
		             .map(e ->e.getText())
		             .collect(Collectors.joining("\n"));  // "\n" represent starts with new line
	
		System.out.println(allPara);
		
		
//		List<WebElement> headers = driver.findElements(By.cssSelector("section#details h3"));
//		String allheaders = headers
//		               .stream()
//		                       .map(e ->e.getText())
//		                               .collect(Collectors.joining("||"));  // "\n" represent starts with new line
//	
//		System.out.println(allheaders);		
//		headers.stream().forEach(e -> System.out.println(e.getText()+"----"+e.getTagName()));
		
		
		By header = By.cssSelector("section#details h3");
		printHeaders(header);
		
		getHeaderlist(header);
		
	}
	
	public static void printHeaders(By locator) {
		driver.findElements(locator)
        .stream()
            .forEach(e -> System.out.println(e.getText()+"----"+e.getTagName()));
	}
	
	public static List<String> getHeaderlist(By locator) {
		return driver.findElements(locator)
                .stream()
                       .map(e ->(e.getText()))
                              .collect(Collectors.toList());
	}

}
