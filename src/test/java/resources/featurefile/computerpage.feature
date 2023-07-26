Feature: Computer Page Test
  As a user I want to check computer page

  @smoke @regression
  Scenario:Verify User Should Navigate To Computer Page Successfully
    Given User on home page
    When User Click on Computer tab
    Then User Verify "Computer" text

  @sanity @regression
  Scenario: verify User Should Navigate To Desktops Page Successfully
    Given User on home page
    When User Click on Computer tab
    And  User Click on Desktops link
    Then User Verify "Desktops" textt

  @regression
  Scenario Outline: Verify That User Should Build You OwnComputer And Add Them ToCart Successfully
    Given User on home page
    When User Click on Computer tab
    And User Click on Desktops link
    And User Click on product name Build your own computer
    And User Select processor "<processor>"
    And User Select RAM "<ram>"
    And User Select HDD "<hdd>"
    And User Select OS "<os>"
    And User Select Software "<software>"
    And User Click on ADD TO CART Button
    Then User  Verify message "The product has been added to your shopping cart"

    Examples:

      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |
