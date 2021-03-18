package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateOpportunityElement {

    // Create New Opportunity
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'New Opportunity')]")
    public static WebElement newOpportunity;

    @FindBy(how = How.XPATH, using = "//input[@maxlength = '120']")
    public static WebElement opportunityName;

    @FindBy(how = How.XPATH, using = "//button[@name='SaveEdit']")
    public static WebElement saveOpportunity;

    @FindBy(how = How.XPATH, using = "//*[text()='Type']/following::input[1]")
    public static WebElement opportunityTypeClick;

    @FindBy(how = How.XPATH, using = "//*[text()='Type']/following::div[6]/lightning-base-combobox-item[2]")
    public static WebElement opportunityTypeSelect;

    @FindBy(how = How.XPATH, using = "//*[text()='Agency or Direct?']/following::input[1]")
    public static WebElement agencyOrDirectClick;

    @FindBy(how = How.XPATH, using = "//*[text()='Agency or Direct?']/following::div[6]/lightning-base-combobox-item[3]")
    public static WebElement agencyOrDirectSelect;

    @FindBy(how = How.XPATH, using = "//input[@name='CloseDate']")
    public static WebElement closeDate;

    // Oppportunity Initiatives
    @FindBy(how = How.XPATH, using = "//*[text()='ALT Summer Camp']/ancestor::span/input")
    public static WebElement opportunityInitiatives;

    @FindBy(how = How.XPATH, using = "//*[@title='Next']")
    public static WebElement nextInitiative;

    @FindBy(how = How.XPATH, using = "//*[@title='Finish']")
    public static WebElement finishInitiative;

    // Ad+Plan
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'ad+ Plan')]")
    public static WebElement btnAdPlan;

//    public static final String newOpportunityButton ="//button[contains(text(),'New Opportunity')]";
//    public static final String type1 = "//*[text()='Type']/following::input[1]";
//    public static final String opportunityTypeSelect1 = "//*[text()='Type']/following::div[6]/lightning-base-combobox-item[2]";
//    public static final String agencyOrDirect = "//*[text()='Agency or Direct?']/following::input[1]";
//    public static final String selectAgencyDirect = "//*[text()='Agency or Direct?']/following::div[6]/lightning-base-combobox-item[3]";
//    public static final String closeDate= "//input[@name='CloseDate']";
//    public static final String opportunityInitiatives= "//*[text()='ALT Summer Camp']/ancestor::span/input";

}
