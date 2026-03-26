package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/search?q=books");
		Welcomepage wp = new Welcomepage(driver);
		wp.getSearchfield().sendKeys("books");
		wp.getSearchbutton().click();
		wp.getSearchfield().sendKeys("mobiles");
		wp.getSearchbutton().click();
	}

}
