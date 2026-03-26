package Brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptonbrokenlinks1 {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total number of links: " + links.size());

        int brokenlinks = 0;

        for(WebElement link : links) {

            String value = link.getAttribute("href");

            if(value == null || value.isEmpty()) {
                System.out.println("Href has no value");
                continue;
            }

            URL linkURL = new URL(value);
            HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
            conn.connect();

            if(conn.getResponseCode() >= 400) {
                System.out.println(value + " -----> Broken Link");
                brokenlinks++;
            }
            else {
                System.out.println(value + " -----> Valid Link");
            }
        }

        System.out.println("Number of broken links: " + brokenlinks);

        driver.quit();
    }
}

