package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;

public class Testscript1 extends Baseclass{
	public void clickbooks() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Reporter.log("books are listed"); 
		
	}

}
