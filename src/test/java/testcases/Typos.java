package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;


@RunWith(WebDriverRunner.class)
public class Typos {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/typos");
    }

    @Test
    public void TyposTest() {
        for (int i = 0; i < 5; i++) {
            driver.navigate().refresh();
            String withOrWithoutTypoText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
            //assertEquals(withOrWithoutTypoText, "Sometimes you'll see a typo, other times you won't.", "Sometimes you'll see a typo, other times you won,t.");
            System.out.println(withOrWithoutTypoText);
        }

    }
}
