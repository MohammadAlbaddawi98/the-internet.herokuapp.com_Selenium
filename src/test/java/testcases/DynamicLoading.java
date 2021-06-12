package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.awt.*;

@RunWith(WebDriverRunner.class)
public class DynamicLoading {
    @Inject
    private WebDriver driver;

    @Test
    public void DynamicallyLoadedPageElements1() throws AWTException, InterruptedException {

        driver.get("/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement all = driver.findElement(By.xpath("//*[@id='start']/button"));
        all.click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
        driver.findElement(By.xpath("//*[@id='finish']/h4"));
        String text = element.getText();
        System.out.println("hi:" + text);
        Assert.assertEquals(text, "Hello World!");
    }

    @Test
    public void DynamicallyLoadedPageElements2() throws AWTException, InterruptedException {

        driver.get("/dynamic_loading/2");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement all = driver.findElement(By.xpath("//*[@id='start']/button"));
        all.click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
        driver.findElement(By.xpath("//*[@id='finish']/h4"));
        String text = element.getText();
        System.out.println("hi:" + text);
        Assert.assertEquals(text, "Hello World!");

    }

}
