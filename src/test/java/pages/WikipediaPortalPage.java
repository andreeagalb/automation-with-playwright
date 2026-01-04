package pages;

import com.microsoft.playwright.Page;
import utils.ConfigReader; // Import our bridge

public class WikipediaPortalPage {
    private final Page page;
    private final String searchInput = "input#searchInput";
    private final String searchButton = "button[type='submit']";

    public WikipediaPortalPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        // Instead of hardcoding the URL, we pull it from config.properties
        String baseUrl = ConfigReader.getProperty("url");
        page.navigate(baseUrl);
    }

    public void searchFor(String term) {
        page.fill(searchInput, term);
        page.click(searchButton);
    }
}