package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement productpage;

    public String getInventoryPage(){
        return productpage.getText();
    }

}
