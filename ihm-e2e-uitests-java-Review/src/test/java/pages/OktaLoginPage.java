package pages;

import elements.OktaLoginElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;
public class OktaLoginPage extends OktaLoginElement {

    WebDriver driver;

    public OktaLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginAsAE_SF() {
        selectOkta.click();
        oktaAuthLogin("1117207@usadev.ihmdev.com","TestuserLocal1");
    }

    public void loginAsAE_UP() {
        selectOkta.click();
        oktaAuthLogin("pranaythoutam@iheartmedia.com","Testuser09");
    }
    public void logintoAdplus(){
        selectOkta.click();
        oktaAuthLogin("1117207@usadev.ihmdev.com","TestuserLocal1");
    }

//    public void loginAsSM(){
//        oktaAuthLogin("","");
//    }
//
//    public void loginAsTM(){
//        oktaAuthLogin("","");
//        oktaAuthLogin("pranaythoutam@iheartmedia.com","Testuser09");
//    }
//
//    public void loginAsSM(){
//        oktaAuthLogin("","", "");
//    }
//
//    public void loginAsTM(){
//        oktaAuthLogin("","","");
//    }
//
//    public void loginAsDSE(){
//        oktaAuthLogin("","");
//    }

    public void oktaAuthLogin(String username,String password)  {
        CommonUtil.waitForElementToBeDisplayed(tbxUsername,driver,2000);
        tbxUsername.sendKeys(username);
        CommonUtil.waitForElementToBeDisplayed(tbxPassword,driver,2000);
        tbxPassword.sendKeys(password);
        btnLogin.click();
    }
}
