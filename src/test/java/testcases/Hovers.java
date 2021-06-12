package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(WebDriverRunner.class)

public class Hovers {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/hovers");
    }

    @Test
    public void HoversTest() {

        List<WebElement> AllFigure = driver.findElements(By.xpath("//div[@class='figure']"));

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.moveToElement(AllFigure.get(1)) //move to second avadar
                .build();
        dragAndDrop.perform();
    }


}
