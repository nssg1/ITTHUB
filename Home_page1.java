package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page1 {

    WebDriver driver;

    @FindBy(name = "add-to-cart-sauce-labs-backpack")
     public WebElement add;

    @FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement two;

    @FindBy(className = "shopping_cart_link")
    public WebElement click;

    @FindBy(name = "checkout")
    public WebElement checkout;

    @FindBy(name = "firstName")
    public  WebElement firstname;

    @FindBy(name = "lastName")
    public WebElement lname;

    @FindBy(name = "postalCode")
    public WebElement zip;

    @FindBy(name = "continue")
    public WebElement cnt;

    @FindBy(name = "finish")
    public WebElement fnsh;





    public Home_page1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
