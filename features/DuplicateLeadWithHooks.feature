Feature: Leaftaps Login Functioanlity

@Functional
Scenario: TC001_CreateLead - Positive

When Click on Leads
Then Click on Find Leads link
When Click Email link
Given Enter Email Address as 'sangeethaoc@gmail.com'
When Click on Find Leads button
Then Click on First Lead item displayed
When Click on Duplicate Lead link
Then Click on Create Lead button
And Verify if Duplicated Lead is same as Actual Lead