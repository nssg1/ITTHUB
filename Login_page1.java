package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page1 {
    WebDriver driver;

  @FindBy(id = "user-name")
  public WebElement username;

  @FindBy(id = "password")
   public WebElement password;

  @FindBy(id = "login-button")
  public WebElement login_btn;


 public void login(String id, String pwd)
  {
      username.sendKeys(id);
      password.sendKeys(pwd);
      login_btn.click();

  }



  public Login_page1(WebDriver driver){
      this.driver = driver;
      PageFactory.initElements(driver,this);
  }

}
