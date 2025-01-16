package testngSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

	// global pre conditions
	// pre condition
	// test cases --> test steps --> act vs exp result -- > assertion
	// post steps
	// global post steps
	
	
//	BS - startDBConnection
//	BT - creatUser
//	BC - LaunchBrowser
	
//	BM - loginToApp
//	homePageSearchTest
//	AM - logOut
	
//	BM - loginToApp
//	homePageTitleTest
//	AM - logOut
	
//	BM - loginToApp
//	homePageUrlTest
//	AM - logOut
	
//	AC - closeBrowser
//	AT - deleteUser
//	AS - closeDBConnection

	

	@BeforeSuite                   //1.Run
	public void startDBConnection() {
		System.out.println("BS - startDBConnection");
	}

	@BeforeTest                    //2.Run
	public void creatUser() {
		System.out.println("BT - creatUser");
	}

	@BeforeClass                   //3.Run
	public void LaunchBrowser() {
		System.out.println("BC - LaunchBrowser");
	}

	@BeforeMethod                  //4 ,7 ,10 .Run
	public void login() {
		System.out.println("BM - loginToApp");
	}

	
	
    @Test                           //8.Run
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	@Test                            //11.Run
	public void homePageUrlTest() {
		System.out.println("homePageUrlTest");
	}
	
	@Test                           //5.Run
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}

		
	 
	@AfterMethod                      //6 ,9 ,12 .Run
	public void logOut() {
		System.out.println("AM - logOut");
	}

	@AfterClass
	public void closeBrowser(){
		System.out.println("AC - closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - deleteUser");
	}

	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS - closeDBConnection");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
