package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom4 {
	 @FindBy(id="BillingNewAddress_Company")
     private WebElement BAcompanyname;
     
     @FindBy(id="BillingNewAddress_CountryId")
     private WebElement countrydropdown;
     
     @FindBy(id="BillingNewAddress_City")
     private WebElement BAcity;
     
     @FindBy(id="BillingNewAddress_Address1")
     private WebElement BAadress1;
     
     @FindBy(id="BillingNewAddress_Address2")
     private WebElement BAadress2;
     
     @FindBy(id="BillingNewAddress_ZipPostalCode")
     private WebElement BApostalcode;
     
     @FindBy(id="BillingNewAddress_PhoneNumber")
     private WebElement BAphonenumber;
     
     @FindBy(id="BillingNewAddress_FaxNumber")
     private WebElement BAfaxnumber;
     
     @FindBy(xpath="(//input[@value='Continue'])[1]")
     private WebElement BAcontinuebutton;
     
     public pom4(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
	}

	 public WebElement getBAcompanyname() {
		 return BAcompanyname;
	 }

	 public WebElement getCountrydropdown() {
		 return countrydropdown;
	 }

	 public WebElement getBAcity() {
		 return BAcity;
	 }

	 public WebElement getBAadress1() {
		 return BAadress1;
	 }

	 public WebElement getBAadress2() {
		 return BAadress2;
	 }

	 public WebElement getBApostalcode() {
		 return BApostalcode;
	 }

	 public WebElement getBAphonenumber() {
		 return BAphonenumber;
	 }

	 public WebElement getBAfaxnumber() {
		 return BAfaxnumber;
	 }

	 public WebElement getBAcontinuebutton() {
		 return BAcontinuebutton;
	 }
     

}
