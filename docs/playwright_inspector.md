The "Cheat Code": Playwright's Built-in Inspector

Playwright has a tool that finds the best locator for you automatically.

In your terminal, run this command:
    Bash

mvn exec:java -e -Dexec.mainClass="com.microsoft.playwright.CLI" -Dexec.args="codegen wikipedia.org"

Two windows will open: a browser and a "Playwright Inspector".

Move your mouse over the Search button in the browser.

Look at the Inspector window—it will show you exactly what code to write!