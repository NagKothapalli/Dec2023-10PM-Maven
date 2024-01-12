package testBatches;

import org.junit.Test;

import testScenarios.TestCases;

public class TestSuites extends TestCases
{
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		bookTicketAndPrint();
		bookTicketAndCheckStatus();
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		bookTicketAndPrint();
		bookTicketAndCheckStatus();
		bookTicketAndCancel();
		bookTicketAndTrackService();
		bookTicketPrintAndCancel();
	}

}
