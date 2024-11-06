package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class InvalidLoginSteps extends CommonMethods {
    LoginPage loginPage = new LoginPage();

    @Given("user navigates to the website")
    public void user_navigates_to_the_website() {
        // Implement navigation to the website
        CommonMethods.openBrowserAndLaunchApplication();
    }

    @When("user enters the credentials {string} {string}")
    public void user_enters_the_credentials(String username, String password) {
        loginPage.enterCredentials(username, password);
    }

    @And("clicks on the login button")
    public void clicks_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("verify the error message is {string}")
    public void verify_the_error_message_is(String expectedMessage) {
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
        System.out.println("Error Message: " + actualMessage);
    }

}




