Feature: Test Login Functionality

Scenario Outline: Test Valid Login

Given Airport app is opened
When I give login id as '<loginId>'
And I give password as '<password>'
And I click on login button
Then I see that login is '<result>'

Examples:
|loginId|password|result|
|73186|e5f6|success|
