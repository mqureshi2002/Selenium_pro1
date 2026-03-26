package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("Selenium");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("test@123");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);
		String error = driver.findElement(By.xpath("(//span[text()='Invalid credentials'])[1]")).getText();
		System.out.println(error);
	}

}
