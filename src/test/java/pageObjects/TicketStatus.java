package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketStatus
{
	//WebDriver driver = new ChromeDriver(); // one new chrome window will be opened - 56547
	public void navigateToTicketStatus()
	{
		System.out.println("RC : Navigate to Ticket Status");
	}
	
	public void checkTicketStatus()
	{
		System.out.println("RC : Check Bus Ticket Status");
	}


}
