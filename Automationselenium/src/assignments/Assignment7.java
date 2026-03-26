package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.className("text-white")).click();
		Set<String> windowids = driver.getWindowHandles();
		  for(String id:windowids) {
	      	driver.switchTo().window(id);
	      	String url = driver.getCurrentUrl();
	      	System.out.println(url);
	      	if(url.equals("https://demoapps.qspiders.com/ui?scenario=1")) {
	      		driver.findElement(By.xpath("\"//section[text()='Link']\"")).click();
	      	}
		
		
		
		
		  }}
			
		}
		
		
		
		
	

