package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontainsattribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		WebElement errormessage = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful.')]"));
		System.out.println(errormessage.getText());
		
			
		}
		}
	


