package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("xdfcgvhbjb@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("xcfgvbhj");
	driver.findElement(By.name("login")).click();
}
}
