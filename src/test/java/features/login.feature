Feature: Test the login functionality
  Scenario: To login with valid email and  valid password
    Given User open the website and go to login page
    When  User fill email and password and click login
    Then User should navigate to home page

