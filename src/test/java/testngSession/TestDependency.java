package testngSession;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void searchTest() {
		System.out.println("SearchTest");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void addToCard() {
		System.out.println("addToCard");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "addToCard")
	public void makePayment() {
		System.out.println("makePayment");
	}



}
