Feature: login functionality

Background: user successfully canceled login page
When user open "chrome" browser with exe as
When user open URL as
When user cancle initial login window

@SmokeTest
Scenario: login with valid credentials
When user navigate on login button 
When user click on Myprofile
When user "8149275960" as username
When user "lumia720" as password
When user click on login button
Then Application shows user profile to user
And take screenshot
Then browser close

@SmokeTest
Scenario Outline: login with valid credentials
When user navigate on login button 
When user click on Myprofile
When user "<Username>" as username
When user "<Password>" as password
When user click on login button
Then Application shows user profile to user
And take screenshot
Then browser close

Examples:
				|Username|Password|
				|8149275960|lumia720|
