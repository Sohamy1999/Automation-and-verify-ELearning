#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Automation Testing of Elearning Website

  Background: Automated login and navigate to social network site
    Given User is on the home page
    When User enters username and password
    And User clicks on the login button
    Then User gets redirected to the dashboard
    And User clicks on the social network on the menu bar
    Then User gets redirected to the social network page

  Scenario Outline: Automated Social network site
    When User enters the"<alphabets>","<numbers>","<specialcharacters>","<blankspaces>"in the comment field
    And User clicks the post button
    Then User views his posted comment
    Then User verifies the comment for 256 characters
    And User replies to the posted comment "<alphabets>","<numbers>","<specialcharacters>","<blankspaces>"
    And User clicks on post button
    Then User deletes the reply
    Then User delets the comment


    Examples: 
      | alphabets | numbers | specialcharacters | blankspaces |
      | svdfavfjs |   12321 | @$%&              |             |

  Scenario Outline: Automated Social network site my friends section
    When User enters a string "<name>" in the friends search field
    Then User clicks on the search button
    And User gets redirected to the search page
    Then User verifies the result

    Examples: 
      | name |
      | r    |

  Scenario Outline: Automated search page
    When User clicks on the search button while field is null
    Then User gets redirected to the detailed search page area
    Then User enters "<letter>" letter or word in the search field
    And User selects User from drop down options
    Then User clicks on search icon
    And User is able to see the related user results
    Then User selects Groups from drop down field options
    And User clicks on search button
    Then User is able to see the groups related results
    Then User selects select from drop down field
    And User clicks on search tab
    Then User is able to see both the user and groups related results

    Examples: 
      | letter |
      | r      |

  Scenario Outline: Automated uploading post with other user
    When User clicks on the search button while field is empty
    Then User again gets redirected to the detailed search page
    Then User enters a "<letter>" letter or word in the search field
    And User selects User from drop down field
    Then User clicks search 
    And User is able to see the user related results
    Then User clicks on send invitation to a specific user
    And User is able to view a popup window
    Then User enters the message "<alphabets>","<numbers>","<specialcharacters>","<blankspaces>"
    And User click on send invitation button
    Then User verifies the message is sent
    Then User clicks on the send message button
    And User is able to view the send message popup window
    Then User enters title "<title>" and message "<alphabets>","<numbers>","<specialcharacters>","<blankspaces>"
    And User clicks on the send this message button
    Then User verifies if the message is sent
    Then User closes the popup window
    Then User clicks over users name (wish to send post with)
    And User gets redirected to the users social wall
    When User enters "<alphabets>","<numbers>","<specialcharacters>","<blankspaces>"
    And User clicks post button
    Then User views the uploaded post "<alphabets>","<numbers>","<specialcharacters>","<blankspaces>"
    And User also deletes the post

    Examples: 
      | letter | alphabets | numbers | specialcharacters | blankspaces | title |
      | r      | sdasfds   |  123124 | $%&&^%            |             | TITLE |

  Scenario Outline: Automated group information
    When User clicks on the search button while field is empty again
    Then User gets redirected to the detailed search page
    Then User enters a string "<letter>" letter or word in the search field
    And User selects Groups from drop down field
    Then User clicks on search
    And User is able to see the related results
    Then User clicks on see more or group name to see more details about the group
    And User sees earlier discussions in discussion tab
    When User clicks on members
    Then User can view members of the group
    Then User clicks on compose message if already joined group
    And User can see the compose message window pop
    And User writes the subject and message,"<alphabets>","<numbers>","<specialcharacters>","<blankspaces>"
    Then User clicks on the send button
    Then User gets redirected to the discussion page
    And User sees the sent message

    Examples: 
      | letter | alphabets | numbers | specialcharacters | blankspaces |
      | r      | sdasfds   |  123124 | $%&&^%            |             |
