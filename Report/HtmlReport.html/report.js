$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking a Hotel Adactin",
  "description": "",
  "id": "booking-a-hotel-adactin",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Sign in page",
  "description": "",
  "id": "booking-a-hotel-adactin;sign-in-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Give The \"\u003cUsername\u003e\" In UserName Textbox",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click The Sign In Button It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "booking-a-hotel-adactin;sign-in-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "booking-a-hotel-adactin;sign-in-page;;1"
    },
    {
      "cells": [
        "sureshsasi",
        "sasisuresh1"
      ],
      "line": 11,
      "id": "booking-a-hotel-adactin;sign-in-page;;2"
    },
    {
      "cells": [
        "chokkalingam",
        "padma"
      ],
      "line": 12,
      "id": "booking-a-hotel-adactin;sign-in-page;;3"
    },
    {
      "cells": [
        "Padmasasi",
        "654321"
      ],
      "line": 13,
      "id": "booking-a-hotel-adactin;sign-in-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Sign in page",
  "description": "",
  "id": "booking-a-hotel-adactin;sign-in-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Give The \"sureshsasi\" In UserName Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"sasisuresh1\" In Password Textbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click The Sign In Button It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4089238100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sureshsasi",
      "offset": 15
    }
  ],
  "location": "Step_Definition.user_Give_The_In_UserName_Textbox(String)"
});
formatter.result({
  "duration": 176268400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sasisuresh1",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Textbox(String)"
});
formatter.result({
  "duration": 102017900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_The_Sign_In_Button_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 897656000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Sign in page",
  "description": "",
  "id": "booking-a-hotel-adactin;sign-in-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Give The \"chokkalingam\" In UserName Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"padma\" In Password Textbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click The Sign In Button It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 464396800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chokkalingam",
      "offset": 15
    }
  ],
  "location": "Step_Definition.user_Give_The_In_UserName_Textbox(String)"
});
formatter.result({
  "duration": 110739500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "padma",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Textbox(String)"
});
formatter.result({
  "duration": 89781200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_The_Sign_In_Button_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1038384000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Sign in page",
  "description": "",
  "id": "booking-a-hotel-adactin;sign-in-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Give The \"Padmasasi\" In UserName Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"654321\" In Password Textbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click The Sign In Button It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 495739000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Padmasasi",
      "offset": 15
    }
  ],
  "location": "Step_Definition.user_Give_The_In_UserName_Textbox(String)"
});
formatter.result({
  "duration": 109102900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "654321",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Textbox(String)"
});
formatter.result({
  "duration": 106935500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_The_Sign_In_Button_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1783062600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User search the hotel",
  "description": "",
  "id": "booking-a-hotel-adactin;user-search-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Give The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Give The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Give The Number Of Adults In Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Give The Number Of Children In Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Give The Search Button It Navigates To The Next Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location()"
});
formatter.result({
  "duration": 183048700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 246800100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 161037600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 110651100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Check_In_Date()"
});
formatter.result({
  "duration": 100024800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Check_Out_Date()"
});
formatter.result({
  "duration": 116158100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Number_Of_Adults_In_Room()"
});
formatter.result({
  "duration": 144094900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Number_Of_Children_In_Room()"
});
formatter.result({
  "duration": 146730900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Search_Button_It_Navigates_To_The_Next_Page()"
});
formatter.result({
  "duration": 1972358800,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "User confirm the hotel booking",
  "description": "",
  "id": "booking-a-hotel-adactin;user-confirm-the-hotel-booking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Click The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click The Continue Button It Navigates To The Book A Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Radio_Button()"
});
formatter.result({
  "duration": 104278100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel_page()"
});
formatter.result({
  "duration": 1335982000,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User give their personal details",
  "description": "",
  "id": "booking-a-hotel-adactin;user-give-their-personal-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Give The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Give The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Give The Address",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Give The Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Give The Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Give The Validitity Details Of The Card",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Give The Card CVV Details",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click The Book Now Button It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Give_The_First_Name()"
});
formatter.result({
  "duration": 142580100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Last_Name()"
});
formatter.result({
  "duration": 131086400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Address()"
});
formatter.result({
  "duration": 120128100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Card_Number()"
});
formatter.result({
  "duration": 111419900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Card_Type()"
});
formatter.result({
  "duration": 223684900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Validitity_Details_Of_The_Card()"
});
formatter.result({
  "duration": 611719900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Give_The_Card_CVV_Details()"
});
formatter.result({
  "duration": 94823800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Book_Now_Button_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 70681900,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Get the itinerary details",
  "description": "",
  "id": "booking-a-hotel-adactin;get-the-itinerary-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "user Click The Itinerary Button And It Navigates To The Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Itinerary_Button_And_It_Navigates_To_The_Itinerary_Page()"
});
formatter.result({
  "duration": 8571563100,
  "status": "passed"
});
});