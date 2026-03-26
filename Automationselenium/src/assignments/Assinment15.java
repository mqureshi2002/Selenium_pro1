package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinment15 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
		WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
		Point location = loginbutton.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		Dimension size = loginbutton.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}

}
