package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;

public class MergeLead extends SeMethods{

	@Test
	public void mergeLead() throws InterruptedException {

		startApp("chrome", "http://leaftaps.com/opentaps");

		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");

		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");

		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);

		WebElement crmsfa = locateElement("link", "CRM/SFA");
		click(crmsfa);

		WebElement leads = locateElement("link", "Leads");
		click(leads);

		WebElement mergelead = locateElement("link", "Merge Leads");
		click(mergelead);

		WebElement from = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		click(from);

		switchToWindow(1);

		WebElement fname = locateElement("name","firstName");
		type(fname, "karthick");

		WebElement flead = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(flead);

		Thread.sleep(2000);

		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

		WebElement leadid1 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickWithNoSnap(leadid1);

		switchToWindow(0);

		WebElement to = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		click(to);
		switchToWindow(1);

		WebElement toname = locateElement("name","lastName");
		type(toname, "Harish");

		WebElement tolead = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(tolead);

		Thread.sleep(2000);	

		WebElement grid = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a");
		clickWithNoSnap(grid);

		switchToWindow(0);


		WebElement merbutton = locateElement("xpath", "//a[text()='Merge']");
		clickWithNoSnap(merbutton);
		acceptAlert();

		/*WebElement fllead = locateElement("linkText", "Find Leads");
click(fllead);*/
		
	}
	
}