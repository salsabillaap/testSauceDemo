package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutInfoPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement coinfoheader;

    @FindBy(id = "first-name")
    WebElement firstnamefield;

    @FindBy(id = "last-name")
    WebElement lastnamefield;

    @FindBy(id = "postal-code")
    WebElement postalcodefield;

    @FindBy(id = "continue")
    WebElement continuebutton;

    @FindBy(id = "cancel")
    WebElement cancelbutton;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement carticon;

    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")
    WebElement errormessage;

    public String getCheckoutInfoHeader(){
        return coinfoheader.getText();
    }

    public void fillfirstname(String firstname){
        firstnamefield.sendKeys(firstname);
    }

    public void filllastname(String lastname){
        lastnamefield.sendKeys(lastname);
    }

    public void fillpostcode(String postcode){
        postalcodefield.sendKeys(postcode);
    }

    public void clickContinueButton(){
        continuebutton.click();
    }

    public void clickCancelButton(){
        cancelbutton.click();
    }

    public void clickCartIcon(){
        carticon.click();
    }

    public String getErrorMessage(){
        return errormessage.getText();
    }
}
