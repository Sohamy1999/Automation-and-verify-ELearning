$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sitefeature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Automation Testing of Elearning Website",
  "description": "",
  "id": "automation-testing-of-elearning-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 29,
  "name": "Automated Social network site",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-social-network-site",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "User enters the\"\u003calphabets\u003e\",\"\u003cnumbers\u003e\",\"\u003cspecialcharacters\u003e\",\"\u003cblankspaces\u003e\"in the comment field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User clicks the post button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User views his posted comment",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User verifies the comment for 256 characters",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User replies to the posted comment \"\u003calphabets\u003e\",\"\u003cnumbers\u003e\",\"\u003cspecialcharacters\u003e\",\"\u003cblankspaces\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User clicks on post button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User deletes the reply",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User delets the comment",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-social-network-site;",
  "rows": [
    {
      "cells": [
        "alphabets",
        "numbers",
        "specialcharacters",
        "blankspaces"
      ],
      "line": 41,
      "id": "automation-testing-of-elearning-website;automated-social-network-site;;1"
    },
    {
      "cells": [
        "svdfavfjs",
        "12321",
        "@$%\u0026",
        ""
      ],
      "line": 42,
      "id": "automation-testing-of-elearning-website;automated-social-network-site;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11522076600,
  "status": "passed"
});
formatter.background({
  "line": 21,
  "name": "Automated login and navigate to social network site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 22,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User gets redirected to the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the social network on the menu bar",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User gets redirected to the social network page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 2265027300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2128760700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 4983447800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_dashboard()"
});
formatter.result({
  "duration": 3039006800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_social_network_on_the_menu_bar()"
});
formatter.result({
  "duration": 3636582300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_social_network_page()"
});
formatter.result({
  "duration": 2031631000,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Automated Social network site",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-social-network-site;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "User enters the\"svdfavfjs\",\"12321\",\"@$%\u0026\",\"\"in the comment field",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User clicks the post button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User views his posted comment",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User verifies the comment for 256 characters",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User replies to the posted comment \"svdfavfjs\",\"12321\",\"@$%\u0026\",\"\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User clicks on post button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User deletes the reply",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User delets the comment",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "svdfavfjs",
      "offset": 16
    },
    {
      "val": "12321",
      "offset": 28
    },
    {
      "val": "@$%\u0026",
      "offset": 36
    },
    {
      "val": "",
      "offset": 43
    }
  ],
  "location": "stepdefination.user_enters_the_in_the_comment_field(String,String,String,String)"
});
formatter.result({
  "duration": 5262913500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_the_post_button()"
});
formatter.result({
  "duration": 3259659000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_views_his_posted_comment()"
});
formatter.result({
  "duration": 2035596000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "256",
      "offset": 30
    }
  ],
  "location": "stepdefination.user_verifies_the_comment_for_characters(int)"
});
formatter.result({
  "duration": 2031424300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "svdfavfjs",
      "offset": 36
    },
    {
      "val": "12321",
      "offset": 48
    },
    {
      "val": "@$%\u0026",
      "offset": 56
    },
    {
      "val": "",
      "offset": 63
    }
  ],
  "location": "stepdefination.user_replies_to_the_posted_comment(String,String,String,String)"
});
formatter.result({
  "duration": 4163470400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_post_button()"
});
formatter.result({
  "duration": 56301700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_deletes_the_reply()"
});
formatter.result({
  "duration": 4073891800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_delets_the_comment()"
});
formatter.result({
  "duration": 2067397900,
  "status": "passed"
});
formatter.after({
  "duration": 2001544000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 44,
  "name": "Automated Social network site my friends section",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-social-network-site-my-friends-section",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 45,
  "name": "User enters a string \"\u003cname\u003e\" in the friends search field",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User clicks on the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User gets redirected to the search page",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User verifies the result",
  "keyword": "Then "
});
formatter.examples({
  "line": 50,
  "name": "",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-social-network-site-my-friends-section;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 51,
      "id": "automation-testing-of-elearning-website;automated-social-network-site-my-friends-section;;1"
    },
    {
      "cells": [
        "r"
      ],
      "line": 52,
      "id": "automation-testing-of-elearning-website;automated-social-network-site-my-friends-section;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11309750700,
  "status": "passed"
});
formatter.background({
  "line": 21,
  "name": "Automated login and navigate to social network site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 22,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User gets redirected to the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the social network on the menu bar",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User gets redirected to the social network page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 2123566200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2118566700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 6195805600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_dashboard()"
});
formatter.result({
  "duration": 3033654700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_social_network_on_the_menu_bar()"
});
formatter.result({
  "duration": 3439715100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_social_network_page()"
});
formatter.result({
  "duration": 2028041800,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Automated Social network site my friends section",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-social-network-site-my-friends-section;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 45,
  "name": "User enters a string \"r\" in the friends search field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User clicks on the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User gets redirected to the search page",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User verifies the result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "r",
      "offset": 22
    }
  ],
  "location": "stepdefination.user_enters_a_character_in_the_friends_search_field(String)"
});
formatter.result({
  "duration": 55473200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 3778515400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_search_page()"
});
formatter.result({
  "duration": 3058258800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_verifies_the_result()"
});
formatter.result({
  "duration": 1042556900,
  "status": "passed"
});
formatter.after({
  "duration": 2000382700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 54,
  "name": "Automated search page",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-search-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 55,
  "name": "User clicks on the search button while field is null",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "User gets redirected to the detailed search page area",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User enters \"\u003cletter\u003e\" letter or word in the search field",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "User selects User from drop down options",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User clicks on search icon",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "User is able to see the related user results",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User selects Groups from drop down field options",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User is able to see the groups related results",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "User selects select from drop down field",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "User clicks on search tab",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User is able to see both the user and groups related results",
  "keyword": "Then "
});
formatter.examples({
  "line": 68,
  "name": "",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-search-page;",
  "rows": [
    {
      "cells": [
        "letter"
      ],
      "line": 69,
      "id": "automation-testing-of-elearning-website;automated-search-page;;1"
    },
    {
      "cells": [
        "r"
      ],
      "line": 70,
      "id": "automation-testing-of-elearning-website;automated-search-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11109745100,
  "status": "passed"
});
formatter.background({
  "line": 21,
  "name": "Automated login and navigate to social network site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 22,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User gets redirected to the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the social network on the menu bar",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User gets redirected to the social network page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 2147959400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2119571900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5104921300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_dashboard()"
});
formatter.result({
  "duration": 3026816600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_social_network_on_the_menu_bar()"
});
formatter.result({
  "duration": 3508874700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_social_network_page()"
});
formatter.result({
  "duration": 2024657900,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "Automated search page",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-search-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 55,
  "name": "User clicks on the search button while field is null",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "User gets redirected to the detailed search page area",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User enters \"r\" letter or word in the search field",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "User selects User from drop down options",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User clicks on search icon",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "User is able to see the related user results",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User selects Groups from drop down field options",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User is able to see the groups related results",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "User selects select from drop down field",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "User clicks on search tab",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User is able to see both the user and groups related results",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_search_button_while_field_is_null()"
});
formatter.result({
  "duration": 2150787300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_detailed_search_page_area()"
});
formatter.result({
  "duration": 3046246300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "r",
      "offset": 13
    }
  ],
  "location": "stepdefination.user_enters_letter_or_word_in_the_search_field(String)"
});
formatter.result({
  "duration": 55970400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_selects_User_from_drop_down_options()"
});
formatter.result({
  "duration": 2123914300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_search_icon()"
});
formatter.result({
  "duration": 2818810000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_is_able_to_see_the_related_user_results()"
});
formatter.result({
  "duration": 2025689200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_selects_Groups_from_drop_down_field_options()"
});
formatter.result({
  "duration": 2124314100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 2285836700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_is_able_to_see_the_groups_related_results()"
});
formatter.result({
  "duration": 2022745500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_selects_select_from_drop_down_field()"
});
formatter.result({
  "duration": 2107987100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_search_tab()"
});
formatter.result({
  "duration": 2990870700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_is_able_to_see_both_the_user_and_groups_related_results()"
});
formatter.result({
  "duration": 2063758800,
  "status": "passed"
});
formatter.after({
  "duration": 2000321000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 72,
  "name": "Automated uploading post with other user",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-uploading-post-with-other-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 73,
  "name": "User clicks on the search button while field is empty",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "User again gets redirected to the detailed search page",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "User enters a \"\u003cletter\u003e\" letter or word in the search field",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "User selects User from drop down field",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "User clicks search",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "User is able to see the user related results",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "User clicks on send invitation to a specific user",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "User is able to view a popup window",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "User enters the message \"\u003calphabets\u003e\",\"\u003cnumbers\u003e\",\"\u003cspecialcharacters\u003e\",\"\u003cblankspaces\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "User click on send invitation button",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "User verifies the message is sent",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "User clicks on the send message button",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "User is able to view the send message popup window",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "User enters title \"\u003ctitle\u003e\" and message \"\u003calphabets\u003e\",\"\u003cnumbers\u003e\",\"\u003cspecialcharacters\u003e\",\"\u003cblankspaces\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "User clicks on the send this message button",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "User verifies if the message is sent",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "User closes the popup window",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "User clicks over users name (wish to send post with)",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "User gets redirected to the users social wall",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "User enters \"\u003calphabets\u003e\",\"\u003cnumbers\u003e\",\"\u003cspecialcharacters\u003e\",\"\u003cblankspaces\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "User clicks post button",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "User views the uploaded post \"\u003calphabets\u003e\",\"\u003cnumbers\u003e\",\"\u003cspecialcharacters\u003e\",\"\u003cblankspaces\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "User also deletes the post",
  "keyword": "And "
});
formatter.examples({
  "line": 97,
  "name": "",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-uploading-post-with-other-user;",
  "rows": [
    {
      "cells": [
        "letter",
        "alphabets",
        "numbers",
        "specialcharacters",
        "blankspaces",
        "title"
      ],
      "line": 98,
      "id": "automation-testing-of-elearning-website;automated-uploading-post-with-other-user;;1"
    },
    {
      "cells": [
        "r",
        "sdasfds",
        "123124",
        "$%\u0026\u0026^%",
        "",
        "TITLE"
      ],
      "line": 99,
      "id": "automation-testing-of-elearning-website;automated-uploading-post-with-other-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11382093500,
  "status": "passed"
});
formatter.background({
  "line": 21,
  "name": "Automated login and navigate to social network site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 22,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User gets redirected to the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the social network on the menu bar",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User gets redirected to the social network page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 2122084700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2109010500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5209640500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_dashboard()"
});
formatter.result({
  "duration": 3029299000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_social_network_on_the_menu_bar()"
});
formatter.result({
  "duration": 3003442800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_social_network_page()"
});
formatter.result({
  "duration": 2037513200,
  "status": "passed"
});
formatter.scenario({
  "line": 99,
  "name": "Automated uploading post with other user",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-uploading-post-with-other-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 73,
  "name": "User clicks on the search button while field is empty",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "User again gets redirected to the detailed search page",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "User enters a \"r\" letter or word in the search field",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "User selects User from drop down field",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "User clicks search",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "User is able to see the user related results",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "User clicks on send invitation to a specific user",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "User is able to view a popup window",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "User enters the message \"sdasfds\",\"123124\",\"$%\u0026\u0026^%\",\"\"",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "User click on send invitation button",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "User verifies the message is sent",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "User clicks on the send message button",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "User is able to view the send message popup window",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "User enters title \"TITLE\" and message \"sdasfds\",\"123124\",\"$%\u0026\u0026^%\",\"\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "User clicks on the send this message button",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "User verifies if the message is sent",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "User closes the popup window",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "User clicks over users name (wish to send post with)",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "User gets redirected to the users social wall",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "User enters \"sdasfds\",\"123124\",\"$%\u0026\u0026^%\",\"\"",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "User clicks post button",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "User views the uploaded post \"sdasfds\",\"123124\",\"$%\u0026\u0026^%\",\"\"",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "User also deletes the post",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_search_button_while_field_is_empty()"
});
formatter.result({
  "duration": 2113819400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_again_gets_redirected_to_the_detailed_search_page()"
});
formatter.result({
  "duration": 3039738600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "r",
      "offset": 15
    }
  ],
  "location": "stepdefination.user_enters_a_letter_or_word_in_the_search_field(String)"
});
formatter.result({
  "duration": 56339000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_selects_User_from_drop_down_field()"
});
formatter.result({
  "duration": 2108066600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_search()"
});
formatter.result({
  "duration": 2689577100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_is_able_to_see_the_user_related_results()"
});
formatter.result({
  "duration": 2028482900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_send_invitation_to_a_specific_user()"
});
formatter.result({
  "duration": 42003800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_is_able_to_view_a_popup_window()"
});
formatter.result({
  "duration": 2018312600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdasfds",
      "offset": 25
    },
    {
      "val": "123124",
      "offset": 35
    },
    {
      "val": "$%\u0026\u0026^%",
      "offset": 44
    },
    {
      "val": "",
      "offset": 53
    }
  ],
  "location": "stepdefination.user_enters_the_message(String,String,String,String)"
});
formatter.result({
  "duration": 4189923900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_send_invitation_button()"
});
formatter.result({
  "duration": 53679000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_verifies_the_message_is_sent()"
});
formatter.result({
  "duration": 2054567100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_send_message_button()"
});
formatter.result({
  "duration": 1039355900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_is_able_to_view_the_send_message_popup_window()"
});
formatter.result({
  "duration": 2020084300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TITLE",
      "offset": 19
    },
    {
      "val": "sdasfds",
      "offset": 39
    },
    {
      "val": "123124",
      "offset": 49
    },
    {
      "val": "$%\u0026\u0026^%",
      "offset": 58
    },
    {
      "val": "",
      "offset": 67
    }
  ],
  "location": "stepdefination.user_enters_title_and_message(String,String,String,String,String)"
});
formatter.result({
  "duration": 5323105900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_send_this_message_button()"
});
formatter.result({
  "duration": 1069785400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_verifies_if_the_message_is_sent()"
});
formatter.result({
  "duration": 2032059000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_closes_the_popup_window()"
});
formatter.result({
  "duration": 35526800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_over_users_name_wish_to_send_post_with()"
});
formatter.result({
  "duration": 2412595700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_user_s_social_wall()"
});
formatter.result({
  "duration": 3036598900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdasfds",
      "offset": 13
    },
    {
      "val": "123124",
      "offset": 23
    },
    {
      "val": "$%\u0026\u0026^%",
      "offset": 32
    },
    {
      "val": "",
      "offset": 41
    }
  ],
  "location": "stepdefination.user_enters(String,String,String,String)"
});
formatter.result({
  "duration": 4154199700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_post_button()"
});
formatter.result({
  "duration": 2694321100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdasfds",
      "offset": 30
    },
    {
      "val": "123124",
      "offset": 40
    },
    {
      "val": "$%\u0026\u0026^%",
      "offset": 49
    },
    {
      "val": "",
      "offset": 58
    }
  ],
  "location": "stepdefination.user_views_the_uploaded_post(String,String,String,String)"
});
formatter.result({
  "duration": 3034258300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_also_deletes_the_post()"
});
formatter.result({
  "duration": 2071040800,
  "status": "passed"
});
formatter.after({
  "duration": 2002080700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 101,
  "name": "Automated group information",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-group-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 102,
  "name": "User clicks on the search button while field is empty again",
  "keyword": "When "
});
formatter.step({
  "line": 103,
  "name": "User gets redirected to the detailed search page",
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "User enters a string \"\u003cletter\u003e\" letter or word in the search field",
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "User selects Groups from drop down field",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "User clicks on search",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "User is able to see the related results",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "User clicks on see more or group name to see more details about the group",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "User sees earlier discussions in discussion tab",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "User clicks on members",
  "keyword": "When "
});
formatter.step({
  "line": 111,
  "name": "User can view members of the group",
  "keyword": "Then "
});
formatter.step({
  "line": 112,
  "name": "User clicks on compose message if already joined group",
  "keyword": "Then "
});
formatter.step({
  "line": 113,
  "name": "User can see the compose message window pop",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "User writes the subject and message,\"\u003calphabets\u003e\",\"\u003cnumbers\u003e\",\"\u003cspecialcharacters\u003e\",\"\u003cblankspaces\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "User clicks on the send button",
  "keyword": "Then "
});
formatter.step({
  "line": 116,
  "name": "User gets redirected to the discussion page",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "User sees the sent message",
  "keyword": "And "
});
formatter.examples({
  "line": 119,
  "name": "",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-group-information;",
  "rows": [
    {
      "cells": [
        "letter",
        "alphabets",
        "numbers",
        "specialcharacters",
        "blankspaces"
      ],
      "line": 120,
      "id": "automation-testing-of-elearning-website;automated-group-information;;1"
    },
    {
      "cells": [
        "r",
        "sdasfds",
        "123124",
        "$%\u0026\u0026^%",
        ""
      ],
      "line": 121,
      "id": "automation-testing-of-elearning-website;automated-group-information;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11368169700,
  "status": "passed"
});
formatter.background({
  "line": 21,
  "name": "Automated login and navigate to social network site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 22,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User gets redirected to the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the social network on the menu bar",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User gets redirected to the social network page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 2132311700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2132940400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5661787300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_dashboard()"
});
formatter.result({
  "duration": 3026634400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_social_network_on_the_menu_bar()"
});
formatter.result({
  "duration": 3368404700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_social_network_page()"
});
formatter.result({
  "duration": 2025373600,
  "status": "passed"
});
formatter.scenario({
  "line": 121,
  "name": "Automated group information",
  "description": "",
  "id": "automation-testing-of-elearning-website;automated-group-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 102,
  "name": "User clicks on the search button while field is empty again",
  "keyword": "When "
});
formatter.step({
  "line": 103,
  "name": "User gets redirected to the detailed search page",
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "User enters a string \"r\" letter or word in the search field",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "User selects Groups from drop down field",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "User clicks on search",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "User is able to see the related results",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "User clicks on see more or group name to see more details about the group",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "User sees earlier discussions in discussion tab",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "User clicks on members",
  "keyword": "When "
});
formatter.step({
  "line": 111,
  "name": "User can view members of the group",
  "keyword": "Then "
});
formatter.step({
  "line": 112,
  "name": "User clicks on compose message if already joined group",
  "keyword": "Then "
});
formatter.step({
  "line": 113,
  "name": "User can see the compose message window pop",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "User writes the subject and message,\"sdasfds\",\"123124\",\"$%\u0026\u0026^%\",\"\"",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "User clicks on the send button",
  "keyword": "Then "
});
formatter.step({
  "line": 116,
  "name": "User gets redirected to the discussion page",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "User sees the sent message",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_search_button_while_field_is_empty_again()"
});
formatter.result({
  "duration": 2049541500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_detailed_search_page()"
});
formatter.result({
  "duration": 3045019300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "r",
      "offset": 22
    }
  ],
  "location": "stepdefination.user_enters_a_string_letter_or_word_in_the_search_field(String)"
});
formatter.result({
  "duration": 57023200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_selects_Groups_from_drop_down_field()"
});
formatter.result({
  "duration": 2104134000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_search()"
});
formatter.result({
  "duration": 2221345300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_is_able_to_see_the_related_results()"
});
formatter.result({
  "duration": 2023544600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_see_more_or_group_name_to_see_more_details_about_the_group()"
});
formatter.result({
  "duration": 4166446700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_sees_earlier_discussions_in_discussion_tab()"
});
formatter.result({
  "duration": 2027376600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_members()"
});
formatter.result({
  "duration": 2054330200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_can_view_members_of_the_group()"
});
formatter.result({
  "duration": 2031727400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_compose_message_if_already_joined_group()"
});
formatter.result({
  "duration": 5117021500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_can_see_the_compose_message_window_pop()"
});
formatter.result({
  "duration": 2026160400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdasfds",
      "offset": 37
    },
    {
      "val": "123124",
      "offset": 47
    },
    {
      "val": "$%\u0026\u0026^%",
      "offset": 56
    },
    {
      "val": "",
      "offset": 65
    }
  ],
  "location": "stepdefination.user_writes_the_subject_and_message(String,String,String,String)"
});
formatter.result({
  "duration": 3185273600,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.fail(Assert.java:96)\r\n\tat Stepdefination.stepdefination.user_writes_the_subject_and_message(stepdefination.java:1529)\r\n\tat ✽.And User writes the subject and message,\"sdasfds\",\"123124\",\"$%\u0026\u0026^%\",\"\"(Sitefeature.feature:114)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_the_send_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.user_gets_redirected_to_the_discussion_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.user_sees_the_sent_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2000173200,
  "status": "passed"
});
});