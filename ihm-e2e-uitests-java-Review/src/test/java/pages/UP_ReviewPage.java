package pages;

import elements.UP_ReviewElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;


public class UP_ReviewPage extends UP_ReviewElement {

    WebDriver driver;

    public UP_ReviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void saveEvent(){
        CommonUtil.waitForElementToBeClickable(saveEvent,driver,10000);
        CommonUtil.jsClick(saveEvent, driver);
    }

    public void syncEvent() throws InterruptedException {
        CommonUtil.waitForElementToBeAttachedToDOM(syncEvent,driver,10000);
        CommonUtil.waitForElementToBeClickable(syncEvent,driver,10000);
        CommonUtil.jsClick(syncEvent, driver);
        CommonUtil.waitForElementToBeAttachedToDOM(okWarning,driver,10000);
        CommonUtil.waitForElementToBeClickable(okWarning,driver,10000);
        if (okWarning.isDisplayed()){
            CommonUtil.jsClick(okWarning, driver);
        }
    }

    public void reviewButton() {
        CommonUtil.waitForElementToBeClickable(footerReview,driver,2000);
        footerReview.click();
    }
}
