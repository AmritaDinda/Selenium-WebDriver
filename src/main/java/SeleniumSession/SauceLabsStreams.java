package SeleniumSession;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsStreams {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		//priceList.stream().forEach(e ->System.out.println(e.getText()));
		//$29.99 = "29.99" = 29.99
		
//		List<Double> sorted_prices = priceList
//		                               .stream()
//		                                       .map(e ->Double.parseDouble(e.getText().substring(1)))
//                                                        .sorted()
//                                                               .collect(Collectors.toList());
//		
//		System.out.println(sorted_prices);
		
//		--------####----------
		
		List<Double> sorted_prices_desc = priceList
                                               .stream()
                                                      .map(e ->Double.parseDouble(e.getText().substring(1)))
                                                             .sorted(Comparator.reverseOrder())
                                                                    .collect(Collectors.toList());

        System.out.println(sorted_prices_desc);
		
//		--------####----------

		
//		double firstPrice = priceList
//                                  .stream()
//                                            .map(e ->Double.parseDouble(e.getText().substring(1)))
//                                                       .findFirst().get();
//
//		 System.out.println(firstPrice);
		
//		--------####----------

		
//		double lastPrice = priceList
//                                   .stream()
//                                         .map(e ->Double.parseDouble(e.getText().substring(1)))
//                                                 .reduce((first, second)->second).get();
// 
//		 System.out.println(lastPrice);
		
//		--------####----------
		
//		double maxPrice = priceList
//                             .stream()
//                                    .map(e ->Double.parseDouble(e.getText().substring(1)))
//                                             .max(Double::compareTo).get();
//		 System.out.println(maxPrice);
		
//		--------####----------

	    double minPrice = priceList
                                    .stream()
                                             .map(e ->Double.parseDouble(e.getText().substring(1)))
                                                  .min(Double::compareTo).get();
          System.out.println(minPrice);

//--------####----------

		
		
	}

}
