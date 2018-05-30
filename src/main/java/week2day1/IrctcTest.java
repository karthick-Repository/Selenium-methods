package week2day1;

import java.io.File;
import java.util.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IrctcTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-infobars");
		
		op.addArguments("start-maximized");
		
		op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File snap =new File("./snap/chrome.jpg");
		
		File utils. copyfile(screenshot, snap);
		
        
		
		
		//ChromeDriver driver =new ChromeDriver();
        
		
		//driver.manage().window().maximize();

	

		driver.findElementByLinkText("Sign up").click();

		driver.findElementById("userRegistrationForm:userName").sendKeys("testitsfortest");

		driver.findElementById("userRegistrationForm:password").sendKeys("123456");

		driver.findElementById("userRegistrationForm:confpasword").sendKeys("123456");

		WebElement questions = driver.findElementById("userRegistrationForm:securityQ");

		Select drop =new Select(questions);

		drop.selectByIndex(3);

		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Thalapathy-Vijay");

		WebElement language = driver.findElementById("userRegistrationForm:prelan");

		Select ddown =new Select(language);

		ddown.selectByVisibleText("English");

		driver.findElementById("userRegistrationForm:firstName").sendKeys("test");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("itsfor"); 
		driver.findElementById("userRegistrationForm:lastName").sendKeys("test");

		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		WebElement date = driver.findElementById("userRegistrationForm:dobDay");
		Select cal =new Select(date);
		cal.selectByIndex(14);

		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select cal1 =new Select(month);
		cal1.selectByIndex(4);

		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select cal2 =new Select(year);
		cal2.selectByIndex(8);

		WebElement Occupation = driver.findElementById("userRegistrationForm:occupation");
		Select occupy =new Select(Occupation);
		occupy.selectByVisibleText("Private");

		driver.findElementById("userRegistrationForm:uidno").sendKeys("1234 5678 9123");

		driver.findElementById("userRegistrationForm:idno").sendKeys("BBJ785241J");

		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select world =new Select(country);
		world.selectByIndex(1);

		driver.findElementById("userRegistrationForm:email").sendKeys("123@yopmail.com");


		driver.findElementById("userRegistrationForm:mobile").sendKeys("9944225425");


		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select nation =new Select(nationality);
		nation.selectByIndex(1);

		driver.findElementById("userRegistrationForm:address").sendKeys("132/11, Castagrande Apartments");
		driver.findElementById("userRegistrationForm:street").sendKeys("Bahubali st");
		driver.findElementById("userRegistrationForm:area").sendKeys("Mazhilmathi");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("621009", Keys.TAB);
		
		Thread.sleep(3000);

		driver.findElementById("userRegistrationForm:cityName").click();
		
		WebElement area = driver.findElementById("userRegistrationForm:cityName");
		Select city =new Select(area);
		city.selectByIndex(1);
		
		Thread.sleep(3000);
		
		WebElement PO = driver.findElementById("userRegistrationForm:postofficeName");
		Select post =new Select(PO);
		post.selectByIndex(3);

		Thread.sleep(3000);
		
		driver.findElementById("userRegistrationForm:resAndOff:0").click();


	}

	private static void copyfile(File screenshot, File snap) {
		// TODO Auto-generated method stub
		
	}

}
