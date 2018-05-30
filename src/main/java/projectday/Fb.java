package projectday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lauch the browser
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		//To Handle the browser notification and to disabled
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(option);

		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Get the Url
		driver.get("https://www.facebook.com/");
		
		//Pass the Credentials and click on login button
		driver.findElementById("email").sendKeys("karthickelango86@gmail.com");
		driver.findElementById("pass").sendKeys("solamaten");
		driver.findElementById("loginbutton").click();

		//Enter TestLeaf in the SearchBox
		driver.findElementByName("q").sendKeys("TestLeaf");

		//Click on Like button and click the link
		driver.findElementByXPath("(//button[@type='submit'])[1]").click();
		driver.findElementByXPath("(//button[@type='submit'])[2]").click();
		driver.findElementByXPath("//a/div[contains(text(),'TestLeaf')]").click();
		
		//Click on review and get the count
		driver.findElementByXPath("//a/span[contains(text(),'Reviews')]").click();
		String review = driver.findElementByXPath("(//div[@class='mvm uiP fsm'])[2]").getText();
		System.out.println(review);
	}
}   