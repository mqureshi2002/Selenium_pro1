package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathbytablehtml {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MUSKAN%20QURESHI/Downloads/movie.html");
		WebElement collection = driver.findElement(By.xpath("//td[text()='dhrandar']/following-sibling::td[2]"));
		System.out.println("dhrandar collections: "+collection.getText());
		
		WebElement ratings = driver.findElement(By.xpath("//td[text()='toxic']/following-sibling::td[1]"));
		System.out.println("toxic rating: "+ratings.getText());
		
		WebElement position = driver.findElement(By.xpath("//td[text()='avengers']/preceding-sibling::td[1]"));
		System.out.println("position of avngers: "+position.getText());
	}

}
