Feature: Search Functionality
  As user I want to search for cars on the website

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on "buy+sell" tab
    And I click 'Search Cars' link
    Then I navigate to 'new and used car search' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab

    Examples:
      | make        | model         | location     | price    |
      | Audi        | Q7            | NT - All     | $60,000  |
      | BMW         | 3 Series      | NSW - All    | $40,000  |
      | Jaguar      | Any Model     | WA - All     | $70,000  |
      | Tesla       | Any Model     | WA - Perth   | $90,000  |
      | Rolls-Royce | Silver Spirit | WA - All     | $50,000  |
      | Ferrari     | Any Model     | Any Location | $200,000 |

  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on "buy+sell" tab
    And I click 'Used' link
    Then I navigate to 'Used Cars For Sale' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab

    Examples:
      | make          | model        | location     | price    |
      | Ford          | Focus        | Any Location | $15,000  |
      | Mercedes-Benz | A-Class      | NSW - All    | $35,000  |
      | Land Rover    | Freelander 2 | NT - All     | $60,000  |
      | Porsche       | Cayenne      | ACT - All    | $200,000 |
      | Mini          | Any Model    | NSW - Sydney | $80,000  |
      | Toyota        | Auris        | Any Location | $50,000  |