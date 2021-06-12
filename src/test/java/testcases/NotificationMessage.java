package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)
public class NotificationMessage {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/notification_message_rendered");
    }

    @Test
    public void NotificationMessageTest() {
        driver.findElement(By.linkText("Click here")).click();
        System.out.println("*\n*\n*\n*\n*\n*\n" + driver.findElement(By.id("flash")).getText() + "*\n*\n*\n*\n*\n*\n");

    }
}
