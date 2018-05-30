package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
         ChromeDriver driver =new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("http://leaftaps.com/opentaps/control/main");
         
         driver.findElementById("username").sendKeys("DemoSalesManager");
         
         driver.findElementById("password").sendKeys("crmsfa");
         
         driver.findElementByClassName("decorativeSubmit").click();
         
         //Thread.sleep(1000);
         
      //   driver.findElementByClassName("decorativeSubmit").click();
         
         driver.findElementByLinkText("CRM/SFA").click();
         driver.findElementByLinkText("Leads").click();
         driver.findElementByLinkText("Create Lead").click();
         driver.findElementById("createLeadForm_companyName").sendKeys("name");

         driver.findElementById("createLeadForm_firstName").sendKeys("Fname");
         driver.findElementById("createLeadForm_lastName").sendKeys("Lname");
         //driver.findElementByClassName("submitButton").click();
         
         WebElement source = driver.findElementById("createLeadForm_dataSourceId");
         Select drop =new Select(source);
         
         drop.selectByIndex(4);
         driver.findElementById("createLeadForm_birthDate-button").click();
         //driver.findElementById("ext-gen620").click();
         
         //driver.findElementById("View Calendar").click();
         WebElement calender = driver.findElementByClassName("calendar");
         
         List<WebElement> count = calender.findElements(By.tagName("tr"));
        
         
         int rowcount = count.size();
         
         System.out.println(rowcount);
         
         WebElement col = driver.findElementByClassName("calendar");
         																																																																																																																																							
         List<WebElement> count1 = col.findElements(By.tagName("td"));
        
         
         int colcount = count1.size();
         
         System.out.println(colcount);
         
         
         
         
         
         
       
		
	}

}
