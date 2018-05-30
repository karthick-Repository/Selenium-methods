package classworkday2Week3;

import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		
		driver.findElementById("input_resumeParser").sendKeys("./C:/Users/prabhu_v2k3/Pictures/pdf 1.pdf");
		
		
		
		
	}
	}

