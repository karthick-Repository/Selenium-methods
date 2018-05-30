package week3Day1;

import java.util.NoSuchElementException;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");												
				driver.findElementByXPath("//button[text()='Try it']").click();
				driver.switchTo().alert();
				try {
					driver.switchTo().alert().sendKeys("Welocme Test");
				} catch (WebDriverException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.err.println("This exception");
				}
				driver.switchTo().alert().accept();
				
				String mytext;
				try {
					mytext = driver.findElementByXPath("//p[text()[contains(.,'Welocme')]]").getText();
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				System.out.println(mytext);
	}

}
