package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathbycontains {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	
List<WebElement> textvalue = driver.findElements(By.xpath("//div[contains(text(),'Tricentis Demo Web Shop')] "));
	for(WebElement ele:textvalue) {
		//System.out.println(ele.getText());
	
}
}}

