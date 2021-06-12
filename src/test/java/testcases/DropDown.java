package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class DropDown {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/dropdown");
    }

    @Test
    public void Dropdown() {
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 2");
    }

}
