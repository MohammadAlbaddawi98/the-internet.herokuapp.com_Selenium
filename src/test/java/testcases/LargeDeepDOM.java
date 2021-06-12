package testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class LargeDeepDOM {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/large");
    }

    @Test
    public void LargeDeepDomTest() {

        WebElement e = driver.findElement(By.xpath("//tr[@class='row-50']/td[@class='column-50']"));
        Assert.assertTrue(e.getText().contains("50.50"));

    }
}
