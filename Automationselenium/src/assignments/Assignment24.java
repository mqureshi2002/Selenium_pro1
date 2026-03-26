package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment24 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://homeloans.hdfc.bank.in/");
		WebElement login1 = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		act.moveToElement(login1).perform();
		WebElement netbanking = driver.findElement(By.xpath("(//a[text()='Login To NetBanking'])[1]"));
		netbanking.click();
		Set<String> windowid = driver.getWindowHandles();
        for(String id : windowid) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("netbanking")) {
				WebElement login2 = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));
				login2.click();
				WebElement netbanking2click = driver.findElement(By.xpath("(//a[@title='NetBanking'])[1]"));
				netbanking2click.click();
				 Set<String> allWindows = driver.getWindowHandles();
				 for(String win : allWindows) {
	                    driver.switchTo().window(win);
				 }
				WebElement frame = driver.findElement(By.xpath("//frame[@src='RSNBLogin.html?v=23']"));
				driver.switchTo().frame(frame);
				
					WebElement knowmore = driver.findElement(By.partialLinkText("Know More"));
					knowmore.click();
					 Set<String> allWindows1 = driver.getWindowHandles();
					 for(String win1 : allWindows1) {
		                    driver.switchTo().window(win1);      
		                    
					
				}
					WebElement lan = driver.findElement(By.xpath("//p[contains(@aria-label,'Bengali | English | Gujarati | Hindi | Kannada | Malayalam | Marathi | Odia | Punjabi | Tamil | Telugu')]"));
					 JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView(true)", lan);
					System.out.println(lan);
					

	               
			}




	
		
	}

	}}
