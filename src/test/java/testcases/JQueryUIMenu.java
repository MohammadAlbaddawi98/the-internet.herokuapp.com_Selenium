package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class JQueryUIMenu {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/jqueryui/menu");
    }

    @Test
    public void JQueryUIMenuTest() {
        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.moveToElement(driver.findElement(By.id("ui-id-2")))
                .moveToElement(driver.findElement(By.id("ui-id-4")))
                .click(driver.findElement(By.id("ui-id-8")))
                .build();
        dragAndDrop.perform();
    }
}
