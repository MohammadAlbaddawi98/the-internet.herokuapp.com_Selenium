package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.awt.*;

@RunWith(WebDriverRunner.class)
public class EntryAd {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/entry_ad");
    }

    @Test
    public void EntryAdTest() throws AWTException, InterruptedException {

        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.cssSelector("p"));
        Actions action = new Actions(driver);
        action.moveToElement(e).click().perform();

        Thread.sleep(3000);
        WebElement restart_ad = driver.findElement(By.id("restart-ad"));
        action.moveToElement(restart_ad).click().perform();

        Thread.sleep(3000);
        action.moveToElement(e).click().perform();


    }
}
