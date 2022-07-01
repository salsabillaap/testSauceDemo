package starter.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.webdriver.driverproviders.webdrivermanager.WebDriverManagerSetup;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductSortZtoA extends PageObject {

    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]")
    WebElement sortingZtoA;


    public void LoginPage(){
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
    }

    public void clickButtonSorting(){
        sortingZtoA.click();
//        return sortingZtoA.isDisplayed();

    }


    }


