package POM;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	@FindBy(linkText="Register")
	private WebElement registerlink;	
	
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement searchfield;
	
	@FindBy(xpath="//input[@value=\"Search\"]")
	private WebElement searchbutton;
	
	
	//intialization
	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}


	public WebElement getRegisterlink() {
		return registerlink;
	}

	


	public WebElement getSearchfield() {
		return searchfield;
	}


	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	
	

	
	

}
