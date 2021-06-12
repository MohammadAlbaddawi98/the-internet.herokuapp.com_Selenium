package testcases;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
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
public class broken_images {
    private int TotalInvalidImages;

    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/broken_images");
    }

    @Test
    public void BrokenImages() {

        List<WebElement> imagesList = driver.findElements(By.tagName("img"));

        System.out.println("Total no. of images are " + imagesList.size());

        for (WebElement myimageelementselefjd : imagesList) {
            verifyimageActive(myimageelementselefjd);
        }

        System.out.println("num. of valid img =" + TotalInvalidImages);

    }


    public void verifyimageActive(WebElement imgElement) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(imgElement.getAttribute("src"));
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() != 200)
                TotalInvalidImages++;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

