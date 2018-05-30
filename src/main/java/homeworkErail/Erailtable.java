																																								package homeworkErail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erailtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://erail.in/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("txtStationFrom").clear();
			driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
			driver.findElementById("txtStationTo").clear();
			driver.findElementById("txtStationTo").sendKeys("TPJ",Keys.TAB);
			
			driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
			driver.findElementByLinkText("Train").click();
			
			WebElement trainlist = driver.findElementByXPath("//table[@class='DataTable TrainList']");
			
			 List<WebElement> all_table = trainlist.findElements(By.tagName("tr"));
			 int row_count = all_table.size();
			 System.out.println("Number of cells In Column are "+ row_count);
			 for (WebElement eachrow : all_table)
			 {
				WebElement all_col = eachrow.findElement(By.tagName("td"));
				String text = all_col.getText();
				System.out.println(text);
		
			List<String> trainNames= new ArrayList<String>();
			trainNames.add(text);
			 
			 Collections.sort(trainNames);
			 System.out.println(trainNames);
			 driver.findElementByLinkText("trainNames").click();
			 
			 
			 }
	}
}
