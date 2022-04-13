package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest extends LoginTest{
	
	@Test
	public void titleTest() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account");
		
	}

}
