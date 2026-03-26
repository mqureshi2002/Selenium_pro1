package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		loginpage lg = new loginpage(driver);
		lg.getLoginlink().click();
		Set<String> windowids = driver.getWindowHandles();
		for(String id:windowids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
        	if(url.equals("https://demowebshop.tricentis.com/login")) {
        		FileInputStream  fs = new FileInputStream("./TestData/commondata.properties");
        		Properties prop = new Properties();
        		prop.load(fs);
        		
        		
        		String un = prop.getProperty("username");
        		String pass = prop.getProperty("password");
        		driver.findElement(By.xpath("//a[text()='Log in']")).click();
        		lg.getEmail().sendKeys(un);
        		lg.getPass().sendKeys(pass);
        		lg.getLoginbutton().click();
        		lg.getLogout().click();
        		

        	}

			
			
		}
	}

}
