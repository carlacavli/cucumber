Feature: Create a Country
  Scenario:  Country Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And Type in the Name "CucuCountry"
    And Type in the code "Cucu"
    When Click on save button
    Then "CucuCountry" should be displayed
    And Remove the data "CucuCountry"
    Then Verify data is removed "CucuCountry"


