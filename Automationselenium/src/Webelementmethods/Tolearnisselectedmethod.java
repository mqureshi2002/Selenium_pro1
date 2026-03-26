package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnisselectedmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']"));	
boolean status = radiobutton.isSelected();
System.out.println(status);
radiobutton.click();
boolean status2 = radiobutton.isSelected();
System.out.println(status2);

		
		
		
	}

}
