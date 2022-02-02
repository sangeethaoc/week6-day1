Feature: Leaftaps Login Functioanlity

@Functional
Scenario Outline: TC001_CreateLead - Positive

When Click on Contacts
Then Click on Create Contact link
Given Enter First Name as <firstName>
And Enter Last Name as <lastName>
And Enter First Name Local as <firstNameLocal>
And Enter Last Name Local as <lastNameLocal>
And Enter Department Name as <departmentName>
And Enter Description as <description>
And Enter Email Address as <emailAddress>
And Enter State Province as <stateProvince>
When Click Create Contact Submit button
Then Verify View Contact page displayed


Examples:
|firstName|lastName|firstNameLocal|lastNameLocal|departmentName|description|emailAddress|stateProvince|
|'Sangeetha'|'Mathivanan'|'Sangee'|'Mathi'|'IT'|'Information Technology'|'sangeethaoc@gmail.com'|'New York'|
