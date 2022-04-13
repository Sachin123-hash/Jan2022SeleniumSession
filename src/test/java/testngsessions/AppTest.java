package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	// global pre conditions
	// pre conditions
	// test steps + actual vs exp results
	// post steps
	/**
 BS--connectWithDB
BT---createUser
BC---launchBrowser

BM----login
headerTest
AM---logout

BM----login
page title test
AM---logout

BM----login
userloggedTest
AM---logout

AC----closeBrowser
AT---deleteUser


PASSED: headerTest
PASSED: titleTest
PASSED: userloggedTest
	 */

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS--connectWithDB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT---createUser");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launchBrowser");
	}
	@BeforeMethod
	public void login(){
		System.out.println("BM----login");
		
	}
	@Test
	public void titleTest() {
		System.out.println("page title test");
	}
	@Test
	public void headerTest() {
		System.out.println("headerTest");
	}
	@Test
	public void userloggedTest() {
		System.out.println("userloggedTest");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM---logout");
	}
	@AfterClass
	public void closeBrowser(){
		System.out.println("AC----closeBrowser");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT---deleteUser");
	}
	@AfterSuite
	public void dissconnectWithDB() {
		System.out.println("AS----dissconnectWithDB");
	}
}
