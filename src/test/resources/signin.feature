Feature: signin

  @signin
  Scenario: signin
#    Given I enter url as "https://www.easyjet.com/en"
    Given I enter url
    When I click on the sign in
    And I enter  email id as "saritha2@hotmail.com"
    And I enter password as "test1212"
    When I click the signin button
    Then I should receive the message"My bookings"


  Scenario: Invalid Signin
    Given I enter url as "https://www.easyjet.com/en"
    When I click on the sign in
#    And I check the check box of returning customer
    And I enter email id as "saritha5@hotmail.com"
    And I enter password as "test1212"
    When I click the signin button
    Then I should receive the message"check the above details"
