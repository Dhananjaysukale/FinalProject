Feature: Manage Addresses functionality

Background: user successfully canceled login page
Given user open "chrome" browser with exe as
Given user open URL as
Given user cancle initial login window
Given user navigate on login button 
Given user click on Myprofile
Given user "8149275960" as username
Given user "lumia720" as password
Given user click on login button
Then Application shows user profile to user

@SmokeTest
Scenario: Manage Address With valid credential
When user click on manage address
When user click on add new address
When user enter "Jayesh Sukale" as name
When user enter "9767608943" as mobile number
When user enter "411011" as pin code
When user enter "mangalwar peth" as locality
When user enter "abcdefg" as address
When user click on home as address type
When user click on save button
Then Application shows new address added to user
Then user navigate to options
Then user select delete option
Then user click on delete
And user close the browser