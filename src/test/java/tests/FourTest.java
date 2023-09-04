package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class FourTest extends Base {
    public WebDriver driver;

    @Test
    public void testFour() throws IOException, InterruptedException {
        System.out.println("TestFour");
        driver = initializeBrowser();

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        Assert.fail();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
