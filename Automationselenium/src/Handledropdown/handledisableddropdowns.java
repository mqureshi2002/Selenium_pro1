package Handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledisableddropdowns {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/disabled?sublist=3");
		
		
		WebElement countrydropdown = driver.findElement(By.id("SelectCountry"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].disabled=false", countrydropdown);
	    Select sel = new Select(countrydropdown);
	    sel.selectByValue("India");
	
	    
	    WebElement statedropdown = driver.findElement(By.id("slectState"));
	    JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("arguments[0].removeAttribute('disabled')", statedropdown);
	    Select sel1 = new Select(statedropdown);
	    sel1.selectByVisibleText("Karnataka");
	     
	    
	    WebElement citydropdown = driver.findElement(By.id("citySelect"));
	    JavascriptExecutor js2 = (JavascriptExecutor)driver;
	    js2.executeScript("arguments[0].disabled=false", citydropdown);
	    Select sel2 = new Select(citydropdown);
	    		sel2.selectByValue("Mumbai");
	}

}
