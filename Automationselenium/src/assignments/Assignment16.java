package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/");
		WebElement signupbutton = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		boolean signupbuttondisplayed = signupbutton.isDisplayed();
		System.out.println(signupbuttondisplayed);
				signupbutton.click();
				Set<String> windowids = driver.getWindowHandles();
				for(String id:windowids) {
					driver.switchTo().window(id);
					String url = driver.getCurrentUrl();
					System.out.println(url);
					if(url.equals("https://petdiseasealerts.org/alert-subscriptions/#/register")) {
						driver.findElement(By.id("user")).sendKeys("cfgvbh");
						driver.findElement(By.id("pass")).sendKeys("dfrgth");
						driver.findElement(By.id("cpass")).sendKeys("dfrgth");
						driver.findElement(By.id("firstName")).sendKeys("firstName");
						driver.findElement(By.id("lastName")).sendKeys("lastName");
						driver.findElement(By.id("phone")).sendKeys("7349579587");
						Thread.sleep(2000);
						WebElement checkbox = driver.findElement(By.xpath("//input[@id='accept-tou']"));
						checkbox.click();
						boolean boxisselected = checkbox.isSelected();
						System.out.println(boxisselected);
						Thread.sleep(2000);
						WebElement signup = driver.findElement(By.xpath("//button[@disabled='disabled']"));
						boolean signupbuttonisenabled = signup.isEnabled();
						System.out.println(signupbuttonisenabled);
				}}

}}
