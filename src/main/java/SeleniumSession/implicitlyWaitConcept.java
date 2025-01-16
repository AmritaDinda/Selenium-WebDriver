package SeleniumSession;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		
		//gobal wait : 10 sec
		//it will be applied for all the elements by default
		//FE -- implicitly wait will be applied automatically
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("AmritaDinda123@gmail.com"); //10-2 = 8sec wait
		driver.findElement(By.id("input-password")).sendKeys("AmritaDinda1232");//10-5 = 5sec wait
		driver.findElement(By.xpath("//input[@value='Login']")).click();// 10-6 = 4sec wait
		//e4 --10sec
		//e5 -- 10sec
		//e6 -- 10sec
		
		//Home page : 20 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//sel 4.x
		
		//login page : 20 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//sel 4.x

		
		//register : 5sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x

		
		//login:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x

		
		//forgotpwd : 0 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel 4.x

		
		
		//only for WebElement - svg,iframe
		//it dosen't support non Web Element - title,url,alerts-js



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
