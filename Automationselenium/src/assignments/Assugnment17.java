package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assugnment17 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("iphone14pro");
	search.submit();
	Set<String> windowids = driver.getWindowHandles();
      for(String id:windowids) {
      	driver.switchTo().window(id);
      	String url = driver.getCurrentUrl();
      	System.out.println(url);
      	if(url.equals("https://www.flipkart.com/search?q=iphone14pro&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off"));
WebElement phone = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro')]"));
System.out.println(phone.getText());

	}}}


