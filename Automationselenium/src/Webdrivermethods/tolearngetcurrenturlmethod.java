package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tolearngetcurrenturlmethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/shop/women");
		 String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.myntra.com/shop/women"))
		System.out.println("womens page is displayed");
		else
			System.out.println("womens page is not displayed");
	}

}
