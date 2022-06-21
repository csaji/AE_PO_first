package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class initialize {

    public static WebDriver driver;
    static loginPage login;
    @BeforeTest
    public static WebDriver initialSetup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        driver =new ChromeDriver();
        login = new loginPage();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dna-staging.hashedin.com/allocation/allocate/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    @Test()
    public void TC01_loginMethod() throws InterruptedException {
        login.loginSteps();
    }

}
