package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
public class ValidLoginSteps {



        public WebDriver driver;

        @Given("user navigate to the Website")
        public void user_navigate_to_the_website() {
            // Set the path for the WebDriver (adjust as necessary)
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize the WebDriver
            driver = new ChromeDriver();

            // Navigate to the desired website
            driver.get("https://example.com"); // Replace with the actual URL
        }

        @Given("click on login button")
        public void click_on_login_button() {
            // Locate the login button and click it
            WebElement loginButton = driver.findElement(By.id("loginButton")); // Adjust the selector as necessary
            loginButton.click();
        }

        @When("user enters the credentials {string} {string}")
        public void user_enters_the_credentials(String username, String password) {
            // Locate the username and password fields and enter the credentials
            WebElement usernameField = driver.findElement(By.id("username")); // Adjust the selector as necessary
            WebElement passwordField = driver.findElement(By.id("password")); // Adjust the selector as necessary

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);

            // Optionally, submit the form if needed
            passwordField.submit(); // or find and click the login button again
        }

        @Then("verify the error message is {string}")
        public void verify_the_error_message_is(String expectedErrorMessage) {
            // Locate the error message element
            WebElement errorMessageElement = driver.findElement(By.id("errorMessage")); // Adjust the selector as necessary

            // Get the actual error message text
            String actualErrorMessage = errorMessageElement.getText();

            // Assert that the actual error message matches the expected one
            assertEquals(expectedErrorMessage, actualErrorMessage);

            // Close the browser after the test
            driver.quit();
        }
    }


