import Base.Base;
import model.AffiliatedPage;
import model.LandingPage;
import model.ProfilePage;
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

        System.out.println("link1= " + link1);
        System.out.println("link2= " + link2);

        Assert.assertEquals(link1, link2);
    }
}
