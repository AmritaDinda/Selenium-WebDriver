package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	
	static	WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//find all links on the page.
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		
		//print the total links count.
		int listcount = linklist.size();
		System.out.println(listcount);
		
		//print the text of each link.
		//and avoid the blank text.
		
//		for(int i=0; i<listcount; i++) {
//			String st = linklist.get(i).getText();
//			if(st.length()>0){
//			System.out.println(i + ":" + st);
//			}
//		}

		System.out.println("...................");
		
		//get total blank links count?? --assignment
		
		//for each loop.
		for(WebElement e : linklist) {
			
			String text = e.getText();
			if(text.length()>0) {
			System.out.println(listcount + ":" +text);
			}
		}
		

		

		
		
		
	}

}
