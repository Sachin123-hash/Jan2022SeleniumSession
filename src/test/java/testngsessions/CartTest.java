package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest2 {
	@Test(priority=2)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account");
	}

	@Test(priority=3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("account/account"));
	}

	@Test(priority=1)
	public void searchTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("carttestingdemo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());

	}
	@Test(priority=4)
	public void checkMyAccount() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'My Account')]")).isDisplayed());
	}

	@Test(priority=5)
	public void checkLogout() {
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	@Test(priority=6)
	public void checkItem() {
		Assert.assertTrue(driver.findElement(By.xpath("//button[@type='button' and @data-toggle='dropdown']")).isDisplayed());         
	}
	
}


