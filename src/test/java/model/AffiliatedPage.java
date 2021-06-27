package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliatedPage extends SignInPage{
    public AffiliatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "root")
    private WebElement referralLinkField;

    public AffiliatedPage getTextReferralOnAffiliated() {
     String valueOfReferralAffiliated = referralLinkField.getText();
        return new AffiliatedPage(getDriver());
    }

}
