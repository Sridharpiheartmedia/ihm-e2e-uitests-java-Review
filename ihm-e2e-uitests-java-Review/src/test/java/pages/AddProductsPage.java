package pages;

import elements.AddProductsElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;

public class AddProductsPage extends AddProductsElement {

    WebDriver driver;

    public AddProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void addCampaignBroadcast(){
        CommonUtil.waitForElementToBeDisplayed(btnAddProducts,driver,2000);
        btnAddProducts.click();
        CommonUtil.waitForElementToBeDisplayed(btnAddBroadcast,driver,2000);
        btnAddBroadcast.click();
        CommonUtil.waitForElementToBeDisplayed(rbtnCampainBuilder,driver,2000);
        rbtnCampainBuilder.click();
        CommonUtil.waitForElementToBeDisplayed(btnAddToProposal,driver,2000);
        btnAddToProposal.click();
    }
//    public void selectBroadcast(){
//        CommonUntilStep.waitForElementToBeDisplayed(btnAddBroadcast,driver,2000);
//        btnAddBroadcast.click();
//    }
//    public void addCampaign(){
//        CommonUntilStep.waitForElementToBeDisplayed(rbtnCampainBuilder,driver,2000);
//        rbtnCampainBuilder.click();
//    }
//    public void addToProposal(){
//        CommonUntilStep.waitForElementToBeDisplayed(btnAddToProposal,driver,2000);
//        btnAddToProposal.click();
//    }
//
}
