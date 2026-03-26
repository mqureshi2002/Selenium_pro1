package Actionsclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Toperformdraganddrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/droppable/photo-manager.html']"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content ui-corner-tr')])[1]"));
		WebElement target = driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
	}

}
