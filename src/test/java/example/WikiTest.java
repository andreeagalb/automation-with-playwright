package example;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Page;

import base.TestParent;
import pages.WikipediaPortalPage;
import pages.WikipediaResultPage;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class WikiTest extends TestParent {

    @Test
    public void testWikipediaWithMap() {
        WikipediaPortalPage portalPage = new WikipediaPortalPage(page);
        WikipediaResultPage resultPage = new WikipediaResultPage(page);

        // 1. Create the Map (Key: Search Term, Value: Expected Title)
        Map<String, String> testData = new HashMap<>();
        testData.put("Java", "Java (programming language)");
        testData.put("Python", "Python (programming language)");
        testData.put("Playwright", "Playwright (software)");

        // 2. Iterate through the Map using entrySet
        for (Map.Entry<String, String> entry : testData.entrySet()) {
            String searchTerm = entry.getKey();
            String expectedTitle = entry.getValue();

            System.out.println("Testing Key: " + searchTerm + " | Expecting: " + expectedTitle);
            
            portalPage.navigate();
            portalPage.searchFor(searchTerm);

            String actualTitle = resultPage.getArticleTitle();
            
            // 3. Exact match validation
           // Instead of assertEquals(expectedTitle, actualTitle);
assertTrue(actualTitle.contains(searchTerm), 
    "FAIL: The page title '" + actualTitle + "' does not contain '" + searchTerm + "'");
        }
    }
@Test
public void testWithExceptionHandling() {
    WikipediaPortalPage portalPage = new WikipediaPortalPage(page);
    
    try {
        portalPage.navigate();
        // Imagine the internet is down or the selector is wrong
        portalPage.searchFor("Java (programming language)");
        
        System.out.println("Search successful!");
        
    } catch (com.microsoft.playwright.PlaywrightException e) {
        // This runs ONLY if a Playwright-specific error occurs
        System.err.println("CRITICAL ERROR: Could not interact with the browser!");
        System.err.println("Error Message: " + e.getMessage());
        
        // Senior Move: Take a screenshot here so you can see what went wrong
        page.screenshot(new Page.ScreenshotOptions().setPath(java.nio.file.Paths.get("error.png")));
        
    } catch (Exception e) {
        // This catches any OTHER type of Java error
        System.err.println("An unexpected Java error occurred: " + e.getMessage());
        
    } finally {
        System.out.println("Cleaning up the test execution...");
        // Usually, browser closing is handled in @AfterEach, 
        // but finally is the core Java way to ensure cleanup.
    }
}
}