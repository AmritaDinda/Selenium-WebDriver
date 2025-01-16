package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoustomXpathConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				
		

	//Xpah: address of the element in html dom ,it's not a Attribute just like class,name,id etc.
		//1.absolute Xpath: //*[@id="menu"]/div[2]/ul/li[4]/a
		//2.relative Xpath: coustom Xpath
		
		
	//tag[@attr = 'value']
		 //tag[@id = 'input-email']
		 //tag[@placeholder = 'E-mail Address']

	//tag[@attr1 = 'value' and @attr2 = 'value']
		//tag[@type = 'text' and @name = 'email']
		//tag[@type = 'text' and @name = 'email' and @id = 'input-email']

		
	//Xpath with text:
		//text is not a attribute, it's the text content of the element
		//don't use this @text...we use text() function
		//tag[text() = 'value']
		//h2[text() = 'Returning Customer']
		
	//check my account link is present or not
		By myAcc = By.xpath(".//a[text() = 'My Account']");
		int myccou = driver.findElements(myAcc).size();
		if(myccou == 2) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");

			}
		
	//text() with attribute:
		//tag[@attr = 'value' and text() = 'value']
		//a[@class = 'list-group-item' and text() = 'Register'] 
		//a[@class = 'list-group-item' and text() = 'Register' and @href] 

		
	//contains() with attribute:
		//tag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@id,'email')]  //contains it is a function it will ask for the parameters
			
                                                   //		dynamic id/attribute:
                                                   //		<input id = firstname_123>
                                                   //		<input id = firstname_456>
                                                  //		<input id = firstname_678>
		
		
	//contains with one attribute and use another @attribute with contains:
		//tag[contains(@attr1,'value') and @attr2 = 'value']
		//input[contains(@placeholder,'E-Mail') and @name = 'email']

		
	//contains with text():
		//tag[contains(text(),'value']
		//strong[contains(text(),'I am a returning customer')]
		//a[contains(text(),'Amazon']
		
		
	//contains() with text() and contains with @attribute:
		//tag[contains(text(),'value') and contains(@atrr,'value')]
		
	//contains() with text() and @attribute	without contains:
		//tag[contains(text(),'value') and @attr = 'value']
		
		
	//Starts-with:
		//tag[starts-with(text(),'value')]
		//p[starts-with(text(),'By creating')]
		//tag[starts=with(@attr = 'value')]
	
	//ends-with xpath ?? - no this type of function is not available	
		
	
	//position/index in Xpath:
		// (//tag[@attr = 'value'])[2]
		// (//input[@class = 'form-control'])[1]
		By.xpath("(input[@class = 'form-control'])[1]");
		// (//input[@class = 'form-control'])[position()=1]
		// (//input[@class = 'form-control'])[last()]
		// ((//div[contains(@class,'col-sm-3')])[last()]//a)[last()]
		
		
	//class in locator: className,Xpath,css
		//div[contains(@class,'UIFlex__StyledFlex-sc-15zd3f5-0 jnrgAA private-flex p-top-5')]   //--valid
		//div[contains(@class,'private-flex')]  //not valid --- we have to right full className
		By.className("//div[contains(@class,'UIFlex__StyledFlex-sc-15zd3f5-0 jnrgAA private-flex p-top-5')]");  // not valid
		By.className("//div[contains(@class,'private-flex')]"); //-- valid
		
	
	//parent to child:
		//  parent/child = direct
		//  parent//child = direct + indirect
		
		//  (//div[@class = 'private-form__input-wrapper'])[1]/input)
		//  (//div[contains(@class,'private-form__control-wrapper')]//div[@class ='private-form__input-wrapper' ]/input[@id='username'])
		
		
	//child to parent: backward traversing	
	  	//input[@id ='input-email']/../../../../../../../../../..
		//input[@id ='input-email']/parent::div      //jump to parent
		//input[@id ='input-email']/ancestor::div    //-- jump to grandparent
		
		
	//siblings:	
		//input[@id ='input-email']/preceding-sibling::label
		//label[@for ='input-email']/following-sibling::input
		driver.findElement(By.xpath("//input[@id ='input-email']/preceding-sibling::label")).getText();
		
		
		
		
		
		
		
		
		}		
		
	}


