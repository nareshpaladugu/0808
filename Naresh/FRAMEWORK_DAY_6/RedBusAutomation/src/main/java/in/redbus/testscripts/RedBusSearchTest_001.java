package in.redbus.testscripts;

import org.testng.annotations.Test;

import in.redbus.base.Base;
import in.redbus.businessmethods.RedBusHomePage;
import in.redbus.datadriven.TestData;
import in.redbus.utilities.TestFailedException;

public class RedBusSearchTest_001 extends Base{
	
	
	@Test
	public void redBusSearchTest_001() throws TestFailedException, Exception
	{
		redBusHomePage = new RedBusHomePage(driver);
		redBusHomePage.invokeRedBusApplication();
		redBusHomePage.seacrhForBuses(TestData.getCellData("fromPlace", "REDBUS_TESTCASE_001.xls"), TestData.getCellData("ToPlace", "REDBUS_TESTCASE_001.xls"));
	}

}
