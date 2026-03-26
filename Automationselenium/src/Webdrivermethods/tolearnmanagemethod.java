package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tolearnmanagemethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/shop/fwd-women");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.manage().window().minimize();
		Thread.sleep(20000);
		driver.manage().window().fullscreen();
	}

}
