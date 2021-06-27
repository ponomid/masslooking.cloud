import Base.Base;
import model.AffiliatedPage;
import model.LandingPage;
import model.ProfilePage;
import model.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IliaTest extends Base {

    @Test
    public void MainPageTest() {
        ProfilePage profilePage = new LandingPage(getDriver())
                .clickLogIN()
                .fillEmail()
                .fillPass()
                .clickLogin();
        String link1 = profilePage.getTextReferralOnProfile();

        AffiliatedPage affiliatedPage = new ProfilePage(getDriver())
                .clickAffiliatedPage();
        String link2 = affiliatedPage.getTextReferralOnAffiliated();

        Assert.assertEquals(link1, link2);
    }
}
