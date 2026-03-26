package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginlink;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement pass;
	

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logout;
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getLogout() {
		return logout;
	}

		
	}
	
	


