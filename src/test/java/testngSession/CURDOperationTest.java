package testngSession;

import org.testng.annotations.Test;

public class CURDOperationTest {

	public void createUser() {
		System.out.println("create user");
	}

	public void getUser() {
		System.out.println("get User");
	}

	public void updateUser() {
		System.out.println("Update User");
	}

	public void deleteUser() {
		System.out.println("delete user");
	}

	@Test
	public void createUserTest() {
		createUser();//post
	}
	@Test
	public void getUserTest() {
		createUser();//post
		getUser();//get
	}
	@Test
	public void updateUserTest() {
		createUser();//post 
		getUser();//get 
		updateUser();//put 
		getUser();//get
	}
	@Test
	public void deleteUserTest() {
		createUser();//post
		getUser();//get
		deleteUser();//delete
		getUser();//get
	}
	

}
