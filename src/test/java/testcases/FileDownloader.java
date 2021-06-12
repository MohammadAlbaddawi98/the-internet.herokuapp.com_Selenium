package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)
public class FileDownloader {
    @Inject
    private WebDriver driver;

    @Test
    public void FileDownloaderTest() throws InterruptedException {
        driver.get("http://admin:admin@the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("SamplePNGImage_1mbmb.png")).click();
        driver.findElement(By.linkText("url.txt")).click();
        driver.findElement(By.linkText("upload_file.xlsx")).click();
        driver.findElement(By.linkText("12.PNG")).click();
        driver.findElement(By.linkText("user.properties")).click();
        driver.findElement(By.linkText("luminoslogo.png")).click();
        driver.findElement(By.linkText("image_2021-01-19_21-07-28.png")).click();


        Thread.sleep(1000);
    }

}
