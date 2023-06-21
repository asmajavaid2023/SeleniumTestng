package Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageRepo {

    public LoginPageRepo (WebDriver driver1){newDriver=driver1;}

    public WebDriver newDriver;
    public By userName = By.id("user-name");
    public By password = By.id("password");
    public By loginButton = By.id("login-button");
    public WebElement userNameElement(){return newDriver.findElement(userName);}
    public WebElement passwordElement(){return newDriver.findElement(password);}
    public WebElement loginElement(){return newDriver.findElement(loginButton);}
    public void enterUserNAme(String userName){userNameElement().sendKeys(userName);}
    public void enterPassword(String password){passwordElement().sendKeys(password);}
    public void clickLoginButton(){loginElement().click();}
    public void fillLoginDetails(String userName, String password){
        enterUserNAme(userName);
        enterPassword(password);
        clickLoginButton();
    }

}
