package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java8.An;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pages.RevisionPage;

public class RevisionStep extends WebDriverConfig implements En {
    WebDriver driver=getDriver(Browsers.CHROME);
    RevisionPage revpage=new RevisionPage(getDriver(Browsers.CHROME));
    public RevisionStep(){
        Given("Launch AdPlus URL",()->{
            driver.manage().window().maximize();
            driver.get("https://ihm--adplusci.lightning.force.com/lightning/r/Opportunity/0067b00000G8twOAAR/view");
        });
        Then("Click on Down button beside Clone and Launch Revision",()->{
            revpage.LaunchRevision();
        });
        And("Click on Revise Order in Ad+Orders page",()->{
            revpage.Addplusorders();
        });
        And("Click Yes on the Popup",()->{
            revpage.ClickYes();
        });
        And("Click BroadCast Section for Revision",()->{
            revpage.BroadcastRevision();
            revpage.ClickYes();
        });
        And("Click First Station and Add Two Weeks After",()->{
            revpage.Revision();
        });
        And("Save Changes by clicking Save Only",()->{
            revpage.SaveOnly();
        });
        And("Return to AddPlusOrders and Submit for Approval",()->{
            revpage.ReturntoAdPlus();
        });
    }
}
