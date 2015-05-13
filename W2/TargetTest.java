package com.selenium.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TargetTest {

	WebDriver driver;

	@Before
	public void setUp()  {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.target.com");
	}

	@After
	public void tearDown()  {
		//driver.close(); //if  executed it will close the browser
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("new guest?")).click();		
		Thread.sleep(10000);
		driver.findElement(By.name("firstName")).sendKeys("Shamuka");
		driver.findElement(By.name("lastName")).sendKeys("Ratha");		
		driver.findElement(By.id("logonId")).sendKeys("shamukamohapatra@gmail.com");//doesnt work with name
		driver.findElement(By.id("logonPassword")).sendKeys("bolangir123");

		typeToElementIfVisible(driver.findElement(By.id("logonPasswordVerify")),"bolangir123");
		driver.findElement(By.id("CreateAccount")).click();
	}

	public void typeToElementIfVisible(WebElement element, String text)
	{
		if(element.isDisplayed())
			element.sendKeys(text);
		else
			System.out.println("Element "+element+ " is not visible to type");
	}

}
