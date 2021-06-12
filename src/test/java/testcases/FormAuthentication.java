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

public class FormAuthentication {

    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/login");
    }

    @Test
    public void LoginTest() {

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        Assert.assertTrue(driver.getPageSource().contains("Welcome to the Secure Area."));


    }

    @Test
    public void LoginErrorTest() {
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("selvi@gmail.co");
        driver.findElement(By.id("password")).sendKeys("Password!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();

        System.out.println(driver.findElement(By.id("flash")).getText());

        Assert.assertTrue((driver.findElement(By.id("flash")).getText().contains("Your username is invalid!")));

    }


}
