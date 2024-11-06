package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;


public class DashboardPage extends CommonMethods {
    //Hide or show button
    @FindBy(className = "sidebar open")
    public WebElement pimButton;
    //propertyManagementLink
    @FindBy(css = "a[href='/aqar']")
    public WebElement propertyManagementLink;

    //propertyManagementLink
    @FindBy(css = "a[href='/amlak']")
    public WebElement addEmployeeButton;

    //add property button
    @FindBy(className="btn-green btn-style")
    public WebElement welcomeAdminLocator;
   //searchPropertyInput
    @FindBy(css = "input[type='search'].input-field")
    public WebElement adminButton;
   //choose Governorate
    @FindBy(className = "select-input min-h-[44px]")
    public  WebElement leaveButton;
     // locate the button elements at the button
    @FindBy(xpath = "//button[contains(@class, 'button-container') and contains(@class, 'pagination-button') and contains(@class, 'active')]")
    public  WebElement timeButton;

    // Table locator
    @FindBy(xpath = "//*[@id='root']/div/div[2]/main/div/table")
    public WebElement table;

    // Headers
    @FindBy(xpath = "//*[@id='root']/div/div[2]/main/div/table//th")
    public List<WebElement> tableHeaders;

    // Rows
    @FindBy(xpath = "//*[@id='root']/div/div[2]/main/div/table//tr")
    public List<WebElement> tableRows;

    // Cells
    @FindBy(xpath = "//*[@id='root']/div/div[2]/main/div/table//td")
   public List<WebElement> tableCells;

    // Constructor
    public DashboardPage()
    {PageFactory.initElements(driver,this);}


}
