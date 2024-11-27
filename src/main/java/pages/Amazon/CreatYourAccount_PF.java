package pages.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatYourAccount_PF {


    WebDriver driver;


    @FindBy(xpath = "//input[@id='ap_customer_name']")
    WebElement fullName;


    @FindBy(xpath = "//input[@id='ap_email']")
    WebElement emailOrPhoneNumber;


    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    WebElement reenterpassword;


    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;



    //constructor
    public CreatYourAccount_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


   //Action for elements
    public void enterfullName(String userName){
        this.fullName.sendKeys(userName);
    }

    public void enterEmailOrPhone(String email){
        this.emailOrPhoneNumber.sendKeys(email);
    }

    public void enterEmailOrPhone(int phone){
        this.emailOrPhoneNumber.sendKeys(Integer.toString(phone));
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void enterReEnterPassword(String password){
        this.reenterpassword.sendKeys(password);
    }

    public void clickOnSubmitButton(){
        submit.click();
    }














}
