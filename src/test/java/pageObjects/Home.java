package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.ActionUtilities;
import generalUtilities.ReadProperties;

public class Home  // page object
{
	//WebDriver driver = new ChromeDriver(); // one new chrome window will be opened - 5678
	WebDriver driver;  // null  
	ReadProperties rp;
	ActionUtilities au;
	public Home(WebDriver mydriver) // 1234
	{
		driver = mydriver;
		rp = new ReadProperties("D:\\WorkSpace\\Java\\Dec2023-10PM-Maven\\TestData\\DevEnv.properties");
		au = new ActionUtilities(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='source']")   WebElement sourceObj;
	@FindBy(xpath="//input[@name='destination']")   WebElement destinationObj;
	@FindBy(xpath="//input[@name='txtJourneyDate']")   WebElement openCalendarObj;
	@FindBy(xpath="//a[text()='29']")   WebElement jDateObj;
	@FindBy(xpath="//input[@name='searchBtn']")   WebElement searchButtonObj;
	
	
	String source = "//input[@name='source']";
	String destination = "//input[@name='destination']";
	String openCalendar = "//input[@name='txtJourneyDate']";
	String jDate = "//a[text()='29']";
	String searchButton = "//input[@name='searchBtn']";
	
	
	public void bookTickt_factory()
	{
		System.out.println("RC : Book Bus Ticket");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//driver.findElement(By.xpath(source)).sendKeys(rp.readData("FromCity")); //Hardcoded
		sourceObj.sendKeys(rp.readData("FromCity"));
		au.waitAndClickEnter();
		destinationObj.sendKeys(rp.readData("ToCity"));
		au.waitAndClickEnter();
		openCalendarObj.click();
		jDateObj.click();
		searchButtonObj.click();
	}
	
	public void bookTickt_xpath()
	{
		System.out.println("RC : Book Bus Ticket");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath(source)).sendKeys(rp.readData("FromCity")); //Hardcoded
		au.waitAndClickEnter();
		driver.findElement(By.xpath(destination)).sendKeys(rp.readData("ToCity"));
		au.waitAndClickEnter();
		driver.findElement(By.xpath(openCalendar)).click();
		driver.findElement(By.xpath(jDate)).click();
		driver.findElement(By.xpath(searchButton)).click();
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
