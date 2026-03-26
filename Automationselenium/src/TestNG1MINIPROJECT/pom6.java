package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom6 {
	 @FindBy(xpath= "//input[@onclick='PaymentInfo.save()']")
     private WebElement PMpage2continue;
	 
	 public pom6(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}

	 public WebElement getPMpage2continue() {
		 return PMpage2continue;
	 }
	 
	 

}
