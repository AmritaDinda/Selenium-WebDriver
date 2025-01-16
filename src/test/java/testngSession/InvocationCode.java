package testngSession;

import org.testng.annotations.Test;

public class InvocationCode {

	@Test(invocationCount = 10)  //use for performance and load test
	public void createUser() {
		System.out.println("create user");
	}

	
	
	
	
	
}
