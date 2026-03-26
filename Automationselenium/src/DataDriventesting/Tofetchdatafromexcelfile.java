package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tofetchdatafromexcelfile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./TestData/testdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("testdata1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		String un = wb.getSheet("testdata1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		String pwd = wb.getSheet("testdata1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(pwd);
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get(url);
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
	    driver.findElement(By.id("Password")).sendKeys(pwd);
	}

}
