package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class Geolocation {
    @Inject
    private WebDriver driver;


    @Test
    public void GeolocationTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/geolocation");

        driver.findElement(By.xpath("//div[@id='content']/div/button")).click();

        Thread.sleep(10000);

        System.out.println(driver.findElement(By.id("lat-value")).getText());

        System.out.println(driver.findElement(By.id("long-value")).getText());

    }

}
