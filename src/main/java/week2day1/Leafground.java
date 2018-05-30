package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
			
		List<WebElement> buttons = driver.findElementsByTagName("button");
		int count = buttons.size();
		System.out.println(count);
		
		for (WebElement eachbutton : buttons) {
			
			System.out.println(eachbutton.getText());
			
		}
		
		WebElement name = buttons.get(count-2);
		name.click();
		System.out.println(name.getText());
	}

}
