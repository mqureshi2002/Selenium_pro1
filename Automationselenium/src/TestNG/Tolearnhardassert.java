package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tolearnhardassert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		//login page is displayed or not
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","loginpage is displayed");
		
		driver.findElement(By.id("Email")).sendKeys("qureshiee123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Muskan@2001");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//homepage is displayed or not
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop", "homepage is displayed");
	
		
	}

}
