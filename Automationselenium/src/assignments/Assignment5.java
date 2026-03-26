package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("dfghjk");
		driver.findElement(By.id("LastName")).sendKeys("cvbnm");
		driver.findElement(By.name("Email")).sendKeys("dfghcvbn@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("xcvbnm");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("xcvbnm");
		driver.findElement(By.id("register-button")).click();
	}

}
