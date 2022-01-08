Feature: Contact page feature
  Scenario: Make sure that the email text field is visible
    Given User open the website and go to login page
    When  User fill email "slayerscream11@gmail.com"  and "Ahm2715130" and click login
    And  Clicks on contacts
    Then Email text filed should be visible