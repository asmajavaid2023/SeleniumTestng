import Repos.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class mainTest {

    public WebDriver driver;
    public LoginPageRepo  loginPageRepo;

    public MenuBarRepo menuBarRepo;

    @BeforeClass
    public void setUpClass() {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginPageRepo = new LoginPageRepo(driver);
        menuBarRepo = new MenuBarRepo(driver);
    }

    @Test
    public void openSite() {
        loginPageRepo.fillLoginDetails("standard_user","secret_sauce");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait1.until(ExpectedConditions.visibilityOf(driver.findElement(menuBarRepo.burgerButton)));
        menuBarRepo.burgerDetails();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait2.until(ExpectedConditions.visibilityOf(driver.findElement(menuBarRepo.aboutButton)));
        menuBarRepo.aboutDetails();
        /*
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/a[text()='About']"))).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[2]/a/span")).click();
        */
        //
    }
    @AfterClass
    public void destroysetUpClass(){
        //      driver.quit();
    }
}
