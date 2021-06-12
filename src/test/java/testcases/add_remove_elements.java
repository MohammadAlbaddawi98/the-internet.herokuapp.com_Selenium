package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(WebDriverRunner.class)
public class add_remove_elements {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/add_remove_elements/");
    }

    @Test
    public void addRemoveElementsTest() {
        By addManually = By.xpath("//button[text()='Add Element']");
        driver.findElement(addManually).click();
        driver.findElement(addManually).click();
        driver.findElement(By.className("added-manually")).click();
        int deletedButtonsQuantity = driver.findElements(By.className("added-manually")).size();
        assertEquals(deletedButtonsQuantity, 1);
    }

}
