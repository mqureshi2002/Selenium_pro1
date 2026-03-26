package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/34");
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	Set<String> windowid = driver.getWindowHandles();
	System.out.println(windowid);
	for(String id:windowid) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/")) {
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.manage().window().setSize(new Dimension(300,500));
		}
		else if(url.equals("https://www.amazon.in/")) {
			Point position = driver.manage().window().getPosition();
			System.out.println(position);
			driver.manage().window().setPosition(new Point(10,10));
		}
		else if(url.equals("https://www.ebay.com/"));
				String sourcecode = driver.getPageSource();
				System.out.println(sourcecode);
				Thread.sleep(20000);
	}
		
	}
}

