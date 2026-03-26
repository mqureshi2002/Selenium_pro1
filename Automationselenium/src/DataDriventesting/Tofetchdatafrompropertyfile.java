package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tofetchdatafrompropertyfile {
	public static void main(String[] args) throws IOException {
		
		//pass location of file
		FileInputStream  fs = new FileInputStream("./TestData/commondata.properties");
		//create file specific object
		Properties prop = new Properties();
		//load the file into location
		prop.load(fs);
		//call read methods
		String url = prop.getProperty("url");
		System.out.println(url);
		String un = prop.getProperty("username");
		System.out.println(un);
		String pass = prop.getProperty("password");
		System.out.println(pass);

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
	    driver.findElement(By.id("Password")).sendKeys(pass);

		
		
	}

}
