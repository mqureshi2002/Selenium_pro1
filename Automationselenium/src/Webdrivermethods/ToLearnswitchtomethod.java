package Webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnswitchtomethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.shoppersstack.com/products_page/34");
        Thread.sleep(20000);
        driver.findElement(By.id("compare")).click();
        Set<String> windowids = driver.getWindowHandles();
        for(String id:windowids) {
        	driver.switchTo().window(id);
        	String url = driver.getCurrentUrl();
        	if(url.equals("https://www.flipkart.com/"))
        		driver.manage().window().maximize();
   
        	else if(url.equals("https://www.amazon.in/"))
        		driver.close();
        	
        	else if(url.equals("https://www.ebay.com/"))
        		driver.manage().window().minimize();
        	
        }
	}

}
