package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(WebDriverRunner.class)

public class Frames {

    @Inject
    private WebDriver driver;


    @Test
    public void NestedFrames() {
        driver.get("/nested_frames");
        List<WebElement> iframeElements = driver.findElements(By.tagName("frame"));
        System.out.println("The total number of iframes are " + iframeElements.size());

        System.out.println(driver.switchTo().frame("frame-top").switchTo().frame("frame-left").getPageSource());
        driver.switchTo().defaultContent();
        System.out.println(driver.switchTo().frame("frame-top").switchTo().frame("frame-middle").getPageSource());
        driver.switchTo().defaultContent();
        System.out.println(driver.switchTo().frame("frame-top").switchTo().frame("frame-right").getPageSource());
        driver.switchTo().defaultContent();
        System.out.println(driver.switchTo().frame(1).getPageSource());


    }

    @Test

    public void iframe() {
        driver.get("/iframe");
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        WebElement element = driver.findElement(By.tagName("body"));
        element.clear();
        element.sendKeys("Selvi loves Selenium");
    }


}
