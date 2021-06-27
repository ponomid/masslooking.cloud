package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Log In')]")
    private WebElement loginButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage clickLogIN() {
        loginButton.click();

        return new SignInPage(getDriver());
    }
}
