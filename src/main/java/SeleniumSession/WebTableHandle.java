package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-women-s-t20-world-cup-2024-25-1432420/england-women-vs-west-indies-women-20th-match-group-b-1432441/full-scorecard");
		Thread.sleep(3000);


		String Wkname = getElement("Danni Wyatt-Hodge");
		System.out.println(Wkname);

		String Wname = getElement("Charlie Dean");
		System.out.println(Wname);
		
        List<String>ListScore = scores("Danni Wyatt-Hodge");
		System.out.println(ListScore);

		
	}
	
	public static String getElement(String batsMan) {
		return driver.findElement(By.xpath("//a[@title='"+batsMan+"']/ancestor::td/following-sibling::td//span/span")).getText();

	}

	public static List<String> scores(String playername) {
		List<WebElement> playerList =  driver.findElements(By.xpath("//a[@title='"+playername+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> playerScore =new ArrayList<String>();
		for(WebElement e : playerList) {
			String ps = e.getText();
			playerScore.add(ps);
		}
		return playerScore;
	}

}
