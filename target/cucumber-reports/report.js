$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 1,
  "name": "Cryptocompare example",
  "description": "",
  "id": "cryptocompare-example",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Scrape page",
  "description": "",
  "id": "cryptocompare-example;scrape-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a user opens the target page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user scrapes the page",
  "keyword": "When "
});
formatter.match({
  "location": "ExampleStepDefs.userOpensPage()"
});
formatter.result({
  "duration": 9442201206,
  "status": "passed"
});
formatter.match({
  "location": "ExampleStepDefs.userScrapesThePage()"
});
formatter.result({
  "duration": 42697741043,
  "status": "passed"
});
});