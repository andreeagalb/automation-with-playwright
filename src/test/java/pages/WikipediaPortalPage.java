package pages;

import com.microsoft.playwright.Page;
import utils.ConfigReader;

public class WikipediaPortalPage {
    private final Page page;
    private final String searchInput = "#searchInput"; // ID selector
    private final String searchButton = "button[type='submit']";

    public WikipediaPortalPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate(ConfigReader.getProperty("url"));
    }

    public void searchFor(String term) {
        page.fill(searchInput, term);
        page.click(searchButton);
    }
}