package assignments;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
    List<WebElement> images = driver.findElements(By.tagName("img"));
    System.out.println(images.size());
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='srcinput']")).sendKeys("Bangalore");
    driver.findElement(By.xpath("//input[contains(@value,'Bangalore')]")).click();
    Thread.sleep(20000);
  driver.findElement(By.xpath("//input[@id='destinput']")).sendKeys("Hyderabad");
  driver.findElement(By.xpath("//input[contains(@value,'Hyderabad')]")).click();
    Thread.sleep(20000);
	List<WebElement> busname = driver.findElements(By.xpath("//div[contains(@class,'travelsName___4606dc')]"));
  	List<WebElement> bustimings = driver.findElements(By.xpath("//div[contains(@class,'timeRow___f89641')]"));
  	List<WebElement> busprice = driver.findElements(By.xpath("//p[contains(@class,'finalFare___e09ba8')]"));
  	for(int i = 0; i<busname.size(); i++) {
  		System.out.println("Bus Name: " + busname.get(i).getText());
  		  if (i < bustimings.size()) {
  			 System.out.println("Timing: " + bustimings.get(i).getText());
  		  }
  			 else if (i < busprice.size()) {
        	  System.out.println("Price: " + busprice.get(i).getText());
  	  	}
  		
  		
        
  
  
  }


}}
