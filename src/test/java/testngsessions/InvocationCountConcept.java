package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount=10,priority=2)
	public void loginTest() {
		System.out.println("loginTest");
	}

	@Test(invocationCount=3,priority=1)
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}

}
