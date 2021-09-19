$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TripAdvisor.feature");
formatter.feature({
  "line": 2,
  "name": "Trip Advisor Hotel Search and Hotel Link Verification",
  "description": "",
  "id": "trip-advisor-hotel-search-and-hotel-link-verification",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify Hotel Search and Hotel link Navigation",
  "description": "",
  "id": "trip-advisor-hotel-search-and-hotel-link-verification;verify-hotel-search-and-hotel-link-navigation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@HotelSearch"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User navigates to TripAdvisor homepage.",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User searches a particular \"\u003ccountry\u003e \" of his choice.",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Clicks on hotel option.",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User selects the first displayed hotel.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User switches window and verifies the hotel Details.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Clicks on hotels website.",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Verifies wether Website of the hotel is successfully launched.",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "trip-advisor-hotel-search-and-hotel-link-verification;verify-hotel-search-and-hotel-link-navigation;",
  "rows": [
    {
      "cells": [
        "country"
      ],
      "line": 16,
      "id": "trip-advisor-hotel-search-and-hotel-link-verification;verify-hotel-search-and-hotel-link-navigation;;1"
    },
    {
      "cells": [
        "France"
      ],
      "line": 17,
      "id": "trip-advisor-hotel-search-and-hotel-link-verification;verify-hotel-search-and-hotel-link-navigation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3816177118,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Hotel Search and Hotel link Navigation",
  "description": "",
  "id": "trip-advisor-hotel-search-and-hotel-link-verification;verify-hotel-search-and-hotel-link-navigation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@HotelSearch"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User navigates to TripAdvisor homepage.",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User searches a particular \"France \" of his choice.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Clicks on hotel option.",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User selects the first displayed hotel.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User switches window and verifies the hotel Details.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Clicks on hotels website.",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Verifies wether Website of the hotel is successfully launched.",
  "keyword": "Then "
});
formatter.match({
  "location": "TripHotelSearchStepDefinition.user_navigates_to_TripAdvisor_homepage()"
});
formatter.result({
  "duration": 2518742953,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "France ",
      "offset": 28
    }
  ],
  "location": "TripHotelSearchStepDefinition.user_searches_a_particular_of_his_choice(String)"
});
