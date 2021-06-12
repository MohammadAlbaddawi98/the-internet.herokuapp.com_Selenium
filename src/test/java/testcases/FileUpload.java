package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class FileUpload {

    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/upload");
    }

    @Test
    public void FileUploadTest() {

        driver.findElement(By.id("file-upload")).sendKeys("C:\\test.txt");
        driver.findElement(By.id("file-submit")).click();
    }


}
