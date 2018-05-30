package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;

public class DeleteLead extends SeMethods{

@Test
public void deleteLead() throws InterruptedException {

startApp("chrome", "http://leaftaps.com/opentaps");

WebElement userName = locateElement("id","username");
type(userName, "DemoSalesManager");

WebElement passWord = locateElement("id", "password");
type(passWord, "crmsfa");

WebElement login = locateElement("class", "decorativeSubmit");
click(login);

WebElement crmsfa = locateElement("link", "CRM/SFA");
click(crmsfa);

WebElement lead = locateElement("link", "Leads");
click(lead);

WebElement flead = locateElement("link", "Find Leads");
click(flead);

WebElement fname = locateElement("xpath", "(//input[@name='firstName'])[3]");
type(fname, "Karthick");

WebElement Find = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
click(Find);
Thread.sleep(3000);

String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

WebElement cell = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
click(cell);

verifyTitle("View Lead | opentaps CRM");

WebElement delete = locateElement("link", "Delete");
click(delete);

WebElement findleads = locateElement("link", "Find Leads");
click(findleads);

WebElement fid = (locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"));
type(fid, "txt");

WebElement leadfind = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
click(leadfind);

WebElement veri = locateElement("xpath", "//div[@class='x-paging-info']");	
verifyPartialText(veri, "No records to display");
}
}