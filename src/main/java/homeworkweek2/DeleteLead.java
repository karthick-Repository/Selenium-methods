package homeworkweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

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
        driver.findElementByLinkText("Phone").click();
        
        driver.findElementByXPath("((//span [text()='Phone']").click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//div[@class='x-plain-bwrap'])[14]")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("9944332211");
   
	}

}
