package com.example;

import com.microsoft.playwright.*; // Import the Playwright "Actor"

import org.junit.jupiter.api.*;    // Import the JUnit "Director" tools
import static org.junit.jupiter.api.Assertions.*; // Import the "Check" tools
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WikiTest{
    // --- Step 1: ARRANGE (The Setup) ---
    //Global Variable (The Actor and the Stage)
    static Playwright playwright;
    static Browser browser;

    // Test-level variables (The specific Tab)
    BrowserContext context;
    Page page;


    private String getProp(String key) {
    Properties props = new Properties();
    try (FileInputStream fis = new FileInputStream("config.properties")) {
        props.load(fis);
    } catch (IOException e) {
        System.out.println("Config file not found, check project root!");
    }
    return props.getProperty(key);
}
    @BeforeAll
    static void launchBrowser(){
        // Start the Playwright engine
        playwright = Playwright.create();
        // Open the physical browser (Headed = true so you can see it)
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000)); // This adds a 1-second pause between every action!);
    }

    @BeforeEach
    void createContextAndPage(){
    // This runs BEFORE EVERY @Test
    context = browser.newContext();
    page = context.newPage();
    page.navigate(getProp("url"));
    }

    @Test
   // @Order(1)
    @DisplayName("Search for Java")
    void searchJavaTest(){
        System.out.println("Running Test 1");
        page.locator("#searchInput").fill("Java");
        page.locator("#search-form > fieldset > button").click();

        String heading = page.locator("#firstHeading").textContent();
        assertEquals("Java", heading);
    }

    @Test
    //@Order(2)
    @DisplayName("Search for Playwright")
    void searchPlaywrightTest(){
    System.out.println("Running Test 2");
    page.locator("#searchInput").fill("Playwright (software)");
    page.locator("#search-form > fieldset > button").click();
        
    assertTrue(page.title().contains("Playwright"));
    }

    @Test
    @DisplayName("Switch to Spanish Wikipedia")
    void searchEspanolLanguage(){
    System.out.println("Running Test 3");
    page.locator("a:has-text('Español')").first().click();
    assertTrue(page.url().contains("es.wikipedia.org"));
}

@Test
@DisplayName("Hover and Click Practice")
void hoverEnglishWiki(){
    // 1. DEFINE: Find the link but DO NOT click it yet
    // selector: #js-link-box-en
    // selector: *[@id="js-link-box-en"]
    // We use the CSS selector from 'Inspect'
    // This is the "Technical Address"
    Locator englishLink = page.locator("#js-link-box-en");
    englishLink.hover();
    englishLink.click();
}

@AfterEach
    void closeContext(){
    // This runs AFTER EVERY @Test
    context.close();
    }


    @AfterAll
    static void closeBrowser(){
        // Close everything when finished
        browser.close();
        playwright.close();
    }
}
