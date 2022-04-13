package Assigement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element {

	private WebDriver driver;

	

	public Element(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doElementgetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	
	public boolean doIsdisplayed(By locator) {
		return getElement(locator).isDisplayed();
}
}
