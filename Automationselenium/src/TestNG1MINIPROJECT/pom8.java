package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom8 {
	 @FindBy(xpath = "//a[contains(text(),'Click here for order details.')]")
     private WebElement details;
	 
	 public pom8(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}

	 public WebElement getDetails() {
		 return details;
	 }

}
