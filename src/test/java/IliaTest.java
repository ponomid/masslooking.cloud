import Base.Base;
import model.AffiliatedPage;
import model.LandingPage;
import model.ProfilePage;
import model.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IliaTest extends Base {

    String valueOfReferralProfile;
    String valueOfReferralAffiliated;

    @Test
    public void MainPageTest() {
        AffiliatedPage affiliatedPage = new LandingPage(getDriver())
                .clickLogIN()
                .fillEmail()
                .fillPass()
                .clickLogin()
                .getTextReferralOnProfile()
                .clickAffiliatedPage()
                .getTextReferralOnAffiliated();

        Assert.assertEquals(valueOfReferralProfile, valueOfReferralAffiliated);
    }
}
