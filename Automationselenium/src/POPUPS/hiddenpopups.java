package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopups {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		
		WebElement addcustomer = driver.findElement(By.xpath("//button[text()='Add Customer']"));
		addcustomer.click();
		
		WebElement close = driver.findElement(By.xpath("//button[text()='X']"));
		close.click();
	}

}
