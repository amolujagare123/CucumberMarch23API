package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("I enter username and password");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
    }
    @Then("I should be at home page")
    public void i_should_be_at_home_page() {
        System.out.println("I should be at home page");
    }

    @When("I enter correct username and correct password")
    public void iEnterCorrectUsernameAndCorrectPassword() {
        System.out.println("I enter correct username and correct password");
    }

    @When("^I enter incorrect username and incorrect password$")
    public void i_enter_incorrect_username_and_incorrect_password() {
        System.out.println("I enter incorrect username and incorrect password");
    }

    @When("^I enter blank username and blank password$")
    public void i_enter_blank_username_and_blank_password() {
        System.out.println("I enter blank username and blank password");
    }

   /* @When("I enter username as {string} and password as {string}")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("Username="+username);
        System.out.println("password="+password);
    }*/

    @When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as_something_and_password_as_something(String username, String password) {
        System.out.println("Username="+username);
        System.out.println("password="+password);
    }


    @Given("^Add User Payload for is created with (.+) and (.+)$")
    public void add_user_payload_for_is_created_with_and(String name, String job) throws Throwable {
        System.out.println("name="+name);
        System.out.println("job="+job);
    }

    @When("I open browser")
    public void iOpenBrowser() {
        System.out.println("I open browser");
    }

    @And("I maximize it")
    public void iMaximizeIt() {
        System.out.println("I maximize it");
    }
}
