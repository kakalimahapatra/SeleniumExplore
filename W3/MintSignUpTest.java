package com.selenium.test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MintSignUpTest {

	WebDriver driver; //interface
	
	@Before
	public void setup(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mint.com");
		
	}
	@After
	public void teardown(){
		//driver.close();
	}

	@Test
	public void openmint() throws InterruptedException {
		driver.findElement(By.id("signup_button")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("form-signup-username")).sendKeys("shamukamohapatra@gmail.com");
		if(driver.findElement(By.id("form-signup-username-confirm")).isDisplayed())
			driver.findElement(By.id("form-signup-username-confirm")).sendKeys("shamukamohapatra@gmail.com");
		Select select = new Select(driver.findElement(By.id("form-signup-country")));
		select.selectByVisibleText("United States");
		driver.findElement(By.name("zipcode")).sendKeys("95132");
		driver.findElement(By.id("form-signup-password")).sendKeys("Welcome123");
		if(driver.findElement(By.id("form-signup-password-confirm")).isDisplayed())
			driver.findElement(By.id("form-signup-password-confirm")).sendKeys("Welcome123");
		driver.findElement(By.id("form-signup-terms")).click();
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();

	}


}
