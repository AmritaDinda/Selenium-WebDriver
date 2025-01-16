package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSClose {

	public static void main(String[] args) {

		//SID = session id
		
		WebDriver driver = new ChromeDriver(); //SID = (98175529de5d72cbc5b8976f272cca26)
		driver.get("https://www.google.com"); //SID = (98175529de5d72cbc5b8976f272cca26)
		System.out.println(driver.getTitle()); //SID = (98175529de5d72cbc5b8976f272cca26)
		System.out.println(driver.getCurrentUrl()); //SID = (98175529de5d72cbc5b8976f272cca26)
		
		//driver.quit(); //SID = (98175529de5d72cbc5b8976f272cca26) After this
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//SID = null
		
		driver.close(); //SID = (98175529de5d72cbc5b8976f272cca26) After this
		//NoSuchSessionException: invalid session id
		//SID = Same and invalid
		
		driver = new ChromeDriver(); //SID = ......
		driver.get("https://www.amazon.com"); //SID = ......
		System.out.println(driver.getTitle()); //SID = ......
		
		
		
		
		
	}

}
