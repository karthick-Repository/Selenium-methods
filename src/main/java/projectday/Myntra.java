package projectday;

	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Myntra {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			driver.findElementByClassName("desktop-searchBar").sendKeys("sunglasses",Keys.ENTER);
			List<WebElement> brandNames = driver.findElementsByXPath("//*[@class='product-brand']");
			Set<String> windowHandles = new HashSet<>();
			int countOfBrands = brandNames.size();
			for (WebElement list : brandNames) {
				windowHandles.add(list.getText());
			}
			System.out.println("Unique Brand Names :" +windowHandles);
			/*
			 * Get count of sunglasses with 40% off
			 */
			List<WebElement> discount = driver.findElementsByXPath("//span[contains(text(),'40% OFF')]");
			int countOfDiscount = discount.size();
			System.out.println("Count of sunglasses with 40% discount :"+countOfDiscount );

			/*
			 * Print count of products with Unisex
			 */
			List<WebElement> unisexList = driver.findElementsByXPath("//h4[contains(text(),'Unisex')]");
			int countOfUnisexProducts = unisexList.size();
			System.out.println("Count of products with Unisex :"+countOfUnisexProducts );

			/*
			 * Click Green color filter icon
			 */
			driver.findElementByXPath("//ul[@class='colour-list']/li[4]").click();;

			/*
			 *  Click second listed search result
			 */
			List<WebElement> clickSecond = driver.findElementsByXPath("//div[@class='product-price']");
			clickSecond.get(1).click();

			/*
			 * Print Name of the product 
			 */
			WebElement printProductName = driver.findElementByXPath("//h1[@class='pdp-title']");	
			WebElement productPrice = driver.findElementByXPath("//strong[@class='pdp-price']");
			String prodName = printProductName.getText();
			String prodPrice = productPrice.getText();
			System.out.println("Product Name is :" +prodName);
			System.out.println("Product Price is :"+prodPrice);
			Thread.sleep(5000);

			/*
			 * Click Add to Bag
			 */
			driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
			Thread.sleep(3000);

			/*
			 * Click Go to Bag button
			 */
			driver.findElementByXPath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']").click();
			Thread.sleep(5000);

			/*
			 * Compare Product Name is productName and product cost
			 */
			WebElement compareProductName = driver.findElementByXPath("//a[@class='c-gray']");	
			WebElement compareProductPrice = driver.findElementByXPath("//div[@class='c-dblue total-rupees']");
			String compareName = compareProductName.getText();
			String comparePrice = compareProductPrice.getText();
			String replacedPrice = comparePrice.replace(",", "");
			System.out.println(compareName);
			System.out.println(replacedPrice);
			if(prodName.equals(compareName) ) {
				System.out.println("Same Product Name");
			}
			else {
				System.out.println("Not same");
			}

			if(prodPrice.equalsIgnoreCase(replacedPrice)) {
				System.out.println("Same Price");
			}
			else {
				System.out.println("Not Same Price");
			}

			driver.close();

		}

	}
