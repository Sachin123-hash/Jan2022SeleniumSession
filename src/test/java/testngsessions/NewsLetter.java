package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsLetter extends HomePage {
	
	

	@Test(priority = 1)
	public void getLetter() {
		
		driver.findElement(By.linkText("Newsletter")).click();
	}
	
	

	
	@Test(enabled=true,priority = 2)
	public void getNewsTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Newsletter Subscription");
	}
}
