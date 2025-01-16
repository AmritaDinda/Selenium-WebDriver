package testngSession;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

	//Not Valid Format-
	
//	@Test
//	public void AmazonPageTest() {
//		
//        System.out.println("checking title......");
//		String title = driver.getTitle();
//		System.out.println("page title :"+title);
//		Assert.assertEquals(title, "Account Login");
//
//        System.out.println("checking Search......");
//	    boolean check = driver.findElement(By.xpath("//input[@class='form-control input-lg']")).isDisplayed();
//		Assert.assertTrue(check);
//			
//	    System.out.println("checking Help......");
//		boolean check1 = driver.findElement(By.linkText("Wish List")).isDisplayed();
//		Assert.assertTrue(check1);
//
//	}
	

	// testCases will be run in alphabetical order
	
	//Valid Format-
	
	@Test(priority = 1)
	public void titleTest() {
		//driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean check = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(check);
	}

	@Test(priority = 3)
	public void isHelpExistTest() {
		boolean check = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(check);
	}

}
