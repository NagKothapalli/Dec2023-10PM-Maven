package driverUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionUtilities
{
	
	//click Enter , Tab , Double click , Right click
	
	Actions actions;
	WebDriver driver; //null
	
	public ActionUtilities(WebDriver driver) //local variable
	{
		this.driver = driver;
		actions = new Actions(driver);
	}
	
	public WebElement returnElement(String myxpath) //Method overloading
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //Explicit wait
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath)));
		//WebElement element = driver.findElement(By.xpath(myxpath));
		System.out.println("Object with xpath is available :" + myxpath);
		return element;
	}
	
	public WebElement returnElement(String myxpath,int waitTime)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime)); //Explicit wait
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath)));
		//WebElement element = driver.findElement(By.xpath(myxpath));
		System.out.println("Object with xpath is available :" + myxpath);
		return element;
	}
	
	public void clickEnter()
	{
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void waitAndClickEnter()
	{
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickTab()
	{
		actions.sendKeys(Keys.TAB).build().perform();
	}
	
	public void doubleClick(WebElement element)
	{
		actions.moveToElement(element).doubleClick().build().perform();
	}
	
	public void rightClick(WebElement element)
	{
		actions.moveToElement(element).contextClick().build().perform();
	}
	
	//Take a screenshot
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
