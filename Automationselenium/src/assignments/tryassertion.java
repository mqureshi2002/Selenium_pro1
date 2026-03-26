package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tryassertion {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sdftyujh@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dcfghj");
		//to check if the loginbutton is enabled or not
		WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
		 Assert.assertTrue(loginBtn.isEnabled(), "Login button is NOT enabled");

		System.out.println("Login button is enabled");
	}

}
