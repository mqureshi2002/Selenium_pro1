package TestNG1MINIPROJECT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseclass1 {
public static WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("a97@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("A@9740526272");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	


}
