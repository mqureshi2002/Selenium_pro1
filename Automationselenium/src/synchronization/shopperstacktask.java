package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstacktask {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/products_page/34");
		WebElement checkbox = driver.findElement(By.id("Check Delivery"));
		checkbox.sendKeys("560103");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

}
