package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@RunWith(WebDriverRunner.class)
public class WYSIWYG_Editor {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/tinymce");
    }

    @Test
    public void WYSIWYG_Editor_Test() {
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Test");
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            System.out.println(handle);
        }
    }
}
