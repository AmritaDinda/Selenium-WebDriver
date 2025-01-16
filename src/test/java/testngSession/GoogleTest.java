package testngSession;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GoogleTest extends BaseTest {	
	
	@Test(priority = 1)
	public void titleTest() {
		//driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "Google");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean check = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(check);
	}


	
}
