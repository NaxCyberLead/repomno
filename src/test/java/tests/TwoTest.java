package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class TwoTest extends Base {
    public WebDriver driver;
    @Test
    public void testTwo() throws IOException, InterruptedException {

        System.out.println("TestTwo");
        driver = initializeBrowser();

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        driver.close();
    }
}
