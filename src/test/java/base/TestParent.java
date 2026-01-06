package base;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class TestParent { // Must be 'TestParent' to match the file name
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeEach
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @AfterEach
    public void tearDown() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}