package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tolearngettitlemethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/shop/women");
		  String title = driver.getTitle();		
		System.out.println(title);
		if(title.equals("Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More"))
			System.out.println("womens wear is displayed");
		else
			System.out.println("womens wear is not displayed");
		
		
	}

}
