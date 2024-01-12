package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home
{
	//WebDriver driver = new ChromeDriver(); // one new chrome window will be opened - 5678
	WebDriver driver;  // null  
	public Home(WebDriver mydriver) // 1234
	{
		driver = mydriver;
	}
	public void bookTickt()
	{
		System.out.println("RC : Book Bus Ticket");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD"); //Hardcoded
		Actions actions = new Actions(driver);		
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='19']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	public void printTicket()
	{
		System.out.println("RC : Print Bus Ticket");
	}
	
	public void editTicket()
	{
		System.out.println("RC : Edit Ticket");
	}

}
