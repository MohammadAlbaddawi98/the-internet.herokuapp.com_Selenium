package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(WebDriverRunner.class)

public class Inputs {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/inputs");
    }

    @Test
    public void InputsTest() throws InterruptedException {
        driver.findElement(By.xpath("//input")).sendKeys(Keys.ARROW_UP);
        String upKeyResult = driver.findElement(By.xpath("//input")).getAttribute("value");
        assertEquals(upKeyResult, "1");

        driver.findElement(By.xpath("//input")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        String downKeyResult = driver.findElement(By.xpath("//input")).getAttribute("value");
        assertEquals(downKeyResult, "-1");
        driver.navigate().refresh();

        driver.findElement(By.xpath("//input")).sendKeys("www");
        String alphaResult = driver.findElement(By.xpath("//input")).getAttribute("value");
        assertEquals(alphaResult, "");


    }


}
