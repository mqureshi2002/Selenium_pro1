package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom5 {
	 @FindBy(id="paymentmethod_0")
     private WebElement PMcod;
     
     @FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
     private WebElement PMcontinue;
     
     public pom5(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
	}

	 public WebElement getPMcod() {
		 return PMcod;
	 }

	 public WebElement getPMcontinue() {
		 return PMcontinue;
	 }
     
    
}
