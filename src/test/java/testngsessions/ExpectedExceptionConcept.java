package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	@Test(expectedExceptions = {NullPointerException.class,ArithmeticException.class})
	public void b_test() {
		System.out.println("b_test");
		int i=9/0;
		ExpectedExceptionConcept obj= null;
		obj.name="tom";
	}


}
