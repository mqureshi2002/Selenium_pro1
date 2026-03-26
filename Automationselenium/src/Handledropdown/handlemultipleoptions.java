package Handledropdown;

import java.net.http.WebSocket;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlemultipleoptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/MUSKAN%20QURESHI/Downloads/SINGLEDROPDOWN.html");
		WebElement selc = driver.findElement(By.id("companies"));
		Select sel = new Select(selc);
		sel.selectByIndex(1);
		sel.selectByValue("3");
		sel.selectByVisibleText("ANTHROPIC");
		sel.deselectByIndex(1);
		WebElement selm = driver.findElement(By.id("Months"));
		Select sel1 = new Select(selm);
		sel1.selectByValue("5");
		sel1.selectByVisibleText("feb");
		sel1.selectByIndex(6);
		sel1.deselectByVisibleText("feb");
		List<WebElement> mop = sel1.getOptions();
		for(WebElement ele:mop) {
			System.out.println(ele.getText());
		}
		
		//
		
	}

}
