package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	
	
	  @FindBy(xpath = "//input[contains(@id,'RecipientName')]")
      private WebElement recepientname;

    @FindBy(xpath = "//input[contains(@id,'RecipientEmail')]")
    private WebElement recepientemail;
    
    @FindBy(xpath = "(//input[contains(@value,'Add to cart')])[1]")
    private WebElement addtocart2;
    
    @FindBy(xpath="//p[contains(text(),'The product has been added to your ')]")
    private WebElement addedtocart;
    
    @FindBy(xpath="//span[text()='Shopping cart']")
    private WebElement shoppingcart;
    
    public Pom2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getRecepientname() {
		return recepientname;
	}

	public WebElement getRecepientemail() {
		return recepientemail;
	}

	public WebElement getAddtocart2() {
		return addtocart2;
	}

	public WebElement getAddedtocart() {
		return addedtocart;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}
    

}
