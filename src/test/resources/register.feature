Feature: registration easy jet
  @register
  Scenario: registration
    Given I enter url as "https://www.easyjet.com/en/register"
    And I enter email id as "saritha2@hotmail.com"
    And I enter confirm email id as "saritha2@hotmail.com"
    And I enter password as "test1212"
    And I enter Confirm password as "test1212"
    And I enter title as "mr"
    And I enter firstName as "Saritha"
    And I enter surname as "Kaja"
    And I enter Address as "Kerris way"
    And I enter Address Continued as "Earley"
    And I enter town/city as "Reading"
    And I enter postcode as"Rg6 5es"
    And I enter country as "United Kingdom"
    And I enter mobile as "07480313983"
    And I select "Brussels" from the dropdown menu of departing

    And I check the check box to receive updates

    When I click the register button
    Then I should receive the message"My bookings"


    @register
  Scenario: registration
    Given I enter url as "https://www.easyjet.com/en/register"
    And I enter email id as "saritha2@hotmail.com"
    And I enter confirm email id as "saritha2@hotmail.com"
    And I enter password as "test1212"
    And I enter Confirm password as "test1212"
    And I enter title as "mr"
    And I enter firstName as "Saritha"
    And I enter surname as "Kaja"
    And I enter Address as "Kerris way"
    And I enter Address Continued as "Earley"
    And I enter town/city as "Reading"
    And I enter postcode as"Rg6 5es"
    And I enter country as "United Kingdom"
    And I enter mobile as "07480313983"
    And I select "Brussels" from the dropdown menu of departing

    And I check the check box to receive updates

    When I click the register button
    Then I should receive the message"My bookings"


