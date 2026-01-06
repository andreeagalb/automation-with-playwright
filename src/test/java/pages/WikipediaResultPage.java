package pages;

import com.microsoft.playwright.Page;

public class WikipediaResultPage {
    private final Page page;

    // Locator: This is the CSS selector for the main title of any Wikipedia article
    private final String firstHeading = "h1#firstHeading";

    // Constructor: This connects this page object to the browser tab
    public WikipediaResultPage(Page page) {
        this.page = page;
    }

    /**
     * This method extracts the text from the main heading of the page.
     * We use this in our test to verify we are on the right article.
     */
    public String getArticleTitle() {
        return page.textContent(firstHeading);
    }
}