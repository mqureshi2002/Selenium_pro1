package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Set<String> windowids = driver.getWindowHandles();
		for(String id:windowids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(2000);
			if(url.contains("ui")) {
				WebElement disabled = driver.findElement(By.xpath("//li[contains(text(),'Disabled')]"));
				disabled.click();
				Thread.sleep(2000);
				WebElement name = driver.findElement(By.id("name"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].value='fgvhj'",name);
				Thread.sleep(2000);
				WebElement email = driver.findElement(By.id("email"));
				js.executeScript("arguments[0].value='cvbnm'",email);
				Thread.sleep(2000);
				WebElement pass = driver.findElement(By.id("password"));
				js.executeScript("arguments[0].value='cvbnm'",pass);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();

				
			}
			
			
		}
	}
}
				
	


