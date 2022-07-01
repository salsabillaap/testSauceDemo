package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.assertTrue;

public class LoginStep {

    LoginPage loginpage;
    InventoryPage inventory;

    public void openLoginPage(){
        loginpage.open();

    }
    @Step
    public void inputValidUserName(String name){
        loginpage.inputValidUserName(name);

    }
    @Step
    public void inputValidPassword(String password){
        loginpage.inputValidPassword(password);

    }
    @Step
    public void clickLoginButton(){
        loginpage.clickLoginButton();

    }
    @Step
    public void gotoInventoryPage(){
        String header = inventory.getInventoryPage();
        assertTrue(header.equalsIgnoreCase("products"));
    }

//    Testcase 2
    @Step
    public void openLoginnPage(){
        loginpage.open();

    }
    @Step
    public void inputValiddUserName(String name){
        loginpage.inputValiddUserName(name);

    }
    @Step
    public void inputInvalidPassword(String password1){
        loginpage.inputInvalidPassword(password1);

    }
    @Step
    public void clickLoginnButton(){
        loginpage.clickLoginnButton();

    }
    @Step
    public void errorMessage(){
        assertTrue(loginpage.errormessage());

    }

    //    Testcase 3
    @Step
    public void openLoginnnPage(){
        loginpage.open();

    }
    @Step
    public void inputInvalidUserName(String name1){
        loginpage.inputInvalidUserName(name1);

    }
    @Step
    public void inputValiddPassword(String password){
        loginpage.inputValiddPassword(password);

    }
    @Step
    public void clickLoginnnButton(){
        loginpage.clickLoginnnButton();

    }
    @Step
    public void errorMessagee(){
        assertTrue(loginpage.errormessagee());

    }


//    Testcase 4

    @Step
    public void openLoginnnnPage(){
        loginpage.open();

    }
    @Step
    public void inputInvaliddUserName(String name1){
        loginpage.inputInvaliddUserName(name1);

    }
    @Step
    public void inputInvaliddPassword(String password){
        loginpage.inputInvaliddPassword(password);

    }
    @Step
    public void clickLoginnnnButton(){
        loginpage.clickLoginnnnButton();

    }
    @Step
    public void errorMessageee(){
        assertTrue(loginpage.errormessageee());

    }

}
