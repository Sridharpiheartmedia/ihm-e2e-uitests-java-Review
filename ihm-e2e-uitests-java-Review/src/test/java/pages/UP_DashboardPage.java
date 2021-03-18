package pages;

import elements.UP_DashboardElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;

public class UP_DashboardPage extends UP_DashboardElement {

    WebDriver driver;

    public UP_DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnCreateProposalButton() {
        CommonUtil.waitForElementToBeClickable(createProposalButton,driver,2000);
        createProposalButton.click();
    }
}
