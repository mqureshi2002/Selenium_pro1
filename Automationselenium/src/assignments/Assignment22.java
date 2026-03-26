package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment22 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/droppable/photo-manager.html']"));
		driver.switchTo().frame(frame1);
		WebElement image1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(image1, target).perform();
		WebElement image2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		act.dragAndDrop(image2, target).perform();
		WebElement image3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		act.dragAndDrop(image3, target).perform();
		WebElement image4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		act.dragAndDrop(image4, target).perform();
		driver.switchTo().parentFrame();
		WebElement cheatsheat = driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]"));
		cheatsheat.click();
		driver.navigate().to("https://www.globalsqa.com/cheatsheets/");
		WebElement sqlsheet = driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']"));
		sqlsheet.click();
		driver.navigate().to("https://www.globalsqa.com/sql-cheat-sheet/");
		WebElement ss1 = driver.findElement(By.xpath("(//img[contains(@data-src,'https://i0')])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", ss1);
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" +timestamp+".png");
	    FileHandler.copy(temp, dest);
		
	
	}

}
