package testngSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestWithBM {
	WebDriver driver;

	//tcs should be independent
	//AAA Rule
	//AAA stands for :  Arrange, Act, and Assert
	//1 tc -> 1 Assert
	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Test
	public void searchExistTest() {
		boolean check = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(check);
	}

	@Test
	public void isHelpExistTest() {
		boolean check = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(check);
	}

	
	
	

}
