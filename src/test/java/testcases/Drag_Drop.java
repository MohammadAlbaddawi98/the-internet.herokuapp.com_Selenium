package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)
public class Drag_Drop {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/drag_and_drop");
    }

    @Test
    public void DragandDrop() {

        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-a"));

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(source)
                .moveToElement(target)
                .release(source)
                .build();

        dragAndDrop.perform();
    }

}


