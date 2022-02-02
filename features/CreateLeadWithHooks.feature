Feature: Leaftaps Login Functioanlity

@Functional
Scenario Outline: TC001_CreateLead - Positive

When Click on Leads
Then Click on Create Lead
Given Enter Company Name as <companyName>
And Enter First Name as <firstName>
And Enter Last Name as <lastName>
And Enter E-mail as <email>
When Click Create Lead Submit button
Then Verify View Lead page is displayed

Examples:
|companyName|firstName|lastName|email|
|'CTS'|'Sangeetha'|'Mathivanan'|'sangeethaoc@gmail.com'|
|'Ford'|'Varsid'|'Mathivanan'|'sangeethaoc@gmail.com'|