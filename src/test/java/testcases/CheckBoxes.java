package testcases;

import org.junit.Assert;
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
public class CheckBoxes {
    @Inject
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver.get("/checkboxes");
    }

    @Test
    public void Checkbox() {

        List<WebElement> checkBoxList = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement checkBox : checkBoxList) {
            System.out.println(checkBox.getText());
            if (!checkBox.isSelected()) {
                checkBox.click();
            }
        }
        List<WebElement> allCheckedBoxList = driver.findElements(By.xpath("//input[@type='checkbox' and @checked='checked']"));
        if (!allCheckedBoxList.isEmpty()) {
            Assert.fail();
        }
    }

}
