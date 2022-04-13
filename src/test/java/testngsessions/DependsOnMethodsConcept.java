package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	//avoid dependency in tests
	//test cases--should be independent to each other
	@Test
	public void loginTest() {
		System.out.println("logintest");
		int i=9/2;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePgaeTest() {
		System.out.println("HomePgaeTest");
		int i=9/0;
	}
	@Test(dependsOnMethods={"loginTest","HomePgaeTest"})
	public void searchPageTest() {
		System.out.println("searchPageTest");
	}

}
