package pages.Fcebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FaceBookMainPage {

    public WebDriver driver;

    //elements
    public WebElement userName;
    public WebElement passWord;
    public WebElement loginButton;
    public Actions ac;




    //constructor
    public FaceBookMainPage(WebDriver driver){
        this.driver=driver;
       this.userName=driver.findElement(By.xpath("//input[@name='email']"));
       this.passWord=driver.findElement(By.xpath("//input[@name='pass']"));
        this.loginButton=driver.findElement(By.xpath("//button[@name='login']"));
    }

    //userName
    public void inputUserName(String userName)   {
                this.userName.sendKeys(userName);
//        ac.click(this.userName);
//        for(   char ch:userName.toCharArray()  ){
//            ac.sendKeys(String.valueOf(ch)).perform();
//            Thread.sleep(1000);
//        }


    }
    //password
    public void inputPassWord(String passWord)   {
                this.passWord.sendKeys(passWord);
//        ac.click(this.passWord);
//        for(   char ch:passWord.toCharArray()  ){
//            ac.sendKeys(String.valueOf(ch)).perform();
//            Thread.sleep(1000);
//        }

    }
    //click on Login
    public void loginButton(){
        loginButton.click();
    }

}
