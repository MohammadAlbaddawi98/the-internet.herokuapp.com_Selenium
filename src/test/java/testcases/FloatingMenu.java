package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class FloatingMenu {


    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/floating_menu");
    }

    @Test
    public void FloatingMenuTest() {

        driver.findElement(By.linkText("About")).click();
        System.out.println("driver.getCurrentUrl()+");

    }


}

