package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/* Author SridharPadige
Created elements using css selectors & Xpaths for the Ad+plan
This page contains elements for the Opportunity Revision
these are applicable for Closed Opportunities for modification/Updation
 */


public class RevisionElement {

    @FindBy(how= How.XPATH,using = "//lightning-button-menu/button")
    public static WebElement DownButton;

   @FindBy(how=How.XPATH,using = "(.//*[normalize-space(text()) and normalize-space(.)='New Sales Request'])[1]/following::span[2]")
    public static WebElement LaunchRevision;

   @FindBy(how=How.CSS,using = "#main > app-review > summary-product-list > div > app-revise-order-button > div > div.column.col-0 > button")
    public static WebElement ReviseOrder;

   @FindBy(how=How.XPATH,using = "//span[normalize-space()='Yes']")
    public  static WebElement Yes;

   @FindBy(how=How.CSS,using = "mat-expansion-panel-header[id='mat-expansion-panel-header-1'] span[class='ng-star-inserted'] span")
    public static WebElement Broadcast;

   @FindBy(how=How.CSS,using = "#cdk-accordion-child-0 > div > table > tbody > tr:nth-child(1) > td.mat-cell.cdk-column-expandable.mat-column-expandable.ng-tns-c10-0.ng-star-inserted > a > i")
    public static WebElement FirstStation;

    @FindBy(how=How.CSS,using = "div.app-wrap:nth-child(1) div.content-fullscreen:nth-child(2) div.content-wrap div.main-content div.order-revision.content div.content.ora-containers.ng-star-inserted div.broadcast-container.ng-star-inserted:nth-child(2) app-broadcast.ng-tns-c10-0 mat-expansion-panel.mat-expansion-panel.ng-tns-c15-1.panel-broadcast-new-bind-to.mat-expanded div.mat-expansion-panel-content.ng-trigger.ng-trigger-bodyExpansion.mat-expanded div.mat-expansion-panel-body table.table-broadcast.mat-table.ng-tns-c10-0.ng-star-inserted tr.broadcast-weeks-row.mat-row.ng-tns-c10-0.ng-star-inserted:nth-child(2) td.include-weeks-cell.mat-cell.cdk-column-expandedDetail.mat-column-expandedDetail.ng-tns-c10-0.ng-star-inserted div.broadcast-weeks.ng-trigger.ng-trigger-detailExpand app-broadcast-week.broadcast-detail div.week-summary-wrap div.week-buttons > button.btn.flat-btn.add-week-btn:nth-child(2)")
    public static WebElement AddWeekAfter;

    @FindBy(how=How.CSS,using = "button[class='btn btn-secondary']")
    public static WebElement SaveOnly;

    @FindBy(how=How.CSS,using = "button[class='btn']")
    public static WebElement ReturntoAdplusorders;

    @FindBy(how=How.CSS,using = "#main > app-review > order-revision-footer > div.footer-container.footer-container-height > div > button.submit-button.mat-button.mat-raised-button.mat-button-base.mat-green > span")
    public static WebElement SubmitforApproval;

    @FindBy(how=How.CSS,using = "#mat-input-0")
    public static WebElement Notes;

    @FindBy(how=How.CSS,using = "button[class='mat-button mat-button-base mat-green mat-raised-button ng-star-inserted'] span[class='mat-button-wrapper']")
    public static WebElement SubmitRequest;



}
