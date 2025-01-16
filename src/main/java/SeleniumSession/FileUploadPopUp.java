package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		//4.file upload pop up
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\ashis\\Downloads\\autumn-season-leafs-plant-scene-generative-ai_188544-7971.avif");
		//<tag type="file"> --it is mandatory attribute
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
