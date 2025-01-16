package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonkeyTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		List<WebElement> footerList = driver
				.findElements(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']//li//a"));
		int footerSize = footerList.size();
		System.out.println(footerSize);

		for (int i = 0; i < footerSize; i++) {

			int randomindex = (int) Math.floor(Math.random() * footerSize);
			System.out.println(randomindex);

			WebElement e = footerList.get(randomindex);
			System.out.println(e.getText());
			e.click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElements(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']//li//a"));

		}

	}

}
