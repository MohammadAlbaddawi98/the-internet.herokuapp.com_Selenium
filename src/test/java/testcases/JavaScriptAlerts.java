package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class JavaScriptAlerts {
    @Inject
    private WebDriver driver;


    @Test
    public void JavaScriptAlerts_Alert() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//div[@class='example']/ul/li/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");
    }

    @Test
    public void JavaScriptAlerts_Confirm() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//div[@class='example']/ul/li[3]/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        Assert.assertTrue(driver.getPageSource().contains("You clicked: Cancel"));
    }

    @Test
    public void JavaScriptAlerts_Prompt() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//div[@class='example']/ul/li[3]/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String testInput = "test";
        driver.switchTo().alert().sendKeys(testInput);
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: " + testInput);


    }

}
