package TestNG1MINIPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom0 {
    WebDriver driver;

    public Pom0(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Gift Cards")
    private WebElement giftCards;

    public void clickGiftCards() {
        giftCards.click();
    }

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}
    
}


