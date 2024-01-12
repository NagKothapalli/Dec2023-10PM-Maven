package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	 // = new ChromeDriver(); // one new chrome window will be opened - 1234
	WebDriver driver;  // null  
	public Login(WebDriver mydriver) // 1234
	{
		driver = mydriver;
	}
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get("https://www.apsrtconline.in/");
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}

}
