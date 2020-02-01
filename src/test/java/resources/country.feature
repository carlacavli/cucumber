Feature: Create a Country
  Scenario:  Country Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And Type in the Name "myCountry"
    And Type in the code "Cucumber"
    When Click on save button
    Then "Cucumber1" should be displayed


