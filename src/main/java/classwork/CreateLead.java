package classwork;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateLead extends SeMethods{

@Test
public void createLead() {

startApp("chrome", "http://leaftaps.com/opentaps");

WebElement userName = locateElement("id","username");
type(userName, "DemoSalesManager");

WebElement passWord = locateElement("id", "password");
type(passWord, "crmsfa");

WebElement login = locateElement("class", "decorativeSubmit");
click(login);

WebElement crmsfa = locateElement("link", "CRM/SFA");
click(crmsfa);

WebElement createlead = locateElement("link", "Create Lead");
click(createlead);

WebElement company = locateElement("id", "createLeadForm_companyName");
type(company, "Google");

WebElement fname = locateElement("id", "createLeadForm_firstName");
type(fname, "Aaron");

WebElement lname = locateElement("id", "createLeadForm_lastName");
type(lname, "Finch");

WebElement ddown = locateElement("id", "createLeadForm_dataSourceId");
selectDropDownUsingIndex(ddown, 4);

WebElement ddown1 = locateElement("id", "createLeadForm_marketingCampaignId");
selectDropDownUsingText(ddown1, "Demo Marketing Campaign");

WebElement createbutton = locateElement("class", "smallSubmit");
click(createbutton);

}



}