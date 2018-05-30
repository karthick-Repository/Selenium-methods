package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
																																																																											
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver;	
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser is Launched");
		} catch (NullPointerException e) {
			System.err.println("object not created for browser");
			//e.printStackTrace();
		}
		catch(WebDriverException e){
			System.err.println("URL not correct");
		}
	}
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				return	driver.findElementById(locValue);	
			case "name":
				return	driver.findElementByName(locValue);			
			case "class":
				return	driver.findElementByClassName(locValue);			
			case "link":
				return	driver.findElementByLinkText(locValue);			
			case "tag":
				return	driver.findElementByTagName(locValue);			
			case "xpath":
				return	driver.findElementByXPath(locValue);
			default:
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("webelement id not correct");
			//e.printStackTrace();
		}

		return null;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The Value is Entered");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element Is Clicked");
		takeSnap();
	}

	public void clickWithNoSnap(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();	
		System.out.println("The Element is clicked without taking any snap");
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		//return null;
		return ele.getText();
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select drop =new Select(ele);
        drop.selectByVisibleText(value);
        System.out.println("The"+ ele +"Dropdown is selected with the value"+value);
        takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select drop =new Select(ele);
        drop.selectByIndex(index);
        System.out.println("The"+ ele +"Dropdown is selected with the value"+index);
        takeSnap();
		}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		//return false;
		if(driver.getTitle().contains(expectedTitle))
		{
				System.out.println("Expected Title Present"+expectedTitle);
				return true;
		}
		else
		{
				System.out.println("Not having expeccted title");
				return false;
		}
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().equals(expectedText))
			System.out.println("Exact text is retrieved: "+expectedText);
		else
			System.out.println("Exact text not found");

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().contains(expectedText))
			System.out.println("Partial text is retrieved: "+expectedText);
		else
			System.out.println("No match found for partial text");
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).contains(value));
		System.out.println("Partial Attribute value found: "+value);
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).contains(value));
		System.out.println("Partial Attribute value found: "+value);
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		System.out.println(ele.isSelected());
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		if(ele.isDisplayed()==true)
			System.out.println("The Web Element is displayed");
		else
			System.out.println("The Web Element is not displayed");
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listofwindow = new ArrayList<String>();
		listofwindow.addAll(allWindows);
		driver.switchTo().window(listofwindow.get(index));
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);
		System.out.println("Switch to frame is successfull");
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		System.out.println("ALert accept");
		driver.switchTo().alert().accept();
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		//return null;
		return driver.switchTo().alert().getText();
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}



}
