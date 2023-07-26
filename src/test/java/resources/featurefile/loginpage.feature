@regression
Feature: LoginPage Test
  As a user I want to login

  @smoke @regression
  Scenario:User Should Navigate To Login PageSuccessFully
    Given User on home page
    When User Click on login link
    Then User verify that "Welcome, Please Sign In!" message display

  @@sanity @regression
  Scenario: User verify The Error Message With InValid Credentials
    Given User on home page
    When User Click on login link
    And  User Enter "EmailId"
    And  User Enter the "Password"
    And  User Click on Login Button
    Then  User Verify that the "Error message"

  @regression
  Scenario: Verify That User Should Log In SuccessFully With Valid Credentials
    Given User on home page
    When User Click on login link
    And  User Enter "EmailId"
    And  User Enter the "Password"
    And  User Click on Login Button
    Then Verify that "LogOut link" is display

  @smoke
  Scenario: Verify That User Should Log Out SuccessFully
    Given User on home page
    When User Click on login link
    And  User Enter "EmailId"
    And  User Enter the "Password"
    And  User Click on Login Button
    Then Verify that "LogIn" Link Display