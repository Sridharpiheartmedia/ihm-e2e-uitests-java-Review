package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UP_BroadcastBuildTargetsElement {

    // broadcast header
    @FindBy(how = How.CSS, using = "#mat-button-toggle-1")
    public static WebElement buildTargetsToggle;
    @FindBy(how = How.CSS, using = "#mat-button-toggle-2")
    public static WebElement viewScheduleToggle;

    // dialogs
    @FindBy(how = How.CSS, using = "[role=\"dialog\"]")
    public static WebElement dialog;

    // RunDates
    @FindBy(how = How.CSS, using = ".start-datepicker input")
    public static WebElement startDateInput;
    @FindBy(how = How.CSS, using = ".end-datepicker input")
    public static WebElement endDateInput;
    @FindBy(how = How.CSS, using = ".at-rundates-error")
    public static WebElement runDatesInlineError;
    @FindBy(how = How.CSS, using = ".at-run-weeks-amount-text")
    public static WebElement runWeeksAmountText;

    // SpotLength
    @FindBy(how = How.CSS, using = ".spotlength-menu .mat-menu-item")
    public static WebElement spotLengthMenuItems;
    @FindBy(how = How.CSS, using = ".spotlengths-selector i")
    public static WebElement spotLengthAddIcon;

    // Audience
    @FindBy(how = How.CSS, using = ".at-audience-start-age")
    public static WebElement startAgeField;
    @FindBy(how = How.CSS, using = ".at-audience-start-age-option")
    public static WebElement startAgeOptions;
    @FindBy(how = How.XPATH, using = "//*[@class='age-selection']/mat-form-field[2]//following::mat-select[@formcontrolname='endAge']")
    public static WebElement endAgeField;
    @FindBy(how = How.CSS, using = ".at-audience-end-age-option")
    public static WebElement endAgeOptions;
    @FindBy(how = How.CSS, using = ".at-audience-gender-all")
    public static WebElement genderAll;
    @FindBy(how = How.CSS, using = ".at-audience-gender-male")
    public static WebElement genderMale;
    @FindBy(how = How.CSS, using = ".at-audience-gender-female")
    public static WebElement genderFemale;
    @FindBy(how = How.CSS, using = ".at-audience-ethnicity-all")
    public static WebElement ethnicityAll;
    @FindBy(how = How.CSS, using = ".at-audience-ethnicity-black")
    public static WebElement ethnicityBlack;
    @FindBy(how = How.CSS, using = ".at-audience-ethnicity-hispanic")
    public static WebElement ethnicityHispanic;

    // Dayparts
    @FindBy(how = How.CSS, using = ".at-container-dayparts .mat-chip-remove")
    public static WebElement daypartChipsRemove;
    @FindBy(how = How.XPATH, using = "//a[@class='add-dayparts-button']")
    public static WebElement addDayParts;
    @FindBy(how = How.XPATH, using = "//span[text()='Clear all']")
    public static WebElement cleanAllDayParts;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'6am - 10am (AMD)')]")
    public static WebElement selectDayParts;
    @FindBy(how = How.XPATH, using = "//span[text()='Apply']/ancestor::button[1]")
    public static WebElement applyDayParts;
    @FindBy(how = How.ID, using = "mat-input-10")
    public static WebElement percentageDayParts;
    @FindBy(how = How.CSS, using = ".daypart-info-total")
    public static WebElement percentageDayPartsTotal;

    //Spot Length
    @FindBy(how = How.XPATH, using = ".//*[contains(text(),' Add Spot Length')]/ancestor::a[1]")
    public static WebElement addSpotLength;
    @FindBy(how = How.ID, using = "mat-input-15")
    public static WebElement addSpotLengthPercentage;


    // ControversialPrograms
    @FindBy(how = How.CSS, using = ".preferences-button")
    public static WebElement controversialProgramExclusionsButtons;
    @FindBy(how = How.CSS, using = ".controversial-programs-tab .mat-checkbox-inner-container")
    public static WebElement excludeAllControversialProgramsCheckbox;
    @FindBy(how = How.CSS, using = ".controversial-programs-tab .mat-raised-button")
    public static WebElement saveControversialProgramsButton;

    // Market&Goals
    @FindBy(how = How.CSS, using = ".at-goal-type-grps-cpp-toggle")
    public static WebElement goalGrpsCppToggle;
    @FindBy(how = How.CSS, using = ".at-goal-type-cpm-imp-toggle")
    public static WebElement goalCpmImpToggle;
    @FindBy(how = How.CSS, using = ".at-first-goal-header")
    public static WebElement firstGoalHeaderElement;
    @FindBy(how = How.CSS, using = ".at-second-goal-header")
    public static WebElement secondGoalHeaderElement;
    @FindBy(how = How.CSS, using = ".ag-header-cell")
    public static WebElement headerCell;
    @FindBy(how = How.CSS, using = ".at-stations-header")
    public static WebElement stationsHeader;
    @FindBy(how = How.CSS, using = ".at-options-header")
    public static WebElement optionsHeader;
    @FindBy(how = How.CSS, using = ".at-market-header")
    public static WebElement marketHeader;
    @FindBy(how = How.CSS, using = ".at-first-goal-cell")
    public static WebElement firstGoalCellElement;
    @FindBy(how = How.CSS, using = ".at-second-goal-cell")
    public static WebElement secondGoalCellElement;
    @FindBy(how = How.XPATH, using = "//div[text()='Budget']/ancestor::button[1]")
    public static WebElement marketBudgetTab;
    @FindBy(how = How.XPATH, using = "//div[@ref='eHeaderViewport']/following::div[@col-id='budget']")
    public static WebElement marketBudget;
    @FindBy(how = How.XPATH, using = "//div[@ref='eHeaderViewport']/following::div[@col-id='budget']/descendant-or-self::input[1]")
    public static WebElement marketBudgetInput;
    @FindBy(how = How.XPATH, using = "//div[@class='market-options-menu']")
    public static WebElement marketBudgetOptions;
    @FindBy(how = How.XPATH, using = "//*[@id='cdk-overlay-6']/div/div/div/button[2]")
    public static WebElement marketBudgetOptionsStations;
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,'mat-checkbox')]/label/span/span[contains(text(),'Select/deselect all')]")
    public static WebElement selectDeselectAllStations;
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,'mat-checkbox')]/label/span/span[contains(text(),'KBIG-FM')]")
    public static WebElement selectStationsOption;
    @FindBy(how = How.XPATH, using = "//button[@class='mat-raised-button']/span[text()='Save']")
    public static WebElement selectStationsSave;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Generate Schedule')]/ancestor::button[1]")
    public static WebElement generateSchedule;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok, Got It')]/ancestor::button[1]")
    public static WebElement notification;

    // ProposalGeneration
    @FindBy(how = How.CSS, using = ".at-broadcast-generate-proposal")
    public static WebElement proposalGenerationButton;

    // FligthCards
    @FindBy(how = How.CSS, using = ".at-special-event-checkbox")
    public static WebElement specialEventCheckbox;
    @FindBy(how = How.CSS, using = ".dayparts-selector")
    public static WebElement daypartsSelector;
    @FindBy(how = How.CSS, using = ".spotlengths-selector")
    public static WebElement spotLengthMixSelector;
    @FindBy(how = How.CSS, using = ".at-programexclusion-selector")
    public static WebElement formatsProgramExclusionSelector;

    // Daypart
    @FindBy(how = How.CSS, using = ".add-dayparts-button")
    public static WebElement addCustomerDaypartButton;
    @FindBy(how = How.CSS, using = ".actions-left .mat-button-wrapper")
    public static WebElement clearAllDaypart;
    @FindBy(how = How.CSS, using = "#mat-checkbox-4 .mat-checkbox-inner-container")
    public static WebElement checkDaypart;
    @FindBy(how = How.CSS, using = ".mat-elevation-z1 > .mat-button-wrapper")
    public static WebElement clickApply;
    @FindBy(how = How.CSS, using = ".daypart-percent")
    public static WebElement addPercentage;


    // Stations
    @FindBy(how = How.CSS, using = ".market-options-menu")
    public static WebElement clickOptions;
    @FindBy(how = How.CSS, using = ".default-dayparts > :nth-child(2)")
    public static WebElement clickStationsOptions;
    @FindBy(how = How.CSS, using = "span.station-name")
    public static WebElement selectStations;
    @FindBy(how = How.CSS, using = ".mat-raised-button:nth-child(2) > .mat-button-wrapper")
    public static WebElement saveStations;

}
