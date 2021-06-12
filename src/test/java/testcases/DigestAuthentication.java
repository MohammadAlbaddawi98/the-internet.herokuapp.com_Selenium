package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class DigestAuthentication {
    @Inject
    private WebDriver driver;


    @Test
    public void DigestAuthenticationTest() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");

        Assert.assertTrue(driver.getPageSource().contains("Congratulations! You must have the proper credentials."));

    }

}
