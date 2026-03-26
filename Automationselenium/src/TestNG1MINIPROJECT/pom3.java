package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 {
	  @FindBy(id="termsofservice")
      private WebElement termsandcondition;
	  
	  @FindBy(id="checkout")
      private WebElement checkout;
	  
	  public pom3(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	}

	  public WebElement getTermsandcondition() {
		  return termsandcondition;
	  }

	  public WebElement getCheckout() {
		  return checkout;
	  }
	  
	  

	  

}
