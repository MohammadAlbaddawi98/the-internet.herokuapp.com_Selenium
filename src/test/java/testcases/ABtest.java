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
public class ABtest {

    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/abtest");
    }

    @Test
    public void headlineAttribute() throws Exception {
        WebElement header = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(header.getText(), "A/B Test Variation 1");
    }

    @Test
    public void contentAttribute() throws Exception {
        WebElement pElement = driver.findElement(By.tagName("p"));
        String content = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
        Assert.assertEquals(pElement.getText(), content);
    }

}
