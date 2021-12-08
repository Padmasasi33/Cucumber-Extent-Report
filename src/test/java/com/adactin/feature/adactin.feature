Feature: Booking a Hotel Adactin
@smokeTest
Scenario Outline: Sign in page
Given user Launch The Application
When user Give The "<Username>" In UserName Textbox
And user Enter The "<Password>" In Password Textbox
Then user click The Sign In Button It Navigates To The Search Hotel Page

Examples:
|Username|Password|
|sureshsasi|sasisuresh1|
|chokkalingam|padma|
|Padmasasi|654321|


@SanityTest
Scenario: User search the hotel
When user Select The Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number Of Rooms
And user Give The Check In Date
And user Give The Check Out Date
And user Give The Number Of Adults In Room
And user Give The Number Of Children In Room
Then user Give The Search Button It Navigates To The Next Page

@RegressionTest
Scenario: User confirm the hotel booking
When user Click The Radio Button
Then user Click The Continue Button It Navigates To The Book A Hotel page

@SmokeTest
Scenario: User give their personal details
When user Give The First Name
And user Give The Last Name
And user Give The Address
And user Give The Card Number
And user Give The Card Type
And user Give The Validitity Details Of The Card
And user Give The Card CVV Details
Then user Click The Book Now Button It Navigates To The Booking Confirmation Page

@SanityTest
Scenario: Get the itinerary details
Then user Click The Itinerary Button And It Navigates To The Itinerary Page
 


