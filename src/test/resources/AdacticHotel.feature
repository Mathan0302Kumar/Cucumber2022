Feature: Generating the 10 numbers of order id from adactin hotel application

Scenario Outline: Generating Order id

Given User is on Adactin hotel app page on chrome browser
When User enters the "<Username>" and "<Password>"
And User should click the login button
When User select "<Location>","<Hotel>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildperRoom>"
And Click continue button
When User select Hotel and click continue for booking
When User enter "<FirstName>","<LastName>","<BillingAddress>","<CardNo>","<CardType>","<ExpMonth>","<Expyear>","<Cvv>"
And User click on continue for generating order id
Then User print order id in the console



Examples:
|Username|Password|Location|Hotel|RoomType|NoOfRooms|CheckInDate|CheckOutDate|AdultsPerRoom|ChildperRoom|FirstName|LastName|BillingAddress|CardNo|CardType|ExpMonth|Expyear|Cvv|

|Maddy0302|maddy@0302|Melbourne|Hotel Sunshine|Deluxe|1 - One|24/04/2022|25/04/2022|1 - One|0 - None|Mathan|Kumar|Chennai|1234432156788765|VISA|June|2022|345|
|Maddy0302|maddy@0302|Sydney|Hotel Hervey|Super Deluxe|1 - One|25/04/2022|26/04/2022|2 - Two|1 - One|Raj|Kumar|Madurai|1234432837788765|VISA|July|2022|897|
