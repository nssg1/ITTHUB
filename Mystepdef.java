import PageObjects.Home_page1;
import PageObjects.Login_page1;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class Mystepdef {


        WebDriver driver;

        Login_page1 lp;
        Home_page1 hp;

    @Before
    public void start() {


        driver = TestRunner.driver;
        lp = new Login_page1(driver);
        hp = new Home_page1(driver);



    }
    @Given("user navigates to application page")
        public void userNavigatesToApplicationPage () {


       String acttitle = driver.getTitle();
       String exptitle = "Swag Labs";
       Assert.assertEquals(acttitle, exptitle);
       System.out.println(acttitle);

        }


        @When("user provides valid login details")
        public void userProvidesValidLoginDetails () {

            lp.username.sendKeys("standard_user");
           lp.password.sendKeys("secret_sauce");
            /*lp.login("standard_user","secret_sauce");*/
            lp.login_btn.click();
        }

        @And("user navigates to homage and able to buy an item and checkout")
        public void userNavigatesToHomageAndAbleToBuyAnItemAndCheckout () {
            hp.add.isDisplayed();
            hp.add.click();
            hp.click.click();
            hp.checkout.isDisplayed();
            hp.checkout.click();
            hp.firstname.sendKeys("NAGA");
            hp.lname.sendKeys("GAMIDI");
            hp.zip.sendKeys("LE2 1GE");
            hp.cnt.isDisplayed();
            hp.cnt.click();
        }


        @Then("user successfully see the orderconfirmation message")
        public void userSuccessfullySeeTheOrderconfirmationMessage () {

        hp.fnsh.click();
        }

/*
  @And("user navigates to homage and  see the details of the product and able to buy an item and checkout")
public void userNavigatesToHomageAndSeeTheDetailsOfTheProductAndAbleToBuyAnItemAndCheckout() {

 }

 @And("user navigates to homage and able to buy two items and checkout")
 public void userNavigatesToHomageAndAbleToBuyTwoItemsAndCheckout() {

}
 @And("user navigates to homage and adds two items in cart and remove an item and checkout")
 public void userNavigatesToHomageAndAddsTwoItemsInCartAndRemoveAnItemAndCheckout() {

 }

@When("user provides valid login details i.e, locked_out_user")
public void userProvidesValidLoginDetailsIELocked_out_user() {

   }

 @And("user should not be able to login")
public void userShouldNotBeAbleToLogin() {

 }

  @Then("user should get error message")
 public void userShouldGetErrorMessage() {


}

@When("user provides valid login details i.e, problem_user")
 public void userProvidesValidLoginDetailsIEProblem_user() {
}*/
}
