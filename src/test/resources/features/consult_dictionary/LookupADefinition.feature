Feature: Check ability to search needed device (iPhone XS) by search input and
  Changing phone's color and adding device to basket on the rozetka.com


    Scenario: Add product to the basket founded it by search input with changing phone color
    Given Open https://rozetka.com.ua
    When Search for "iPhone"
    And Choose "iPhone xs" from dropdown list and go to category page
    And Choose any phone with "Gray" color and go to product page
    And Change phone's color to "Space Gray" color
    And Add product to the basket
    Then Button "Оформить заказ" is visible