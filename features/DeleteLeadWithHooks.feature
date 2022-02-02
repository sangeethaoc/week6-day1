Feature: Leaftaps Login Functioanlity

@Functional
Scenario: TC001_CreateLead - Positive

When Click on Leads
Then Click on Find Leads link
When Click on First Lead link displayed
Then Click on Delete button
Then Click on Find Leads link
Given Enter Lead ID
When Click on Find Leads button
Then Confirm the given Lead ID is deleted
