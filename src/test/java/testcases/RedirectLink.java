package testcases;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;
import java.io.IOException;

@RunWith(WebDriverRunner.class)
public class RedirectLink {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/redirector");
    }

    @Test
    public void RedirectLinkTest() throws IOException, InterruptedException {
        WebElement redirectLink = driver.findElement(By.cssSelector("a#redirect"));
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(redirectLink.getAttribute("href"));
        CloseableHttpResponse httpResponse = httpclient.execute(httpGet);
        System.out.println(httpResponse.getStatusLine().getStatusCode());
        redirectLink.click();


        Thread.sleep(5000);
    }
}
