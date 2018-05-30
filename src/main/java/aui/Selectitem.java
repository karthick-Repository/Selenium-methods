package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://jqueryui.com/");
        driver.findElementByLinkText("Selectable").click();
        
        WebElement frame = driver.findElementByClassName("demo-frame");	
        driver.switchTo().frame(frame);
        
        WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
        
        WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
	
        
        
       Actions builder= new Actions(driver);
       builder.clickAndHold(item1).clickAndHold(item3).release().perform();
	
	}

}



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.getKeyboard().sendKeys(Keys.ESCAPE);

		WebElement appliance = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement Tvname = driver.findElementByXPath("(//span[text()='Samsung'])[2]");	
		Actions tvapp = new Actions(driver);
		
		tvapp.moveToElement(appliance).pause(3000).click(Tvname).perform();
		/*Thread.sleep(3000);
		tvapp.moveToElement(Tvname).click().perform();
		Thread.sleep(3000);
		
		 WebElement max = 
		 Actions filter = new Actions(driver);
		//driver.findElementByXPath("//select[@class='a_eCSK']/following::option[3]").click();	
		 * //driver.findElementByXPath("//select[@class='a_eCSK']/following::option[7]").click();
		*/
		
		
		Select min = new Select(driver.findElement(By.xpath("(//select[@class='a_eCSK'])[1]")));
		min.selectByVisibleText("₹25000");
		Thread.sleep(3000);
		Select max = new Select(driver.findElement(By.xpath("(//select[@class='a_eCSK'])[2]")));
		max.selectByVisibleText("₹60000");
		
		
												
		driver.findElementByXPath("(//div[@class='_3QT2gR _1AgMas'])[2]").click();
		driver.findElementByXPath("//label/div[text()='48 - 55']").click();
       
		String fstwindow = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]").getText();
        System.out.println(fstwindow);
        
        Set<String> windowHandles = driver.getWindowHandles();
        	List<String>windows=new ArrayList<String>();
        	windows.addAll(windowHandles);
        	
        	driver.switchTo().window(windows.get(1));
        
		
		String scndwindow = driver.findElementByXPath("//div[contains(@class,'_1vC4OE')]").getText();
		System.out.println(scndwindow);	
		
		tvapp.click(appliance).pause(4000).click(Tvname).perform();		
		Thread.sleep(4000);
		tvapp.sendKeys(Keys.PAGE_DOWN).perform();//

		//driver.switchTo().window(windows1.get(1));
		//String scndwindow = driver.findElementByXPath("//div[contains(@class,'_1vC4OE')]").getText();
		//System.out.println(scndwindow);

		if (fstwindow.equals(scndwindow)) 
		{
			System.out.println("Verified");
		}

		else
		{
			System.out.println("Rejected");
		}
		driver.close();
		windowHandles = driver.getWindowHandles();
		driver.switchTo().window(windows.get(0));
		driver.findElementByXPath("(//span[text()='Add to Compare'])[1]").click();
		driver.findElementByXPath("(//span[text()='Add to Compare'])[2]").click();
		driver.findElementByXPath("//span[text()='COMPARE']").click();
		List<WebElement> price = driver.findElementsByXPath("(//div[@class='_1vC4OE'])");
		String price1 = price.get(0).getText().replaceAll("[₹,]", "");
		String price2 = price.get(1).getText().replaceAll("[₹,]", "");
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		if (p1<p2) {
			System.out.println(p1);
		} else {
			System.out.println(p2);
		}
	}
}

