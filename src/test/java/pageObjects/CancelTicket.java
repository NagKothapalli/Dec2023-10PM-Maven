package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelTicket
{
	//WebDriver driver = new ChromeDriver(); // one new chrome window will be opened - 1435
	public void navigateToCancelTicket()
	{
		System.out.println("RC : Navigate to Cancel Ticket");
	}
	
	public void cancelTicket()
	{
		System.out.println("RC : Cancel the Bus Ticket");
	}

}
