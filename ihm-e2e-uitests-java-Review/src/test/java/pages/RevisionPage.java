package pages;

import elements.RevisionElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;
import java.util.ArrayList;

public class RevisionPage extends RevisionElement {
    WebDriver driver;
    public RevisionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /* Author SridharPadige
    launchRevision method will be Launching the Revision page from Opportunity page
     */
    public void LaunchRevision(){
        CommonUtil.waitFor(10);
        CommonUtil.waitForElementToBeAttachedToDOM(DownButton,driver,60);
        CommonUtil.waitFor(15);
        DownButton.click();
        CommonUtil.waitForElementToBeAttachedToDOM(LaunchRevision,driver,10);
        LaunchRevision.click();
    }

    /* Author SridharPadige
    Addplusorders method will be dealing with switching between the tabs and Initiate Revise order
     */
    public void Addplusorders(){
        CommonUtil.waitFor(15);
        ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs_windows.get(1));
        CommonUtil.waitFor(15);
        CommonUtil.waitForElementToBeClickable(ReviseOrder,driver,60);
        ReviseOrder.click();
    }

    /* Author SridharPadige
    ClickYes method will be Perform Yes action in multiple location during confirmation
     */
    public void ClickYes()
    {
        Yes.click();
    }

    /* Author SridharPadige
    BroadcastRevision method is used to select Broadcast for Revision
     */
    public void BroadcastRevision(){
        CommonUtil.waitFor(30);
        CommonUtil.waitForElementToBeClickable(Broadcast,driver,60);
        Broadcast.click();
    }

    /* Author SridharPadige
    Revision method will be used to Select Station and adding Two weeks after
     */
    public void Revision(){
        CommonUtil.waitFor(30);
        CommonUtil.waitForElementToBeClickable(FirstStation,driver,60);
        FirstStation.click();
        CommonUtil.waitForElementToBeClickable(FirstStation,driver,5);
        AddWeekAfter.click();
        AddWeekAfter.click();
    }

    /* Author SridharPadige
    SaveOnly method will be used to Perform Page Scroll
     till end to click Save Only button for saving the revision changes
     */
    public void SaveOnly(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        SaveOnly.click();
    }

    /* Author SridharPadige
    ReturntoAdPlus method will be dealing with Returning back to add+ orders page
    and complete the approval process
     */
    public void ReturntoAdPlus(){
        CommonUtil.waitForElementToBeClickable(ReturntoAdplusorders,driver,60);
        ReturntoAdplusorders.click();
        CommonUtil.waitFor(15);
        CommonUtil.waitForElementToBeClickable(SubmitforApproval,driver,60);
        SubmitforApproval.click();
        CommonUtil.waitFor(15);
        CommonUtil.waitForElementToBeClickable(Notes,driver,60);
        Notes.sendKeys("DemoApproval");
        SubmitRequest.click();
        CommonUtil.waitFor(5);
    }
}
