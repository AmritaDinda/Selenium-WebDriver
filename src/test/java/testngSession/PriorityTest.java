package testngSession;

import org.testng.annotations.Test;

public class PriorityTest {

	//if you are organize the sequence use priority
	// the priority it will run first before non-priority

	@Test(priority =1)
	public void a_test() {
		System.out.println("a_test");
	}
	@Test(priority =3)
	public void b_test() {
		System.out.println("b_test");
	}
	@Test
	public void c_test() {
		System.out.println("c_test");
	}
	@Test(priority =2)
	public void d_test() {
		System.out.println("d_test");
	}
	@Test(priority =4)
	public void e_test() {
		System.out.println("e_test");
	}
}
