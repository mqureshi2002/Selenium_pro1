package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetcssvalue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.xpath("//span[contains(text(),'Explore the things ')]")).getCssValue("color");
		System.out.println(color);
	}

}
