package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment21 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		WebElement textfield1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textfield1.sendKeys("automation");
		TakesScreenshot js = (TakesScreenshot)driver;
		String timestamp = LocalDateTime.now().toString().replace(":","-");
		File temp = js.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+timestamp+ ".png");
		FileHandler.copy(temp, dest);
		driver.switchTo().parentFrame();
		
		WebElement iframe2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        iframe2.click();
      //  WebElement nested = driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
        driver.switchTo().frame(1);
       // WebElement childframe = driver.findElement(By.xpath("//h5[text()='iFrame Demo']"));
        driver.switchTo().frame(0);
        WebElement textfield2 = driver.findElement(By.xpath("//input[@type='text']"));
        textfield2.sendKeys("selenium");
        Thread.sleep(2000);
        
        TakesScreenshot js1 = (TakesScreenshot)driver;
		String timestamp1 = LocalDateTime.now().toString().replace(":","-");
		File temp1 = js1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshots/"+timestamp1+ ".png");
		FileHandler.copy(temp1, dest1);

    

		
	    
		
		
		 

	        
	        
		
		
		}

}
