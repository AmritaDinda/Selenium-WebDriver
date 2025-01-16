package testngSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{


	@Test(priority = 1)
	public void titleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean check = driver.findElement(By.xpath("//input[@class='form-control input-lg']")).isDisplayed();
		Assert.assertTrue(check);
	}

	@Test(priority = 3)
	public void isHelpExistTest() {
		boolean check = driver.findElement(By.linkText("Wish List")).isDisplayed();
		Assert.assertTrue(check);
	}

	

}
