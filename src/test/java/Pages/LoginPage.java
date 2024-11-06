package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class LoginPage extends CommonMethods {

    @FindBy(className = "input-field !h-fit ")
    public WebElement userEmailField;

    @FindBy(className = "input-field !h-fit ")
    public WebElement passwordField;

    @FindBy(className = "btn-green login-btn ")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@id='spanMessage']")
    public WebElement actualErrorMsg;


    @FindBy(id = "errorMessage")
    private WebElement errorMessageElement;

    public LoginPage() {
        PageFactory.initElements(driver, this);


    }

    public boolean isLoginSuccessful() {
        // Implement logic to check if login was successful
        // For example, check if a specific element is displayed after login
        return true; // Replace with actual condition
    }


}
