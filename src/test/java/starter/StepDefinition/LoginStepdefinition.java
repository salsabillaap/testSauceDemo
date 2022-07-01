package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.LoginStep;

public class LoginStepdefinition {
    @Steps
    LoginStep loginstep;
    @Given("the user is already on the login page")
    public void theUserIsAlreadyOnTheLoginPage() {
        loginstep.openLoginPage();

    }

    @When("input valid username {string}")
    public void inputValidUsername(String name) {
        loginstep.inputValidUserName(name);
    }

    @And("input valid password {string}")
    public void inputValidPassword(String password) {
        loginstep.inputValidPassword(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        loginstep.clickLoginButton();
    }

    @Then("go to inventory page")
    public void goToInventoryPage() {
        loginstep.gotoInventoryPage();
    }


//    Testcase 2
    @Given("user is already on the login page")
    public void userIsAlreadyOnTheLoginPage() {
        loginstep.openLoginnPage();

    }
    @When("input validd username {string}")
    public void inputValiddUsername(String name) {
        loginstep.inputValiddUserName(name);
    }

    @And("input invalid password {string}")
    public void inputInvalidPassword(String password1) {
        loginstep.inputInvalidPassword(password1);
    }

    @And("click loginn button")
    public void clickLoginnButton() {
        loginstep.clickLoginnButton();
    }

    @Then("should be error message appear")
    public void shouldBeErrorMessageAppear() {
        loginstep.errorMessage();
    }


//    Test case 3
    @Given("already on the login page")
    public void AlreadyOnTheLoginPage() {
    loginstep.openLoginnnPage();

}
    @When("input invalid username {string}")
    public void inputInvalidUsername(String name1) {

        loginstep.inputInvalidUserName(name1);
    }

    @And("input validd password {string}")
    public void inputValiddPassword(String password) {
        loginstep.inputValiddPassword(password);

    }

    @And("click loginnn button")
    public void clickLoginnnButton() {
        loginstep.clickLoginnnButton();
    }
    @Then("display error message")
    public void displayErrorMessage() {
        loginstep.errorMessagee();
    }


//    Testcase 4
    @Given("User is already on the login page")
    public void isAlreadyOnTheLoginPage() {
        loginstep.openLoginnnnPage();
    }

    @When("input invalidd username {string}")
    public void inputInvaliddUsername(String name1) {
        loginstep.inputInvaliddUserName(name1);
    }

    @And("input invalidd password {string}")
    public void inputInvaliddPassword(String password2) {
        loginstep.inputInvaliddPassword(password2);
    }

    @And("click loginnnn button")
    public void clickLoginnnnButton() {
        loginstep.clickLoginnnnButton();
    }

    @Then("error message")
    public void errorMessageee() {
        loginstep.errorMessageee();
    }
}
