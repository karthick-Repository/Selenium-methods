package classworkday2Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContactusIRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String>allwindows= driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		System.out.println(driver.getTitle());
		
		List<String> everywindow = new ArrayList<String>();
		everywindow.addAll(allwindows);
		
		
		String nextwindow =everywindow.get(1);
		driver.switchTo().window(nextwindow);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	}

