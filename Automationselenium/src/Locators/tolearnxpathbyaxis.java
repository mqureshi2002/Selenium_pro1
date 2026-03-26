package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tolearnxpathbyaxis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-world-test-championship-2025-2027-1472510/points-table-standings");
		WebElement cricket = driver.findElement(By.xpath("//span[text()='Australia']/../../../..//td[3]"));
			System.out.println(cricket.getText());

		}

}
