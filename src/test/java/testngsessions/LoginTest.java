package testngsessions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest1 {
	
	@Test
	public void searchTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("carttestingdemo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());

	}

}
