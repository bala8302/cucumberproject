$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/AppStart.feature");
formatter.feature({
  "line": 1,
  "name": "Test the BDD framework",
  "description": "",
  "id": "test-the-bdd-framework",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9261600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test the Feature",
  "description": "",
  "id": "test-the-bdd-framework;test-the-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Given user clicks the application"
    },
    {
      "line": 7,
      "value": "#When user enters \"uname\" and \"pwd\""
    }
  ],
  "line": 8,
  "name": "Open the Browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Users Enters the Value",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.open_the_browser()"
});
formatter.result({
  "duration": 7790114000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.entertheValuesinSB()"
});
formatter.result({
  "duration": 286844100,
  "error_message": "java.lang.Exception\r\n\tat io.cucumber.cucumber_archetype.StepDefinitions.entertheValuesinSB(StepDefinitions.java:50)\r\n\tat ✽.When Users Enters the Value(src/test/resources/Feature/AppStart.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 561497400,
  "status": "passed"
});
});