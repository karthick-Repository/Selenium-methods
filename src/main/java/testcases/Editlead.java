package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Editlead extends SeMethods{
@Test
public void run() throws InterruptedException {
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
WebElement findlead = locateElement("link", "Find Leads");
click(findlead);
WebElement fname = locateElement("xpath", "(//input[@name='firstName'])[3]");
type(fname, "Aaron");
WebElement findleads = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
click(findleads);
Thread.sleep(2000);
WebElement leadid = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
click(leadid);
WebElement edit = locateElement("xpath", "//a[contains(text(),'Edit')]");
click(edit);
WebElement department = locateElement("id", "updateLeadForm_departmentName");
type(department, "Sports");
WebElement Update = locateElement("name", "submitButton");
click(Update);
}   
}