package pages;

import elements.CreateOpportunityElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;

public class CreateOpportunityPage extends CreateOpportunityElement {

    public static WebDriver driver;

    public CreateOpportunityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//   public void selectnewoppbutton(){
//       driver.findElement(By.xpath(newOpportunityButton)).click();
//   }

    public void selectDropdownType(){
        opportunityTypeClick.click();
        opportunityTypeSelect.click();
    }

    public void selectAgencyDirect(){
        agencyOrDirectClick.click();
        agencyOrDirectSelect.click();
    }

    public void createOpportunity(String oppName, String cloDate) {
        CommonUtil.waitForElementToBeClickable(newOpportunity,driver,10000);
        newOpportunity.click();
        CommonUtil.waitForElementToBeClickable(opportunityName,driver,10000);
        opportunityName.sendKeys(oppName);
        CommonUtil.waitForElementToBeClickable(closeDate,driver,10000);
        closeDate.sendKeys(cloDate);
        selectDropdownType();
        selectAgencyDirect();
        saveOpportunity.click();
        CommonUtil.waitForElementToBeClickable(btnAdPlan,driver,10000);
    }

    public void createOpportunityInitiative(){


    }
}
