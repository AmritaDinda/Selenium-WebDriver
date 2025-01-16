package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClanderHandling {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();		
//		driver.findElement(By.xpath("//a[text()='13']")).click();
		

		
		
		
		
		
		
		
		
		
		
		SelectFutureDate("March2025","14");
//		selectDate("26");
//		selectClanderDate("14");
		
		
	}
	
	public static void SelectFutureDate(String ExpectMonthoryear ,String day) {
		
		if(ExpectMonthoryear.contains("February") && Integer.parseInt(day)>29) {
			System.out.println("plz pass the right month/year...");
			return;
		}
		if(Integer.parseInt(day)>31) {
			System.out.println("plz pass the right date...");
			return;
		}
		
		
		
		String actualMonth = driver.findElement(By.xpath("ui-datepicker-title")).getText();
		System.out.println(actualMonth);

		while(!actualMonth.equalsIgnoreCase(ExpectMonthoryear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
					
			actualMonth = driver.findElement(By.xpath("ui-datepicker-title")).getText();
			System.out.println(actualMonth);

		}
		selectDate(day);
	}
		
		
	
	public static void selectClanderDate(String day) {
		List<WebElement>dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		System.out.println(dayList.size());
		for(WebElement e:dayList) {
			String getT= e.getText();
			if(getT.equals(day)) {
				e.click();
				break;
			}
		}
	}
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

	}

	
	
	//cssSeelctor for Dynamic calander-
	       //  https://www.goibibo.com/
	
	//div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside)    -17
	//div.DayPicker-Day--selected     -current date
	//div.DayPicker-Day:not(.DayPicker-Day--outside)   -dates for both the month
	//div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled)   -only enable dates from both the month
	
	
	
	
	
	
}
