package example;

import org.junit.jupiter.api.Test;
import base.TestParent;
import pages.WikipediaPortalPage;
import pages.WikipediaResultPage;
import java.util.Map;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
            assertEquals(expectedTitle, actualTitle, "Title mismatch for: " + searchTerm);
        }
    }
}