package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class ShadowDom {
    @Inject
    private WebDriver driver;

    @Test
    public void DynamicControlsTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/shadowdom");

        WebElement host = driver.findElement(By.tagName("my-paragraph"));
        JavascriptExecutor js = (JavascriptExecutor) driver;


    }
}
