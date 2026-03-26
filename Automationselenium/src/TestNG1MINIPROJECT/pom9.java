package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom9 {
	 @FindBy(xpath="//h1[text()='Order information']")
     private WebElement screnshotele;
     
	 
	 public pom9(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}


	 public WebElement getScrenshotele() {
		 return screnshotele;
	 }
	 

}
