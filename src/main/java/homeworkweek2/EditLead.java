package homeworkweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	
				// TODO Auto-generated method stub
		         System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		         ChromeDriver driver =new ChromeDriver();
		         
		         driver.manage().window().maximize();
		         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		         
		         driver.get("http://leaftaps.com/opentaps");
		         
		         driver.findElementById("username").sendKeys("DemoSalesManager");
		         
		         driver.findElementById("password").sendKeys("crmsfa");
		         
		         driver.findElementByClassName("decorativeSubmit").click();
		         
		         Thread.sleep(1000);
		         		         
		         driver.findElementByLinkText("CRM/SFA").click();
		         driver.findElementByLinkText("Leads").click();
		         driver.findElementByLinkText("Find Leads").click();
		         
		         driver.findElementByXPath("(//input[@class=' x-form-text x-form-field'])[25]").sendKeys("sample");
		         driver.findElementByXPath("//button[text()='Find Leads']").click();
		         
		         driver.findElementByXPath("//a[text()='10059']").click();
		         
		         driver.findElementByXPath("//a[text()='Edit']").click();
		         
		         driver.findElementById("updateLeadForm_companyName").clear();
		         
		         driver.findElementById("updateLeadForm_companyName").sendKeys("New123");
		         
		         driver.findElementByClassName("smallSubmit").click();
	}

}
