package Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBarRepo {

    public WebDriver newDriver;

    public By menuButton = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[2]/a/span");
    public By burgerButton = By.id("react-burger-menu-btn");

    public By aboutButton = By.id("about_sidebar_link");
    public MenuBarRepo (WebDriver driver1){newDriver=driver1;}

    public WebElement burgerElement(){return newDriver.findElement(burgerButton);}

    public WebElement aboutElement(){return newDriver.findElement(aboutButton);}

    public WebElement menuElement(){return newDriver.findElement(menuButton);}

    public void clickBurgerButton(){burgerElement().click();}

    public void clickAboutButton(){aboutElement().click();}

    public void clickMenuButton(){menuElement().click();}

    public void burgerLoginDetails(){
        clickBurgerButton();
        clickAboutButton();

    }

}


