package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(WebDriverRunner.class)
public class ContextMenu {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/context_menu");
    }

    @Test
    public void contextMenuTest() throws InterruptedException {
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.id("hot-spot"))).perform();
        String mess = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        assertEquals(mess, "You selected a context menu");

    }

}
