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

public class ForgotPassword {


    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/forgot_password");
    }

    @Test
    public void ForgotPasswordTest() {

        driver.findElement(By.id("email")).sendKeys("selvi@test.com");
        driver.findElement(By.id("form_submit")).click();
        Assert.assertTrue(driver.getPageSource().contains("Internal Server Error"));

    }


}
