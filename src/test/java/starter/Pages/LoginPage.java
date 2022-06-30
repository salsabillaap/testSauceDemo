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

    public void inputUsername(){
        fieldUsername.sendKeys("standard_user");
    }

    public void inputPassword(){
        fieldPassword.sendKeys("secret_sauce");
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
