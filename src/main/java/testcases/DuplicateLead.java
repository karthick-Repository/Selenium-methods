package testcases;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DuplicateLead extends SeMethods{

	@Test (enabled=false)
	public void duplicateLead() throws InterruptedException {
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


		WebElement flead = locateElement("link", "Find Leads");
		click(flead);

		WebElement phon = locateElement("xpath", "//span[contains(text(),'Phone')]");
		click(phon);

		WebElement number = locateElement("name", "phoneNumber");
		type(number, "9944332211");

		WebElement Flead1 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(Flead1);
		Thread.sleep(2000);

		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		WebElement field = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickWithNoSnap(field);
		
	}
}