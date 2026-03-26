package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Assigment20 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		//Handled multiselect page
		Set<String> windowids = driver.getWindowHandles();
		for(String id:windowids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
	
			if(url.contains("ui")) {
				WebElement dropdown = driver.findElement(By.xpath("//section[contains(text(),'Dropdown')]"));
				dropdown.click();
				
				WebElement multiselect = driver.findElement(By.xpath("//a[contains(text(),'Multi Select')]"));
				multiselect.click();
				
				WebElement multiselectoptions = driver.findElement(By.id("select-multiple-native"));
				Select options = new Select(multiselectoptions);
				options.selectByValue("Mens Cotton Jacket");
				options.selectByValue("Mens Casual Slim Fit");
				options.selectByValue("Solid Gold Petite Micropave ");
				
				WebElement addbutton = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
				addbutton.click();
				
				TakesScreenshot js = (TakesScreenshot)driver;
				String timestamp = LocalDateTime.now().toString().replace(":","-");
				File temp = js.getScreenshotAs(OutputType.FILE);
				File dest = new File("./Screenshots/"+timestamp+ ".png");
				FileHandler.copy(temp, dest);
				
				//handled searchwithselect page
				WebElement searchwithselect = driver.findElement(By.xpath("//a[contains(text(),'Search With Select')]"));
				searchwithselect.click();
				for(String win : driver.getWindowHandles()) {
				    driver.switchTo().window(win);
				   String url1 = driver.getCurrentUrl();
				   if(url1.contains("sublist=2")) {
					  WebElement number = driver.findElement(By.xpath("//input[contains(@placeholder,'enter your number')]"));
					   number.sendKeys("234567890789");
					  
					 WebElement gender = driver.findElement(By.xpath("(//div[contains(@aria-hidden,'true')])[2]"));
					 gender.click();
					 driver.findElement(By.xpath("//div[text()='female']")).click();
					 
					 WebElement country = driver.findElement(By.xpath("(//div[contains(@aria-hidden,'true')])[3]"));
					 country.click();
					 driver.findElement(By.xpath("//div[text()='India']")).click();
					 
					 WebElement state = driver.findElement(By.xpath("(//div[contains(@aria-hidden,'true')])[4]"));
					 state.click();
					 driver.findElement(By.xpath("//div[text()='Karnataka']")).click();
					 
					 WebElement city = driver.findElement(By.xpath("(//div[contains(@aria-hidden,'true')])[5]"));
					 city.click();
					 driver.findElement(By.xpath("//div[text()='Bangalore Rural']")).click();
					 
					 WebElement qty = driver.findElement(By.xpath("(//div[contains(@aria-hidden,'true')])[6]"));
					 qty.click();
					 driver.findElement(By.xpath("//div[text()='3']")).click();
					
					 TakesScreenshot js1 = (TakesScreenshot)driver;
						String timestamp1 = LocalDateTime.now().toString().replace(":","-");
						File temp1 = js1.getScreenshotAs(OutputType.FILE);
						File dest1 = new File("./Screenshots/"+timestamp1+ ".png");
						FileHandler.copy(temp1, dest1);
						
						
					//handled singleselectpage
						WebElement singleselectpage = driver.findElement(By.xpath("//a[contains(text(),'Single Select')]"));
						singleselectpage.click();
						for(String win1: driver.getWindowHandles()) {
							driver.switchTo().window(win1);
							String url2 = driver.getCurrentUrl();
							if(url2.contains("sublist=0")) {
								
								WebElement gender1 = driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
								gender1.click();
								
								WebElement number1 = driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
								number1.sendKeys("7349579587");
								
								WebElement countrydropdown = driver.findElement(By.id("select3"));
								Select s = new Select(countrydropdown);
								s.selectByVisibleText("India");

								WebElement statedropdown = driver.findElement(By.id("select5"));
								Select s1 = new Select(statedropdown);
								s1.selectByVisibleText("Karnataka");
								
								//WebElement citydropdown = driver.findElement(By.id("optionCity"));
								//Select s2 = new Select(citydropdown);
								//s2.selectByVisibleText("Bangalore Rural");
								
								TakesScreenshot js2 = (TakesScreenshot)driver;
								String timestamp2 = LocalDateTime.now().toString().replace(":","-");
								File temp2 = js.getScreenshotAs(OutputType.FILE);
								File dest2 = new File("./Screenshots/"+timestamp2+ ".png");
								FileHandler.copy(temp2, dest2);
							}
						}
					 
				   }
				}
				
			

						
						
						
					 }
					 
				 }
			}
		
		
	}


