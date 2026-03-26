package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom7 {
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
    private WebElement finalchechoutpage;
	
	public pom7(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getFinalchechoutpage() {
		return finalchechoutpage;
	}
	

}
