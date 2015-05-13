package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstExample  {
	public static void main(String[] args) {
		System.out.println("Start program");

		WebDriver driver = new FirefoxDriver();

		// visit Google
		driver.get("http://www.google.com");
		//driver.navigate().to("http://www.google.com");

		// Find the text input element by its name
		//WebElement element = driver.findElement(By.name("q"));

		// Enter something to search for
		//element.sendKeys("Cheese!");

		// Now submit the form. WebDriver will find the form for us from the element
		//element.submit();

		// Check the title of the page
		//System.out.println("Page title is: " + driver.getTitle());

		//driver.quit();
	}
}