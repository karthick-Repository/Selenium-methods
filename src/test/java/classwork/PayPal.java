package classwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PayPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com");
		
		driver.findElementById("signup-button").click();
		
		boolean radio = driver.findElementById("radio-personal").isSelected();
		if (radio) {
			System.out.println("Radio button is Selected");
			}
		else {
			driver.findElementById("radio-personal").click();
		}
		driver.findElementByLinkText("Next").click();
		
		WebElement Country = driver.findElementById("country");
	    Select dd = new Select(Country);
	    dd.selectByVisibleText("United Arab Emirates");
	}

}
