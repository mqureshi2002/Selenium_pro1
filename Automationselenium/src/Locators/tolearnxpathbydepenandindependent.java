package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tolearnxpathbydepenandindependent {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone+17+pro&crid=2XTAJ0GFFFL5U&sprefix=iphone+17+pr%2Caps%2C424&ref=nb_sb_ss_mvt-t11-ranker_1_12");
		List<WebElement> iphone = driver.findElements(By.xpath("//span[contains(text(),'iPhone 17 Pro')]/../../../..//span[contains(@class,'a-price-whole')]"));
		for(WebElement price:iphone) {
			System.out.println(price.getText());
		}
	}

}
