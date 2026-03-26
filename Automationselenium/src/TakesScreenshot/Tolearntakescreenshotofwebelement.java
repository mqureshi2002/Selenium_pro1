package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tolearntakescreenshotofwebelement {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(20000);
	WebElement image = driver.findElement(By.xpath("//img[@alt='women']"));
	
	String timestamp = LocalDateTime.now().toString().replace(":", "-");
	File temp = image.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/"+timestamp+".png");
	FileHandler.copy(temp, dest);
	
			
}
}
