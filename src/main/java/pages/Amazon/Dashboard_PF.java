package pages.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class Dashboard_PF {

public WebDriver driver;



    @FindBy(xpath = "//span[text()='Hello, sign in']")
    public WebElement signIn;

   //constructor
    public Dashboard_PF(WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,Dashboard_PF.this);
    }

    //Action for elements
    public void clickOnSignIn(){
        this.signIn.click();
    }















}
