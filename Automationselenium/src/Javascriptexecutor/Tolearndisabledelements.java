package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearndisabledelements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MUSKAN%20QURESHI/Downloads/disabledelements.html");
		driver.findElement(By.id("username")).sendKeys("dfgthyuj");
		WebElement pass = driver.findElement(By.id("password"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value= 'fghj'", pass);
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		js.executeScript("argument[0].click()", login);
	}

}
