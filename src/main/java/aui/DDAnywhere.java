package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DDAnywhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://jqueryui.com/");
        driver.findElementByLinkText("Draggable").click();
        
        WebElement frame = driver.findElementByClassName("demo-frame");
        driver.switchTo().frame(frame);
        
        WebElement drag = driver.findElementById("draggable");
        WebElement drop = driver.findElementById("draggable");
        
        Actions builder =new Actions(driver);
        builder.dragAndDropBy(drag, 150, 100).perform();
        
	}

}
