Feature: BCP mobile automation exam

  @mobile
  Scenario Outline: VodQA navigation
    Given I set up appium server
    When I login with user "<usr>" and password "<pwd>"
    And I tap on Carousel
    Then I verify that the first number displayed is "<number>"

    Examples: 
      | usr   | pwd   | number |
      | admin | admin |      1 |
