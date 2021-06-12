package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import swb.framework.WebDriverRunner;

import javax.inject.Inject;

@RunWith(WebDriverRunner.class)

public class FileDownload {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/download");
    }

    @Test
    public void FileDownloadTest() {
        String path = "C:\\";
        ChromeOptions profile = new ChromeOptions();
        profile.setExperimentalOption("browser.download.folderList", 2);
        profile.setExperimentalOption("browser.download.dir", path);
        profile.setExperimentalOption("browser.download.alertOnEXEOpen", false);
        profile.setExperimentalOption("browser.helperApps.neverAsksaveToDisk", "application/txt");
        profile.setExperimentalOption("browser.helperApps.alwaysAsk.force", false);
        profile.setExperimentalOption("browser.download.manager.showWhenStarting", false);
        profile.setExperimentalOption("browser.download.manager.focusWhenStarting", false);
        profile.setExperimentalOption("browser.download.manager.alertOnEXEOpen", false);
        profile.setExperimentalOption("browser.download.manager.closeWhenDone", false);
        profile.setExperimentalOption("browser.download.manager.showAlertOnComplete", false);
        profile.setExperimentalOption("browser.download.manager.useWindow", false);
        profile.setExperimentalOption("browser.download.manager.showWhenStarting", false);
        profile.setExperimentalOption("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
        profile.setExperimentalOption("pdfjs.disabled", true);

        WebDriver downloaddriver = new ChromeDriver(profile);
        downloaddriver.get("http://the-internet.herokuapp.com/download/some-file.txt");
    }
}
