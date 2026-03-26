package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toswitchintoiframe {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
		//driver.switchTo().frame("moneyiframe");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='moneyiframe']"));
		driver.switchTo().frame(frame1);
		WebElement bsepage = driver.findElement(By.xpath("//span[text()='BSE']"));
		bsepage.click();
		//switch control to main webpage
		//driver.switchTo().parentFrame();
		
		//switch control to its parent frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	}

}
