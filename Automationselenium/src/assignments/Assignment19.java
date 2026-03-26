package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment19 {
	public static void main(String[] args) throws IOException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.cricbuzz.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement morephotos = driver.findElement(By.xpath("//button[contains(text(),'More Photos')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",morephotos);
		morephotos.click();
		 Set<String> windowids = driver.getWindowHandles();
	        for(String id:windowids) {
	        	driver.switchTo().window(id);
	        	String url = driver.getCurrentUrl();
	        	System.out.println(url);
	        	if(url.equals("https://www.cricbuzz.com/cricket-photo-gallery")) {
                List<WebElement> img = driver.findElements(By.tagName("img"));
                System.out.println("Total images present:" + img.size());
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                WebElement facebook = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
                facebook.click();
                Set<String> allWindows = driver.getWindowHandles();

                for(String win : allWindows) {
                    driver.switchTo().window(win);
                    if(driver.getCurrentUrl().contains("facebook")) {
                    	 WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
                         email.sendKeys("fgbhnjkm");
                 		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
                 		pass.sendKeys("vbnm,");
                 		String timestamp = LocalDateTime.now().toString().replace(":","-");
                 		TakesScreenshot ss = (TakesScreenshot)driver;
                 		File temp = ss.getScreenshotAs(OutputType.FILE);
                 		File dest = new File("./Screenshots/"+timestamp+ ".png");
                 		FileHandler.copy(temp, dest);
                        
               
                
	        	}
	        	
		
		
		
		
	}
	}
}}}
