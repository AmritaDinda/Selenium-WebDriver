package testngSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {

	public WebDriver driver;

	public boolean doLogin(String userName, String password) {
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

		String errorMess = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))
				.getText();
		System.out.println(errorMess);
		if (errorMess.contains("No match for E-Mail Address and/or Password")) {
			return true;
		} else {
			return false;
		}
	}

	@DataProvider    //although it's work as a DataDriven
	public Object[][] getLoginPageNagitiveData() {

		return new Object[][] { { "amritadinda@gmail.com", "Test#@123" }, { "amritadinda", "Test#@123" },
				{ "", "Test#@123" }, { "amritadinda@gmail.com", "" },{ "amritadinda@gmail.com#", "Test#@123"},{ "amritadinda@gmail.com", "123323"} };

	}

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@Test(dataProvider = "getLoginPageNagitiveData")
	public void loginTest(String userName, String password) {
		boolean testlo = doLogin(userName, password);
		System.out.print(testlo);

//		Assert.assertTrue(doLogin("amritadinda@gmail.com", "Test#@123"));
		
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

}
