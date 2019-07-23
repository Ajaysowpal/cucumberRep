$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:CaseStudy2/case2.feature");
formatter.feature({
  "name": "Testing User",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing Valid Users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the app",
  "keyword": "Given "
});
formatter.step({
  "name": "click signin",
  "keyword": "Then "
});
formatter.step({
  "name": "type \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "types \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clickLogin",
  "keyword": "Then "
});
formatter.step({
  "name": "clickLogout",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "AlexUser",
        "Alex@123"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing Valid Users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the app",
  "keyword": "Given "
});
formatter.match({
  "location": "CaseStudy2.open_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type \"AlexUser\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.type(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "types \"Alex@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy2.types(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickLogin",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.clicklogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickLogout",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.clickLogout()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing Valid Users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the app",
  "keyword": "Given "
});
formatter.match({
  "location": "CaseStudy2.open_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type \"Lalitha\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.type(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "types \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy2.types(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickLogin",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.clicklogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickLogout",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2.clickLogout()"
});
formatter.result({
  "status": "passed"
});
});