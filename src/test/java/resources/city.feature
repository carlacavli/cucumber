Feature: Create a City

  Scenario Outline:  City Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on City
    And Click on plus icon
    And Type in the Name "<Cucucountry>"
    And Choose any value from the dropdown
    When Click on save button
    Then "<Cucucountry>" should be displayed
    And Remove the data "<Cucucountry>"
    Then Verify data is removed "<Cucucountry>"

    Examples:
      | Cucucountry |
      |   cucu1  |
      |   cucu2   |
      |   cucu3   |
