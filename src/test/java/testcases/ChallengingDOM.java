package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)
public class ChallengingDOM {
    private int TotalInvalidImages;

    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/challenging_dom");
    }

    @Test
    public void ChallengingDOM_Test() throws InterruptedException {
        driver.findElement(By.cssSelector(".button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".button.success")).click();
        Thread.sleep(1000);
        String redButtonMessage = driver.findElement(By.cssSelector(".button.alert")).getText();
        System.out.println("red message is " + redButtonMessage);
    }


}

