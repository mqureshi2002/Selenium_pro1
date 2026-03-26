package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickandHold {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]")).click();
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("cfgvbhjn");
		WebElement eyeicon = driver.findElement(By.xpath("//button[@class='disableddiv']"));
		Actions act = new Actions(driver);
		act.clickAndHold(eyeicon).build().perform();
	}

}
