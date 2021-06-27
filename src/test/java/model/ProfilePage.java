package model;

import com.sun.jdi.Value;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends LandingPage{

    @FindBy(xpath = "//span[contains(text(),'Affiliated program')]")
    private WebElement affiliatedProgram;

    @FindBy(xpath = "//div/input[@type='text']")
    private WebElement referralLinkField;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public AffiliatedPage clickAffiliatedPage() {
        affiliatedProgram.click();

        return new AffiliatedPage(getDriver());
    }

    public String getTextReferralOnProfile() {
        return referralLinkField.getAttribute("value");
    }
}
