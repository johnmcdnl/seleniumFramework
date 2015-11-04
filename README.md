# seleniumFramework
seleniumFramework

A selenium based automation framework using Cucumber/Gherkin to drive test cases.
Built in logging is provided by making use of EventFiringWebDriver + screenshots to reports.

The framework also makes use of a single instance of a WebDriver through the tests to reduce the time needed due to opening and closing browser regularaly.
The browser should close when the JVM exits.

It's still in early days but will get there bit by bit!
