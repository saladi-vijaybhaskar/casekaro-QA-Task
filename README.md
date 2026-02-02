# Assignment — Test Automation ⚡

A compact, easy-to-use Maven test automation project using **Playwright (Java)** for browser automation, **TestNG** for test execution, and **ExtentReports** for reporting.

---

## Quick start 🔧
1. Prerequisites
   - Java 11+ and Maven 3.6+
2. (Optional) Install Playwright browsers
   - Use Playwright CLI or run the Playwright Java CLI (e.g., via Maven exec) to install browsers.
3. Build and run
```bash
mvn clean test
```
4. Run suite (uses `testng.xml`)
```bash
mvn -Dsurefire.suiteXmlFiles=testng.xml test
```
5. Run specific test class or method
```bash
mvn -Dtest=HomePageTest test
mvn -Dtest=HomePageTest#testMethodName test
```

---

## What you'll find here 📁
- `pom.xml` — project and dependencies (Playwright, TestNG, ExtentReports)
- `testng.xml` — TestNG suite configuration
- `src/test/java/pages` — Page Objects
- `src/test/java/base` — `BaseTest` and test bootstrap
- `src/test/java/tests` — test classes (primary: **`HomePageTest`**)
- `src/test/java/utils` — utilities (e.g., `ExtentManager`)
- `test-output/` — TestNG/Extent reports generated after runs

---

## Architecture & patterns 🏗️
- Page Object Model: pages encapsulate UI interactions and locators.
- Tests are lightweight and assert behavior using pages and utilities.
- Reporting: ExtentReports is initialized via `ExtentManager` and written to `test-output/`.

---

## Reports & results 📊
- TestNG HTML: `test-output/index.html`
- Extent report: `test-output/ExtentReport.html`
Open these files in your browser after a test run.

---

## IDE & workflow 🖥️
- Recommended: **IntelliJ IDEA** (run TestNG tests directly from the IDE).
- Alternatively use **Eclipse** or **VS Code** with Java extensions.
- To run a single test class/method in IDE, use TestNG run configurations or right-click the test.

---

## CI suggestion 🚦
- Use `mvn clean test` in pipeline and archive `test-output/` artifacts for report inspection.
- Keep `testng.xml` updated to control suites and parallelism.

---

## Notes & tips 💡
- Primary test: `HomePageTest`. Add tests under `src/test/java/tests` following POM.
- Keep page objects small and focused on behavior.
- If Playwright browsers are not available on CI, ensure browsers are installed during CI (Playwright CLI step).

---

If you want, I can add a short GitHub Actions snippet to run tests and upload reports or include badges at the top. Keep it minimal and I will add them on request.

---
Made minimal on purpose — say if you want more details (examples, badges, or CI snippets).
