Feature: Create a discount
  Scenario Outline:  discount Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on Discount
    And Click on plus icon
    And Type in the Description "<description>"
    And Type in the integrationCode "<integrationCode>"
    And Type in the Priority "<Priority>"
    When Click on save button
    Then "<description>" should be displayed
    And Remove the data "<description>"
    Then Verify data is removed "<description>"
    Examples:
      | description | integrationCode | Priority |
      | disc1   |code1            | 2        |
      | disc2   |code2            | 3        |
      | disc3   |code3            | 4        |

