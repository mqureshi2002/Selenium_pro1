package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Twitter")).click();
	Set<String> windowids = driver.getWindowHandles();
	  for(String id:windowids) {
      	driver.switchTo().window(id);
      	String url = driver.getCurrentUrl();
      	System.out.println(url);
      	if(url.equals("\"https://x.com/nopCommerce\"")) 
      		driver.findElement(By.xpath(""));
      	driver.findElement(By.name("name")).sendKeys("dxcfgvbh");
      	driver.findElement(By.name("email")).sendKeys("dfcgh@gamil.com");
	  }
}
}
