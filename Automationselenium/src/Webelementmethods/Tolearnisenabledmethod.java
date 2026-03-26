package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnisenabledmethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement loginbutton = driver.findElement(By.xpath("//div[@aria-disabled='true']"));
		boolean status = loginbutton.isEnabled();
		System.out.println(status);
		email.sendKeys("cfgvhj");
		pass.sendKeys("dcfvgbhnj");
		boolean status2 = loginbutton.isEnabled();
		System.out.println(status2);
		

	}

}
