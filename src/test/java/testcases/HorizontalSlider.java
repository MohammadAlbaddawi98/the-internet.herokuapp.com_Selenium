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

public class HorizontalSlider {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/horizontal_slider");
    }

    @Test
    public void HorizontalSliderTest() throws InterruptedException {
        WebElement slider = driver.findElement(By.cssSelector(".sliderContainer input"));
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(slider, 2, 0).build();
        action.perform();
        Thread.sleep(1000);

    }
}
