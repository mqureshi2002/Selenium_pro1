package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment25 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement googleapps = driver.findElement(By.xpath("//a[contains(@aria-label,'Google apps')]"));
		googleapps.click();
		driver.switchTo().frame(0);
		WebElement youtube = driver.findElement(By.xpath("//span[text()='YouTube']"));
		youtube.click();
		Set<String> windowid = driver.getWindowHandles();
		for(String id:windowid) {
			driver.switchTo().window(id);
			WebElement searchyoutube = driver.findElement(By.xpath("//input[@type='text']"));
			searchyoutube.sendKeys("arijitsinghsongs",Keys.ENTER);
			List<WebElement> songs = driver.findElements(By.id("video-title"));

			// print titles
			for (WebElement song : songs) {
				System.out.println(song.getText());
			
		}
		
	}

}}
