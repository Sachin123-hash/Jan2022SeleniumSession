package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseTest3 {

	@Test(priority = 3)
	public void getAccount() {

		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'My Account')]")).isDisplayed());

	}

	@Test(priority = 2)
	public void getOrders() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]")).isDisplayed());
	}

	@Test(priority = 1)
	public void login() {

		driver.findElement(By.id("input-email")).sendKeys("carttestingdemo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();

	}

}
