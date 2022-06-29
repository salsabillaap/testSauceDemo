package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement headerCartPage;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement itemName;

    public String getCartHeader(){
        return headerCartPage.getText();
    }

    public String getItemName(){
        return itemName.getText();
    }
}
