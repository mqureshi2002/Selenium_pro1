package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToperformRightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		//act.contextClick().build().perform();
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightclick).build().perform();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
	}

}
