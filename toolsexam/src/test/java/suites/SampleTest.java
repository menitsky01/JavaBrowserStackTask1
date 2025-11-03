package suites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {

    public WebDriver driver;

    public String username = "YOUR_USERNAME";
    public String accessKey = "YOUR_ACCESS_KEY";
    public boolean useBrowserStack = false;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("BrowserStack");
        driver.findElement(By.name("q")).submit();
        System.out.println("Title is: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}