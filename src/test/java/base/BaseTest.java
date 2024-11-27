package base;

import config.ConfigManager;
import config.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    // WebDriver instance to be shared across test methods
    protected  WebDriver driver;

    // Logger instance to log test actions and important events
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    /**
     * This method runs before each test method. It initializes the WebDriver, opens the browser,
     * and navigates to the base URL from the configuration.
     */
    @BeforeMethod
    public  void setup( ) {
        // Initialize WebDriver using the DriverFactory
        driver = DriverFactory.initializeWebDriver();

        // Navigate to the base URL as configured in the properties file
        driver.get(ConfigManager.getProperty("baseUrl"));

        // Log that the test has started with the base URL
        logger.info("Started test with URL {}", ConfigManager.getProperty("baseUrl"));
    }



    /**
     * This method runs after each test method. It quits the WebDriver and closes the browser.
     */

    @AfterMethod
    public void tearDown() {
        // Quit the WebDriver and close the browser window
//        DriverFactory.quitDriver();
    }
}