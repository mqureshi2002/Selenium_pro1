package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tohandlepromptpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		WebElement delete = driver.findElement(By.xpath("//button[@id='deleteButton']"));
		delete.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		WebElement delete1 = driver.findElement(By.xpath("//button[@id='deleteButton']"));
		delete1.click();
		driver.switchTo().alert().sendKeys("dxcfgvhjk");
		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();
	}

}
