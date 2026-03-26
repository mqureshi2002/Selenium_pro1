package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.linkText("View Buses")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[text()='Bangalore'])[1]/../../..//div[text()='Hyderabad']"));
	
		List<WebElement> buses = driver.findElements(By.xpath("//div[contains(@class,'operator-info col')]"));
		for(WebElement busname:buses) {
			System.out.println("Bus Name: " + busname.getText());
		}
		List<WebElement> timings = driver.findElements(By.xpath("//div[contains(@class,'container travel-distance')]"));
		
		for(WebElement bustimings:timings) {
			System.out.println("Bus timings : " + bustimings.getText());
		}
		List<WebElement> prices = driver.findElements(By.xpath("//span[contains(@class,'fare text-neutral-800')]"));
		for(WebElement busprice:prices) {
			System.out.println("Bus prices: " + busprice.getText());

		}
	}

}

