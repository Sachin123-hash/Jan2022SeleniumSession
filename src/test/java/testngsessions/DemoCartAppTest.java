package testngsessions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoCartAppTest extends BaseTest{
	

	@Test(description="verifying title test of demo cart application...")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account");
	}

	@Test(enabled=true,description="url test...")
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("account/account"));
	}

	@Test(description="this is search test...")
	public void searchTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("carttestingdemo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());

	}
	
	
}
