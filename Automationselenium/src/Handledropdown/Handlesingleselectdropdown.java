package Handledropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlesingleselectdropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/MUSKAN%20QURESHI/Downloads/SINGLEDROPDOWN.html");
		WebElement dropdown = driver.findElement(By.id("companies"));
		Select sel = new Select(dropdown);
		//select  singleoptions                 
		sel.selectByIndex(3);
		sel.selectByValue("4");
		sel.selectByVisibleText("GOOGLE");
		WebElement dropdown2 = driver.findElement(By.id("Months"));
		Select sel1 = new Select(dropdown2);
		sel.selectByIndex(2);
		sel.selectByValue("5");
		//togetalloptions
		List<WebElement> alloptions = sel.getOptions();
		for(WebElement ele:alloptions) {
			System.out.println(ele.getText());
			
		}
				
	}

}
