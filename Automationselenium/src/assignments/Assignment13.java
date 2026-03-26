package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("mobiles");
	search.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='Bank Offer']")).click();
	
}
}
