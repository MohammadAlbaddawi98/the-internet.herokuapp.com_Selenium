package testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScroll {

    @Test
    public void InfiniteScrollTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Infinite Scroll')]")).click();
        long lenOfPage = (Long) ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);var lenOfPage=document.body.scrollHeight;return lenOfPage;");
        boolean scrolled = true;
        long lastCount = 0;
        System.out.println("page length at first time =" + lenOfPage);

        while (scrolled == true) {
            Thread.sleep(200);
            lastCount = lenOfPage;
            lenOfPage = (Long) ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);var lenOfPage=document.body.scrollHeight;return lenOfPage;");
            System.out.println(lenOfPage);
            if (lastCount == lenOfPage) {
                break;
            }
        }
        Thread.sleep(5000);
    }
}
