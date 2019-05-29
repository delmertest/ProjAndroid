$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/VodQA.feature");
formatter.feature({
  "name": "BCP mobile automation exam",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "VodQA navigation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mobile"
    }
  ]
});
formatter.step({
  "name": "I set up appium server",
  "keyword": "Given "
});
formatter.step({
  "name": "I login with user \"\u003cusr\u003e\" and password \"\u003cpwd\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I tap on Carousel",
  "keyword": "And "
});
formatter.step({
  "name": "I verify that the first number displayed is \"\u003cnumber\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usr",
        "pwd",
        "number"
      ]
    },
    {
      "cells": [
        "admin",
        "admin",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "VodQA navigation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mobile"
    }
  ]
});
formatter.step({
  "name": "I set up appium server",
  "keyword": "Given "
});
formatter.match({
  "location": "VodQASteps.i_set_up_appium_server()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login with user \"admin\" and password \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "VodQASteps.i_login_with_user_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Carousel",
  "keyword": "And "
});
formatter.match({
  "location": "VodQASteps.i_tap_on_Carousel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the first number displayed is \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "VodQASteps.i_verify_that_the_first_number_displayed_is(String)"
});
formatter.result({
  "status": "passed"
});
});