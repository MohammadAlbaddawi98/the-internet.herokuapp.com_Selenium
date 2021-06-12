package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)
public class DisappearingElements {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/disappearing_elements");
    }

    @Test
    public void DisappearingElementsHome() {
        if (driver.findElement(By.linkText("Home")).isDisplayed()) {
            driver.findElement(By.linkText("Home")).click();
        }
    }

    @Test
    public void DisappearingElementsAbout() {
        if (driver.findElement(By.linkText("About")).isDisplayed()) {
            driver.findElement(By.linkText("About")).click();
        }
    }

    @Test
    public void DisappearingElementsContactUs() {
        if (driver.findElement(By.linkText("Contact Us")).isDisplayed()) {
            driver.findElement(By.linkText("Contact Us")).click();
        }
    }

    @Test
    public void DisappearingElementsProtofllio() {
        if (driver.findElement(By.linkText("Portfolio")).isDisplayed()) {
            driver.findElement(By.linkText("Portfolio")).click();
        }
    }


}
