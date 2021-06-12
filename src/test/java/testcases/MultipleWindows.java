package testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)
public class MultipleWindows {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/windows");
    }

    @Test
    public void MultipleWindowsTest() {

        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getCurrentUrl());

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        boolean IsNewWindowDataExists = driver.getPageSource().contains("New Window");
        driver.close();
        driver.switchTo().window(parentHandle);
        Assert.assertTrue(IsNewWindowDataExists);

    }
}
