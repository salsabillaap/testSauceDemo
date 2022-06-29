package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CartPage;
import starter.Pages.ItemPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;

public class AddItemStep {

    LoginPage loginPage;
    ItemPage itemPage;
    CartPage cartPage;

    @Step
    public void loginPage(){
        loginPage.open();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
    }

    @Step
    public void clickAddButton(){
        itemPage.clickAddButton();
    }

    @Step
    public void verifyItemNumber(){
        String itemNumber = itemPage.getItemNumber();
        assertTrue(itemNumber.equalsIgnoreCase("1"));
    }

    @Step
    public void clickCartButton(){
        itemPage.clickCartButton();
    }

    @Step
    public void verifyCartPage(){
        String headerPage = cartPage.getCartHeader();
        assertTrue(headerPage.equalsIgnoreCase("Your Cart"));
    }

    @Step
    public void verifyItemName(){
        String itemName = cartPage.getItemName();
        assertTrue(itemName.equalsIgnoreCase("Sauce Labs Backpack"));
    }
}
