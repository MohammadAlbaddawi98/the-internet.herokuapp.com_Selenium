package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class JavaScriptError {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/javascript_error");
    }

    @Test
    public void JavaScriptErrorTest() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String errorRetrievalScript = "return window.__webdriver_javascript_errors;";

        System.out.println(js.executeScript(errorRetrievalScript));
    }
}
