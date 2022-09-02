@BookHotel
Feature: Verify Booking Hotel on Adactin Hotel website

  Scenario Outline: Verify Booking Hotel Page By entering all fields
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello bullet11!"
    And User should Search hotel by select fields with "<location>", "<hotels>", "<typeOfRoom>", "<noOfRoom>", "<checekInDate>", "<checkOutDate>", "<noOfAdults>" and "<childNos>"
    Then User should verify Select Hotel Page after Search Hotel page "Select Hotel "
    And User should select the Hotel and Click Continue button
    Then User should verify the page after Hotel selection by "Book A Hotel "
    And User should Book Hotel by "<firstname>", "<lastname>" and "<billingAddress>"
      | ccNo             | ccType | ccExpMon | ccExpYear | ccCVV |
      | 2345678345678456 | VISA   |        9 |      2022 |   456 |
      | 5678456234567834 | AMEX   |       11 |      2022 |   876 |
      | 7834567234568456 | MAST   |       10 |      2022 |   155 |
      | 3456783456278456 | OTHR   |       12 |      2022 |   346 |
    Then User should verify Booking confirmation Messege "Booking Confirmation"

    Examples: 
      | username | password  | location | hotels         | typeOfRoom   | noOfRoom | checkInDate | checkOutDate | noOfAdults | childNos | firstname | lastname | billingAddress |
      | bullet11 | bulletboy | Sydney   | Hotel Sunshine | Super Deluxe |        1 | 13/08/2022  | 14/08/2022   |          2 |        1 | mohan     | Jack     | Cumbum         |

  Scenario Outline: Verify Booking Hotel Page without entering all fields
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello bullet11!"
    And User should Search hotel by select fields with "<location>", "<hotels>", "<typeOfRoom>", "<noOfRoom>", "<checekInDate>", "<checkOutDate>", "<noOfAdults>" and "<childNos>"
    Then User should verify Select Hotel Page after Search Hotel page "Select Hotel "
    And User should select the Hotel and Click Continue button
    Then User should verify the page after Hotel selection by "Book A Hotel "
    And User should click Book now button without entering any fields
    Then User should verify all the error message "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Year" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username | password  | location | hotels         | typeOfRoom   | noOfRoom | checkInDate | checkOutDate | noOfAdults | childNos |
      | bullet11 | bulletboy | Sydney   | Hotel Sunshine | Super Deluxe |        1 | 13/08/2022  | 14/08/2022   |          2 |        1 |
