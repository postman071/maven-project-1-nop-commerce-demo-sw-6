Feature: Register Page  Test
  As a user I want to Register

  @smoke @regression
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given User on home page
    When User Click on Register Link
    Then User verify that "Register" text

  @sanity @regression
  Scenario: Verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    Given User on home page
    When User Click on Register Link
    And User Click on REGISTER button
    And User Verify the error messages "First name is required."
    And User Verify the error messages "Last name is required."
    And User Verify the error messages "Email is required."
    And User Verify the error messages "Password is required."
    Then User Verify the error messages "Password is required."

  @regression
  Scenario: Verify That User Should Create Account Successfully
    Given User Click on Register Link
    When User Select gender Female
    And User Enter firstname
    And User Enter lastname
    And User Select day
    And User Select month
    And User Select year
    And User Enter email
    And User Enter password
    And User Enter Confirm Password
    And User Click on REGISTER button
    Then User Verify message "Your registration completed"
