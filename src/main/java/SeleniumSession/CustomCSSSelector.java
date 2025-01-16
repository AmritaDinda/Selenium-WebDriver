package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		//id
		//#id
		//#input_firstName	-- css
		//input[@id='input_firstName'] -- Xpath
//		By fn = By.cssSelector("#input_firstName");
		
		//tag#id
		//input#input_firstName
		
		//class
		//.class
		//.form-control
		//.login-email
		
		//tag.class
		//input.form-control
		//input.login-email
		//button.login-submit
		
		//.c1.c2.c3.c4.......cn
		//.form-control.login-email.private-form_control
		
		//tag.c1.c2.c3.c4.......cn
		//input.form-control.login-email.private-form_control
		
		//tag.c1.c2.c3.c4.......cn#id
		//input.form-control.login-email.private-form_control#username
		
		//tag#id.class
		//input#username.login-email
		
		//tag.class#id
		//input.login-email#username
		
		//.class#id
		//.login-email#username
		
		//#id.class
		//#username.login-email
		
		//other attr:
		//tag[attr ='value']
		//input[type = 'text'] --css
		//input[@type = 'text'] --Xpath
		
		//Multipal attr:
		//tag[attr1='value'][attr2='vlaue'][attr3='value']
		//input[type='text'][name='firstname'][placeholder='First Name'] --css
		//input[@type='text'][@name='firstname'][@placeholder='First Name'] --Xpath
		
		//tag#id[attr='value']
		//input#input_firstName[type='text'][name='firstname'][placeholder='First Name']
		//input#input_firstName[type='text'][name='firstname'][placeholder='First Name'].form-control

		//h1[text()='Register Account']
		//text is not support in css
		
		//contains:
		//tag[attr*='value']
		//input[id*='input_firstName']
		//input[class*='login=email']
		
		//starts-with:
		//tag[attr^='value']
		//input[placeholder^='First']
		//input[id^='naveen_']
		
		//ends-with:
		//tag[attr$='value']
		//input[placeholder$='Name']
		
		//parent to child:
		//parent tag child tag -- indirect child + direct child
		//parent tag > child tag > child tag -- direct child
		
		//child to parent: backward traversing not possible
		
		
		//or - comma in css:
		//input#username,form#hs-login,input#password,button#loginBtn,noscript#no-script
		int importantEle = driver.findElements(By.cssSelector("input#username,form#hs-login,input#password,button#loginBtn,noscript#no-script"))
		.size();
		
		if(importantEle == 5) {
			System.out.println("PASS");
		}
		
		//not in css:
		//input.form-control:not(input[id='password'])
		
		
	//indexing:
		//select#Form_getForm_Country > option:first-child
		//select#Form_getForm_Country > option:last-child
		
		//select#Form_getForm_Country > option:first-of-type
		//select#Form_getForm_Country > option:last-of-type
		
		//select#Form_getForm_Country > :first-child
    	//select#Form_getForm_Country > :first-of-type

		//select#Form_getForm_Country > option:nth-of-type(2)
		//select#Form_getForm_Country > :nth-of-type(2)

	//sibling in css:
		//label[for='input-email'] +input[name='email'] --immediate sibling
		//div.private-form_label-wallpaper ~ div  --all forward siblings
		
		
		
		
		
		                      // xpath                         vs                   css

		//syntax:              complex                                           simple
		//text():               yes                                                no
		//AND:                  yes                                                yes
		//or:                   yes                                                yes
		//forward:              yes                                                yes
		//backward:             yes                                                no
		//forward sibling:      yes                                                yes
		//backward sibling:     yes                                                no
		//not:                  no                                                 yes
		//index:                yes                                                yes
		//capture group:        yes                                                no
		//performance:          good                                               yes
		//starts-with:          yes                                                yes
		//contains:             yes                                                yes
		//end-with:             no                                                 yes
		//Webtable:             easy                                               limited
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
