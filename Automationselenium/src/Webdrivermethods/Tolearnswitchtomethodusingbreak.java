package Webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnswitchtomethodusingbreak {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/34");
	Thread.sleep(20000);
	driver.findElement(By.id("compare"));
	Set<String> windowids = driver.getWindowHandles();
	for(String id:windowids) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/"));
		break;
	}
	driver.manage().window().maximize();
	Thread.sleep(20000);
	driver.manage().window().minimize();
	Thread.sleep(20000);
	driver.close();

}
}
