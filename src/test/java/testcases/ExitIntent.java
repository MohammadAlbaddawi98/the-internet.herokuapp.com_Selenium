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

public class ExitIntent {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/exit_intent");
    }

    @Test
    public void ExitIntentTest() throws AWTException, InterruptedException {

        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.cssSelector("h3"));
        Actions action = new Actions(driver);
        action.moveByOffset(600, -1).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='ouibounce-modal']/div[2]/div[3]/p")).click();

    }
}
