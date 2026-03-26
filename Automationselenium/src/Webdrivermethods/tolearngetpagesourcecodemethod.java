package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tolearngetpagesourcecodemethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/shop/women");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
				
	}

}
