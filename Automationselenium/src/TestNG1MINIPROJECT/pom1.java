package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	

	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
    private WebElement addtocart1;
	
	public pom1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getAddtocart1() {
		return addtocart1;
	}

	
	}
	
	



