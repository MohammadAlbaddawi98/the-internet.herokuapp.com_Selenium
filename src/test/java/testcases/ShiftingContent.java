package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(WebDriverRunner.class)
public class ShiftingContent {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/shifting_content");
    }

    @Test
    public void ShiftingContent_Menu() {
        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());
        String List1 = "";
        for (WebElement element : menuItems)
            List1 += element.getText();

        driver.navigate().refresh();

        List<WebElement> menuItems2 = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems2.size());
        String List2 = "";
        for (WebElement element : menuItems2)
            List2 += element.getText();
        assertEquals(List1, List2);

    }
    //list & image
}
