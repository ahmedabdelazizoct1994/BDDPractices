Feature: Test the login functionality
  @Regression
  Scenario: To login with valid email and  valid password
    Given User open the website and go to login page
    When  User fill email "slayerscream11@gmail.com"  and "Ahm2715130" and click login

    Then User should navigate to home page


@Sanity
  Scenario Outline: To login with valid email and  valid password
    Given User open the website and go to login page
    When  User fill email "<username>"  and "<password>" and click login

    Then User should navigate to home page

    Examples:
      |username|password|
      |slayerscream11@gmail.com|Ahm2715130|
      |slayerscream11@gmail.com| wrongPass|
      |wrongUser|Ahm2715130|

