package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    WebElement fieldUsername;

    @FindBy(id = "password")
    WebElement fieldPassword;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement errorMessage;

    public void inputValidUserName(String name){

        fieldUsername.sendKeys(name);
    }

    public void inputValidPassword(String password){

        fieldPassword.sendKeys(password);
    }

    public void clickLoginButton(){

        loginButton.click();
    }


//   Test case 2
    public void inputValiddUserName(String name){
    fieldUsername.sendKeys(name);
}
    public void inputInvalidPassword(String password1){ fieldPassword.sendKeys(password1);}

    public void clickLoginnButton(){ loginButton.click();}
    public boolean errormessage(){
        return errorMessage.isDisplayed();
    }

//    Testcase 3
public void inputInvalidUserName(String name1){
    fieldUsername.sendKeys(name1);
}

    public void inputValiddPassword(String password){

        fieldPassword.sendKeys(password);
    }

    public void clickLoginnnButton(){

        loginButton.click();
    }
    public boolean errormessagee(){
        return errorMessage.isDisplayed();
    }

//    Testcase 4
public void inputInvaliddUserName(String name1){
    fieldUsername.sendKeys(name1);
}

    public void inputInvaliddPassword(String password){

        fieldPassword.sendKeys(password);
    }

    public void clickLoginnnnButton(){

        loginButton.click();
    }
    public boolean errormessageee(){
        return errorMessage.isDisplayed();
    }
}
