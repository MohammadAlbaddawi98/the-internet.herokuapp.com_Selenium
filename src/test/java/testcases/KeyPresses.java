package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class KeyPresses {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/key_presses");
    }

    @Test
    public void KeyPressesTest() throws InterruptedException {

        Actions action = new Actions(driver);
        action.sendKeys("S").perform();
        System.out.println(driver.findElement(By.cssSelector("p#result")).getText());

        Thread.sleep(3000);
    }

}
