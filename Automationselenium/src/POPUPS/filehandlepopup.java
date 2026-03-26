package POPUPS;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class filehandlepopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.id("firstname")).sendKeys("cfgvhbjk");
		driver.findElement(By.id("email")).sendKeys("dfcgvbh@gamil.com");
		driver.findElement(By.id("mobile")).sendKeys("34567890");
		driver.findElement(By.id("datepicker")).sendKeys("28/02/2002");
		WebElement course = driver.findElement(By.id("course"));
		Select sel = new Select(course);
		sel.selectByVisibleText("BE/B.Tech");
		File f = new File("C:\\Users\\MUSKAN QURESHI\\Desktop\\1376_Dec 2025 (2) (1).pdf");
		String absolutepath = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolutepath);
	}

}
