package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathbyaxis2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/reserve.php");
	//driver.findElement(By.xpath("(//th[text()='Price']/../../..//td[text()='$765.32']/../..//input[@value='Choose This Flight'])[4]")).click();
	driver.findElement(By.xpath("(//th[text()='Price']/../../..//td[text()='$200.98']/../..//input[@value='Choose This Flight'])[3]")).click();
	
	
			
	

  
 
}}