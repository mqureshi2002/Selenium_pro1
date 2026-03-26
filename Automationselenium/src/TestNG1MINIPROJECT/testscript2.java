package TestNG1MINIPROJECT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POPUPS.filehandlepopup;

public class testscript2 extends baseclass1 {
	@Test
	public void Pom0() throws IOException {
		Pom0 hp = new Pom0(driver);
		hp.clickGiftCards();
	
	
       //page0 
		pom1 a1 = new pom1(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(a1.getAddtocart1()));
		a1.getAddtocart1().click();
		
	  //page1	
		
		wait.until(ExpectedConditions.urlContains("5-virtual-gift-card"));
        System.out.println(driver.getCurrentUrl());
        Pom2 a2 = new Pom2(driver);
		wait.until(ExpectedConditions.visibilityOf(a2.getRecepientname()));
		a2.getRecepientname().sendKeys("dcfgh");
		a2.getRecepientemail().sendKeys("dfrgthj@gmail.com");
		a2.getAddtocart2().click();
		String text = a2.getAddedtocart().getText();
		System.out.println(text);
		
		((JavascriptExecutor) driver).executeScript(
			    "arguments[0].click();", a2.getShoppingcart());
		
		wait.until(ExpectedConditions.urlContains("cart"));
		System.out.println(driver.getCurrentUrl());
		pom3 a3 = new pom3(driver);
		a3.getTermsandcondition().click();
		a3.getCheckout().click();
		
		
		wait.until(ExpectedConditions.urlContains("onepagecheckout"));
		pom4 a4 = new pom4(driver);
		a4.getBAadress1().sendKeys("fghj");
		a4.getBAadress2().sendKeys("hjk");
		a4.getBAcity().sendKeys("cvbnj");
		a4.getBAcompanyname().sendKeys("ghjk");
		a4.getBAfaxnumber().sendKeys("854785478");
		a4.getBAphonenumber().sendKeys("52562626524");
		a4.getBApostalcode().sendKeys("8632862");
		Select s = new Select(a4.getCountrydropdown());
		s.selectByIndex(2);
		a4.getBAcontinuebutton().click();
		
		wait.until(ExpectedConditions.urlContains("onepagecheckout"));
		pom5 a5 = new pom5(driver);
		wait.until(ExpectedConditions.elementToBeClickable(a5.getPMcontinue()));
		a5.getPMcontinue().click();
		
		wait.until(ExpectedConditions.urlContains("onepagecheckout"));
		pom6 a6 = new pom6(driver);
		wait.until(ExpectedConditions.elementToBeClickable(a6.getPMpage2continue()));
		a6.getPMpage2continue().click();
		
		wait.until(ExpectedConditions.urlContains("onepagecheckout"));
        pom7 a7 = new pom7(driver);
		wait.until(ExpectedConditions.elementToBeClickable(a7.getFinalchechoutpage()));
        a7.getFinalchechoutpage().click();
        
		wait.until(ExpectedConditions.urlContains("checkout/completed/"));
		pom8 a8 = new pom8(driver);
		a8.getDetails().click();
		
		wait.until(ExpectedConditions.urlContains("orderdetails"));
		pom9 a9 = new pom9(driver);
		wait.until(ExpectedConditions.visibilityOf(a9.getScrenshotele()));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", a9.getScrenshotele());
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = LocalDateTime.now().toString().replace(":","-");
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + timestamp + ".png");
		FileHandler.copy(temp, dest);

		
		



}}
		
		

		

	


