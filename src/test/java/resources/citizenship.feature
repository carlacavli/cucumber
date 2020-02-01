Feature: create citizenship
  Scenario: citizenship creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on citizenship
    And Click on plus icon
    And Type the citizenship name "Cucucitizen"
    And Type the shortName "cucu"
    When Click on save button
    Then "Cucucitizen" should be displayed
