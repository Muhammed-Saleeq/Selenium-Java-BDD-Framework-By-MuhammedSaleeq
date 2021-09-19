
Feature: Trip Advisor Hotel Search and Hotel Link Verification
  

  @HotelSearch
  Scenario Outline: Verify Hotel Search and Hotel link Navigation
    Given User navigates to TripAdvisor homepage.
    When User searches a particular "<country> " of his choice.
    When User Clicks on hotel option.
    And User selects the first displayed hotel.
    And User switches window and verifies the hotel Details.
    And User Clicks on hotels website.
    Then User Verifies wether Website of the hotel is successfully launched.
    
    Examples:
   | country|
   | France |
    
    
    
    
    
  
