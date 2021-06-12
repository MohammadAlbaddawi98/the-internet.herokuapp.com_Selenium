package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

@RunWith(WebDriverRunner.class)
public class DynamicControls {

    @Inject
    private WebDriver driver;

    @Test
    public void DynamicControlsTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.id("checkbox")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("btn")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));

        driver.findElement(By.id("btn")).click();

        driver.findElement(By.id("checkbox")).click();
    }

}




