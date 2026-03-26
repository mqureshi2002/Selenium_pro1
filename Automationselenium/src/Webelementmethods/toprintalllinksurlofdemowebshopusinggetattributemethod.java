package Webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toprintalllinksurlofdemowebshopusinggetattributemethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		for(WebElement ele:links) {
			System.out.println(ele.getAttribute("href"));
			System.out.println(ele.getText());
		}
				
	}

}
