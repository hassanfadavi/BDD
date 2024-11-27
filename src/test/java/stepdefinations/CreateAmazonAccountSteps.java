package stepdefinations;

import base.BaseTest;
import config.ConfigManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import pages.Amazon.CreatYourAccount_PF;
import pages.Amazon.Dashboard_PF;
import pages.Amazon.SignInPage_PF;

public class CreateAmazonAccountSteps extends BaseTest {

    Dashboard_PF  dashboard_PF;
    SignInPage_PF signInPage_PF;
    CreatYourAccount_PF  creatYourAccount_PF;

@Before
public   void setupDriver() {
    setup();
    this.dashboard_PF = new Dashboard_PF(driver);
    this.signInPage_PF = new SignInPage_PF(driver);
    this.creatYourAccount_PF=new CreatYourAccount_PF(driver);
}



    @Given("I am on the amazon web page")
    public void I_am_on_the_amazon_web_page() {
        driver.get(ConfigManager.getProperty("baseUrl"));
    }

    @When("I will click on signIn button")
    public void I_will_click_on_signIn_button() {
        dashboard_PF.clickOnSignIn();
    }

    @Then("I will click on Create amazon account button")
    public void I_will_click_on_Create_amazon_account_button() {
        signInPage_PF.clickOnCreateAccount();
    }

    @And("I will enter username as value for your name field")
    public void I_will_enter_username_as_value_for_your_name_field(){
      creatYourAccount_PF.enterfullName("John Doe");
    }

    @And ("I will enter phone number as value for phone number field")
    public void   I_will_enter_phone_number_as_value_for_phone_number_field(){
    creatYourAccount_PF.enterEmailOrPhone(240408614);
    }

    @And ("I will enter password as a valid password value for password field")
    public void I_will_enter_password_as_a_valid_password_value_for_password_field(){
    creatYourAccount_PF.enterPassword("1456325@ghgh");
    }

    @And ("I will re-enter the password as a valid password value")
    public void  I_will_re_enter_the_password_as_a_valid_password_value(){
    creatYourAccount_PF.enterReEnterPassword("1456325@ghgh");
    }

    @Then ("I click on verify mobile number button")
    public void I_click_on_verify_mobile_number_button(){
    creatYourAccount_PF.clickOnSubmitButton();
    }








@After
    public void tearDownDriver(){
    tearDown();
}







}
