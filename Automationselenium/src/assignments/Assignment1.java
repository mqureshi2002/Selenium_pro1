package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		Thread.sleep(20000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Buy Latest Men's T-shirts Online at Best Price | Myntra"))
		System.out.println("Homepage is displayed");
		else
			System.out.println("home page is not displayed");
	    driver.quit();
	}

}
