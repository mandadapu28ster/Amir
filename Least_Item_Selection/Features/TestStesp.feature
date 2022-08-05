Feature: least price item search

 Scenario: Test least price search in Amazon web page

    Given I am on home page
    When  I enter search mobile phone in search bar
    And   I press enter
    And   I am presented on search result page
    And   I search for least price mobile phone
    Then  I am have got search results