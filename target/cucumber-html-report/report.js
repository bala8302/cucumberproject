$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/AppStart.feature");
formatter.feature({
  "line": 1,
  "name": "Test the BDD framework",
  "description": "",
  "id": "test-the-bdd-framework",
  "keyword": "Feature"
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
  "line": 6,
  "name": "user clicks the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"uname\" and \"pwd\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.testApp()"
});
formatter.result({
  "duration": 120675600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "uname",
      "offset": 13
    },
    {
      "val": "pwd",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.inputLogin(String,String)"
});
formatter.result({
  "duration": 2150100,
  "status": "passed"
});
});