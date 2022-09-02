@CancelBooking
Feature: Verify Cancel Hotel on Adactin Hotel website

  Scenario Outline: Verify Cancel Hotel Booking
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
    And User should cancel Booked Id
    Then User should Verify cancelation message "The booking has been cancelled."

    Examples: 
      | username | password  | location | hotels         | typeOfRoom   | noOfRoom | checkInDate | checkOutDate | noOfAdults | childNos |
      | bullet11 | bulletboy | Sydney   | Hotel Sunshine | Super Deluxe |        1 | 13/08/2022  | 14/08/2022   |          2 |        1 |

  Scenario Outline: Verify Cancel Existing Hotel Booking
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello bullet11!"
    And User should click Booking itinerary
    And User should cancel Existing Id
    Then User should Verify cancelation message "The booking has been cancelled."

    Examples: 
      | username | password  |
      | bullet11 | bulletboy |
