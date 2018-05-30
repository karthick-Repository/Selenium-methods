package classwork;

import org.openqa.selenium.WebElement;
import wdMethods.SeMethods2;

public class PayPalWithSeMethods extends SeMethods2{

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		startApp("Chrome", "https://www.paypal.com");

		WebElement Button = locateElement("Id", "signup-button");
		click(Button);

		WebElement Radio = locateElement("Id", "radio-personal");
		verifySelected(Radio);

		WebElement Nb = locateElement("LinkText","Next" );
		click(Nb);

		WebElement Country = locateElement("Id","country" );
		selectDropDownUsingText(Country, "United Arab Emirates");

		WebElement mail = locateElement("Id", "email");
		type(mail, "kutty.cs007@gmail.com");

		WebElement pwd = locateElement("Id", "password");
		type(pwd, "Password@123");

		WebElement Repwd = locateElement("Id", "confirmPassword");
		type(Repwd, "Password@123");
		
		WebElement Cb = locateElement("Id", "_eventId_personal");
		click(Cb);
		
	}
}
