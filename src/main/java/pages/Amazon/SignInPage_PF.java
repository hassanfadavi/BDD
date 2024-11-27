package pages.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage_PF {

    WebDriver driver;


     @FindBy(xpath = "//span[@class='a-button-inner']//a")
    public WebElement createAccount;

    //constructor
    public SignInPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Action for elements
    public void clickOnCreateAccount(){
        this.createAccount.click();
    }










}
