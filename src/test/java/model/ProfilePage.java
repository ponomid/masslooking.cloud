package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends SignInPage{
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Affiliated program')]")
    private WebElement affiliatedProgram;

    @FindBy(id = "root")
    private WebElement referralLinkField;

    public AffiliatedPage clickAffiliatedPage() {
        affiliatedProgram.click();

        return new AffiliatedPage(getDriver());
    }

    public ProfilePage getTextReferralOnProfile() {
        String valueOfReferralProfile = referralLinkField.getText();
        return new ProfilePage(getDriver());
    }


}
