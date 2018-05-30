package projectday;

import java.awt.Desktop.Action;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.ParseConversionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		WebElement appliance = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement Tvname = driver.findElementByXPath("(//span[text()='Samsung'])[2]");	
		
		////*[@id="container"]/div/header/div[3]/div/ul/li[2]/ul/li/ul/li[1]/ul/li[11]/a/span
		
		
		Actions tvapp = new Actions(driver);
		
		tvapp.moveToElement(appliance).pause(3000).click(Tvname).perform();
		/*Thread.sleep(3000);
		tvapp.moveToElement(Tvname).click().perform();
		Thread.sleep(3000);
		
		 WebElement max = 
		 Actions filter = new Actions(driver);
		//driver.findElementByXPath("//select[@class='a_eCSK']/following::option[3]").click();	
		 * //driver.findElementByXPath("//select[@class='a_eCSK']/following::option[7]").click();*/	
		
		Select min = new Select(driver.findElement(By.xpath("(//select[@class='a_eCSK'])[1]")));
		min.selectByVisibleText("₹25000");
		Thread.sleep(3000);
		Select max = new Select(driver.findElement(By.xpath("(//select[@class='a_eCSK'])[2]")));
		max.selectByVisibleText("₹60000");
				
		tvapp.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElementByXPath("//div[text()='Screen Size']").click();
				//Thread.sleep(3000);

				driver.findElementByXPath("//label/div[text()='48 - 55']").click();
				Thread.sleep(2000);
	
				//	driver.get("https://www.flipkart.com/search?count=40&otracker=CLP_filters&otracker=nmenu_sub_TVs+and+Appliances_0_Samsung&p%5B%5D=facets.brand%255B%255D%3DSamsung&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&p%5B%5D=facets.price_range.from%3D25000&p%5B%5D=facets.price_range.to%3D60000&p%5B%5D=facets.screen_size%255B%255D%3D48%2B-%2B55&sid=ckf%2Fczl");
					driver.findElementByXPath("//div[@class='_3wU53n']").click();
			        String fstwindow = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]").getText();
			        System.out.println(fstwindow);
			        Set<String> windowHandles = driver.getWindowHandles();
			        	List<String>windows=new ArrayList<String>();
			        	windows.addAll(windowHandles);
			        	
			        	driver.switchTo().window(windows.get(1));
			        	String scndwindow = driver.findElementByXPath("//div[@class='_1vC4OE _37U4_g']").getText();
			        	System.out.println(scndwindow);
			        	
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
