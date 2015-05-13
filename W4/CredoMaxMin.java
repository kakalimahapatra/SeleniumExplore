//http://www.credomobile.com/

package com.selenium.test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CredoMaxMin {


	WebDriver driver;

	@Before
	public void setUp() throws Exception
	{
		driver= new FirefoxDriver();
		driver.get("http://www.credomobile.com/phones");
	}


	@Test
	public void testMaxMinPhone() 
	{

		ArrayList<String> arl=new ArrayList();
		//driver.findElement(By.id("btnChangeHSCategory7")).click();
		String s1= driver.findElement(By.xpath("//div[@id='divMatrix']/div[@class='phone '][@id='246']")).getText();
		System.out.println(s1);
		String price1= driver.findElement(By.className("ourPrice")).getText();
		arl.add(price1);
		System.out.println(price1);
		assertEquals("$199.99", price1);
		System.out.println();

		//driver.findElement(By.id("223")).click();
		String s2= driver.findElement(By.xpath("//div[@id='divMatrix']/div[@class='phone '][@id='223']")).getText();
		System.out.println(s2);
		String price2=  driver.findElement(By.xpath("//div[@id='divMatrix']/div[5]/div[3]/div[@class='ourPrice']")).getText();	 
		arl.add(price2);
		System.out.println(price2);
		assertEquals("$149.00", price2);
		System.out.println();


		//driver.findElement(By.id("222")).click();
		String s3= driver.findElement(By.xpath("//div[@id='divMatrix']/div[@Class='phone ' ][@id='222']")).getText();
		System.out.println(s3);
		String price3= driver.findElement(By.xpath("//div[@id='divMatrix']/div[8]/div[3]/div[@class='ourPrice']")).getText();
		arl.add(price3);
		System.out.println(price3);
		System.out.println();

		String s4 = driver.findElement(By.xpath("//div[@id='221'][@class='phone ']")).getText();
		System.out.println(s4);
		String price4 = driver.findElement(By.xpath("//div[@id='221'][@class='phone ']//div[3]/div[@class='ourPrice']")).getText();
		System.out.println(price4);
		arl.add(price4);
		System.out.println();


		//System.out.println(arl);

		String s5 = driver.findElement(By.xpath("//div[@id='209'][@class='phone ']")).getText();
		System.out.println(s5);
		String price5 = driver.findElement(By.xpath("//div[@id='divMatrix']//div[13]//div[3]/div[@class='ourPrice']")).getText();
		System.out.println(price5);
		arl.add(price5);


		String temp =	driver.findElement(By.xpath("//div[@id='divMatrix']//div[17]/div[@class='title']")).getText();
		System.out.println(temp);


	}
}


