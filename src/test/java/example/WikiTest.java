package example;

import org.junit.jupiter.api.Test;
import base.TestParent; // Pointing to the new parent name
import pages.WikipediaPortalPage;
import pages.WikipediaResultPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WikiTest extends TestParent { // Changed from BaseTest to TestParent

    @Test
    public void testWikipediaSearch() {
        WikipediaPortalPage portalPage = new WikipediaPortalPage(page);
        WikipediaResultPage resultPage = new WikipediaResultPage(page);

        portalPage.navigate();
        portalPage.searchFor("Java (programming language)");

        String actualTitle = resultPage.getArticleTitle();
        assertEquals("Java (programming language)", actualTitle);
    }
}