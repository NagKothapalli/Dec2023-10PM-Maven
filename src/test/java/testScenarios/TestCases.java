package testScenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackService;

public class TestCases  // child class
{
	WebDriver driver = new ChromeDriver(); //1234
	Login login = new Login(driver);//1234 // parent class
	Home home = new Home(driver);//1234
	CancelTicket cancelTicket = new CancelTicket();
	TicketStatus ticketStatus = new TicketStatus();
	TrackService trackService = new TrackService();
	@Test
	public void bookTicketAndPrint() //Ram -  Sprint - Automation UserStory - Manual Steps - Automation - execute - report - close the story
	{
		System.out.println("Test Case : Book Ticket And Print");
		//launch , login , bookTicket , printTicket , logout , close
		login.launchApplication();
		login.loginToApplication();
		//home.bookTickt();
		//home.bookTickt_xpath();
		home.bookTickt_factory();
		home.printTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookTicketAndCancel() // Ravi
	{
		System.out.println("Test Case : BookTicketAndCancel");
		//launch , login , bookTicket , cancel , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.bookTickt();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookTicketAndCheckStatus() //Raj
	{
		System.out.println("Test Case : BookTicketAndCheckStatus");
		//launch , login , bookTicket , check Status , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.bookTickt();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookTicketAndTrackService()
	{
		System.out.println("Test Case : BookTicketAndTrackService");
		//launch , login , bookTicket , printTicket , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.bookTickt();
		trackService.navigateToTrackService();
		trackService.trackTheBusService();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookTicketPrintAndCancel() //Rajesh
	{
		System.out.println("Test Case : BookTicketPrintAndCancel");
		//launch , login , bookTicket , printTicket , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.bookTickt();
		home.printTicket();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}

}
