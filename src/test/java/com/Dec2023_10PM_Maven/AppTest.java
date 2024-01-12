package com.Dec2023_10PM_Maven;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	@Test
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
	}
   
}
