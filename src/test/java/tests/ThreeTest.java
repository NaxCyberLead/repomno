package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class ThreeTest extends Base {
    public WebDriver driver;

    @Test
    public void testThree() throws IOException, InterruptedException {
        System.out.println("TestThree");
        driver = initializeBrowser();

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        driver.close();
    }
}
