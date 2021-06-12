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

@RunWith(WebDriverRunner.class)
public class DynamicContent {

    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/dynamic_content");
    }

    @Test
    public void DynamicContentTest() {
        List<WebElement> imagesList = driver.findElements(By.tagName("img"));
        StringBuilder sb = new StringBuilder();
        sb.append("before click on static botton\n");
        for (WebElement myimageelement : imagesList) {
            sb.append(myimageelement.getAttribute("src") + "\n");
        }
        driver.navigate().refresh();
        List<WebElement> imagesList1 = driver.findElements(By.tagName("img"));
        sb.append("refresh the page\n");
        for (WebElement myimageelement : imagesList1) {
            sb.append(myimageelement.getAttribute("src") + "\n");
        }

        driver.get("/?with_content=static");

        List<WebElement> imagesList2 = driver.findElements(By.tagName("img"));
        sb.append("\nfter click on static botton\n");
        for (WebElement myimageelement : imagesList2) {
            sb.append(myimageelement.getAttribute("src") + "\n");
        }
        driver.navigate().refresh();
        List<WebElement> imagesList3 = driver.findElements(By.tagName("img"));
        sb.append("refresh the page\n");
        for (WebElement myimageelement : imagesList3) {
            sb.append(myimageelement.getAttribute("src") + "\n");
        }
        System.out.println(sb.toString());

    }

}